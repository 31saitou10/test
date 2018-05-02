package com.internousdev.zen.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.zen.dao.CartDAO;
import com.internousdev.zen.dao.DestinationAddDAO;
import com.internousdev.zen.dto.CartDTO;
import com.internousdev.zen.dto.DestinationAddDTO;
import com.internousdev.zen.util.CSRFUtil;
import com.opensymphony.xwork2.ActionSupport;

public class PaymentAction extends ActionSupport implements SessionAware {
	private String user_id;
	private String loginUserId;
	private Map<String, Object> session;

	private ArrayList<CartDTO> cartList;
	private String errorCartList;
	private String errorIdList;

	private String token;
	private ArrayList<DestinationAddDTO> addressList = new ArrayList<DestinationAddDTO>();

	public String execute() throws SQLException {
		CartDAO cartDAO = new CartDAO();

		String result = SUCCESS;
		String loginFlg = "yes";

		user_id = (String) session.get("loginUserId");
		cartList = cartDAO.select(user_id, loginFlg);
		// 宛先情報選択
		DestinationAddDAO destinationAddDAO = new DestinationAddDAO();
		addressList = destinationAddDAO.getDestinationList(user_id);

		if (user_id == null) {
			session.put("target", "payment");
			result = "login";
		} else if (cartList.isEmpty()) {
			System.out.println("this is cartLIST:" + cartList);

			errorCartList = "カートに１つも商品が入っていません。";
			result = "back";
		} else if (addressList.isEmpty()) {
			errorIdList = "新規宛先登録してください。";
			result = "back2";
		}

		session.put("addressList", addressList);

		token = new CSRFUtil().makeToken();
		session.put("token", token);

		return result;

	}

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String geterrorIdList() {
		return errorIdList;
	}

	public void seterrorIdList(String errorIdList) {
		this.errorIdList = errorIdList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getLoginuserId() {
		return loginUserId;
	}

	public void setLoginuserId(String loginuserId) {
		this.loginUserId = loginuserId;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public ArrayList<DestinationAddDTO> getAddressList() {
		return addressList;
	}

	public void setAddressList(ArrayList<DestinationAddDTO> addressList) {
		this.addressList = addressList;
	}

	public ArrayList<CartDTO> getCartList() {
		return cartList;
	}

	public void setCartList(ArrayList<CartDTO> cartList) {
		this.cartList = cartList;
	}

	public String getErrorCartList() {
		return errorCartList;
	}

	public void setErrorCartList(String errorCartList) {
		this.errorCartList = errorCartList;
	}

}
