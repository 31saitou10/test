package com.internousdev.miamiburger.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miamiburger.dao.UserUpdateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserUpdateCompleteAction extends ActionSupport implements SessionAware {
//session情報
	public Map<String, Object> session;

	public String execute() throws SQLException {
//DAOのインスタンス化
		UserUpdateCompleteDAO dao = new UserUpdateCompleteDAO();
//sessionに格納されている変更情報をDBへ書き込む

		int check = dao.UserUpdate(
			session.get("userId").toString(),
			session.get("new_familyName").toString(),
			session.get("new_firstName").toString(),
			session.get("new_familyNameKana").toString(),
			session.get("new_firstNameKana").toString(),
			Integer.parseInt(session.get("new_sex").toString()),
			session.get("new_email").toString(),
			session.get("new_secretQuestion").toString(),
			session.get("new_secretAnswer").toString()
		);
		if(check > 0){
			System.out.println("ユーザー情報の更新をしました。");
		}
//result結果、SUCCESSを挿入する
		String result = SUCCESS;
		return result;
	}

//以下、getter/setter
	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
