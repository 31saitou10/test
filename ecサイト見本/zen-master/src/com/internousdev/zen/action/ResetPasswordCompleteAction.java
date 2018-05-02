package com.internousdev.zen.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.zen.dao.ResetPasswordDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ResetPasswordCompleteAction extends ActionSupport implements SessionAware{

	private String loginUserId;
	private String loginPassword;
	private Map<String, Object> session;

	public String execute(){
		ResetPasswordDAO dao = new ResetPasswordDAO();
		int count = 0;
		try {
			count =  dao.resetPassword(loginUserId, loginPassword);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		if(count > 0){
			return SUCCESS;
		}else{
			return ERROR;
		}
	}





	public String getLoginUserId() {
		return loginUserId;
	}





	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}





	public String getLoginPassword() {
		return loginPassword;
	}





	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}





	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}
