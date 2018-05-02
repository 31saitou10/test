package com.internousdev.zen.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.zen.dao.BuyItemHistoryDAO;
import com.internousdev.zen.dto.BuyItemHistoryDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemHistoryAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;

	private ArrayList<BuyItemHistoryDTO> buyItemHistoryList;

	private String message;

	private int deleteFlg;

	private String user_id;

	public String execute() throws SQLException {

		BuyItemHistoryDAO dao = new BuyItemHistoryDAO();

		user_id = session.get("loginUserId").toString();

		buyItemHistoryList = dao.getBuyItemHistory(user_id);

//		if(buyItemHistoryList == null){
//
//		}

		if (deleteFlg == 0) {
			buyItemHistoryList = dao.getBuyItemHistory(user_id);
		}else if(deleteFlg==1){

			int res = dao.buyItemHistoryDeleteAll(user_id);
			if (res==0) {
				this.message = "削除に失敗しました。";

			} else{
				this.message = "全ての履歴を削除しました。";
			}
			buyItemHistoryList=dao.getBuyItemHistory(user_id);

		}

		return SUCCESS;
	}


	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public ArrayList<BuyItemHistoryDTO> getBuyItemHistoryList() {
		return buyItemHistoryList;
	}

	public void setBuyItemHistoryList(ArrayList<BuyItemHistoryDTO> buyItemHistoryList) {
		this.buyItemHistoryList = buyItemHistoryList;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(int deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

}
