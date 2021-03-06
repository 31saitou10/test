package com.internousdev.fifties.action;


import java.sql.SQLException;
import java.text.ParseException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.fifties.dao.MasterAddDAO;
import com.opensymphony.xwork2.ActionSupport;

public class MasterAddCompleteAction extends ActionSupport implements SessionAware{





	public Map<String, Object> session;
	private MasterAddDAO masterAddDAO = new MasterAddDAO();


	private String productName;
	private String productKanaName;
	private String price;
	private String productStock;
	private String imageFileName;
	private String imageName;
	private String company;
	private String productId;
	private String category;
	private String description;
	private String release;



	public String execute() throws SQLException, ParseException {



		masterAddDAO.buyItemeInfo(
				Integer.parseInt(productId.toString()),
				productName,
				productKanaName,
				Integer.parseInt(price.toString()),
				Integer.parseInt(productStock.toString()),
				imageFileName,
				imageName,
				company,
				description,
				Integer.parseInt(category.toString())
				);
		String result = SUCCESS;
		return result;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getRelease() {
		return release;
	}


	public void setRelease(String release) {
		this.release = release;
	}


	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getProductId() {
		return productId;
	}


	public void setProductId(String productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductKanaName() {
		return productKanaName;
	}


	public void setProductKanaName(String productKanaName) {
		this.productKanaName = productKanaName;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public String getProductStock() {
		return productStock;
	}


	public void setProductStock(String productStock) {
		this.productStock = productStock;
	}



	public String getImageFileName() {
		return imageFileName;
	}


	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}


	public MasterAddDAO getMasterAddDAO() {
		return masterAddDAO;
	}


	public void setMasterAddDAO(MasterAddDAO masterAddDAO) {
		this.masterAddDAO = masterAddDAO;
	}


	public String getImageName() {
		return imageName;
	}


	public void setImageName(String imageName) {
		this.imageName = imageName;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}





}



