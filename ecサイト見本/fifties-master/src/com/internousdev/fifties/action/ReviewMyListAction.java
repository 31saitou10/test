/*
 * 中嶋　作成（使用するか不明）
 */

package com.internousdev.fifties.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.fifties.dao.ReviewDAO;
import com.internousdev.fifties.dto.ReviewDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ReviewMyListAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;
	private int productId;
	private String userId;
	private boolean loginFlg;
	private String reviewMessage;
	ReviewDAO reviewDAO = new ReviewDAO();
	private List<ReviewDTO> reviewMyList = new ArrayList<>();

	public String execute() throws SQLException {

		loginFlg = (boolean) session.get("loginFlg");

		// ログイン判定
		if (loginFlg == false) {
			return LOGIN;
		} else {
			userId = session.get("user_id").toString();
			reviewMyList = reviewDAO.getMyReview_info(userId, productId);
			if (reviewMyList.size() == 0) {
				setReviewMessage("レビューを投稿していません");
			} else {
				int reviewCount = reviewMyList.size();
				String count = Integer.toString(reviewCount);
				setReviewMessage(count + "件のレビュー投稿があります");
			}
		}

		Iterator<ReviewDTO> iterator = reviewMyList.iterator();
		if (!(iterator.hasNext())) {
			reviewMyList = null;
		}
		return SUCCESS;

	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public boolean isLoginFlg() {
		return loginFlg;
	}

	public void setLoginFlg(boolean loginFlg) {
		this.loginFlg = loginFlg;
	}

	public String getReviewMessage() {
		return reviewMessage;
	}

	public void setReviewMessage(String reviewMessage) {
		this.reviewMessage = reviewMessage;
	}

	public ReviewDAO getReviewDAO() {
		return reviewDAO;
	}

	public void setReviewDAO(ReviewDAO reviewDAO) {
		this.reviewDAO = reviewDAO;
	}

	public List<ReviewDTO> getReviewMyList() {
		return reviewMyList;
	}

	public void setReviewMyList(List<ReviewDTO> reviewMyList) {
		this.reviewMyList = reviewMyList;
	}

}
