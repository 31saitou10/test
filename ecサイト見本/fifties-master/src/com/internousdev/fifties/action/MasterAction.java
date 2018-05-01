package com.internousdev.fifties.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.fifties.dao.MasterDAO;
import com.internousdev.fifties.dto.ProductDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MasterAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;
	private String id;
	private String product_id;
	private String product_name;
	private String product_name_kana;
	private String price;
	private String image_file_name;
	private String release_company;
	private String product_description;
	private String deleteFlg;
	private String errorMessage;
	private String dMessage;
	private String changeFlg;
	private String stockFlg;
	private int stock;

	ArrayList<ProductDTO> productDTOList = new ArrayList<ProductDTO>();
	ArrayList<ProductDTO> productIdList = new ArrayList<ProductDTO>();

	public String execute() throws SQLException {

		String result = ERROR;

//		MasterIdがsessionに入ってるか確認
		if (session.containsKey("MasterFlg")) {
			result = SUCCESS;
//			削除
			if (deleteFlg != null) {
				System.out.println(deleteFlg);
				result = this.delete(product_id);
			}

//			商品情報変更
			if (changeFlg != null) {
				System.out.println(changeFlg);
				result = this.update(product_id);
			}

//			在庫変更
			if(stockFlg !=null){
				System.out.println(stock);
				result =this.stock(product_id,stock);
			}

			MasterDAO dao = new MasterDAO();
			productDTOList = dao.getProductInfo();

			return result;
		} else {
			result = "token";
		}
		return result;
	}



//	商品削除
	private String delete(String product_id) throws SQLException {

		String result = SUCCESS;

		System.out.println(product_id);

		int count = 0;

		MasterDAO dao = new MasterDAO();

		count += dao.productDelete(Integer.parseInt(product_id));

		if (count > 0) {
			this.dMessage = "削除できました。";
			return SUCCESS;
		}
		return result;
	}


//	商品情報変更
	private String update(String product_id) throws NumberFormatException, SQLException {

		System.out.println(product_id);

		System.out.println("チェック→" + product_id);


		return "masterChange";

	}


//	在庫変更
	private String stock(String product_id, int stock) throws NumberFormatException, SQLException {
		String result=SUCCESS;

		System.out.println(product_id);
		System.out.println(stock);
		int count = 0;
		MasterDAO dao=new MasterDAO();

		dao.updateStock(stock,Integer.parseInt(product_id));

		if(count>0){
			return SUCCESS;
		}

		return result;
	}




	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}

	public String getdMessage() {
		return dMessage;
	}

	public String getStockFlg() {
		return stockFlg;
	}



	public void setStockFlg(String stockFlg) {
		this.stockFlg = stockFlg;
	}



	public int getStock() {
		return stock;
	}



	public void setStock(int stock) {
		this.stock = stock;
	}



	public void setdMessage(String dMessage) {
		this.dMessage = dMessage;
	}

	public String getDMessage() {
		return dMessage;
	}

	public void setDMessage(String dMessage) {
		this.dMessage = dMessage;
	}

	public String getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public ArrayList<ProductDTO> getProductIdList() {
		return productIdList;
	}

	public void setProductIdList(ArrayList<ProductDTO> productIdList) {
		this.productIdList = productIdList;
	}

	public String getChangeFlg() {
		return changeFlg;
	}

	public void setChangeFlg(String changeFlg) {
		this.changeFlg = changeFlg;
	}

	public Map<String, Object> getSession() {
		return this.session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public ArrayList<ProductDTO> getProductDTOList() {
		return productDTOList;
	}

	public void setProductDTOList(ArrayList<ProductDTO> productDTOList) {
		this.productDTOList = productDTOList;
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


}
