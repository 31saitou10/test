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

public class MasterAddConfirmAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;

	private String productName;
	private String productKanaName;
	private String price;
	private int productStock;
	private String filePath;
	private File file;
	private String imageFileName;
	private String imageName;
	private String company;
	private String productId;
	private int category;
	private String description;
	private final long triOrder = 1024;
	private ArrayList<String> errorMessageList = new ArrayList<String>();

	MasterDAO dao = new MasterDAO();

	ArrayList<ProductDTO> productDTOList = new ArrayList<ProductDTO>();

	public String execute() throws SQLException {

		String result = ERROR;
		productDTOList = dao.getProductInfo();



			   if (productName.length() != 0 && productKanaName.length() != 0 && price.length() != 0
						) {
					if (!productId.matches("^[0-9]+$")) { // itemPriceが数字でない時（あるいは0の時も）
						errorMessageList.add("【商品IDは半角数字で正しい値を入力してください】");
					}else if (dao.checkItemInfo(productName, productKanaName, Integer.parseInt(productId))) {
						errorMessageList.add("【すでに登録されています】");
					}
					if (productName.length() > 50) {
						errorMessageList.add("【商品名は50文字以下で入力してください】");
					}

					if (productKanaName.length() > 80) {
						errorMessageList.add("【商品名(ひらがな)は80文字以下で入力してください】");
					}
					if (productKanaName.matches("^[a-zA-Z.一-龠]+$")) {
						errorMessageList.add("【商品名(ひらがな)はひらがな,カナで入力してください】");
					}
					if (!price.matches("^[1-9]+[0-9]+$")) { // itemPriceが数字でない時（あるいは0の時も）
						errorMessageList.add("【価格は半角数字で正しい値を入力してください】");
					}


					if (!errorMessageList.isEmpty()) {
						return result;
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
				}else{
					errorMessageList.add("【全ての項目を入力してください】");
					return result;
				}
	}



	public Map<String, Object> getSession() {
		return session;
	}

	public String getImageFileName() {
		return imageFileName;
	}

	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	public long getTriOrder() {
		return triOrder;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductKanaName() {
		return productKanaName;
	}

	public void setProductKanaName(String productKanaName) {
		this.productKanaName = productKanaName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public int getProductStock() {
		return productStock;
	}

	public void setProductStock(int productStock) {
		this.productStock = productStock;
	}




	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public ArrayList<ProductDTO> getProductDTOList() {
		return productDTOList;
	}

	public void setProductDTOList(ArrayList<ProductDTO> productDTOList) {
		this.productDTOList = productDTOList;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

}
