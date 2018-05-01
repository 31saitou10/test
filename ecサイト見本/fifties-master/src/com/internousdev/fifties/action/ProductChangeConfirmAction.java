package com.internousdev.fifties.action;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import javax.imageio.ImageIO;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.fifties.dao.MasterDAO;
import com.internousdev.fifties.dto.ProductDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ProductChangeConfirmAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;

	private String id;
	private String product_id;
	private String product_name;
	private String product_name_kana;
	private int category;
	private String price;
	private int product_stock;
	private String image_file_name;
	private String imageFileName;
	private String release_company;
	private String product_description;
	private String itemName;
	private String itemKanaName;
	private String itemId;
	private final long triOrder = 1024;
	private File file;
	private String filePath;
	private ArrayList<String> errorMessageList = new ArrayList<String>();
	MasterDAO dao = new MasterDAO();
	ArrayList<ProductDTO> productIdList = new ArrayList<ProductDTO>();

	public String execute() throws SQLException {

		String result = ERROR;
		System.out.println(itemKanaName);
		System.out.println(itemId);
		System.out.println(product_stock);
		System.out.println(file);
		if (product_id == null || product_name == null || product_name_kana == null || price == null ) {
			errorMessageList.add("【全ての項目を入力してください】");
			return result;
		}
		if (product_name.length() != 0 && product_name_kana.length() != 0 && price.length() != 0
				&& product_id.length() != 0) {
			if (!(itemName.equals(product_name))) {
				if (dao.checkItemNameInfo(product_name)) {
					errorMessageList.add("【登録されています】");
				}
			}
			if (!(itemKanaName.equals(product_name_kana))) {
				if (dao.checkItemKanaNameInfo(product_name_kana)) {
					errorMessageList.add("【登録されています】");
				}
			}
			if (!product_id.matches("^[1-9][0-9]{0,5}$")) { // itemPriceが数字でない時（あるいは0の時も）
				errorMessageList.add("【商品IDは半角数字で正しい値を入力してください】");
			}else if (!(itemId.equals(product_id))) {
				if (dao.checkItemIdInfo(Integer.parseInt(product_id))) {
					errorMessageList.add("【すでに登録されて】");
				}
			}
			if (product_name.length() > 50) {
				errorMessageList.add("【商品名は50文字以下で入力してください】");
			}

			if (product_name_kana.length() > 80) {
				errorMessageList.add("【商品名(ひらがな)は80文字以下で入力してください】");
			}
			if (!product_name_kana.matches("^[ぁ-ん]+$")) {
				errorMessageList.add("【商品名(ひらがな)はひらがなで入力してください】");
			}
			if (!price.matches("^[1-9][0-9]{0,5}$")) { // itemPriceが数字でない時（あるいは0の時も）
				errorMessageList.add("【価格は半角数字で正しい値を入力してください】");
			}

			if(file != null) {

				if(file.length() > 4 * triOrder * triOrder){
					errorMessageList.add(  "ファイルサイズの上限は4MB");
					return ERROR;
				}

				BufferedImage readImage = null;
				imageFileName = String.valueOf(new Date().getTime()) + ".jpg";
				filePath = "./images/" + imageFileName;
				String realPath = ServletActionContext.getServletContext().getRealPath(filePath);

				try {
					readImage = ImageIO.read(file);
					ImageIO.write(readImage, "jpg", new File(realPath));
				}catch(IOException e) {
					e.printStackTrace();
					readImage = null;
				}
			}

			result = SUCCESS;
			return result;
		}
		return result;

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

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public int getProduct_stock() {
		return product_stock;
	}

	public void setProduct_stock(int product_stock) {
		this.product_stock = product_stock;
	}

	public String getImage_file_name() {
		return image_file_name;
	}

	public void setImage_file_name(String image_file_name) {
		this.image_file_name = image_file_name;
	}

	public String getImageFileName() {
		return imageFileName;
	}

	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
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

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemKanaName() {
		return itemKanaName;
	}

	public void setItemKanaName(String itemKanaName) {
		this.itemKanaName = itemKanaName;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public ArrayList<String> getErrorMessageList() {
		return errorMessageList;
	}

	public void setErrorMessageList(ArrayList<String> errorMessageList) {
		this.errorMessageList = errorMessageList;
	}

	public MasterDAO getDao() {
		return dao;
	}

	public void setDao(MasterDAO dao) {
		this.dao = dao;
	}

	public ArrayList<ProductDTO> getProductIdList() {
		return productIdList;
	}

	public void setProductIdList(ArrayList<ProductDTO> productIdList) {
		this.productIdList = productIdList;
	}

	public long getTriOrder() {
		return triOrder;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}



}