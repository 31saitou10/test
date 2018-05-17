package com.internousdev.miamiburger.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miamiburger.dao.GetAddressDAO;
import com.internousdev.miamiburger.dto.DestinationInfoDTO;
import com.internousdev.miamiburger.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

/*
 * カート情報に宛先情報を加える。
 * user_idから宛先情報の読み込みを行う。
 */
public class AddressSelectAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;

	public String execute() {

//		宛先情報をdestination_infoテーブルから呼び出し----------------------------
		List<DestinationInfoDTO> destinationDTOList = new ArrayList<>();
		GetAddressDAO dao = new GetAddressDAO();
		UserInfoDTO loginDTO = (UserInfoDTO) session.get("userInfoDTO");

		destinationDTOList = dao.getAddress(loginDTO.getUserId());
//		----------------------------------------------------------------------

		session.put("destinationDTOList",destinationDTOList);

		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}
