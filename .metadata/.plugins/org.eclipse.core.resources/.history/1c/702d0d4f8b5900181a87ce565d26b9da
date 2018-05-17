package com.internousdev.miamiburger.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class MyPageChangePasswordAction extends ActionSupport implements SessionAware {
//session情報
	public Map<String, Object> session;
	private String errorPass = "";          //パスワードエラー
	public String execute() throws SQLException {

//result結果、SUCCESSを挿入する
		String result = SUCCESS;
		return result;
	}

//以下、getter/setter
	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getErrorPass() {
		return errorPass;
	}

	public void setErrorPass(String errorPass) {
		this.errorPass = errorPass;
	}

}
