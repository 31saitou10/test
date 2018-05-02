package com.internousdev.zen.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.zen.dao.CartDAO;
import com.internousdev.zen.dto.CartDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CartAction extends ActionSupport implements SessionAware {
	private String user_id;
	private int product_id;
	private int product_count;
	private int total_price;

	private String message;
	private final String EMPTY_MESSAGE = "カートに入っている商品がありません。";

	public Map<String, Object> session;

	// カートの商品情報を順番に格納する

	private ArrayList<CartDTO> cartList;

	public String execute() {
		String loginFlg;
		CartDAO cartDAO = new CartDAO();

		// ログインユーザIDを取得
		user_id = (String) session.get("loginUserId");

		if (user_id == null) {

			// ログインしていないのでログインフラグはfalse
			loginFlg = "no";

			// ゲストIDがセッションにあれば取得する
			String user_id = (String) session.get("tempUserId");

			// ゲストIDのカート情報を取得する
			cartList = cartDAO.select(user_id, loginFlg);
		} else {
			// ログインしているのでログインフラグはtrue
			loginFlg = "yes";

			// ユーザIDのカート情報を取得する
			cartList = cartDAO.select(user_id, loginFlg);
		}

		// カートに何も商品がなければないことをメッセージで表示する
		if (cartList.isEmpty()) {
			message = EMPTY_MESSAGE;
		}

		// カートの合計金額を計算する
		total_price = 0;
		for (int i = 0; cartList.size() > i; i++) {
			int price = cartList.get(i).getPrice();
			int product_count = cartList.get(i).getProduct_count();
			total_price += price * product_count;
		}

		// セッションに合計金額を入れる
		session.put("total_price", total_price);

		return SUCCESS;
	}

	// ゲッター＆セッター
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

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public int getProduct_count() {
		return product_count;
	}

	public void setProduct_count(int product_count) {
		this.product_count = product_count;
	}

	public int getTotal_price() {
		return total_price;
	}

	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}