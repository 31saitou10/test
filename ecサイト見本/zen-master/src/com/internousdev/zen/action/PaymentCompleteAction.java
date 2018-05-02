package com.internousdev.zen.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.zen.dao.PaymentCompleteDAO;
import com.internousdev.zen.dto.PaymentDTO;
import com.opensymphony.xwork2.ActionSupport;

public class PaymentCompleteAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;
	private int id;
	private String userId;
	private String productName;
	private String productCount;
	private String price;
	private String image_file_path;
	private String product_name_kana;
	private String release_company;

	// private String token;
	// private String productTotalPrice;
	// private String totalPrice;

	@SuppressWarnings({ "unchecked", "unused" })
	public String execute() {
		// String result=ERROR;
		// String sessionToken=(String)session.get("token");
		// if(sessionToken == null || !(token.equals(sessionToken))){
		// return result;
		// }

		String[] imageFilePathList = image_file_path.split(", ", 0);
		String[] productNameList = productName.split(", ", 0);
		String[] product_name_kanaList = product_name_kana.split(", ", 0);
		String[] release_companyList = release_company.split(", ", 0);
		String[] productCountList = productCount.split(", ", 0);
		String[] priceList = price.split(", ", 0);

		session.remove("token");

		// LoginDTO loginDTO=(LoginDTO)session.get("loginUser");
		// String userId=loginDTO.getLoginUserId();

		List<PaymentDTO> purchasedItems = new ArrayList<PaymentDTO>();
		purchasedItems = ((ArrayList<PaymentDTO>) session.get("cart"));

		int purchaseResult = 0;
		int cartResult = 0;

		PaymentCompleteDAO paymentCompleteDAO = new PaymentCompleteDAO();
		for (int i = 0; i < productNameList.length; i++) {
			// 購入者履歴テーブルにインサート
			try {
				purchaseResult = paymentCompleteDAO.insertPurchaseHistory(userId, String.valueOf(imageFilePathList[i]),
						String.valueOf(productNameList[i]), String.valueOf(product_name_kanaList[i]),
						String.valueOf(release_companyList[i]), String.valueOf(productCountList[i]),
						String.valueOf(priceList[i]));
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		// カート情報を削除する
		try {
			cartResult = paymentCompleteDAO.deleteCartItems(userId);
			if (cartResult <= 0) {
				return ERROR;
			}
		} catch (NumberFormatException | SQLException e) {
			e.printStackTrace();
		}

		if (purchaseResult <= 0) {
			return ERROR;
		}

		session.remove("cart");
		session.remove("price");
		session.remove("latestAddress");
		session.remove("addressList");

		return SUCCESS;

	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	// public String getToken(){
	// return token;
	// }
	// public void setToken(String token){
	// this.token=token;
	// }

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCount() {
		return productCount;
	}

	public void setProductCount(String productCount) {
		this.productCount = productCount;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getImage_file_path() {
		return image_file_path;
	}

	public void setImage_file_path(String image_file_path) {
		this.image_file_path = image_file_path;
	}

	public String getProduct_name_kana() {
		return product_name_kana;
	}

	public void setProduct_name_kana(String product_name_kana) {
		this.product_name_kana = product_name_kana;
	}

	public String getRelease_company() {
		return release_company;
	}

	public void setRelease_company(String release_company) {
		this.release_company = release_company;
	}

	// public String getProductTotalPrice() {
	// return productTotalPrice;
	// }
	//
	// public void setProductTotalPrice(String productTotalPrice) {
	// this.productTotalPrice = productTotalPrice;
	// }

	// public String getTotalPrice() {
	// return totalPrice;
	// }
	//
	// public void setTotalPrice(String totalPrice) {
	// this.totalPrice = totalPrice;
	// }

}
