package com.internousdev.miamiburger.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miamiburger.dao.GetBurgerOptionsDAO;
import com.internousdev.miamiburger.dto.BurgerOptionsDTO;
import com.internousdev.miamiburger.dto.CreateBurgerHtmlCreaterDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CreateBurgerAction extends ActionSupport implements SessionAware{

	public Map<String,Object> session;
	/*
	 * GetBurgerOptionsDAO()を使いデータベースからオプションのリストを手に入れる。
	 * リストを「burgerOptionsList」でセッションに格納する。
	 */
	public String execute(){
		List<BurgerOptionsDTO> dtoList = new ArrayList<>();
		GetBurgerOptionsDAO dao = new GetBurgerOptionsDAO();
		dtoList = dao.getAllBurgerOptions();

		session.put("burgerOptionsList", dtoList);
		
//		createBurger.jspで選択されたオプションの表示に使用するListを作成
		List<CreateBurgerHtmlCreaterDTO> htmlCreaterList = new ArrayList<>();
		CreateBurgerHtmlCreaterDTO htmlCreaterDTO = new CreateBurgerHtmlCreaterDTO();
		for(int i = 1; i < 11; i++){
			htmlCreaterDTO = new CreateBurgerHtmlCreaterDTO();
			htmlCreaterDTO.setCount(i);
			htmlCreaterDTO.setOption("option"+i);
			htmlCreaterDTO.setHiddenOption("hiddenOption"+i);
			htmlCreaterList.add(htmlCreaterDTO);
		}
		session.put("htmlCreaterList", htmlCreaterList);

		return SUCCESS;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
