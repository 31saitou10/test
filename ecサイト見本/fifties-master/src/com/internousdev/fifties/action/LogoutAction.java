package com.internousdev.fifties.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;

	public String execute() {
        String saveId =(String)session.get("saveId");
        session.clear();
        if(saveId!=null){
        	session.put("saveId", saveId);

        }
		return SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
