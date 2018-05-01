package com.internousdev.fifties.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.fifties.dao.ChangePasswordCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ChangePasswordCompleteAction extends ActionSupport implements SessionAware {
	private String newpass;
	private String userid;
	private String hideNewPassword;
	private Map<String, Object> session;
	private ChangePasswordCompleteDAO dao = new ChangePasswordCompleteDAO();

	@Override
	public String execute() throws SQLException {
		String result = ERROR;

		int count = 0;
		count += dao.changeComplete(newpass, userid);
		if (count > 0) {
			return SUCCESS;
		}

		return result;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getNewpass() {
		return newpass;
	}

	public void setNewpass(String newpass) {
		this.newpass = newpass;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getHideNewPassword() {
		return hideNewPassword;
	}

	public void setHideNewPassword(String hideNewPassword) {
		this.hideNewPassword = hideNewPassword;
	}
}
