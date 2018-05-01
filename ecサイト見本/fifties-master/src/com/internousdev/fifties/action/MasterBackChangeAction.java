package com.internousdev.fifties.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class MasterBackChangeAction  extends ActionSupport{



	public Map<String, Object> session;
	private String id;
	private String product_id;
	private String product_stock;
	private String product_name;
	private String product_name_kana;
	private String price;
	private String imageFileName;
	private String image_file_name;
	private String release_company;
	private String product_description;
	private String category;
	public String execute(){

		return SUCCESS;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getProduct_stock() {
		return product_stock;
	}
	public void setProduct_stock(String product_stock) {
		this.product_stock = product_stock;
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
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getImageFileName() {
		return imageFileName;
	}
	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}
	public String getImage_file_name() {
		return image_file_name;
	}
	public void setImage_file_name(String image_file_name) {
		this.image_file_name = image_file_name;
	}
	public String getRelease_company() {
		return release_company;
	}
	public void setRelease_company(String release_company) {
		this.release_company = release_company;
	}
	public String getProduct_description() {
		return product_description;
	}
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}




}