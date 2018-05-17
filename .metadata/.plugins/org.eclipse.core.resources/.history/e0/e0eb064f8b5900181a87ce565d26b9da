package com.internousdev.miamiburger.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miamiburger.dao.ProductInfoDAO;
import com.internousdev.miamiburger.dto.ProductInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class GoMasterAction extends ActionSupport implements SessionAware{
	public Map<String, Object> session;
	// カテゴリID(初期値0で全検索)
		private String categoryId = "0";
	// 検索ワード(初期値空白)
		private String search = "";
	// 商品情報取得DAO
		private ProductInfoDAO productInfoDAO = new ProductInfoDAO();
	// 商品情報をリストに格納
		public ArrayList<ProductInfoDTO> productInfoList = new ArrayList<ProductInfoDTO>();

		public String execute() throws SQLException {

			productInfoList = productInfoDAO.getProductListInfoAll(search);
			session.put("productInfoList", productInfoList);
			return SUCCESS;

		}

		public Map<String, Object> getSession() {
			return session;
		}

		public void setSession(Map<String, Object> session) {
			this.session = session;
		}

		public String getCategoryId() {
			return categoryId;
		}

		public void setCategoryId(String categoryId) {
			this.categoryId = categoryId;
		}

		public String getSearch() {
			return search;
		}

		public void setSearch(String search) {
			this.search = search;
		}

		public ProductInfoDAO getProductInfoDAO() {
			return productInfoDAO;
		}

		public void setProductInfoDAO(ProductInfoDAO productInfoDAO) {
			this.productInfoDAO = productInfoDAO;
		}

		public ArrayList<ProductInfoDTO> getProductInfoList() {
			return productInfoList;
		}

		public void setProductInfoList(ArrayList<ProductInfoDTO> productInfoList) {
			this.productInfoList = productInfoList;
		}

}