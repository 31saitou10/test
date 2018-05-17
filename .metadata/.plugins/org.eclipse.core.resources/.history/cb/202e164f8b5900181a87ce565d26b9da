package com.internousdev.miamiburger.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserUpdateAction extends ActionSupport implements SessionAware {
//session情報
	public Map<String, Object> session;
	private String errorId = "";        //IDエラー
	private String errorPass = "";          //パスワードエラー
	private String errorCheck = "";         //確認用パスワードエラー
	private String errorName = "";          //姓名エラー
	private String errorNameKana = "";      //姓名（ひらがな）エラー
	private String errorEmail = "";         //メールアドレスエラー
	private String errorQuestion;      //秘密の質問エラー
	private String errorAnswer = "";        //秘密の質問の回答エラー

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

	public String getErrorId() {
		return errorId;
	}

	public void setErrorId(String errorId) {
		this.errorId = errorId;
	}

	public String getErrorPass() {
		return errorPass;
	}

	public void setErrorPass(String errorPass) {
		this.errorPass = errorPass;
	}

	public String getErrorCheck() {
		return errorCheck;
	}

	public void setErrorCheck(String errorCheck) {
		this.errorCheck = errorCheck;
	}

	public String getErrorName() {
		return errorName;
	}

	public void setErrorName(String errorName) {
		this.errorName = errorName;
	}

	public String getErrorNameKana() {
		return errorNameKana;
	}

	public void setErrorNameKana(String errorNameKana) {
		this.errorNameKana = errorNameKana;
	}

	public String getErrorEmail() {
		return errorEmail;
	}

	public void setErrorEmail(String errorEmail) {
		this.errorEmail = errorEmail;
	}

	public String getErrorQuestion() {
		return errorQuestion;
	}

	public void setErrorQuestion(String errorQuestion) {
		this.errorQuestion = errorQuestion;
	}

	public String getErrorAnswer() {
		return errorAnswer;
	}

	public void setErrorAnswer(String errorAnswer) {
		this.errorAnswer = errorAnswer;
	}

}
