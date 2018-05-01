/*
 * 中嶋　作成
 */
package com.internousdev.fifties.action;

import java.sql.SQLException;
import java.util.Collection;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.fifties.dao.ReviewDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ReviewDeleteAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;
	private String userId;
	private int productId;

	ReviewDAO reviewDAO = new ReviewDAO();

	private Collection<Integer> deleteList;
	private String deleteMessage;

	public String execute() throws SQLException {
		String result = ERROR;

		if (deleteList != null) {

			int count = 0;
			userId = session.get("userId").toString();
			// count = reviewDAO.deleteReview_info(userId, productId);
			count = reviewDAO.deleteReview_info(userId, deleteList);

			if (count > 0) {
				setDeleteMessage(count + "件のレビューを削除しました。");
				result = SUCCESS;
			} else {
				setDeleteMessage("削除に失敗しました");
				result = ERROR;
			}

			setDeleteMessage("削除したいレビューにチェックを入れてください");
			result = ERROR;

		}
		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public Collection<Integer> getDeleteList() {
		return deleteList;
	}

	public void setDeleteList(Collection<Integer> deleteList) {
		this.deleteList = deleteList;
	}

	public String getDeleteMessage() {
		return deleteMessage;
	}

	public void setDeleteMessage(String deleteMessage) {
		this.deleteMessage = deleteMessage;
	}

}
