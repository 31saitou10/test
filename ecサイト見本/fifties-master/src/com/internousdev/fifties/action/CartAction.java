package com.internousdev.fifties.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.fifties.dao.CartDeleteDAO;
import com.internousdev.fifties.dao.CartInfoDAO;
import com.internousdev.fifties.dto.CartInfoDTO;
import com.opensymphony.xwork2.ActionSupport;
//山本作成

public class CartAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;
	private int cartTotalPrice;
	private ArrayList<CartInfoDTO> cartList = new ArrayList<CartInfoDTO>();
	private boolean deleteFlg;
	private ArrayList<String> deleteList = new ArrayList<String>();
	private String errorMessage;


	public String execute() throws SQLException{
		CartInfoDAO cartInfoDAO = new CartInfoDAO();
		CartDeleteDAO cartDeleteDAO = new CartDeleteDAO();
		String userId = (String) session.get("userId");
		boolean loginFlg = (boolean) session.get("loginFlg");


		if(loginFlg){
			userId = session.get("userId").toString();
		}else{
			userId = session.get("tempUserId").toString();
		}

		if(deleteFlg){
			if(deleteList.size() == 0){
				errorMessage = "削除する商品が選択されていません。";

			}else if(deleteList.get(0).equals("false")){

				errorMessage = "削除する商品が選択されていません。";
			}else{
				//チェックされたカート情報を削除する
				for(String productId: deleteList){
					int count = cartDeleteDAO.deleteUserCart(userId, Integer.parseInt(productId));
					if(count == 0){
						cartList = cartInfoDAO.getUserCartList(userId);
						cartTotalPrice = calcTotalPrice(cartList);
						errorMessage = "削除中にエラーが発生しました。";
						return SUCCESS;
					}
				}
			}
		}

		cartList = cartInfoDAO.getUserCartList(userId);

		cartTotalPrice = calcTotalPrice(cartList);

		return SUCCESS;
	}

	public int calcTotalPrice(ArrayList<CartInfoDTO> cartList){
		int cartTotalPrice = 0;
		for(CartInfoDTO dto : cartList){
			cartTotalPrice += dto.getTotalPrice();
		}
		return cartTotalPrice;
	}


	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public int getCartTotalPrice() {
		return cartTotalPrice;
	}


	public void setCartTotalPrice(int cartTotalPrice) {
		this.cartTotalPrice = cartTotalPrice;
	}


	public ArrayList<CartInfoDTO> getCartList() {
		return cartList;
	}


	public void setCartList(ArrayList<CartInfoDTO> cartList) {
		this.cartList = cartList;
	}


	public boolean isDeleteFlg() {
		return deleteFlg;
	}


	public void setDeleteFlg(boolean deleteFlg) {
		this.deleteFlg = deleteFlg;
	}


	public ArrayList<String> getDeleteList() {
		return deleteList;
	}


	public void setDeleteList(ArrayList<String> deleteList) {
		this.deleteList = deleteList;
	}


	public String getErrorMessage() {
		return errorMessage;
	}


	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
