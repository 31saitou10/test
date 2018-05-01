package com.internousdev.fifties.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.fifties.dao.UserUpdateConfirmDAO;
import com.internousdev.fifties.dto.UserUpdateDTO;
import com.internousdev.fifties.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

//林作成
public class UserUpdateConfirmAction extends ActionSupport implements SessionAware {

	private String user_id;

	private String password;

	private String newPassword;

	private String rePassword;

	private String newEmail;

	private String familyName;

	private String firstName;

	private String familyNameKana;

	private String firstNameKana;

	private Map<String, Object> session;

	private String errorPass;        //パスワードエラー
	private String errorRePass;		//確認用パスワードエラー
	private String errorFamilyName;	//姓エラー
	private String errorFirstName;	//名エラー
	private String errorFamilyNameKana;  //姓（ひらがな）エラー
	private String errorFirstNameKana; 	//名（ひらがな）エラー
	private String errorEmail;       //メールアドレスエラー


	public String execute() throws SQLException {

		UserUpdateConfirmDAO dao = new UserUpdateConfirmDAO();
		UserUpdateDTO dto = new UserUpdateDTO();
		InputChecker ic = new InputChecker();
		String result = SUCCESS;

		dto = dao.getUserInfo(user_id);

		//新しいパスワード
		if (!ic.newPasswordChk(newPassword).equals("TRUE")) {
			errorPass =ic.newPasswordChk(newPassword);
			result = ERROR;
		} else if (!(password.equals(dto.getPassword()))) {
			errorPass = "現在のパスワードが間違っています";
			result = ERROR;
		}

		//新しいメールアドレス
		if (!ic.newEmailChk(newEmail).equals("TRUE")) {
			errorEmail = ic.newEmailChk(newEmail);
			result = ERROR;
		}

		//姓
		if(!ic.familyNameChk(familyName).equals("TRUE")) {
			errorFamilyName = ic.familyNameChk(familyName);
			result = ERROR;
		}

		//名
		if(!ic.firstNameChk(firstName).equals("TRUE")) {
			errorFirstName =  ic.firstNameChk(firstName);
			result = ERROR;
		}

		//姓かな
		if(!ic.familyNameKanaChk(familyNameKana).equals("TRUE")) {
			errorFamilyNameKana = ic.familyNameKanaChk(familyNameKana);
			result = ERROR;
		}

		//名かな
		if(!ic.firstNameKanaChk(firstNameKana).equals("TRUE")) {
			errorFirstNameKana = ic.firstNameKanaChk(firstNameKana);
			result = ERROR;
		}

		//確認パスワード
		if(!ic.reNewPasswordChk(rePassword, newPassword).equals("TRUE")) {
			errorRePass = ic.reNewPasswordChk(rePassword, newPassword);
			result = ERROR;
		}


		if(!(newPassword.equals("")) && !(newEmail.equals("")) && !(familyName.equals(""))
				&& !(firstName.equals("")) && !(familyNameKana.equals("")) && !(firstNameKana.equals(""))) {
			session.put("newPassword", newPassword);
			session.put("newEmail", newEmail);
			session.put("familyName", familyName);
			session.put("firstName", firstName);
			session.put("familyNameKana", familyNameKana);
			session.put("firstNameKana", firstNameKana);

		}
		return result;
	}




	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getNewPassword() {
		return newPassword;
	}


	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}


	public String getRePassword() {
		return rePassword;
	}


	public void setRePassword(String rePassword) {
		this.rePassword = rePassword;
	}


	public String getNewEmail() {
		return newEmail;
	}


	public void setNewEmail(String newEmail) {
		this.newEmail = newEmail;
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


	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}



	public String getErrorPass() {
		return errorPass;
	}




	public void setErrorPass(String errorPass) {
		this.errorPass = errorPass;
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


	public String getErrorRePass() {
		return errorRePass;
	}




	public void setErrorRePass(String errorRePass) {
		this.errorRePass = errorRePass;
	}



}
