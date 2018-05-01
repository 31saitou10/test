package com.internousdev.fifties.util;

//林作成
public class InputChecker {

	//姓エラーメッセージ管理
	public String familyNameChk(String familyName) {
		String result = "TRUE";

		if(familyName.equals("")) {
			result = "【姓を入力してください】";
		}else if(familyName.length() < 1 || familyName.length() > 16) {
			result = "【姓は1文字以上16文字以下で入力してください】";
		}else if(!familyName.matches("^[a-zA-Zぁ-ゞ一-龠々]+$")) {
			//"^[]+$"で囲われた文字以外が使われた時
			result = "【姓は半角英語、漢字、ひらがなで入力してください】";
		}
		return result;
	}

	//名前エラーメッセージ管理
	public String firstNameChk(String firstName) {
		String result = "TRUE";

		if(firstName.equals("")) {
			result = "【名前を入力してください】";
		}else if(firstName.length() < 1 || firstName.length() > 16) {
			result = "【名前は1文字以上16文字以下で入力してください】";
		}else if(!firstName.matches("^[a-zA-Zぁ-ゞ一-龠々]+$")){
			result = "【名前は半角英語、漢字、ひらがなで入力してください】";
		}
		return result;
	}

	//姓仮名エラーメッセージ管理
	public String familyNameKanaChk(String familyNameKana) {
		String result = "TRUE";

		if(familyNameKana.equals("")) {
			result = "【姓のふりがなを入力してください】";
		}else if(familyNameKana.length() < 1 || familyNameKana.length() > 16) {
			result = "【姓のふりがなは1文字以上16文字以下で入力してください】";
		}else if(!familyNameKana.matches("^[ぁ-ゞ]+$")){
			result = "【姓のふりがなはひらがなで入力してください】";
		}
		return result;
	}

	//名前仮名エラーメッセージ管理
	public String firstNameKanaChk(String firstNameKana) {
		String result = "TRUE";

		if(firstNameKana.equals("")) {
			result = "【名前のふりがなを入力してください】";
		}else if(firstNameKana.length() < 1 || firstNameKana.length() > 16) {
			result = "【名前のふりがなは1文字以上16文字以下で入力してください】";
		}else if(!firstNameKana.matches("^[ぁ-ゞ]+$")){
			result = "【名前のふりがなはひらがなで入力してください】";
		}
		return result;
	}

	//ユーザーIDエラーメッセージ管理
	public String userIdChk(String userId) {
		String result = "TRUE";

		if(userId.equals("")) {
			result = "【ユーザーIDを入力してください】";
		}else if(userId.length() < 1 || userId.length() > 8) {
			result = "【ユーザーIDは1文字以上8文字以下で入力してください】";
		}else if(!userId.matches("^[a-zA-Z0-9]+$")) {
			result = "【ユーザーIDは半角英数字で入力してください】";
		}
		return result;
	}

	//パスワードエラーメッセージ管理
	public String passwordChk(String password) {
		String result = "TRUE";

		if(password.equals("")) {
			result = "【パスワードを入力してください】";
		}else if(password.length() < 1 || password.length() > 16) {
			result = "【パスワードは1文字以上16文字以下で入力してください】";
		}else if(!password.matches("^[a-zA-Z0-9]+$")) {
			result ="【パスワードは半角英数字で入力してください】";
		}
		return result;
	}

	//新しいパスワードエラーメッセージ管理
	public String newPasswordChk(String newPassword) {
		String result = "TRUE";

		if(newPassword.equals("")) {
			result = "【パスワードを入力してください】";
		}else if(newPassword.length()<1 || newPassword.length()>16){
			result = "【パスワードは1文字以上16文字以下で入力してください】";
		}else if(!(newPassword.matches("^[a-zA-Z0-9]+$"))){
			result = "【パスワードは半角英数字で入力してください】";
		}
		return result;
	}

