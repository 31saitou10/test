package com.internousdev.fifties.dto;

public class InquiryDTO {
	private int id;
	private String name;
	private String email;
	private String inquiry_type;
	private String inquiry_body;
	private String insert_date;



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getInquiry_type() {
		return inquiry_type;
	}
	public void setInquiry_type(String inquiry_type) {
		this.inquiry_type = inquiry_type;
	}
	public String getInquiry_body() {
		return inquiry_body;
	}
	public void setInquiry_body(String inquiry_body) {
		this.inquiry_body = inquiry_body;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInsert_date() {
		return insert_date;
	}
	public void setInsert_date(String insert_date) {
		this.insert_date = insert_date;
	}

}
