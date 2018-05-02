package com.internousdev.zen.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.zen.dao.LoginDAO;
import com.internousdev.zen.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {

	private String loginUserId;// ユーザーid
	private String loginPassword;// パスワード
	private boolean saveLogin;// ID保持
	private boolean errorFlg;// エラーを表示する際に使用する
	public Map<String, Object> session;// セッション

	private List<String> errorMessage = new ArrayList<String>();
	private List<String> errorLoginUserIdList = new ArrayList<String>();
	private List<String> errorLoginPasswordList = new ArrayList<String>();

	private String familyName;
	private String firstName;

	public String execute() throws SQLException {

		LoginDAO loginDAO = new LoginDAO();
		LoginDTO loginDTO = new LoginDTO();

		errorFlg = false;

		// ID入力チェック
		if (loginUserId.equals("")) {// loginUserIdが空欄
			errorLoginUserIdList.add("ユーザーIDを入力してください");
			errorFlg = true;
		} else if (loginUserId.length() < 1 || loginUserId.length() > 8) {// loginUserIdの長さが0か9以上のとき
			errorLoginUserIdList.add("ユーザーIDは1文字以上8文字以下で入力してください");
			errorFlg = true;
		} else if (!loginDAO.existsLoginUserId(loginUserId)) {// ユーザーIDがデータベースにないとき
			errorLoginUserIdList.add("ユーザーIDが正しくありません");
			errorFlg = true;
		}

		errorFlg = false;

		// パスワード入力チェック
		if (loginPassword.equals("")) {// passwordが空欄
			errorLoginPasswordList.add("パスワードを入力してください");
			errorFlg = true;
		} else if (loginPassword.length() < 1 || loginPassword.length() > 16) {// passwordの長さが0か17以上のとき
			errorLoginPasswordList.add("パスワードは1文字以上16文字以下で入力してください");
			errorFlg = true;
		} else if (!loginDAO.existsLoginPassword(loginPassword)) {// passwordがデータベースにないとき
			errorLoginPasswordList.add("パスワードが正しくありません");
			errorFlg = true;
		}



		// ID保持
		// jsp側でvalue指定で呼び出す
		if (loginDTO != null) {
			if (saveLogin) {// boolean型を使ったif文
							// trueのときの処理
				session.put("saveId", loginUserId);
			} else {
				// falseのときの処理
				session.remove("saveId");
			}

		}

		// ログインチェック

		loginDTO = loginDAO.select(loginUserId, loginPassword);

		boolean isExistsUser = loginDAO.isExistsUser(loginUserId, loginPassword);
		if (!isExistsUser) {
			return ERROR;
		}

		// ユーザーIDがDBに存在するか確認
		if (!loginDAO.existsLoginUserId(loginUserId)) {// ユーザーIDがない
			return ERROR;
		} else {
			// ログイン判定
			if (loginUserId.equals(loginDTO.getLoginUserId()) && loginPassword.equals(loginDTO.getLoginPassword())) {// 二つとも一致した場合
				int loginCount = loginDAO.login(loginDTO);
				if (loginCount <= 0) {
					return ERROR;
				}
			}

			// ゲストユーザーでカートに追加後、ログインした場合のカート情報保持
			String tempUserId;

			if ((String) session.get("tempUserId") != null) {
				tempUserId = session.get("tempUserId").toString();
				int count = loginDAO.replaceUserId(tempUserId, loginUserId);
				if (count == 0) {
					return ERROR;
				}
			}

			// Mapセッション情報の更新をする
			session.put("loginUserId", loginDTO.getLoginUserId());
			session.put("loginPassword", loginDTO.getLoginPassword());
			session.put("loginFirstName", loginDTO.getFirstName());
			session.put("loginFlg", true);// ログインフラグ立て

		}

		session.put("loginUser", loginDTO.getLoginUserId());

		if (session.get("loginUser") == null) {
			return ERROR;
		}
		return SUCCESS;
	}

	public boolean getErrorFlg() {
		return errorFlg;
	}

	public void setErrorFlg(boolean errorFlg) {
		this.errorFlg = errorFlg;
	}

	public List<String> getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(List<String> errorMessage) {
		this.errorMessage = errorMessage;
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

	public boolean isSaveLogin() {
		return saveLogin;
	}

	public void setSaveLogin(boolean saveLogin) {
		this.saveLogin = saveLogin;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
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

	public List<String> getErrorLoginUserIdList() {
		return errorLoginUserIdList;
	}

	public void setErrorLoginUserIdList(List<String> errorLoginUserIdList) {
		this.errorLoginUserIdList = errorLoginUserIdList;
	}

	public List<String> getErrorLoginPasswordList() {
		return errorLoginPasswordList;
	}

	public void setErrorLoginPasswordList(List<String> errorLoginPasswordList) {
		this.errorLoginPasswordList = errorLoginPasswordList;
	}

}
