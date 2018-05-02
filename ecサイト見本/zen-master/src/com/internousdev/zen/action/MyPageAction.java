package com.internousdev.zen.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.zen.dao.MyPageDAO;
import com.internousdev.zen.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware  {
	   private Map<String, Object> session;
	   public ArrayList<MyPageDTO> myPageList = new ArrayList<MyPageDTO>();
	   private String loginUserId;


    public String execute() throws SQLException{
      if(!(session.containsKey("loginUserId"))){
      }
      	String result = ERROR;

      if(session.containsKey("loginUserId")){
    	  loginUserId = session.get("loginUserId").toString();
    		MyPageDAO myPageDAO = new MyPageDAO();
    		myPageList = myPageDAO.getMyPageUserInfo(loginUserId);
    		session.put("list", myPageList);

    		if(myPageList.size() > 0){
    			result = SUCCESS;
    		}
    	}
    	return result;
    }

    @Override
    public void setSession(Map<String, Object> session){
    	this.session = session;
    }

    public Map<String, Object> getSession() {
		return session;
	}

	public void setMyPageList(ArrayList<MyPageDTO> myPageList) {
		this.myPageList = myPageList;
	}

	public ArrayList<MyPageDTO> getMyPageList(){
    	return this.myPageList;

    }

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}




}











