
package com.internousdev.fifties.dto;

public class ProductDTO {
	private int id;
	private int product_id;
	private String product_name;
	private String product_name_kana;
	private String product_description;
	private int category_id;
	private int product_stock;
	private int price;
	private String image_file_path;
	private String image_file_name;
	private String release_date;
	private String release_company;
	private int status;
	private String insert_date;
	private String update_date;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
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

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
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

	public String getImage_file_path() {
		return image_file_path;
	}

	public void setImage_file_path(String image_file_path) {
		this.image_file_path = image_file_path;
	}

	public String getImage_file_name() {
		return image_file_name;
	}

	public void setImage_file_name(String image_file_name) {
		this.image_file_name = image_file_name;
	}

	public String getRelease_date() {
		return release_date;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	public String getRelease_company() {
		return release_company;
	}

	public void setRelease_company(String release_company) {
		this.release_company = release_company;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getInsert_date() {
		return insert_date;
	}

	public void setInsert_date(String insert_date) {
		this.insert_date = insert_date;
	}

	public String getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}

}