package com.internousdev.zen.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.zen.dao.CartDAO;
import com.internousdev.zen.dao.DestinationAddDAO;
import com.internousdev.zen.dao.PaymentConfirmDAO;
import com.internousdev.zen.dto.CartDTO;
import com.internousdev.zen.dto.DestinationAddDTO;
import com.internousdev.zen.dto.PaymentDTO;
import com.opensymphony.xwork2.ActionSupport;

public class PaymentConfirmAction extends ActionSupport implements SessionAware {
	private String user_id;
	private String id;
	private String family_name;
	private String first_name;
	private String family_name_kana;
	private String first_name_kana;
	private String email;
	private String tel_number;
	private String user_address;
	private String product_name;
	private String product_count;
	private String price;


	private ArrayList<CartDTO> cartList;

	public Map<String, Object> session;
	public ArrayList<PaymentDTO> List = new ArrayList<PaymentDTO>();
	// private PaymentCompleteDAO paymentCompleteDAO = new PaymentCompleteDAO();

	private ArrayList<DestinationAddDTO> addressList = new ArrayList<DestinationAddDTO>();
	private ArrayList<DestinationAddDTO> selectAddList = new ArrayList<DestinationAddDTO>();

	public String execute() throws SQLException {
		CartDAO cartDAO = new CartDAO();
		String result = ERROR;
		String loginFlg = "yes";

		user_id = (String) session.get("loginUserId");

		cartList = cartDAO.select(user_id, loginFlg);

		if (cartList.isEmpty()) {
			result = "back";
			return result;
		}


		//宛先情報選択
		DestinationAddDAO destinationAddDAO = new DestinationAddDAO();
		addressList = destinationAddDAO.getDestinationList(user_id);

		if (addressList.isEmpty()) {
			result = "back2";
			return result;
		}
//		if(addressList == null){
//			result = "back";
//			return result;
//		}

		String[] idList = id.split(", ", 0);

		PaymentConfirmDAO paymentConfirmDAO = new PaymentConfirmDAO();
		// selectAddList = paymentConfirmDAO.selectAddress(id);

		// selectAddList =
		// paymentConfirmDAO.selectAddress(String.valueOf(idList[0]));
		selectAddList = paymentConfirmDAO.selectAddress(Integer.parseInt((idList[0])));

		if (selectAddList.isEmpty()) {
			result = "back";
			return result;
		}

		session.put("selectAddList", selectAddList);

		result = SUCCESS;
		return result;

	}

	public ArrayList<DestinationAddDTO> getAddressList() {
		return addressList;
	}

	public void setAddressList(ArrayList<DestinationAddDTO> addressList) {
		this.addressList = addressList;
	}

	public ArrayList<DestinationAddDTO> getSelectAddList() {
		return selectAddList;
	}

	public void setSelectAddList(ArrayList<DestinationAddDTO> selectAddList) {
		this.selectAddList = selectAddList;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFamily_name() {
		return family_name;
	}

	public void setFamily_name(String family_name) {
		this.family_name = family_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getFamily_name_kana() {
		return family_name_kana;
	}

	public void setFamily_name_kana(String family_name_kana) {
		this.family_name_kana = family_name_kana;
	}

	public String getFirst_name_kana() {
		return first_name_kana;
	}

	public void setFirst_name_kana(String first_name_kana) {
		this.first_name_kana = first_name_kana;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel_number() {
		return tel_number;
	}

	public void setTel_number(String tel_number) {
		this.tel_number = tel_number;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_count() {
		return product_count;
	}

	public void setProduct_count(String product_count) {
		this.product_count = product_count;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public ArrayList<CartDTO> getCartList() {
		return cartList;
	}

	public void setCartList(ArrayList<CartDTO> cartList) {
		this.cartList = cartList;
	}

}
