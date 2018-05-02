package com.internousdev.zen.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.zen.dao.CartDAO;
import com.internousdev.zen.dto.CartDTO;
import com.opensymphony.xwork2.ActionSupport;

public class goCartInsertAction extends ActionSupport implements SessionAware {

	private String user_id;
	private int product_id;
	private int product_count;
	private int total_price;
	private int price;

	// エラーメッセージ
	private String ERROR_MESSAGE;

	public Map<String, Object> session;

	// cartListにユーザIDに対応する商品情報をある分だけ格納する
	public ArrayList<CartDTO> cartList;

	public String execute() {
		String result = ERROR;
		int putIntoCart_result = 0;
		String loginFlg;
		CartDAO cartDAO = new CartDAO();

		// ログインユーザIDを取得
		user_id = (String) session.get("loginUserId");

		// 商品情報からカートに入れた商品の価格を取り出す
		price = cartDAO.takePrice(product_id);

		if (user_id == null) {
			// ログインしていないのでログインフラグはfalse
			loginFlg = "no";

			// ゲストIDがないなら
			if ((String) session.get("tempUserId") == null) {
				// ゲストIDを生成する
				Integer create_tempUserId = Integer.valueOf((int) (Math.random() * 1000000));
				String temp_user_id = create_tempUserId.toString();
				session.put("tempUserId", temp_user_id);

				// ゲストユーザが選択した商品情報をカート情報テーブルに登録する
				putIntoCart_result = cartDAO.putIntoCart(product_id, temp_user_id, product_count, price, loginFlg);

				// ゲストIDのカート情報を取得する
				cartList = cartDAO.select(temp_user_id, loginFlg);

				// ゲストIDがすでに与えられているなら
			} else {
				String temp_user_id = (String) session.get("tempUserId");

				// ゲストユーザが選択した商品情報をカート情報テーブルに登録する
				putIntoCart_result = cartDAO.putIntoCart(product_id, temp_user_id, product_count, price, loginFlg);

				// ゲストIDのカート情報を取得する
				cartList = cartDAO.select(temp_user_id, loginFlg);
			}

		} else {
			// ログインしているのでログインフラグはtrue
			loginFlg = "yes";

			// ゲストユーザが選択した商品情報をカート情報テーブルに登録する
			putIntoCart_result = cartDAO.putIntoCart(product_id, user_id, product_count, price, loginFlg);

			// ゲストIDのカート情報を取得する
			cartList = cartDAO.select(user_id, loginFlg);
		}

		// カート内の商品の合計金額を計算する
		total_price = 0;
		for (int i = 0; cartList.size() > i; i++) {
			int price = cartList.get(i).getPrice();
			int product_count = cartList.get(i).getProduct_count();
			total_price += price * product_count;
		}

		// 合計金額をセッションに入れる
		session.put("total_price", total_price);

		if (putIntoCart_result == 0) {
			ERROR_MESSAGE = "カートへの商品追加が失敗しました。";
			result = SUCCESS;
		} else {
			result = SUCCESS;
		}
		return result;
	}

	// ゲッター＆セッター
	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
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

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public ArrayList<CartDTO> getCartList() {
		return cartList;
	}

	public void setCartList(ArrayList<CartDTO> cartList) {
		this.cartList = cartList;
	}

	public int getTotal_price() {
		return total_price;
	}

	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getERROR_MESSAGE() {
		return ERROR_MESSAGE;
	}
}
