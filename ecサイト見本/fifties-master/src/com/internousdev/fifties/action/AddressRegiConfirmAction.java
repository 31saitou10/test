package com.internousdev.fifties.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.fifties.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;


//林作成
public class AddressRegiConfirmAction extends ActionSupport implements SessionAware {

	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private String zip11;
	private String addr11;
	private String telNumber;
	private String email;

	public Map<String, Object> session;

	private String errorFamilyName;	//姓エラー
	private String errorFirstName;	//名エラー
	private String errorFamilyNameKana;  //姓（ひらがな）エラー
	private String errorFirstNameKana; 	//名（ひらがな）エラー
	private String errorEmail;       //メールアドレスエラー
	private String errorTelNumber; 	//電話番号エラー
	private String errorZip11; 	//郵便番号エラー
	private String errorAddr11; 	//住所エラー

	public String execute() {
		String result = SUCCESS;

		//"userId"でログイン判定
		if(!(session.containsKey("userId"))) {
			result = "login";
			return result;
		}

		//入力選択に対してチェックをかける。 この時エラーで合った場合はerrorMessageを表示する。
		InputChecker ic = new InputChecker();

		if(!ic.familyNameChk(familyName).equals("TRUE")) {
			errorFamilyName = ic.familyNameChk(familyName);
			result = ERROR;
		}

		if(!ic.firstNameChk(firstName).equals("TRUE")) {
			errorFirstName = ic.firstNameChk(firstName);
			result = ERROR;
		}

		if(!ic.familyNameKanaChk(familyNameKana).equals("TRUE")) {
			errorFamilyNameKana = ic.familyNameKanaChk(familyNameKana);
			result = ERROR;
		}

		if(!ic.firstNameKanaChk(firstNameKana).equals("TRUE")) {
			errorFirstNameKana = ic.firstNameKanaChk(firstNameKana);
			result = ERROR;
		}

		if(!ic.zip11Chk(zip11).equals("TRUE")) {
			errorZip11 = ic.zip11Chk(zip11);
			result = ERROR;
		}

		if(!ic.addr11Chk(addr11).equals("TRUE")) {
			errorAddr11 = ic.addr11Chk(addr11);
			result = ERROR;
		}

		if(!ic.telNumberChk(telNumber).equals("TRUE")) {
			errorTelNumber = ic.telNumberChk(telNumber);
			result = ERROR;
		}

		if(!ic.emailChk(email).equals("TRUE")) {
			errorEmail = ic.emailChk(email);
			result = ERROR;
		}


		if(!(familyName.equals("")) && !(firstName.equals("")) && !(familyNameKana.equals(""))
				&& !(firstNameKana.equals("")) &&!(telNumber.equals("")) && !(email.equals(""))
				&& !(zip11.equals("")) && !(addr11.equals(""))) {
			session.put("familyName", familyName);
			session.put("firstName", firstName);
			session.put("familyNameKana", familyNameKana);
			session.put("firstNameKana", firstNameKana);
			session.put("email", email);
			session.put("telNumber", telNumber);
			session.put("zip11", zip11);
			session.put("addr11", addr11);
		}

		return result;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFamilyNameKana() {
		return familyNameKana;
	}

	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}

	public String getFirstNameKana() {
		return firstNameKana;
	}

	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}

	public String getZip11() {
		return zip11;
	}

	public void setZip11(String zip11) {
		this.zip11 = zip11;
	}

	public String getAddr11() {
		return addr11;
	}

	public void setAddr11(String addr11) {
		this.addr11 = addr11;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getErrorFamilyName() {
		return errorFamilyName;
	}

	public void setErrorFamilyName(String errorFamilyName) {
		this.errorFamilyName = errorFamilyName;
	}

	public String getErrorFirstName() {
		return errorFirstName;
	}

	public void setErrorFirstName(String errorFirstName) {
		this.errorFirstName = errorFirstName;
	}

	public String getErrorFamilyNameKana() {
		return errorFamilyNameKana;
	}

	public void setErrorFamilyNameKana(String errorFamilyNameKana) {
		this.errorFamilyNameKana = errorFamilyNameKana;
	}

	public String getErrorFirstNameKana() {
		return errorFirstNameKana;
	}

	public void setErrorFirstNameKana(String errorFirstNameKana) {
		this.errorFirstNameKana = errorFirstNameKana;
	}

	public String getErrorEmail() {
		return errorEmail;
	}

	public void setErrorEmail(String errorEmail) {
		this.errorEmail = errorEmail;
	}

	public String getErrorTelNumber() {
		return errorTelNumber;
	}

	public void setErrorTelNumber(String errorTelNumber) {
		this.errorTelNumber = errorTelNumber;
	}

	public String getErrorZip11() {
		return errorZip11;
	}

	public void setErrorZip11(String errorZip11) {
		this.errorZip11 = errorZip11;
	}

	public String getErrorAddr11() {
		return errorAddr11;
	}

	public void setErrorAddr11(String errorAddr11) {
		this.errorAddr11 = errorAddr11;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
