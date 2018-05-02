package com.internousdev.zen.dto;

public class LoginDTO {

	private int id;
	private String loginUserId;
	private String loginPassword;
	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private String loginFlg;


	public int getId() {
	    return id;
	}


	public void setId(int id) {
	    this.id = id;
	}


	public String getLoginUserId() {
	    return loginUserId;
	}


	public void setLoginUserId(String loginUserId) {
	    this.loginUserId = loginUserId;
	}


	public String getLoginPassword() {
	    return loginPassword;
	}


	public void setLoginPassword(String loginPassword) {
	    this.loginPassword = loginPassword;
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


	public String getLoginFlg() {
		return loginFlg;
	}


	public void setLoginFlg(String loginFlg) {
		this.loginFlg = loginFlg;
	}


}