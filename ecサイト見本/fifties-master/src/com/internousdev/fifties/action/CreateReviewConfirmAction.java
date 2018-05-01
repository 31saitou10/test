/*
 * 中嶋 作成
 */
package com.internousdev.fifties.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class CreateReviewConfirmAction extends ActionSupport implements SessionAware {

	private String userId;
	private int productId = 0;
	private String reviewTitle;
	private String reviewBody;
	private int reviewScore = 0;
	private String imageFilePath;
	private String productName;

	public Map<String, Object> session;

	// ----エラーメッセージ各種
	private String errorBody;
	private String errorTitle;
	private String errorScore;

	public String execute() throws SQLException {
		String result = null;
		if (reviewScore == 0) {
			setErrorScore("評価を選択してください");
			result = ERROR;
		}

		if (!(reviewTitle.length() <= 15)) {
			setErrorTitle("レビュータイトルは15文字以内で入力してください。");
			result = ERROR;
		}

		if (reviewBody.equals("")) {
			setErrorBody("レビューを入力してください。");
			result = ERROR;

		}else if(!(reviewBody.length() >= 1 && reviewBody.length() <= 250)) {
			setErrorBody("レビューは250文字以内で入力してください。");
			result = ERROR;
		}

		if(result != null){
			return result;
		}

		String score = String.valueOf(reviewScore);

		session.put("r_title", reviewTitle);
		session.put("r_body", reviewBody);
		session.put("r_score", score);
		return SUCCESS;
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

	public String getReviewBody() {
		return reviewBody;
	}

	public void setReviewBody(String reviewBody) {
		this.reviewBody = reviewBody;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getErrorBody() {
		return errorBody;
	}

	public void setErrorBody(String errorBody) {
		this.errorBody = errorBody;
	}

	public String getErrorScore() {
		return errorScore;
	}

	public void setErrorScore(String errorScore) {
		this.errorScore = errorScore;
	}

	public String getErrorTitle() {
		return errorTitle;
	}

	public void setErrorTitle(String errorTitle) {
		this.errorTitle = errorTitle;
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