	//再確認パスワードエラーメッセージ管理
	public String rePasswordChk(String rePassword, String password) {
		String result = "TRUE";

		if(rePassword.equals("")) {
			result = "【再確認パスワードを入力してください】";
		}else if(rePassword.length() < 1 || rePassword.length() > 16) {
			result = "【再確認パスワードは1文字以上16文字以下で入力してください】";
		}else if(!rePassword.matches("^[a-zA-Z0-9]+$")) {
			result = "【再確認パスワードは半角英数字で入力してください】";
		}else if(!(rePassword.equals(password))) {
			result = "【入力されたパスワードが一致しません】";
		}
		return result;
	}

	//再確認新しいパスワードエラーメッセージ管理
		public String reNewPasswordChk(String rePassword, String newPassword) {
			String result = "TRUE";

			if(rePassword.equals("")) {
				result = "【再確認パスワードを入力してください】";
			}else if(rePassword.length() < 1 || rePassword.length() > 16) {
				result = "【再確認パスワードは1文字以上16文字以下で入力してください】";
			}else if(!rePassword.matches("^[a-zA-Z0-9]+$")) {
				result = "【再確認パスワードは半角英数字で入力してください】";
			}else if(!(rePassword.equals(newPassword))) {
				result = "【入力された新しいパスワードが一致しません】";
			}
			return result;
		}

	//郵便番号エラーメッセージ管理
	public String zip11Chk(String zip11) {
		String result = "TRUE";

		if(zip11.equals("")) {
			result = "【郵便番号を入力してください】";
		}else if(zip11.length() < 7 || zip11.length() > 8) {
			result = "【郵便番号は7桁で入力してください】";
		}else if(!zip11.matches("^[0-9-]+$")) {
			result = "【郵便番号は半角数字で入力してください】";
		}
		return result;
	}

	//住所エラーメッセージ管理
	public String addr11Chk(String addr11) {
		String result = "TRUE";

		if(addr11.equals("")) {
			result = "【住所を入力してください】";
		}else if(addr11.length() < 15 || addr11.length() > 50) {
			result = "【住所は15文字以上50文字以下で入力してください】";
		}else if(!addr11.matches("^[a-zA-Z0-9ぁ-ゞァ-ヾ一-龠々!-~]+$")) {
			result = "【住所は半角英数字、漢字、ひらがな、カタカナおよび半角記号で入力してください】";
		}
		return result;
	}

	//電話エラーメッセージ管理
	public String telNumberChk(String telNumber) {
		String result = "TRUE";

		if(telNumber.equals("")) {
			result = "【電話番号を入力してください】";
		}else if(telNumber.length() < 10 || telNumber.length() > 13) {
			result = "【電話番号は10文字以上13文字以下で入力してください】";
		}else if(!telNumber.matches("^[0-9\\-]+$")) {
			result = "【電話番号は半角数字で、正しいものを入力してください】";
		}
		return result;
	}

	//メールアドレスエラーメッセージ管理
	public String emailChk(String email) {
		String result = "TRUE";

		if(email.equals("")) {
			result = "【メールアドレスを入力してください】";
		}else if(email.length() < 14 || email.length() > 32) {
			result = "【メールアドレスは14文字以上32文字以下で入力してください】";
		}else if(!email.matches("^[a-zA-Z0-9@.,;:!#$%&'*+-/=?^_`{|}~]+@+[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)+.+[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$")) {
			result = "【メールアドレスは半角英数字記号で、正しいものを入力してください】";
		}
		return result;
	}

	//新しいメールアドレスエラーメッセージ管理
	public String newEmailChk(String newEmail) {
		String result = "TRUE";

		if(newEmail.equals("")) {
			result = "【新しいメールアドレスを入力してください】";
		}else if(newEmail.length()<14 || newEmail.length()>32){
			result = "【新しいメールアドレスは14文字以上32文字以下で入力してください】";
		}else if((!newEmail.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$"))){
			result = "【新しいメールアドレスは半角英数字で、正しいものを入力してください】";
		}
		return result;
	}


	//検索ワードエラーメッセージ管理
	public String keywordChk(String keywords) {
		String result = "";

		if(keywords.length() > 16) {
			result = "【検索は、1文字以上16文字以下で入力してください】";
		}else if(!keywords.matches("^[a-zA-Z0-9ぁ-ゞ一-龠々ァ-ヾ　\\s]+$")) {
			result = "【検索は半角英数字、漢字、ひらがな、カタカナで入力してください】";
		}
		return result;
	}


}