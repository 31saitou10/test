package com.internousdev.miamiburger.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miamiburger.dao.UserCreateConfirmDAO;
import com.internousdev.miamiburger.util.InputChecker;
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

	private String errorId = "";        //IDエラー
	private String errorPass = "";          //パスワードエラー
	private String errorCheck = "";         //確認用パスワードエラー
	private String errorName = "";          //姓名エラー
	private String errorNameKana = "";      //姓名（ひらがな）エラー
	private String errorEmail = "";         //メールアドレスエラー
	private String errorQuestion;      //秘密の質問エラー
	private String errorAnswer = "";        //秘密の質問の回答エラー


	int i;

	private InputChecker inputChecker = new InputChecker();

	public List<String> ErrorUserIdList = new ArrayList<>();
	public List<String> ErrorPasswordList = new ArrayList<>();
	public List<String> ErrorReconfirmPassList = new ArrayList<>();
	public List<String> ErrorFamilyNameList = new ArrayList<>();
	public List<String> ErrorFirstNameList = new ArrayList<>();
	public List<String> ErrorFamilyNameKanaList = new ArrayList<>();
	public List<String> ErrorFirstNameKanaList = new ArrayList<>();
	public List<String> ErrorEmailList = new ArrayList<>();
	public List<String> ErrorQuestionList = new ArrayList<>();
	public List<String> ErrorAnswerList = new ArrayList<>();

	private UserCreateConfirmDAO userCreateConfirmDAO = new UserCreateConfirmDAO();

	private Map<String,Object> session;

	/*------エラー出力--------*/

	public String execute() throws SQLException{

		String result = ERROR;

		String checkUserId = userCreateConfirmDAO.getConfirmUser(userId);

		System.out.println(checkUserId);
		System.out.println(userId);

		ErrorUserIdList = inputChecker.doCheck("ユーザーID", userId, 1, 8, true, false, false, true, true);
		ErrorPasswordList = inputChecker.doCheck("パスワード", password, 1, 16, true, false, false, true, true);
		ErrorReconfirmPassList = inputChecker.doPasswordCheck(password, checkPassword);
		ErrorFamilyNameList = inputChecker.doCheck("姓", familyName, 1, 16, true, true, true, false, false);
		ErrorFirstNameList = inputChecker.doCheck("名", firstName, 1, 16, true, true, true, false, false);
		ErrorFamilyNameKanaList = inputChecker.doCheck("姓ふりがな", familyNameKana, 1, 16, false, false, true, false, false);
		ErrorFirstNameKanaList = inputChecker.doCheck("名ふりがな", firstNameKana, 1, 16, false, false, true, false, false);
		ErrorEmailList = inputChecker.doCheck("メールアドレス", email, 14, 32, true, false, false, true, true);
		ErrorAnswerList = inputChecker.doCheck("メールアドレス", secretAnswer, 1, 16, true, true, true, true, true);


		if(
				ErrorUserIdList.size() == 0 &&
				!(checkUserId.equals(userId)) &&
				ErrorPasswordList.size() == 0 &&
				ErrorReconfirmPassList.size() == 0 &&
				ErrorFamilyNameList.size() == 0 &&
				ErrorFirstNameList.size() == 0 &&
				ErrorFamilyNameKanaList.size() == 0 &&
				ErrorFirstNameKanaList.size() == 0 &&
				ErrorEmailList.size() == 0 &&
				secretQuestion != null &&
				ErrorAnswerList.size() == 0
				){
			result = SUCCESS;
		}else{
			for(i=0;i < ErrorUserIdList.size()-1;i++){
				errorId = errorId + ErrorUserIdList.get(i);
			}
			if(!(userId.equals(""))){
				if (checkUserId.equals(userId)) {
					errorId = errorId + "そのユーザーIDはすでに使われています";
				}
			}
			for(i=0;i < ErrorPasswordList.size()-1;i++){
				errorPass = errorPass + ErrorPasswordList.get(i);
			}
			for(i=0;i < ErrorReconfirmPassList.size()-1;i++){
				errorCheck = errorCheck + ErrorReconfirmPassList.get(i);
			}
			for(i=0;i < ErrorFamilyNameList.size()-1;i++){
				errorName = errorName + ErrorFamilyNameList.get(i);
			}
			for(i=0;i < ErrorFirstNameList.size()-1;i++){
				errorName = errorName + ErrorFirstNameList.get(i);
			}
			for(i=0;i < ErrorFamilyNameKanaList.size()-1;i++){
				errorNameKana = errorNameKana + ErrorFamilyNameKanaList.get(i);
			}
			for(i=0;i < ErrorFirstNameKanaList.size()-1;i++){
				errorNameKana = errorNameKana + ErrorFirstNameKanaList.get(i);
			}
			for(i=0;i < ErrorEmailList.size()-1;i++){
				errorEmail = errorEmail + ErrorEmailList.get(i);
			}
			if(secretQuestion != null ){
				errorQuestion = "選択してください。";
			}
			for(i=0;i < ErrorAnswerList.size()-1;i++){
				errorAnswer = errorAnswer + ErrorAnswerList.get(i);
			}
		}


		session.put("userId", userId);
		session.put("password",password);
		session.put("familyName",familyName);
		session.put("firstName",firstName);
		session.put("familyNameKana",familyNameKana);
		session.put("firstNameKana",firstNameKana);
		session.put("sex",sex);
		session.put("email",email);
		session.put("secretQuestion",secretQuestion);
		session.put("secretAnswer",secretAnswer);



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



	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
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



	public String getCheckPassword() {
		return checkPassword;
	}



	public void setCheckPassword(String checkPassword) {
		this.checkPassword = checkPassword;
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



	public String getErrorCheck() {
		return errorCheck;
	}



	public void setErrorCheck(String errorCheck) {
		this.errorCheck = errorCheck;
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
		this.errorQuestion = errorQuestion;
	}



	public String getErrorAnswer() {
		return errorAnswer;
	}



	public void setErrorAnswer(String errorAnswer) {
		this.errorAnswer = errorAnswer;
	}



	public int getI() {
		return i;
	}



	public void setI(int i) {
		this.i = i;
	}



	public InputChecker getInputChecker() {
		return inputChecker;
	}



	public void setInputChecker(InputChecker inputChecker) {
		this.inputChecker = inputChecker;
	}



	public List<String> getErrorUserIdList() {
		return ErrorUserIdList;
	}



	public void setErrorUserIdList(List<String> errorUserIdList) {
		ErrorUserIdList = errorUserIdList;
	}



	public Map<String, Object> getSession() {
		return session;
	}
}