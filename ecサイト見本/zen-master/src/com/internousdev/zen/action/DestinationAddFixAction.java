package com.internousdev.zen.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class DestinationAddFixAction extends ActionSupport
		implements SessionAware {
	private String family_name;
	private String first_name;
	private String family_name_kana;
	private String first_name_kana;
	private String user_address;
	private String tel_number;
	private String email;

	public Map<String, Object> session;

	public String execute() {
		String result = SUCCESS;

		// 入力された宛先情報をsessionに入れて保持する
		session.put("family_name", family_name);
		session.put("first_name", first_name);
		session.put("family_name_kana", family_name_kana);
		session.put("first_name_kana", first_name_kana);
		session.put("user_address", user_address);
		session.put("tel_number", tel_number);
		session.put("email", email);

		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getFamily_name() {
		return family_name;
	}

	public void setFamily_name(String family_name) {
		this.family_name = family_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getFamily_name_kana() {
		return family_name_kana;
	}

	public void setFamily_name_kana(String family_name_kana) {
		this.family_name_kana = family_name_kana;
	}

	public String getFirst_name_kana() {
		return first_name_kana;
	}

	public void setFirst_name_kana(String first_name_kana) {
		this.first_name_kana = first_name_kana;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public String getTel_number() {
		return tel_number;
	}

	public void setTel_number(String tel_number) {
		this.tel_number = tel_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
