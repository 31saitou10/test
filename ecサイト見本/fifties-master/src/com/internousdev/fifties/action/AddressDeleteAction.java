package com.internousdev.fifties.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.fifties.dao.AddressDAO;
import com.internousdev.fifties.dao.AddressDeleteDAO;
import com.internousdev.fifties.dao.CartInfoDAO;
import com.internousdev.fifties.dto.AddressDTO;
import com.internousdev.fifties.dto.CartInfoDTO;
import com.internousdev.fifties.dto.ProductDTO;
import com.opensymphony.xwork2.ActionSupport;

//林作成
public class AddressDeleteAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;
	private ArrayList<AddressDTO> addressList = new ArrayList<AddressDTO>();
	private String message; //削除メッセージ
	private String deleteFlg; //削除フラグ
	private AddressDeleteDAO dao = new AddressDeleteDAO();
	private AddressDAO addressDAO = new AddressDAO();
	private int finallyTotalPrice;
	private int id;
	String userId;
	private List<CartInfoDTO> cartList = new ArrayList<CartInfoDTO>();

	public List<CartInfoDTO> getCartList(){

		return cartList;
	}


	private ArrayList<AddressDTO> addressDTOList = new ArrayList<AddressDTO>();
	public ArrayList<AddressDTO> getAddressDTOList(){ //BuyItemCompleteActionへ

		return addressDTOList;
	}

	public void setAddressDTOList(ArrayList<AddressDTO> addressDTOList) {

		this.addressDTOList = addressDTOList;
	}

	private int totalPrice = 0;
	public List<ProductDTO> notSameCategoryList = new ArrayList<ProductDTO>();
	public ProductDTO dto = new ProductDTO();



	public String execute() throws SQLException{


		userId = (String)session.get("userId");
		String result = SUCCESS;

		if(deleteFlg.equals("1")) {
			this.deleteAll();//全て削除する

		}else if(deleteFlg.equals("2")) {
			this.deletePart(); //選択したものを削除する

		}

		//ログインユーザーのカート情報を表示
		CartInfoDAO cartInfoDAO = new CartInfoDAO();
		cartList = cartInfoDAO.getUserCartList(userId);

		if((boolean) session.get("loginFlg")) {
			AddressDAO addressInfoDAO = new AddressDAO();
			addressDTOList.addAll(addressInfoDAO.getAddressInfo(session.get("userId").toString()));

		}else {
			return ERROR;
		}

		if(cartList.size() == 0) {
			return "other";
		}
		for(CartInfoDTO dto : cartList) {
			setTotalPrice(getTotalPrice() + dto.getPrice());
		}
		for(int i=0; i<cartList.size(); i++){
			finallyTotalPrice += cartList.get(i).getTotalPrice();
		}

		if(addressDTOList.size() > 0) {
			result = SUCCESS;
		}
		else {
			result = "address";
		}

		return result;
	}

	//全削除メソッド
	public String deleteAll() throws SQLException{

		String user_id = session.get("userId").toString();

		int res = dao.deleteAllAddress(user_id);
		String result = ERROR;

		if(res > 0) {
			result = "address";
			addressList = null;
			setMessage("注文履歴を全て削除しました");
			}else if(res == 0) {
				setMessage("履歴の削除に失敗しました");
				return result;
			}
		return result;
	}

	//選択削除メソッド
	public String deletePart() throws SQLException{
		int res = dao.deletePartAddress(id);
		addressList = addressDAO.getAddressInfo(userId);
String result=SUCCESS;
		if(res > 0) {
			setMessage(res + "件削除しました");
			 return result ;
		}else if(res == 0) {
			setMessage("削除できませんでした");
			result = ERROR;
		}


		return result;
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public ArrayList<AddressDTO> getAddressList() {
		return addressList;
	}

	public void setAddressList(ArrayList<AddressDTO> addressList) {
		this.addressList = addressList;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}


	public int getFinallyTotalPrice() {
		return finallyTotalPrice;
	}

	public void setFinallyTotalPrice(int finallyTotalPrice) {
		this.finallyTotalPrice = finallyTotalPrice;
	}

	public Map<String, Object> getSession(){
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
