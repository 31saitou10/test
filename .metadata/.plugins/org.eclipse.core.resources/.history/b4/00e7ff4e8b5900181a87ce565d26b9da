package com.internousdev.miamiburger.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miamiburger.dao.SelectCartInfoDAO;
import com.internousdev.miamiburger.dto.CartProductInfoDTO;
import com.internousdev.miamiburger.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CartAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;
	private List<CartProductInfoDTO> cartList = new ArrayList<>();
	private int totalPrice = 0;

	public String execute() {
		String userId = null;
		if(session.containsKey("userInfoDTO")){
			UserInfoDTO loginDTO = (UserInfoDTO) session.get("userInfoDTO");
			userId = loginDTO.getUserId();
		}
		session.put("userId", userId);
		String tempUserId = session.get("temp_user_id").toString();

		SelectCartInfoDAO dao = new SelectCartInfoDAO();
		cartList = dao.selectCartInfo(userId, tempUserId);
		
//		カートの合計金額を算出
		for(int i = 0; i < cartList.size(); i++){
			totalPrice += cartList.get(i).getTotalPrice();
		}
		
		session.put("cartList", cartList);

		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public List<CartProductInfoDTO> getCartList() {
		return cartList;
	}

	public void setCartList(List<CartProductInfoDTO> cartList) {
		this.cartList = cartList;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	

}