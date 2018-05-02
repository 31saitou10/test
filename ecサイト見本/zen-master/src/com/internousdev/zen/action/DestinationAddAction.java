package com.internousdev.zen.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class DestinationAddAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;

	public String execute() {
		String result = SUCCESS;

		// 初期の状態では入力は空欄にしておく
		session.remove("family_name");
		session.remove("first_name");
		session.remove("family_name_kana");
		session.remove("first_name_kana");
		session.remove("user_address");
		session.remove("tel_number");
		session.remove("email");

		return result;
	}

	// ゲッターセッター
	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
