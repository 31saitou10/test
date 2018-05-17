package com.internousdev.miamiburger.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miamiburger.dao.MyPageDAO;
import com.internousdev.miamiburger.dto.MyPageDTO;
import com.internousdev.miamiburger.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware {
//session情報
	public Map<String, Object> session;
	private String passCon;            //パスワードを＊で暗号化
	public String execute() throws SQLException {
//MyPageDAOのインスタンス生成
		MyPageDAO myPageDAO = new MyPageDAO();
//session内に"userInfoDTO"がない場合ERRORを返す
		if (!(session.containsKey("userInfoDTO"))) {
			return ERROR;
		}
//userIdを受け取りuserIdに対応したユーザー情報をmyPageDTOに格納する

		UserInfoDTO user = (UserInfoDTO) session.get("userInfoDTO");
		String userId = user.getUserId();
		MyPageDTO myPageDTO = myPageDAO.getUserInfo(userId);
//userIdをsessionに格納する。
				session.put("userId", myPageDTO.getUserId());
//変更予定のユーザー情報を格納する
				session.put("new_password", myPageDTO.getPassword());
				session.put("new_familyName", myPageDTO.getFamilyName());
				session.put("new_firstName", myPageDTO.getFirstName());
				session.put("new_familyNameKana", myPageDTO.getFamilyNameKana());
				session.put("new_firstNameKana", myPageDTO.getFirstNameKana());
				session.put("new_sex", myPageDTO.getSex());
				session.put("new_email", myPageDTO.getEmail());
				session.put("new_status", myPageDTO.getStatus());
				session.put("new_logined", myPageDTO.getLogined());
				session.put("new_registDate", myPageDTO.getRegistDate());
				session.put("new_updateDate", myPageDTO.getUpdateDate());
				session.put("new_secretQuestion", myPageDTO.getSecretQuestion());
				session.put("new_secretAnswer", myPageDTO.getSecretAnswer());

//変更予定のユーザー情報を格納する
				session.put("old_password", myPageDTO.getPassword());
				session.put("old_familyName", myPageDTO.getFamilyName());
				session.put("old_firstName", myPageDTO.getFirstName());
				session.put("old_familyNameKana", myPageDTO.getFamilyNameKana());
				session.put("old_firstNameKana", myPageDTO.getFirstNameKana());
				session.put("old_sex", myPageDTO.getSex());
				session.put("old_email", myPageDTO.getEmail());
				session.put("old_status", myPageDTO.getStatus());
				session.put("old_logined", myPageDTO.getLogined());
				session.put("old_registDate", myPageDTO.getRegistDate());
				session.put("old_updateDate", myPageDTO.getUpdateDate());
				session.put("old_secretQuestion", myPageDTO.getSecretQuestion());
				session.put("old_secretAnswer", myPageDTO.getSecretAnswer());

//男性と女性の判別、文字列の挿入
				try{
					switch(myPageDTO.getSex()){
					  case 0 :
						  session.put("old_sex_Name","男性" );
					       break;
					  case 1 :
						  session.put("old_sex_Name","女性" );
					       break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

//既存パスワードの暗号化
				if (((String) session.get("old_password")).length() > 2) {
					StringBuilder sb = new StringBuilder((String) session.get("old_password"));
						for (int i = 2; i < ((String) session.get("old_password")).length(); i++) {
							sb.setCharAt(i, '*');
							System.out.println(String.valueOf(sb));
						}
							passCon = sb.toString();
						}else if(((String) session.get("old_password")).length() == 2){
							passCon = "**";
						}else if(((String) session.get("old_password")).length() == 1){
							passCon = "*";
				}
				session.put("passCon", passCon);

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

	public String getPassCon() {
		return passCon;
	}

	public void setPassCon(String passCon) {
		this.passCon = passCon;
	}


}
