package com.internousdev.fifties.action;
//妹尾
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.fifties.dao.BuyItemCompleteDAO;
import com.internousdev.fifties.dao.CartDeleteDAO;
import com.internousdev.fifties.dao.CartInfoDAO;
import com.internousdev.fifties.dto.CartInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

/*
 * 1,カート情報取得
 * 2,在庫更新
 * 3,購入履歴に登録
 * 4,カートテーブルの情報を削除する
 */

public class BuyItemCompleteAction extends ActionSupport implements SessionAware {

	// userId格納
	private String userId;
	// cartInfoDAO格納List
	private Map<String, Object> session;

	private int cartTotalPrice;
	private ArrayList<CartInfoDTO> cartList=new ArrayList<CartInfoDTO>();
	private ArrayList<CartInfoDTO> cartInfoList=new ArrayList<CartInfoDTO>();
	private String errorMessage;



	public String execute() throws SQLException {
		String result = SUCCESS;
		userId=(String) session.get("userId");
		BuyItemCompleteDAO buyItemCompleteDAO = new BuyItemCompleteDAO();
		CartInfoDAO dao = new CartInfoDAO();

		CartDeleteDAO cartDeleteDAO = new CartDeleteDAO();


		// カート情報取得（getUserCartInfo)
		cartList=buyItemCompleteDAO.getCartInfo(userId);


		//在庫情報を取得

		//在庫を更新
		int productResult=0;
		productResult = buyItemCompleteDAO.updateProductCount(cartList);

		if (productResult<0){
				return ERROR;


		}

		//履歴にいれる
		int count = 0;
		count = buyItemCompleteDAO.setPurchseHistory(cartList);

		if (count <= 0) {
			return ERROR;
		}

		cartList = dao.getUserCartList((String) session.get("userId"));



			//カートの中身を削除
			int deletedCount = 0;
			deletedCount=cartDeleteDAO.deleteAllCartInfo(session.get("userId").toString());

			if (deletedCount <= 0) {
				return ERROR;
			}

			cartTotalPrice =cartTotalPrice(getcartList());


		return result;
		}



	// 合計金額計算メソッド
	public int cartTotalPrice(ArrayList<CartInfoDTO> cartList) {
		int totalPrice = 0;
		for (CartInfoDTO dto : cartList) {
			totalPrice += dto.getPrice() * dto.getProductCount();
		}

		return totalPrice;
	}




	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}


	public ArrayList<CartInfoDTO> getcartList() {
		return cartList;
	}

	public void setCartInfoDTOList(ArrayList<CartInfoDTO> cartList) {
		this.cartList = cartList;
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

	public String getErrorMessage(){
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage){
		this.errorMessage=errorMessage;
	}

	public ArrayList<CartInfoDTO> getCartInfoList() {
		return cartInfoList;
	}

	public void setCartInfoList(ArrayList<CartInfoDTO> cartInfoList) {
		this.cartInfoList = cartInfoList;
	}


}

