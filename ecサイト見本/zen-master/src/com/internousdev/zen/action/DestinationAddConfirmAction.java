package com.internousdev.zen.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class DestinationAddConfirmAction extends ActionSupport implements SessionAware{
	// 入力される宛先情報
	private String user_id;
	private String family_name;
	private String first_name;
	private String family_name_kana;
	private String first_name_kana;
	private String user_address;
	private String tel_number;
	private String email;

	// エラー変数
	private String errorFamilyName;
	private String errorFirstName;
	private String errorFamilyNameKana;
	private String errorFirstNameKana;
	private String errorEmail;
	private String errorTel;
	private String errorAddress;

	public Map<String, Object> session;

	public String execute() {
		String result = SUCCESS;

		// エラーメッセージを表示する
		// 姓の入力値チェック
		if(family_name.equals("")) {
			errorFamilyName = "姓を入力してください。";
			result = ERROR;
		}else if(!(family_name.length() >=1 && family_name.length() <= 16))  {
			errorFamilyName = "姓は１６文字以内で入力してください。";
			result = ERROR;
		}else if(!(family_name.matches("^[a-zA-Zぁ-ゞ一-龠]+$"))) {
			errorFamilyName = "姓は半角英語、漢字、ひらがなで入力してください。";
			result = ERROR;
		}

		// 名の入力値チェック
		if(first_name.equals("")) {
			errorFirstName = "名を入力してください。";
			result = ERROR;
		}else if(!(first_name.length() >=1 && first_name.length() <= 16))  {
			errorFirstName = "名は１６文字以内で入力してください。";
			result = ERROR;
		}else if(!(first_name.matches("^[a-zA-Zぁ-ゞ一-龠]+$"))) {
			errorFirstName = "名は半角英語、漢字、ひらがなで入力してください。";
			result = ERROR;
		}

		// 姓（かな）の入力値チェック
		if(family_name_kana.equals("")) {
			errorFamilyNameKana = "姓（かな）を入力してください。";
			result = ERROR;
		}else if(!(family_name_kana.length() >=1 && family_name_kana.length() <= 16))  {
			errorFamilyNameKana = "姓（かな）は１６文字以内で入力してください。";
			result = ERROR;
		}else if(!(family_name_kana.matches("^[ぁ-ゞ]+$"))) {
			errorFamilyNameKana = "姓（かな）はひらがなで入力してください。";
			result = ERROR;
		}

		// 名（かな）の入力値チェック
		if(first_name_kana.equals("")) {
			errorFirstNameKana = "名（かな）を入力してください。";
			result = ERROR;
		}else if(!(first_name_kana.length() >=1 && first_name_kana.length() <= 16))  {
			errorFirstNameKana = "名（かな）は１６文字以内で入力してください。";
			result = ERROR;
		}else if(!(first_name_kana.matches("^[ぁ-ゞ]+$"))) {
			errorFirstNameKana = "名（かな）はひらがなで入力してください。";
			result = ERROR;
		}

		// 住所の入力値チェック
		if(user_address.equals("")) {
			errorAddress = "住所を入力してください。";
			result = ERROR;
		}else if(!(user_address.length() >= 15 && user_address.length() <= 50)) {
			errorAddress = "住所は１５文字以上５０文字以内で入力してください。";
			result = ERROR;
		}else if(!(user_address.matches("^[a-zA-Z0-9ぁ-ゞァ-ヾ一-龠々!-~]+$"))) {
			errorAddress = "住所は漢字,半角英数字記号,ひらがな,カタカナで入力してください。";
			result = ERROR;
		}

		// 電話番号の入力値チェック
		if(tel_number.equals("")) {
			errorTel = "電話番号を入力してください。";
			result = ERROR;
		}else if(!(tel_number.matches("^[0-9]{10}$")) && !(tel_number.matches("^[0-9]{11}$"))&& !(tel_number.matches("^[0-9]{12}$"))&& !(tel_number.matches("^[0-9]{13}$"))) {
			errorTel = "電話番号は半角数字ハイフンなし＆正しい桁数で入力してください。";
			result = ERROR;
		}

		// メールアドレスの入力値チェック
		if(email.equals("")) {
			errorEmail = "メールアドレスを入力してください。";
			result = ERROR;
		}else if(!(email.length() >= 14 && email.length() <=32)) {
			errorEmail = "メールアドレスは１８文字以上３２文字以下で入力してください。";
			result = ERROR;
		}else if(!(email.matches("^([a-zA-Z0-9])+([a-zA-Z0-9¥._-])*@([a-zA-Z0-9_-])+([a-zA-Z0-9¥._-]+)+$"))){
			errorEmail = "半角＠を含む正しいメールアドレスの形で入力してください。";
			result = ERROR;
		}

		// 入力された宛先情報をsessionに入れる
		session.put("family_name", family_name);
		session.put("first_name", first_name);
		session.put("family_name_kana", family_name_kana);
		session.put("first_name_kana", first_name_kana);
		session.put("user_address", user_address);
		session.put("tel_number", tel_number);
		session.put("email", email);

		return result;
	}

	// ゲッターセッター
	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
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

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public String getTel_number() {
		return tel_number;
	}

	public void setTel_number(String tel_number) {
		this.tel_number = tel_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public Map<String, Object> getSession() {
		return session;
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

	public String getErrorTel() {
		return errorTel;
	}

	public void setErrorTel(String errorTel) {
		this.errorTel = errorTel;
	}

	public String getErrorAddress() {
		return errorAddress;
	}

	public void setErrorAddress(String errorAddress) {
		this.errorAddress = errorAddress;
	}
}
