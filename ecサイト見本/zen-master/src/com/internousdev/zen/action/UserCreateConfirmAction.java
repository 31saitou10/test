package com.internousdev.zen.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.zen.dao.UserCreateIdCheckDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmAction extends ActionSupport implements SessionAware {

	private String family_name;
	private String first_name;
	private String family_name_kana;
	private String first_name_kana;
	private String sex;
	private String email;
	private String user_id;
	private String password;
	public Map<String, Object> session;



	private List<String> errorFamily_nameList = new ArrayList<String>();
	private List<String> errorFirst_nameList = new ArrayList<String>();
	private List<String> errorFamily_name_kanaList = new ArrayList<String>();
	private List<String> errorFirst_name_kanaList = new ArrayList<String>();
	private List<String> errorEmailList = new ArrayList<String>();
	private List<String> errorUser_idList = new ArrayList<String>();
	private List<String> errorPasswordList = new ArrayList<String>();

	public String execute() {
		UserCreateIdCheckDAO userCreateIdCheckDAO = new UserCreateIdCheckDAO();

		String result = SUCCESS;

		// 未入力チェック
		if (family_name.length() == 0) {
			errorFamily_nameList.add("姓を入力してください。");
			result = ERROR;
		}
		else if (!(family_name.length() >= 1 && family_name.length() <= 16)) {
			errorFamily_nameList.add("姓は1文字以上16文字以下で入力してください。");

			result = ERROR;
		}
		else if (!(family_name.matches("^[a-zA-Zぁ-ゞ一-龠]+$"))) {
			errorFamily_nameList.add("姓は半角英語又は漢字又はひらがなで入力してください。");

			result = ERROR;
		}



		if (first_name.length() == 0) {
			errorFirst_nameList.add("名を入力してください。");

			result = ERROR;
		}
		else if (!(first_name.length() >= 1 && first_name.length() <= 16)) {
			errorFirst_nameList.add("名は1文字以上16文字以下で入力してください。");


			result = ERROR;

		}
		else if(!(first_name.matches("^[a-zA-Zぁ-ゞ一-龠]+$"))) {
			errorFirst_nameList.add("名は半角英語又は漢字又はひらがなで入力してください。");
			result = ERROR;
		}



		if (family_name_kana.length() == 0) {
			errorFamily_name_kanaList.add("姓ふりがなを入力してください。");


			result = ERROR;
		}
		else if (!(family_name_kana.length() >= 1 && family_name_kana.length() <= 16)) {
			errorFamily_name_kanaList.add("姓ふりがなは1文字以上16文字以下で入力してください。");


			result = ERROR;

		}
		else if (!(family_name_kana.matches("^[ぁ-ゞ]+$"))) {
			errorFamily_name_kanaList.add("姓ふりがなはひらがなで入力してください。");


			result = ERROR;
		}



		if (first_name_kana.length() == 0) {
			errorFirst_name_kanaList.add("名ふりがなを入力してください。");


			result = ERROR;
		}
		else if (!(first_name_kana.length() >= 1 && first_name_kana.length() <= 16)) {
			errorFirst_name_kanaList.add("名ふりがなは1文字以上16文字以下で入力してください。");


			result = ERROR;
		}
		else if (!(first_name_kana.matches("^[ぁ-ゞ]+$"))) {
			errorFirst_name_kanaList.add("名ふりがなはひらがなで入力してください。");


			result = ERROR;
		}



		if (email.length() ==0) {
			errorEmailList.add("メールアドレスを入力してください。");


			result = ERROR;
		}
		else if (!(email.length() >= 14 && email.length() <= 32)) {
			errorEmailList.add("メールアドレスは14文字以上32文字以下で入力してください。");


			result = ERROR;
		}
		else if (!(email.matches("^([a-zA-Z0-9])+([a-zA-Z0-9¥._-])*@([a-zA-Z0-9_-])+([a-zA-Z0-9¥._-]+)+$"))) {
			errorEmailList.add("メールアドレスは半角@を含む半角英数字又は半角記号で入力してください。");


			result = ERROR;
		}



		if (user_id.length() == 0) {
			errorUser_idList.add("ログインIDを入力してください。");


			result = ERROR;
		}
		else if (!(user_id.length() >= 1 && user_id.length() <= 8)) {
			errorUser_idList.add("ログインIDは1文字以上8文字以下で入力してください。");


			result = ERROR;
		}
		else if (!(user_id.matches("^[a-zA-Z0-9]+$"))) {
			errorUser_idList.add("ログインIDは半角英数字で入力してください。");


			result = ERROR;
		}
		else if(userCreateIdCheckDAO.getloginUserId(user_id)){
			errorUser_idList.add("そのIDは既に使われています。");
			result = ERROR;
		}


		if (password.length() == 0) {
			errorPasswordList.add("パスワードを入力してください。");


			result = ERROR;
		}

		else if (!(password.length() >= 1 && password.length() <= 16)) {
			errorPasswordList.add("パスワードは1文字以上16文字以下で入力してください。");


			result = ERROR;
		}

		else if (!(password.matches("^[a-zA-Z0-9]+$"))) {
			errorPasswordList.add("パスワードは半角英数字で入力してください。");


			result = ERROR;
		}


		 session.put("family_name", family_name);
		 session.put("first_name", first_name );
		 session.put("family_name_kana", family_name_kana);
		 session.put("first_name_kana", first_name_kana);
		 session.put("sex", sex);
		 session.put("email", email);
		 session.put("user_id", user_id);
		 session.put("password", password);


		return result;
	}

	public String getFamily_name() {
		return family_name;
	}

	public void setFamily_name(String family_name) {
		this.family_name = family_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getFamily_name_kana() {
		return family_name_kana;
	}

	public void setFamily_name_kana(String family_name_kana) {
		this.family_name_kana = family_name_kana;
	}

	public String getFirst_name_kana() {
		return first_name_kana;
	}

	public void setFirst_name_kana(String first_name_kana) {
		this.first_name_kana = first_name_kana;
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

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String loginUserId) {
		this.user_id = loginUserId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}



	public List<String> getErrorFirst_nameList() {
		return errorFirst_nameList;
	}

	public void setErrorFirst_nameList(List<String> errorFirst_nameList) {
		this.errorFirst_nameList = errorFirst_nameList;
	}

	public List<String> getErrorFamily_name_kanaList() {
		return errorFamily_name_kanaList;
	}

	public void setErrorFamily_name_kanaList(List<String> errorFamily_name_kanaList) {
		this.errorFamily_name_kanaList = errorFamily_name_kanaList;
	}

	public List<String> getErrorFirst_name_kanaList() {
		return errorFirst_name_kanaList;
	}

	public void setErrorFirst_name_kanaList(List<String> errorFirst_name_kanaList) {
		this.errorFirst_name_kanaList = errorFirst_name_kanaList;
	}

	public List<String> getErrorEmailList() {
		return errorEmailList;
	}

	public void setErrorEmailList(List<String> errorEmailList) {
		this.errorEmailList = errorEmailList;
	}

	public List<String> getErrorUser_idList() {
		return errorUser_idList;
	}

	public void setErrorUser_idList(List<String> errorUser_idList) {
		this.errorUser_idList = errorUser_idList;
	}

	public List<String> getErrorPasswordList() {
		return errorPasswordList;
	}

	public void setErrorPasswordList(List<String> errorPasswordList) {
		this.errorPasswordList = errorPasswordList;
	}

	public List<String> getErrorFamily_nameList() {
		return errorFamily_nameList;
	}

	public void setErrorFamily_nameList(List<String> errorFamily_nameList) {
		this.errorFamily_nameList = errorFamily_nameList;
	}

	public String getLoginUserId() {
		return user_id;
	}

	public void setLoginUserId(String loginUserId) {
		this.user_id = loginUserId;
	}

}
