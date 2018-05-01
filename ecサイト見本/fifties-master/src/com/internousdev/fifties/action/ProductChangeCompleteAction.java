package com.internousdev.fifties.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.fifties.dao.MasterDAO;
import com.internousdev.fifties.dto.ProductDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ProductChangeCompleteAction extends ActionSupport implements SessionAware {
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
	private String updateErrorMessage;
	private String id;

	MasterDAO dao = new MasterDAO();
	ArrayList<ProductDTO> productDTOList = new ArrayList<ProductDTO>();
	private Map<String, Object> session;

	public String execute() throws SQLException {
		String result = ERROR;
		System.out.println(id);
		System.out.println(product_id);

		if (product_id.equals(null)) {
			return result;
		} else if (!product_id.equals(null)) {

			return update();

		}
		productDTOList = dao.getProductInfo();
		return result;
	}

	private String update() throws SQLException {
		String result = SUCCESS;


		dao.productUpdateInfo(Integer.parseInt(product_stock),
				product_name,
				product_name_kana,
				Integer.parseInt(price),
				imageFileName,
				image_file_name,
				release_company,
				product_description,
				Integer.parseInt(category),
				Integer.parseInt(product_id),
				Integer.parseInt(id)
				);

		return result;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getUpdateErrorMessage() {
		return updateErrorMessage;
	}

	public void setUpdateErrorMessage(String updateErrorMessage) {
		this.updateErrorMessage = updateErrorMessage;
	}

	public ArrayList<ProductDTO> getProductDTOList() {
		return productDTOList;
	}

	public void setProductDTOList(ArrayList<ProductDTO> productDTOList) {
		this.productDTOList = productDTOList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
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

	public MasterDAO getDao() {
		return dao;
	}

	public void setDao(MasterDAO dao) {
		this.dao = dao;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}




}
