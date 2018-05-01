package com.internousdev.fifties.action;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.fifties.dao.CartInfoDAO;
import com.internousdev.fifties.dto.CartInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CartInsertAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;
	private String userId;
	private int productId;
	private int productCount;
	private int price;
	private ArrayList<CartInfoDTO> cartList = new ArrayList<CartInfoDTO>();
	private String errorMessage;
	private int cartTotalPrice;
	private boolean loginFlg;
	//商品詳細に戻すための情報



	public String execute() throws SQLException{
		CartInfoDAO cartInfoDAO = new CartInfoDAO();
		String result = SUCCESS;
		loginFlg = (boolean) session.get("loginFlg");

		if(loginFlg){
			userId = session.get("userId").toString();
		}else{
			userId = session.get("tempUserId").toString();
		}

		//在庫が足りているか確認
		int cartProductCount = cartInfoDAO.getCartProductCount(userId, productId);
		int stock = cartInfoDAO.getProductStock(productId);
		if(cartProductCount > stock){
			errorMessage = "在庫が足りないためこれ以上カートに入れられません。";
			return ERROR;
		}

		//同じ商品がすでにカートに入っているか確認。
		int count = 0;
		if(cartInfoDAO.sameProductExists(userId, productId)){

			count = cartInfoDAO.updateCartProductCount(userId,productId,productCount);
			if(count == 0){
				return "errorPage";
			}
		}else{
			//ない場合は、普通に入れる
			count = cartInfoDAO.insertUserCart(userId,productId,productCount,price);
			if(count == 0){
				errorMessage = "カートに商品を追加するのに失敗しました。";
			}
		}

		//カート画面にカート商品一覧を表示するための処理
		cartList = cartInfoDAO.getUserCartList(userId);

		//カートの合計金額を計算
		for(CartInfoDTO dto: cartList){
			cartTotalPrice += dto.getTotalPrice();
		}

		return result;
	}


	public int getCartTotalPrice() {
		return cartTotalPrice;
	}


	public void setCartTotalPrice(int cartTotalPrice) {
		this.cartTotalPrice = cartTotalPrice;
	}


	public boolean getLoginFlg() {
		return loginFlg;
	}


	public void setLoginFlg(boolean loginFlg) {
		this.loginFlg = loginFlg;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}



	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public int getProductCount() {
		return productCount;
	}


	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}

	public ArrayList<CartInfoDTO> getCartList() {
		return cartList;
	}


	public void setCartList(ArrayList<CartInfoDTO> cartList) {
		this.cartList = cartList;
	}


	public String getErrorMessage() {
		return errorMessage;
	}


	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
