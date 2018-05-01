/*
 * nakajima 作成
 */
package com.internousdev.fifties.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.fifties.dao.ReviewDAO;
import com.opensymphony.xwork2.ActionSupport;

public class CreateReviewAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;
	private String userId;
	private int productId;
	private String reviewTitle;
	private String reviewBody;
	private boolean loginFlg;
	private int count = 0;
	private String imageFilePath;
	private String productName;

	private ReviewDAO reviewDAO = new ReviewDAO();

	public String execute() throws SQLException {

		// ログイン判別
		loginFlg = (boolean) session.get("loginFlg");

		if (loginFlg == false) {
			return LOGIN;

		} else {
			userId = session.get("userId").toString();
			// レビューしているかの確認
			count = reviewDAO.checkReview_info(userId, productId);
			if (count != 0) {
				// レビューをしていた場合はマイページ
				return ERROR;
			}
		}

		return SUCCESS;
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

	public boolean isLoginFlg() {
		return loginFlg;
	}

	public void setLoginFlg(boolean loginFlg) {
		this.loginFlg = loginFlg;
	}

	public String getReviewTitle() {
		return reviewTitle;
	}

	public void setReviewTitle(String reviewTitle) {
		this.reviewTitle = reviewTitle;
	}

	public String getReviewBody() {
		return reviewBody;
	}

	public void setReviewBody(String reviewBody) {
		this.reviewBody = reviewBody;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getImageFilePath() {
		return imageFilePath;
	}

	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}



}