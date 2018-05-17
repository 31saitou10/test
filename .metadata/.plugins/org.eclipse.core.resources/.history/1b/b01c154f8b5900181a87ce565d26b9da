package com.internousdev.miamiburger.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miamiburger.dao.LoginDAO;
import com.internousdev.miamiburger.dao.UserCreateCompleteDAO;
import com.internousdev.miamiburger.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware {

	private String userId;
	private String password;
	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private int sex;
	private String email;
	private String secretQuestion;
	private String secretAnswer;
	public Map<String, Object> session;


	public String execute() throws SQLException {
		String result = SUCCESS;


		UserCreateCompleteDAO userCreateCompleteDAO = new UserCreateCompleteDAO();
		int checkInsert = userCreateCompleteDAO.createUser(userId,password,familyName,firstName,familyNameKana,firstNameKana,sex,email,secretQuestion,secretAnswer);

		if(checkInsert > 0){
			System.out.println("ユーザー情報の書き込み成功");
		}

		//		ログインする
		LoginDAO dao = new LoginDAO();
		UserInfoDTO userInfoDTO = new UserInfoDTO();

		//ユーザーの情報をDTOに詰める
		userInfoDTO = dao.login(session.get("userId").toString(), session.get("password").toString());

		session.put("userInfoDTO",userInfoDTO);

		//カートの書き換え
		int check = dao.changeUserCart(session.get("userId").toString(), session.get("temp_user_id").toString());
		if(check == 0){
			System.out.println("カートへの書き換えなし。");
		}

//		idCheckにnullを代入
		int idCheck = 0;
		session.put("idCheck",idCheck);
		return result;


	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
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


	public int getSex() {
		return sex;
	}


	public void setSex(int sex) {
		this.sex = sex;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSecretQuestion() {
		return secretQuestion;
	}


	public void setSecretQuestion(String secretQuestion) {
		this.secretQuestion = secretQuestion;
	}


	public String getSecretAnswer() {
		return secretAnswer;
	}


	public void setSecretAnswer(String secretAnswer) {
		this.secretAnswer = secretAnswer;
	}


	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
