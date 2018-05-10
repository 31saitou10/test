package com.internousdev.miamiburger.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmAction extends ActionSupport implements SessionAware {

	private String userId;             //ユーザーID
	private String password;           //パスワード
	private String checkPassword;      //確認用パスワード
	private String familyName;         //姓
	private String firstName;          //名
	private String familyNameKana;     //姓（ひらがな）
	private String firstNameKana;      //名（ひらがな）
	private String sex;                //性別
	private String email;              //メールアドレス

	private String secretQuestion;     //秘密の質問
	private String secretAnswer;       //秘密の質問の答え

	private String passCon;            //パスワードを＊で暗号化

	private String errorId;            //IDエラー
	private String errorPass;          //パスワードエラー
	private String errorCheck;         //確認用パスワードエラー
	private String errorName;          //姓名エラー
	private String errorNameKana;      //姓名（ひらがな）エラー
	private String errorEmail;         //メールアドレスエラー
	private String errorQuestion;      //秘密の質問エラー
	private String errorAnswer;        //秘密の質問の回答エラー

	private Map<String,Object> session;

	/*------エラー出力--------*/

	public String execute(){

		if(userId == null) return ERROR;

		String result = SUCCESS;

		session.put("userId", userId);
		session.put("password",password);
		session.put("familyName",familyName);
		session.put("firstName",firstName);
		session.put("familyNameKana",familyNameKana);
		session.put("firstNameKana",firstNameKana);
		session.put("sex",sex);
		session.put("email",email);
		session.put("secretQuestion",secretQuestion);
		session.put("secretAnswer",secretQuestion);

    /*----ユーザーID-----*/

		//未入力
		if(userId.equals("")){
			errorId = "ユーザーIDを入力してください。";
			result = ERROR;
		}

		//文字数エラー
		else if(!(userId.length() >=1 && userId.length() <=8)){
			errorId = "ユーザーIDは8文字以内で入力してください。";
			result = ERROR;
		}

		//文字種エラー
		else if(!(userId.matches("^[0-9a-zA-Z]+$"))){
			errorId = "ユーザーIDは半角英数字で入力してください。";
			result = ERROR;
		}


	/*------パスワード------*/

		//未入力
		if(password.equals("")){
			errorPass = "パスワードを入力してください。";
			result = ERROR;
		}

		//文字数エラー
		else if(!(password.length() <=16)){
			errorPass = "パスワードは16文字以内で入力してください。";
			result = ERROR;
		}

		//文字種エラー
		else if(!(password.matches("^[0-9a-zA-Z]+$"))){
			errorPass ="パスワードは半角英数字で入力してください。";
			result = ERROR;
		}

	/*------パスワード確認用------*/

		//未入力
		if(password.equals("")){
			errorCheck = "パスワードを入力してください。";
			result = ERROR;
		}

		//入力間違え
		else if (password == errorCheck) {
			   errorCheck = "";
			 } else {
			   errorCheck =  "パスワードが一致しません";
			 }

	/*-------名前（姓・名）------*/


		//未入力
		if(familyName.equals("") || firstName.equals("")){
			errorName = "姓・名を入力してください。";
			result = ERROR;
		}

		//文字数エラー
		else if(!(familyName.length() >=1 && familyName.length() <=16)
				|| !(firstName.length() >=1 && firstName.length() <=16)){
			errorName = "姓・名はそれぞれ16文字以内で入力してください。";
			result = ERROR;
		}

		//文字種エラー
		else if(!(familyName.matches("^[a-zA-Zぁ-ゞ一-龠]+$")) || !(firstName.matches("^[a-zA-Zぁ-ゞ一-龠]+$"))){
			errorName = "姓・名は半角英字,漢字,ひらがなで入力してください。";
			result = ERROR;
		}



	/*-------名前（せい・めい）---------*/

		//未入力
		if(familyNameKana.equals("") || firstNameKana.equals("")){
			errorNameKana = "せい・めいを入力してください。";
			result = ERROR;
		}

		//文字数エラー
		else if(!(familyNameKana.length() >=1 && familyNameKana.length() <=16)
				|| !(firstNameKana.length() >=1 && firstNameKana.length() <=16)){
			errorNameKana = "せい・めいはそれぞれ16文字以内で入力してください。";
			result = ERROR;
		}

		//文字種エラー
		else if(!(familyNameKana.matches("^[ぁ-ゞ]+$")) || !(firstNameKana.matches("^[ぁ-ゞ]+$"))){
			errorNameKana = "せい・めいは「ひらがな」で入力してください。";
			result = ERROR;
		}



	/*-------メールアドレス------*/

		//未入力
		if(email.equals("")){
			errorEmail = "メールアドレスを入力してください。";
			result = ERROR;
		}

		//文字数エラー
		else if(!(email.length() >=14 && email.length() <=32)){
			errorEmail = "メールアドレスは14文字以上32文字以下で入力してください。";
			result = ERROR;
		}

		 //文字種エラー
		else if(!(email.matches("^([a-zA-Z0-9])+([a-zA-Z0-9¥._-])*@([a-zA-Z0-9_-])+([a-zA-Z0-9¥._-]+)+$"))){
			errorEmail = "半角＠を含む正しいメールアドレスの形で入力してください。";
			result = ERROR;
		}

	/*------秘密の質問------*/
		if (!(secretQuestion.matches("^[1-3]+$"))) {
			errorQuestion = "質問を選択してください。";
			result = ERROR;
		}


	/*------秘密の質問の答え------*/

		//未入力
		if(secretAnswer.equals("")){
			errorAnswer  = "質問の答えを入力してください。";
			result = ERROR;
		}


	/*-----パスワード暗号化(*)------*/

		if (password.length() > 2) {
			StringBuilder sb = new StringBuilder(password);

			for (int i = 2; i < password.length(); i++) {
				sb.setCharAt(i, '*');
				System.out.println(String.valueOf(sb));
			}

			passCon = sb.toString();
		}else if(password.length() == 2){
			passCon = "**";
		}else if(password.length() == 1){
			passCon = "*";
		}


		return result;
	}



   /*-----ゲッターとセッター-----*/

	public String getErrorCheck() {
		return errorCheck;
	}



	public void setErrorCheck(String errorCheck) {
		this.errorCheck = errorCheck;
	}



	public String getUserId(){
		return userId;
	}

	public void setUserId(String userId){
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


	public String getCheckPassword() {
		return checkPassword;
	}



	public void setCheckPassword(String checkPassword) {
		this.checkPassword = checkPassword;
	}



	public String getSex() {
		return sex;
	}



	public void setSex(String sex) {
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

	public String getPassCon() {
		return passCon;
	}

	public void setPassCon(String passCon) {
		this.passCon = passCon;
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
		this.errorAnswer = errorQuestion;
	}


	public String getErrorAnswer() {
		return errorAnswer;
	}


	public void setErrorAnswer(String errorAnswer) {
		this.errorAnswer = errorAnswer;
	}


	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}
}