package com.internousdev.fifties.dto;

public class CategoryDTO {
	private int id;
	private int category_id;
	private String category_name;
	private String category_description;
	private String insert_date;
	private String update_date;

	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	public int getCategory_id(){
		return category_id;
	}
	public void setCategory_id(int category_id){
		this.category_id=category_id;
	}
	public String getCategory_name(){
		return category_name;
	}
	public void setCategory_name(String category_name){
		this.category_name=category_name;
	}
	public String getCategory_description(){
		return category_description;
	}
	public void setCategory_description(String category_description){
		this.category_description=category_description;
	}
	public String getInsert_date(){
		return insert_date;
	}
	public void setInsert_date(String insert_date){
		this.insert_date=insert_date;
	}
	public String getUpdate_date(){
		return update_date;
	}
	public void setUpdate_date(String update_date){
		this.update_date=update_date;
	}
}
