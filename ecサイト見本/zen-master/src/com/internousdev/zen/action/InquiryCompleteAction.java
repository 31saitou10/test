package com.internousdev.zen.action;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.zen.dao.InquiryCompleteDAO;
import com.internousdev.zen.dto.InquiryDTO;
import com.opensymphony.xwork2.ActionSupport;

public class InquiryCompleteAction extends ActionSupport implements SessionAware {
	private String name;
	private String mailaddress;
	private String qtype;
	private String body;

	/*エラー関連*/
//	private String errorMsg;
	private String errorName;
	private String errorMailaddress;
	private String errorBody;
	private String errorOverName;
	private String errorOverMailaddress;
	private String errorEmail;
	private String errorOverBody;
	private int errorFlag=0;


	private Map<String, Object> session;

	private List<InquiryDTO> inquiryDTOList = new ArrayList<InquiryDTO>();

	public String execute() throws SQLException{
		String result = ERROR;

		if (name.equals("")) {
			errorName = "お名前を入力してください。";
			errorFlag = 1;
		}

		if(name.length() >= 255){
			errorOverName = "255文字以下で入力してください。";
			errorFlag = 1;
		}

		if (mailaddress.equals("")) {
			errorMailaddress = "メールアドレスを入力してください。";
			errorFlag = 1;
		}

		if(mailaddress.length() >= 255){
			errorOverMailaddress = "255文字以下で入力してください。";
			errorFlag = 1;
		}

		if(!(mailaddress.matches("^([a-zA-Z0-9])+([a-zA-Z0-9¥._-])*@([a-zA-Z0-9_-])+([a-zA-Z0-9¥._-]+)+$"))){
			errorEmail = "半角＠を含む正しいメールアドレスの形で入力してください。";
			errorFlag = 1;
		}

		if (body.equals("")) {
			errorBody = "内容を入力してください。";
			errorFlag = 1;
		}

		if(body.length() >= 255){
			errorOverBody = "255文字以下で入力してください。";
			errorFlag = 1;
		}

		if(errorFlag == 1){
			return ERROR;
		}

		InquiryCompleteDAO dao = new InquiryCompleteDAO();

		int count = dao.insert(name, mailaddress, qtype, body);
		if (count > 0) {
			inquiryDTOList = dao.select();
			session.put("inquiryDTOList", inquiryDTOList);

			result = SUCCESS;
		}
		return result;
	}

	public String getErrorName() {
		return errorName;
	}

	public void setErrorName(String errorName) {
		this.errorName = errorName;
	}

	public String getErrorMailaddress() {
		return errorMailaddress;
	}

	public void setErrorMailaddress(String errorMailaddress) {
		this.errorMailaddress = errorMailaddress;
	}


	public String getErrorBody() {
		return errorBody;
	}

	public void setErrorBody(String errorBody) {
		this.errorBody = errorBody;
	}


	public List<InquiryDTO> getInquiryDTOList() {
		return inquiryDTOList;
	}

	public void setInquiryDTOList(List<InquiryDTO> inquiryDTOList) {
		this.inquiryDTOList = inquiryDTOList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailaddress() {
		return mailaddress;
	}

	public void setMailaddress(String mailaddress) {
		this.mailaddress = mailaddress;
	}

	public String getQtype() {
		return qtype;
	}

	public void setQtype(String qtype) {
		this.qtype = qtype;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getErrorOverBody() {
		return errorOverBody;
	}

	public void setErrorOverBody(String errorOverBody) {
		this.errorOverBody = errorOverBody;
	}

	public String getErrorOverName() {
		return errorOverName;
	}

	public void setErrorOverName(String errorOverName) {
		this.errorOverName = errorOverName;
	}

	public String getErrorOverMailaddress() {
		return errorOverMailaddress;
	}

	public void setErrorOverMailaddress(String errorOverMailaddress) {
		this.errorOverMailaddress = errorOverMailaddress;
	}

	public String getErrorEmail() {
		return errorEmail;
	}

	public void setErrorEmail(String errorEmail) {
		this.errorEmail = errorEmail;
	}



}
