package com.internousdev.fifties.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class InquiryConfirmAction extends ActionSupport implements SessionAware{
	private String inquiryName;
	private String inquiryEmail;
	private String qtype;
	private String inquiryBody;
	public String qtypeSelect;
	public Map<String,Object> session;

	//----エラーメッセージ各種
	private String errorName;
	private String errorEmail;
	private String errorQtype;
	private String errorBody;


	public String execute(){
		String result = SUCCESS;

		if(qtype.equals("company")){
			 qtypeSelect="THE FIFTIESについて";
			 session.put("qtype", qtypeSelect);

		}else if(qtype.equals("product")){
			 qtypeSelect="製品について";
			 session.put("qtype", qtypeSelect);

		}else if(qtype.equals("support")){
			 qtypeSelect="アフターサポートについて";
			 session.put("qtype", qtypeSelect);

		}else if(qtype.equals("other")){
			 qtypeSelect="その他お問合わせ";
			 session.put("qtype", qtypeSelect);
		}
		session.put("inquiryName", inquiryName);
		session.put("inquiryEmail", inquiryEmail);
		session.put("inquiryBody", inquiryBody);



		//----入力エラーのチェック
		//----名前 (入力必須、0文字以上20文字以下)s
		if(inquiryName.equals("")){
			setErrorName("※お名前を入力してください。");
			result=ERROR;
		}

		else if(!(inquiryName.length() >=1 && inquiryName.length() <=20)){
			setErrorName("※お名前は20文字以内で入力してください。");
			result=ERROR;
		}

		//----メールアドレス (100文字以内)
		if(inquiryEmail.length() > 100){
			setErrorEmail("※メールアドレスが長すぎます。");
			result=ERROR;
		}else if(!inquiryEmail.matches("^[a-zA-Z0-9@.,;:!#$%&'*+-/=?^_`{|}~]+@+[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)+.+[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$")) {
			setErrorEmail("※メールアドレスは半角英数字記号で、正しいものを入力してください。");
			result = ERROR;
		}

		//----ボディ (入力必須、0文字以上250文字以下)
		if(inquiryBody.equals("")){
			setErrorBody("※お問い合わせ内容を入力してください。");
			result=ERROR;
		}
		else if(!(inquiryBody.length() >=1 && inquiryBody.length() <=250)){
			setErrorBody("※お問い合わせ内容は250文字以内で入力してください。");
			result=ERROR;
		}


	return result;
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


	public String getQtypeSelect(){
		return qtypeSelect;
	}
	public void setQtypeSelect(String qtypeSelect){
		this.qtypeSelect = qtypeSelect;
	}


	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}
	public Map<String,Object> getSession(){
		return this.session;
	}


	public String getErrorName(){
		return errorName;
	}
	public void setErrorName(String errorName){
		this.errorName = errorName;
	}


	public String getErrorEmail(){
		return errorEmail;
	}
	public void setErrorEmail(String errorEmail){
		this.errorEmail = errorEmail;
	}


	public String getErrorQtype(){
		return errorQtype;
	}
	public void setErrorQtype(String errorQtype){
		this.errorQtype = errorQtype;
	}


	public String getErrorBody(){
		return errorBody;
	}
	public void setErrorBody(String errorBody){
		this.errorBody = errorBody;
	}


}
