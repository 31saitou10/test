package com.internousdev.miamiburger.action;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miamiburger.dao.StartDAO;
import com.internousdev.miamiburger.dto.MCategoryDTO;
import com.internousdev.miamiburger.util.DateUtil;
import com.opensymphony.xwork2.ActionSupport;
public class StartAction extends ActionSupport implements SessionAware{

	private Map<String,Object>session;
	private String temp_user_id;


	public String execute(){
		ArrayList<MCategoryDTO> mCategoryDTOList = new ArrayList<MCategoryDTO>();

		String result = SUCCESS;


		//999999までの乱数生成S
		Random ran = new Random();
		int random = ran.nextInt(899999)+100000;

		String randomNum= String.valueOf(random);

		//ページを訪れた時の時間
		DateUtil date = new DateUtil();

		//乱数と時間が仮ユーザーID
		String temp_user_id = randomNum + "&" + date.getLoginDate() ;
		System.out.println(temp_user_id);	//確認用


		session.put("temp_user_id", temp_user_id);

		StartDAO dao = new StartDAO();

		mCategoryDTOList = dao.categoryInfo();

		session.put("mCategoryDTOList", mCategoryDTOList);

		return result;

	}


	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public String getTemp_user_id() {
		return temp_user_id;
	}


	public void setTemp_user_id(String temp_user_id) {
		this.temp_user_id = temp_user_id;
	}


}
