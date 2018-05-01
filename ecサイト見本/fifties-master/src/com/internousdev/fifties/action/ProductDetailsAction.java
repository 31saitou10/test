package com.internousdev.fifties.action;
/*
 * 戌亥　作成
 */

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.fifties.dao.CartInfoDAO;
import com.internousdev.fifties.dao.FavoriteDAO;
import com.internousdev.fifties.dao.ProductDetailsDAO;
import com.internousdev.fifties.dao.ReviewDAO;
import com.internousdev.fifties.dto.ProductDTO;
import com.internousdev.fifties.dto.ReviewDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ProductDetailsAction extends ActionSupport implements SessionAware {

	// セッション情報取得
	public Map<String, Object> session;
	private String id;
	private int product_id;
	private String image_file_path;
	private String product_name;
	private String product_name_kana;
	private String product_description;
	private String release_company;
	private String release_date;
	private int product_count;
	private int product_stock;
	private int remainingCount;
	private String error;
	private int insertFlg;
	private int price;
	private int category_id;

	private int favoriteFlg = 0;
	private FavoriteDAO favoriteDAO = new FavoriteDAO();


	// 購入個数リスト
	private List<Integer> stockList = new ArrayList<Integer>();

	// 商品情報リスト
	public ProductDTO detail = new ProductDTO();
	public List<ProductDTO> detailsList = new ArrayList<ProductDTO>();

	// お勧めリスト
	public List<ProductDTO> sugestList = new ArrayList<ProductDTO>();

	private ProductDetailsDAO productDetailsDAO = new ProductDetailsDAO();

	private List<ReviewDTO> reviewList = new ArrayList<ReviewDTO>();

	public String execute() throws SQLException {
				try {
						detail = productDetailsDAO.getProductDetailsInfo(product_id);
						if (detail != null) {
							image_file_path = detail.getImage_file_path();
							product_name_kana = detail.getProduct_name_kana();
							product_name = detail.getProduct_name();
							product_description = detail.getProduct_description();
							price = detail.getPrice();
							release_date = detail.getRelease_date();
							release_company = detail.getRelease_company();
							product_stock = detail.getProduct_stock();
							product_id = detail.getProduct_id();
							category_id = detail.getCategory_id();

						} else {

							return ERROR;
						}
					} catch (Exception e) {
						e.printStackTrace();
					}

		// お勧めリスト情報取得
		try {
			sugestList = productDetailsDAO.getSugestProductInfo(category_id, product_id);
		} catch (Exception e) {
			e.printStackTrace();
		}

		//在庫判定
		String userId;
		boolean loginFlg;
		loginFlg = (boolean) session.get("loginFlg");

		if(loginFlg){
			userId = session.get("userId").toString();
		}else{
			userId = session.get("tempUserId").toString();
		}

		CartInfoDAO cartInfodao =new CartInfoDAO();
		product_count = cartInfodao.getCartProductCount(userId, product_id);
		remainingCount=product_stock - product_count;
		// １から在庫数までの選択表示用List
		for (int i = 1; i <= remainingCount; i++) {
			stockList.add(i);
		}

		if (category_id == 0) {
			return ERROR;
		}

		// -----------------review---------------------------------------------------------------------------------------------

		ReviewDAO reviewDAO = new ReviewDAO();

		reviewList = reviewDAO.getReview_info(product_id);

		Iterator<ReviewDTO> iterator = reviewList.iterator();
		if (!(iterator.hasNext())) {
			reviewList = null;
		}

		// ------------------------------------------------------------------------------------------------------------------
		if(loginFlg == true){
		String user_id = session.get("userId").toString();
		setFavoriteFlg(favoriteDAO.checkFavorite_info(user_id, product_id));
		}
		String result = SUCCESS;
		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public int getProduct_count() {
		return product_count;
	}

	public void setProduct_count(int product_count) {
		this.product_count = product_count;
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

	/**
	 * insertFlgを取得します。
	 *
	 * @return insertFlg
	 */
	public int getInsertFlg() {
		return insertFlg;
	}

	/**
	 * insertFlgを設定します。
	 *
	 * @param insertFlg
	 *            insertFlg
	 */
	public void setInsertFlg(int insertFlg) {
		this.insertFlg = insertFlg;
	}

	public List<Integer> getStockList() {
		return stockList;
	}

	public void setStockList(List<Integer> stockList) {
		this.stockList = stockList;
	}

	public List<ProductDTO> getDetailsList() {
		return detailsList;
	}

	public void setDetailsList(List<ProductDTO> detailsList) {
		this.detailsList = detailsList;
	}

	public ProductDetailsDAO getProductDetailsDAO() {
		return productDetailsDAO;
	}

	public void setProductDetailsDAO(ProductDetailsDAO productDetailsDAO) {
		this.productDetailsDAO = productDetailsDAO;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public List<ReviewDTO> getReviewList() {
		return reviewList;
	}

	public void setReviewList(List<ReviewDTO> reviewList) {
		this.reviewList = reviewList;
	}

	public String getImage_file_path() {
		return image_file_path;
	}

	public void setImage_file_path(String image_file_path) {
		this.image_file_path = image_file_path;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_name_kana() {
		return product_name_kana;
	}

	public void setProduct_name_kana(String product_name_kana) {
		this.product_name_kana = product_name_kana;
	}

	public String getProduct_description() {
		return product_description;
	}

	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}

	public String getRelease_company() {
		return release_company;
	}

	public void setRelease_company(String release_company) {
		this.release_company = release_company;
	}

	public String getRelease_date() {
		return release_date;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	public List<ProductDTO> getSugestList() {
		return sugestList;
	}

	public void setSugestList(List<ProductDTO> sugestList) {
		this.sugestList = sugestList;
	}

	public int getFavoriteFlg() {
		return favoriteFlg;
	}

	public void setFavoriteFlg(int favoriteFlg) {
		this.favoriteFlg = favoriteFlg;
	}

	public int getRemainingCount() {
		return remainingCount;
	}

	public void setRemainingCount(int remainingCount) {
		this.remainingCount = remainingCount;
	}

}
