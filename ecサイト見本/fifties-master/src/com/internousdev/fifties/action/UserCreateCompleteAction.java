package com.internousdev.fifties.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.fifties.dao.CartInfoDAO;
import com.internousdev.fifties.dao.LoginDAO;
import com.internousdev.fifties.dao.UserCreateCompleteDAO;
import com.internousdev.fifties.dto.CartInfoDTO;
import com.internousdev.fifties.dto.LoginDTO;
/*import com.internousdev.fifties.dto.LoginDTO;*/
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
	private String question;
	private String answer;

	private String token; //userCreateConfirm.jspから受け取るtoken

	private Map<String, Object> session;

	@Override
	public String execute() throws SQLException {

		String sessionToken = (String) session.get("token");
		if (sessionToken == null || !(token.equals(token))) {
			return ERROR;
		}
		session.remove("token");

		UserCreateCompleteDAO uccDAO = new UserCreateCompleteDAO();
		/*-----データベースに格納---------*/
		int result = uccDAO.createUser(
				userId,
				password,
				familyName,
				firstName,
				familyNameKana,
				firstNameKana,
				sex,
				email,
				question,
				answer

		);
		if (result == 0) {
			return ERROR;
		}

		//登録完了後ログイン状態にするためユーザーIDのみセッション格納
		LoginDTO loginDTO = new LoginDTO();
		LoginDAO loginDAO = new LoginDAO();

		loginDTO = loginDAO.getUserInfo(userId, password);
		boolean loginFlg = (boolean) session.get("loginFlg");
		loginFlg = true;
		session.put("loginFlg", loginFlg);
		session.put("userId", userId);
		session.put("userInfoDTO", loginDTO);

		//カート情報を書き換える
		CartInfoDAO cartInfoDAO = new CartInfoDAO();
		ArrayList<CartInfoDTO> cartList = new ArrayList<CartInfoDTO>();
		String tempUserId = session.get("tempUserId").toString();
		cartList = cartInfoDAO.getUserCartList(tempUserId);
		for (CartInfoDTO cartInfoDTO : cartList) {
			cartInfoDAO.changeTempUserCart(userId, tempUserId, cartInfoDTO.getProductId());
		}

		return SUCCESS;

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

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
