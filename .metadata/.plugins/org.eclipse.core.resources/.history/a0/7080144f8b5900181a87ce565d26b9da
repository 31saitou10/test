package com.internousdev.miamiburger.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserCreateAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;

	private String errorId = null; // IDエラー
	private String errorPass = null; // パスワードエラー
	private String errorCheck = null; // 確認用パスワードエラー
	private String errorSei = null; // 姓名エラー
	private String errorMei = null;
	private String errorSeiKana = null; // 姓名（ひらがな）エラー
	private String errorMeiKana = null;
	private String errorEmail = null; // メールアドレスエラー
	private String sex = "";
	private String errorQuestion = null; // 秘密の質問エラー
	private String errorAnswer = null;

	public String execute() {
		return SUCCESS;
	}

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



	public String getErrorSei() {
		return errorSei;
	}

	public void setErrorSei(String errorSei) {
		this.errorSei = errorSei;
	}

	public String getErrorMei() {
		return errorMei;
	}

	public void setErrorMei(String errorMei) {
		this.errorMei = errorMei;
	}

	public String getErrorSeiKana() {
		return errorSeiKana;
	}

	public void setErrorSeiKana(String errorSeiKana) {
		this.errorSeiKana = errorSeiKana;
	}

	public String getErrorMeiKana() {
		return errorMeiKana;
	}

	public void setErrorMeiKana(String errorMeiKana) {
		this.errorMeiKana = errorMeiKana;
	}

	public String getErrorEmail() {
		return errorEmail;
	}

	public void setErrorEmail(String errorEmail) {
		this.errorEmail = errorEmail;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
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
