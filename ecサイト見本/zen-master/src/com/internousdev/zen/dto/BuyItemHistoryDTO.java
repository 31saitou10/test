package com.internousdev.zen.dto;

public class BuyItemHistoryDTO {

	private String user_id;

	private String product_name;

	private String product_count;

	private String product_namekana;

	private String price;

	private String image_file_path;

	private String release_company;

	private String regist_date;




	public String getProduct_namekana() {
		return product_namekana;
	}
	public void setProduct_namekana(String product_namekana) {
		this.product_namekana = product_namekana;
	}
	public String getImage_file_path() {
		return image_file_path;
	}
	public void setImage_file_path(String image_file_path) {
		this.image_file_path = image_file_path;
	}
	public String getRelease_company() {
		return release_company;
	}
	public void setRelease_company(String release_company) {
		this.release_company = release_company;
	}
	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id){
		this.user_id=user_id;
	}

	public String getProduct_name(){
		return product_name;
	}
	public void setProduct_name(String product_name){
		this.product_name=product_name;
	}

	public String getProduct_count(){
		return product_count;
	}

	public void setProduct_count(String product_count){
		this.product_count=product_count;
	}


	public String getPrice(){
		return price;
	}
	public void setPrice(String price){
		this.price=price;
	}

	public String getRegist_date(){
		return regist_date;
	}

	public void setRegist_date(String regist_date){
		this.regist_date=regist_date;
	}


}
