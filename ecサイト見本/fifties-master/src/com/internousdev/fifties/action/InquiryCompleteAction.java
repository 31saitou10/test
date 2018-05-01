package com.internousdev.fifties.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.fifties.dao.InquiryCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class InquiryCompleteAction extends ActionSupport implements SessionAware{
	private String inquiryName;
	private String inquiryEmail;
	private String qtype;
	private String inquiryBody;
	private String errorMessage;
	public Map<String,Object> session;
	private InquiryCompleteDAO inquiryCompleteDAO = new InquiryCompleteDAO();

	public String execute() throws SQLException{

		String result;

		boolean check = inquiryCompleteDAO.insertInquiry(
					session.get("inquiryName").toString(),
					session.get("inquiryEmail").toString(),
					session.get("qtype").toString(),
					session.get("inquiryBody").toString());

		if(check == false){
			errorMessage = "送信に失敗しました。もう一度お試しください。";
			result = ERROR;
		}else{
			result = SUCCESS;
			}

		return result;
	}

	public String getInquiryName(){
		return inquiryName;
	}
	public void setInquiryName(String inquiryName){
		this.inquiryName = inquiryName;
	}


	public String getInquiryEmail(){
		return inquiryEmail;
	}
	public void setInquiryEmail(String inquiryEmail){
		this.inquiryEmail = inquiryEmail;
	}


	public String getQtype(){
		return qtype;
	}
	public void setQtype(String qtype){
		this.qtype = qtype;
	}


	public String getInquiryBody(){
		return inquiryBody;
	}
	public void setInquiryBody(String inquiryBody){
		this.inquiryBody = inquiryBody;
	}


	public String GetErrorMessage(){
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage){
		this.errorMessage = errorMessage;
	}

@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}
}