package com.internousdev.fifties.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class StartAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;

	public String execute() {

		if (!(session.containsKey("loginFlg")) && !(session.containsKey("tempUserId"))) {
			int tempUserId = Integer.valueOf((int) (Math.random() * 1000000000));
			boolean loginFlg = false;
			session.put("tempUserId", tempUserId);
			session.put("loginFlg", loginFlg);
		}

		return SUCCESS;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
