package com.internousdev.zen.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.zen.dao.CartDAO;
import com.internousdev.zen.dto.CartDTO;
import com.opensymphony.xwork2.ActionSupport;


public class AllCartDeleteAction extends ActionSupport implements SessionAware {
	private String user_id;

	private String message = "";
	private final String ERROR_MESSAGE = "削除に失敗しました。";
	private final String DELETE_MESSAGE = "件の商品をカートから削除しました。";

	private Map<String, Object> session;
	private ArrayList<CartDTO> cartList;

	public String execute() {
		String temp_user_id;
		String loginFlg;
		int result;

		CartDAO cartDAO = new CartDAO();

		// ログインユーザIDを取得
		user_id = (String) session.get("loginUserId");

		// ゲストIDを取得
		temp_user_id = (String) session.get("tempUserId");

		if(user_id == null) {
			loginFlg = "no";

			// ゲストユーザIDのカート内商品を全て削除する
			result =  cartDAO.allDeleteCart(temp_user_id, loginFlg);

			// 削除したあとでカートの商品情報を表示する
			cartList = cartDAO.select(temp_user_id, loginFlg);
		}else {
			loginFlg = "yes";

			// ユーザIDのカート内商品を全て削除する
			result =  cartDAO.allDeleteCart(user_id, loginFlg);

			// 削除したあとでカートの商品情報を表示する
			cartList = cartDAO.select(user_id, loginFlg);
		}

		System.out.println("this is AllDeleteAciton'result:"+result);

		// 削除が成功または失敗によって表示するメッセージを変える
		if(result == 0) {
			message = ERROR_MESSAGE;
		}else {
			message = result + DELETE_MESSAGE;
		}

		// カート内の商品の合計金額を計算する
		int total_price = 0;
		for(int i=0; cartList.size()>i; i++) {
			int price = cartList.get(i).getPrice();
			int product_count = cartList.get(i).getProduct_count();
			total_price += price * product_count;
		}

		// 合計金額をセッションに入れる
		session.put("total_price", total_price);

		return SUCCESS;
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

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public ArrayList<CartDTO> getCartList() {
		return cartList;
	}

	public void setCartList(ArrayList<CartDTO> cartList) {
		this.cartList = cartList;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
