/*
 *　中嶋　作成
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

public class ReviewListAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;
	private List<ReviewDTO> reviewList = new ArrayList<>();
	ReviewDAO reviewDAO = new ReviewDAO();
	private String reviewListMessage;

	//商品詳細へ送る変数
	private int productId;
	private String imageFilePath;
	private String productName;
	private String productNameKana;
	private String productDescription;
	private int product_stock;
	private int price;
	private int categoryId;
	private String releaseCompany;
	private String releaseDate;

	public String execute() throws SQLException {
		// 選択商品の全レビューをリスト化
		reviewList = reviewDAO.getReview_info(productId);
		// レビュー件数の判別
		if (reviewList.size() == 0) {
			setReviewListMessage("レビューが投稿されていません。");
		} else {
			int reviewCount = reviewList.size();
			String count = Integer.toString(reviewCount);
			setReviewListMessage(count + "件のレビューがあります。");
		}

		Iterator<ReviewDTO> iterator = reviewList.iterator();
		if (!(iterator.hasNext())) {
			reviewList = null;
		}
		return SUCCESS;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public List<ReviewDTO> getReviewList() {
		return reviewList;
	}

	public void setReviewList(List<ReviewDTO> reviewList) {
		this.reviewList = reviewList;
	}

	public String getReviewListMessage() {
		return reviewListMessage;
	}

	public void setReviewListMessage(String reviewListMessage) {
		this.reviewListMessage = reviewListMessage;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
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

	public String getProductNameKana() {
		return productNameKana;
	}

	public void setProductNameKana(String productNameKana) {
		this.productNameKana = productNameKana;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public int getProduct_stock() {
		return product_stock;
	}

	public void setProduct_stock(int product_stock) {
		this.product_stock = product_stock;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}



	public String getReleaseCompany() {
		return releaseCompany;
	}

	public void setReleaseCompany(String releaseCompany) {
		this.releaseCompany = releaseCompany;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}




}
