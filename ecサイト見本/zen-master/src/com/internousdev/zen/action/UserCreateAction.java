package com.internousdev.zen.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

//import com.internousdev.zen.dto.UserCreateDTO;
import com.opensymphony.xwork2.ActionSupport;


public class UserCreateAction extends ActionSupport implements SessionAware{

		private Map<String, Object> session;
		//private boolean saveLogin;
		private String family_name;
		private String first_name;
		private String family_name_kana;
		private String first_name_kana;
		private String sex;
		private String email;
		private String user_id;
		
		
		
		
//		public String execute(){
//			UserCreateDTO userCreateDTO = new UserCreateDTO();
//			
//			if(userCreateDTO !=null){
//	    		if(saveLogin){//boolean型を使ったif文
//	    			          //trueのときの処理
//	    			
//
//	    			session.put("family_name",family_name);
//	    			session.put("first_name",first_name);
//	    			session.put("family_name_kana",family_name_kana);
//	    			session.put("first_name_kana",first_name_kana);
//	    			session.put("sex",sex);
//	    			session.put("user_id",user_id);
//	    			session.put("email",email);
//	    			
//	    			
//	    		}else{
//	    			          //falseのときの処理
//	    			session.remove("");
//	    		}
//
//	        }
//			
//			return SUCCESS;
//		}
		
	
		
//		
//		public boolean isSaveLogin() {
//			return saveLogin;
//		}
//
//
//
//
//		public void setSaveLogin(boolean saveLogin) {
//			this.saveLogin = saveLogin;
//		}




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




		public void setUser_id(String user_id) {
			this.user_id = user_id;
		}




		public Map<String, Object> getSession() {
			return session;
		}

		public void setSession(Map<String, Object> session) {
			this.session = session;
		}
	
}
			


