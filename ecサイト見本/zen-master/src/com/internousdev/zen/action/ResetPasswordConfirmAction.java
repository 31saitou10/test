package com.internousdev.zen.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ResetPasswordConfirmAction extends ActionSupport implements SessionAware{

	private String loginUserId;
	private String loginPassword;
	private String loginPasswordConfirm;
	private Map<String, Object> session;
	private List<String> loginUserIdList = new ArrayList<String>();
	private List<String> loginPasswordList = new ArrayList<String>();
	private List<String> loginPasswordConfirmList = new ArrayList<String>();

	public String execute() {
		String result=SUCCESS;
		System.out.println("---------------------");
		System.out.println("LOGINID:"+loginUserId);
		System.out.println("PASSWORD:"+loginPassword);
		System.out.println("PASSWORDCONFIRM:"+loginPasswordConfirm);
		System.out.println("---------------------");

		if (loginUserId.length() == 0) {
			loginUserIdList.add("ログインIDを入力してください。");
			result = ERROR;
		}
		else if (!(loginUserId.length() >= 1 && loginUserId.length() <= 8)) {
			loginUserIdList.add("ログインIDは1文字以上8文字以下で入力してください。");

			result = ERROR;
		}
		else if (!(loginUserId.matches("^[a-zA-Z0-9]+$"))) {
			loginUserIdList.add("ログインIDは半角英語で入力してください。");

			result = ERROR;
		}
		if (loginPassword.length() == 0) {
			loginPasswordList.add("パスワードを入力してください。");
			result = ERROR;
		}
		else if (!(loginPassword.length() >= 1 && loginPassword.length() <= 16)) {
			loginPasswordList.add("パスワードは1文字以上16文字以下で入力してください。");

			result = ERROR;
		}
		else if (!(loginPassword.matches("^[a-zA-Z0-9]+$"))) {
			loginPasswordList.add("パスワードは半角英数字で入力してください。");

			result = ERROR;
		}
		if (loginPasswordConfirm.length() == 0) {
			loginPasswordConfirmList.add("パスワードを入力してください。");
			result = ERROR;
		}
		else if (!(loginPasswordConfirm.length() >= 1 && loginPasswordConfirm.length() <= 8)) {
			loginPasswordConfirmList.add("パスワードは1文字以上8文字以下で入力してください。");

			result = ERROR;
		}
		else if (!(loginPasswordConfirm.matches("^[a-zA-Z0-9]+$"))) {
			loginPasswordConfirmList.add("パスワードは半角英語で入力してください。");

			result = ERROR;
		}

				return  result;
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

	public String getLoginPasswordConfirm() {
		return loginPasswordConfirm;
	}

	public void setLoginPasswordConfirm(String loginPasswordConfirm) {
		this.loginPasswordConfirm = loginPasswordConfirm;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public List<String> getLoginUserIdList() {
		return loginUserIdList;
	}

	public void setLoginUserIdList(List<String> loginUserIdList) {
		this.loginUserIdList = loginUserIdList;
	}

	public List<String> getLoginPasswordList() {
		return loginPasswordList;
	}

	public void setLoginPasswordList(List<String> loginPasswordList) {
		this.loginPasswordList = loginPasswordList;
	}

	public List<String> getLoginPasswordConfirmList() {
		return loginPasswordConfirmList;
	}

	public void setLoginPasswordConfirmList(List<String> loginPasswordConfirmList) {
		this.loginPasswordConfirmList = loginPasswordConfirmList;
	}



}