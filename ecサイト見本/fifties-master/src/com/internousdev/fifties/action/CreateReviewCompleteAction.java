/*
 * 中嶋　作成
 */

package com.internousdev.fifties.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.fifties.dao.ReviewDAO;
import com.opensymphony.xwork2.ActionSupport;

public class CreateReviewCompleteAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;
	private String userId;
	private int productId;
	private String reviewTitle;
	private String reviewBody;
	private String reviewScore;
	private ReviewDAO reviewDAO = new ReviewDAO();

	public String execute() throws SQLException {
		userId = session.get("userId").toString();
		// String型で送られてきた評価をInt型に戻す
		int rScore = Integer.parseInt(reviewScore);

		if (rScore == 0 || userId == null) {
			// ログインしていない、もしくは評価が選択されていなかった場合エラー
			return ERROR;
		} else {

			reviewDAO.insertReview_info(userId, productId, reviewTitle, reviewBody, rScore);
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

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getReviewTitle() {
		return reviewTitle;
	}

	public void setReviewTitle(String reviewTitle) {
		this.reviewTitle = reviewTitle;
	}

	public String getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(String reviewScore) {
		this.reviewScore = reviewScore;
	}

	public String getReviewBody() {
		return reviewBody;
	}

	public void setReviewBody(String reviewBody) {
		this.reviewBody = reviewBody;
	}

}
