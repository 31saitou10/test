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
	private String errorSei = "";          //姓エラー
	private String errorMei="";
	private String errorSeiKana = "";      //姓（ひらがな）エラー
	private String errorMeiKana = "";
	private String errorEmail = "";         //メールアドレスエラー
	private String errorQuestion;      //秘密の質問エラー
	private String errorAnswer = "";        //秘密の質問の回答エラー


	int i;

	private InputChecker inputChecker = new InputChecker();

	public List<String> ErrorUserIdList = new ArrayList<>();
	public List<String> ErrorPasswordList = new ArrayList<>();
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

		ErrorUserIdList = inputChecker.doCheck("ユーザーID", userId, 1, 8, true, false, false, true, false);
		ErrorPasswordList = inputChecker.doCheck("パスワード", password, 1, 16, true, false, false, true, false);
		ErrorFamilyNameList = inputChecker.doCheck("姓", familyName, 1, 16, true, true, true, false, false);
		ErrorFirstNameList = inputChecker.doCheck("名", firstName, 1, 16, true, true, true, false, false);
		ErrorFamilyNameKanaList = inputChecker.doCheck("姓ふりがな", familyNameKana, 1, 16, false, false, true, false, false);
		ErrorFirstNameKanaList = inputChecker.doCheck("名ふりがな", firstNameKana, 1, 16, false, false, true, false, false);
		ErrorEmailList = inputChecker.doCheck("メールアドレス", email, 14, 32, true, false, false, true, true);
		ErrorAnswerList = inputChecker.doCheck("質問の答え", secretAnswer, 1, 10, true, true, true, true, true);

		if(
				ErrorUserIdList.size() == 0 &&
				!(checkUserId.equals(userId)) &&
				ErrorPasswordList.size() == 0 &&
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
			for(i=0;i < ErrorUserIdList.size();i++){
				errorId = errorId + ErrorUserIdList.get(i);
			}
			if(!(userId.equals(""))){
				if (checkUserId.equals(userId)) {
					errorId = errorId + "そのユーザーIDはすでに使われています";
				}
			}
			for(i=0;i < ErrorPasswordList.size();i++){
				errorPass = errorPass + ErrorPasswordList.get(i);
			}
			for(i=0;i < ErrorFamilyNameList.size();i++){
				errorSei = errorSei + ErrorFamilyNameList.get(i);
			}
			for(i=0;i < ErrorFirstNameList.size();i++){
				errorMei = errorMei + ErrorFirstNameList.get(i);
			}
			for(i=0;i < ErrorFamilyNameKanaList.size();i++){
				errorSeiKana = errorSeiKana + ErrorFamilyNameKanaList.get(i);
			}
			for(i=0;i < ErrorFirstNameKanaList.size();i++){
				errorMeiKana = errorMeiKana + ErrorFirstNameKanaList.get(i);
			}
			for(i=0;i < ErrorEmailList.size();i++){
				errorEmail = errorEmail + ErrorEmailList.get(i);
			}
			if(secretQuestion == null ){
				errorQuestion = "選択してください。";
			}
			for(i=0;i < ErrorAnswerList.size();i++){
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


		passCon = "";
		if(password.length() > 0){
			for(int i = 0; i < password.length(); i++){
				passCon += "*";
			}
		}


		return result;
	}

 /*-----ゲッターとセッター-----*/
	public String getUserId() {
		return userId;
	}

	public String getPassword() {
		return password;
	}

	public String getFamilyName() {
		return familyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getFamilyNameKana() {
		return familyNameKana;
	}

	public String getFirstNameKana() {
		return firstNameKana;
	}

	public String getSex() {
		return sex;
	}

	public String getEmail() {
		return email;
	}

	public String getSecretQuestion() {
		return secretQuestion;
	}

	public String getSecretAnswer() {
		return secretAnswer;
	}

	public String getPassCon() {
		return passCon;
	}

	public String getErrorId() {
		return errorId;
	}

	public String getErrorPass() {
		return errorPass;
	}

	public String getErrorCheck() {
		return errorCheck;
	}

	public String getErrorEmail() {
		return errorEmail;
	}

	public String getErrorQuestion() {
		return errorQuestion;
	}

	public String getErrorAnswer() {
		return errorAnswer;
	}

	public int getI() {
		return i;
	}

	public InputChecker getInputChecker() {
		return inputChecker;
	}

	public List<String> getErrorUserIdList() {
		return ErrorUserIdList;
	}

	public List<String> getErrorPasswordList() {
		return ErrorPasswordList;
	}

	public List<String> getErrorFamilyNameList() {
		return ErrorFamilyNameList;
	}

	public List<String> getErrorFirstNameList() {
		return ErrorFirstNameList;
	}

	public List<String> getErrorFamilyNameKanaList() {
		return ErrorFamilyNameKanaList;
	}

	public List<String> getErrorFirstNameKanaList() {
		return ErrorFirstNameKanaList;
	}

	public List<String> getErrorEmailList() {
		return ErrorEmailList;
	}

	public List<String> getErrorQuestionList() {
		return ErrorQuestionList;
	}

	public List<String> getErrorAnswerList() {
		return ErrorAnswerList;
	}

	public UserCreateConfirmDAO getUserCreateConfirmDAO() {
		return userCreateConfirmDAO;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}

	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSecretQuestion(String secretQuestion) {
		this.secretQuestion = secretQuestion;
	}

	public void setSecretAnswer(String secretAnswer) {
		this.secretAnswer = secretAnswer;
	}

	public void setPassCon(String passCon) {
		this.passCon = passCon;
	}

	public void setErrorId(String errorId) {
		this.errorId = errorId;
	}

	public void setErrorPass(String errorPass) {
		this.errorPass = errorPass;
	}

	public void setErrorCheck(String errorCheck) {
		this.errorCheck = errorCheck;
	}

	public void setErrorEmail(String errorEmail) {
		this.errorEmail = errorEmail;
	}

	public void setErrorQuestion(String errorQuestion) {
		this.errorQuestion = errorQuestion;
	}

	public void setErrorAnswer(String errorAnswer) {
		this.errorAnswer = errorAnswer;
	}

	public void setI(int i) {
		this.i = i;
	}

	public void setInputChecker(InputChecker inputChecker) {
		this.inputChecker = inputChecker;
	}

	public void setErrorUserIdList(List<String> errorUserIdList) {
		ErrorUserIdList = errorUserIdList;
	}

	public void setErrorPasswordList(List<String> errorPasswordList) {
		ErrorPasswordList = errorPasswordList;
	}

	public void setErrorFamilyNameList(List<String> errorFamilyNameList) {
		ErrorFamilyNameList = errorFamilyNameList;
	}

	public void setErrorFirstNameList(List<String> errorFirstNameList) {
		ErrorFirstNameList = errorFirstNameList;
	}

	public void setErrorFamilyNameKanaList(List<String> errorFamilyNameKanaList) {
		ErrorFamilyNameKanaList = errorFamilyNameKanaList;
	}

	public void setErrorFirstNameKanaList(List<String> errorFirstNameKanaList) {
		ErrorFirstNameKanaList = errorFirstNameKanaList;
	}

	public void setErrorEmailList(List<String> errorEmailList) {
		ErrorEmailList = errorEmailList;
	}

	public void setErrorQuestionList(List<String> errorQuestionList) {
		ErrorQuestionList = errorQuestionList;
	}

	public void setErrorAnswerList(List<String> errorAnswerList) {
		ErrorAnswerList = errorAnswerList;
	}

	public void setUserCreateConfirmDAO(UserCreateConfirmDAO userCreateConfirmDAO) {
		this.userCreateConfirmDAO = userCreateConfirmDAO;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getErrorSei() {
		return errorSei;
	}

	public void setErrorSei(String errorSei) {
		this.errorSei = errorSei;
	}

	public String getErrorMei() {
		return errorMei;
	}

	public void setErrorMei(String errorMei) {
		this.errorMei = errorMei;
	}

	public String getErrorSeiKana() {
		return errorSeiKana;
	}

	public void setErrorSeiKana(String errorSeiKana) {
		this.errorSeiKana = errorSeiKana;
	}

	public String getErrorMeiKana() {
		return errorMeiKana;
	}

	public void setErrorMeiKana(String errorMeiKana) {
		this.errorMeiKana = errorMeiKana;
	}






}