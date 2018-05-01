package com.internousdev.fifties.action;

import com.opensymphony.xwork2.ActionSupport;

//森作成

//問い合わせ確認画面から内容を保持したまま入力画面に
//戻るためのActionクラスです。

public class InquiryBackAction extends ActionSupport{
	private String inquiryName;
	private String inquiryEmail;
	private String inquiryBody;

	public String execute(){
		return SUCCESS;
	}


	//------------------------getter/setter------------------------
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


	public String getInquiryBody(){
		return inquiryBody;
	}
	public void setInquiryBody(String inquiryBody){
		this.inquiryBody = inquiryBody;
	}
}
