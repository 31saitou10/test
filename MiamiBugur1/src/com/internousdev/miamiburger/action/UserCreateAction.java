package com.internousdev.miamiburger.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserCreateAction extends ActionSupport implements SessionAware {

	public Map<String,Object> session;

	private String errorId=null;              //IDエラー
	private String errorPass = null;          //パスワードエラー
	private String errorCheck = null;         //確認用パスワードエラー
	private String errorName = null;          //姓名エラー
	private String errorNameKana = null;      //姓名（ひらがな）エラー
	private String errorEmail = null;         //メールアドレスエラー
	private String sex = "";
	private String errorQuestion= null;       //秘密の質問エラー
	private String errorAnswer = null;

	public String execute() {
		return SUCCESS;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}


}