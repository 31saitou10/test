package com.internousdev.miamiburger.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miamiburger.dao.ProductInfoDescriptionDAO;
import com.internousdev.miamiburger.dto.CreateBurgerHtmlCreaterDTO;
import com.internousdev.miamiburger.dto.ProductInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ProductInfoDescriptionAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;

	// 商品詳細情報格納リスト
	private ProductInfoDescriptionDAO productInfoDescriptionDAO = new ProductInfoDescriptionDAO();

	// お勧めリスト
	public List<ProductInfoDTO> sugestList = new ArrayList<ProductInfoDTO>();
	private List<CreateBurgerHtmlCreaterDTO> htmlList = new ArrayList<>();

	private int productId;
	private int categoryId;
	private int price;

	public String execute() {



		ProductInfoDTO productInfoDTO = productInfoDescriptionDAO.getProductDescription(productId);

		session.put("productId", productId);
		session.put("productName", productInfoDTO.getProductName());
		session.put("productNameKana", productInfoDTO.getProductNameKana());
		session.put("productDescription", productInfoDTO.getProductDescription());
		session.put("categoryId", productInfoDTO.getCategoryId());
		session.put("price", productInfoDTO.getPrice());
		price = productInfoDTO.getPrice();
		session.put("imageFilePath", productInfoDTO.getImageFilePath());
		session.put("imageFileName", productInfoDTO.getImageFileName());
		session.put("releaseDate", productInfoDTO.getReleaseDate());

		// お勧めリスト情報取得
		try {
			sugestList = productInfoDescriptionDAO.getSugestProductInfo(categoryId, productId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		for(int i = 1; i< 6;i++){
			dto = new CreateBurgerHtmlCreaterDTO();
			dto.setCount(i);
			htmlList.add(dto);
		}

		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public ProductInfoDescriptionDAO getProductInfoDescriptionDAO() {
		return productInfoDescriptionDAO;
	}

	public void setProductInfoDescriptionDAO(ProductInfoDescriptionDAO productInfoDescriptionDAO) {
		this.productInfoDescriptionDAO = productInfoDescriptionDAO;
	}

	public List<ProductInfoDTO> getSugestList() {
		return sugestList;
	}

	public void setSugestList(List<ProductInfoDTO> sugestList) {
		this.sugestList = sugestList;
	}

	public List<CreateBurgerHtmlCreaterDTO> getHtmlList() {
		return htmlList;
	}

	public void setHtmlList(List<CreateBurgerHtmlCreaterDTO> htmlList) {
		this.htmlList = htmlList;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}



	
}