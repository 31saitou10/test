package com.internousdev.zen.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.zen.dao.DestinationAddDAO;
import com.opensymphony.xwork2.ActionSupport;

public class DestinationAddCompleteAction extends ActionSupport implements SessionAware{
	// 入力される宛先情報
	private String user_id;
	private String family_name;
	private String first_name;
	private String family_name_kana;
	private String first_name_kana;
	private String user_address;
	private String tel_number;
	private String email;

	// 結果によって表示するメッセージ
	private final String SUCCESS_MESSAGE = "宛先情報の入力が完了しました。";
	private final String ERROR_MESSAGE = "宛先情報の入力が失敗しました。もう一度やり直してください。";

	public Map<String, Object> session;

	public String execute() throws SQLException{
		int result = 0;
		DestinationAddDAO destinationAddDAO = new DestinationAddDAO();

		// ログインユーザIDを取得
		user_id = (String) session.get("loginUserId");

		// 入力された宛先情報をcart_infoテーブルに書き込む
		result = destinationAddDAO.AddDestination(user_id,
				session.get("family_name").toString(),
				session.get("first_name").toString(),
				session.get("family_name_kana").toString(),
				session.get("first_name_kana").toString(),
				session.get("user_address").toString(),
				session.get("tel_number").toString(),
				session.get("email").toString());

		// 宛先情報の入力が成功したかのチェック
		if(result == 1) {
			return SUCCESS;
		}else {
			return ERROR;
		}
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
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

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public String getSUCCESS_MESSAGE() {
		return SUCCESS_MESSAGE;
	}

	public String getERROR_MESSAGE() {
		return ERROR_MESSAGE;
	}
}
