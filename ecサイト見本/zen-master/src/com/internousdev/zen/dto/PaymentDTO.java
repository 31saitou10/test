package com.internousdev.zen.dto;

public class PaymentDTO {
	private int userId;
	private String productId;
	private String productName;
	private String Price;
	private String productCount;
	private String imageFilePath;

	private int totalPrice;


	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getTotalPrice(){
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice){
		this.totalPrice=totalPrice;
	}

	public String getproductId(){
		return productId;
	}

	public void setproductId(String productId){
		this.productId=productId;
	}
	public String getPrice(){
		return Price;
	}

	public void setPrice(String Price){
		this.Price=Price;
	}

	public String getProductCount(){
		return productCount;
	}

	public void setProductCount(String productCount){
		this.productCount=productCount;
	}

	public int getUserId(){
		return userId;
	}

	public void setUserID(int userId){
		this.userId=userId;
	}

	public String getImageFilePath() {
		return imageFilePath;
	}

	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}



}
