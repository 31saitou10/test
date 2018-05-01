package com.internousdev.fifties.action;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.fifties.dao.CartDeleteDAO;
import com.internousdev.fifties.dao.CartInfoDAO;
import com.internousdev.fifties.dao.LoginDAO;
import com.internousdev.fifties.dao.MasterDAO;
import com.internousdev.fifties.dto.CartInfoDTO;
import com.internousdev.fifties.dto.LoginDTO;
import com.internousdev.fifties.dto.ProductDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;
	private String userId;
	private String tempUserId;
	private String password;
	private boolean saveIdFlg;
	private String errorMessage;
	private String idErrorMessage;
	private String passwordErrorMessage;
	private ArrayList<ProductDTO> productDTOList = new ArrayList<ProductDTO>();


	public String execute() throws SQLException {
		LoginDAO loginDAO = new LoginDAO();
		LoginDTO userInfoDTO = new LoginDTO();
		CartInfoDAO cartInfoDAO = new CartInfoDAO();
		ArrayList<CartInfoDTO> cartList = new ArrayList<CartInfoDTO>();



		//ID保持
		if(saveIdFlg){
			session.put("saveId",userId);
		}else{
			session.remove("saveId");
		}
		//ここからーーー入力内容のチェック
		if(userId.equals("")){ //userIdが空欄
			idErrorMessage = ("【ユーザーIDを入力してください】");
		}else if(userId.length()>8){ //userIdの長さが1以下か8以上のとき
			idErrorMessage = ("【ユーザーIDは1文字以上8文字以下で入力してください】");
		}else if(!userId.matches("^[a-zA-Z0-9]+$")){ //userIdに英数字以外が含まれているとき
			idErrorMessage = ("【ユーザーIDは半角英数字で入力してください】");
		}

		if(password.equals("")){ //passwordが空欄
			passwordErrorMessage = ("【パスワードを入力してください】");
		}else if(password.length()<1 || password.length()>16){ //passwordの長さが1以下か8以上のとき
			passwordErrorMessage = ("【パスワードは1文字以上16文字以下で入力してください】");
		}else if(!password.matches("^[a-zA-Z0-9]+$")){ //passwordに英数字以外が含まれているとき
			passwordErrorMessage = ("【パスワードは半角英数字で入力してください】");
		}
		if(idErrorMessage != null || passwordErrorMessage != null){
			return ERROR;
		}
		//ここまで----入力チェック



		userInfoDTO = loginDAO.getUserInfo(userId, password);
		if(userInfoDTO.getUserId() == null){
			errorMessage = ("【入力されたパスワードが異なります】");
			return ERROR;
		}

		//管理者ユーザor一般ユーザ
		if(userInfoDTO.getMasterFlg().equals("1")){
			session.put("MasterFlg",1);
			MasterDAO dao = new MasterDAO();
			productDTOList = dao.getProductInfo();
			return "master";
		}else{
			session.put("userId", userId);
			session.put("loginFlg", true);
			session.put("userInfoDTO", userInfoDTO);

			//仮ユーザーで入れたカート情報を書き換える
			tempUserId = session.get("tempUserId").toString();
			cartList = cartInfoDAO.getUserCartList(tempUserId);
			if(cartList.size() == 0){
				return SUCCESS;
			}else{
				for(CartInfoDTO cartInfoDTO: cartList){
					//すでに同じ商品が入っているか
					if(cartInfoDAO.sameProductExists(userId,cartInfoDTO.getProductId())){
						int cnt = cartInfoDAO.updateCartProductCount(userId, cartInfoDTO.getProductId(), cartInfoDTO.getProductCount());
						if(cnt == 0){
							return "errorPage";
						}
						//仮ユーザーのカートを削除
						CartDeleteDAO cartDeleteDAO = new CartDeleteDAO();
						int count = 0;
						count = cartDeleteDAO.deleteUserCart(tempUserId, cartInfoDTO.getProductId());
						if(count == 0){
							return "errorPage";
						}

					}else{
						cartInfoDAO.changeTempUserCart(userId, session.get("tempUserId").toString(), cartInfoDTO.getProductId());
					}
				}
			}

		}

		return SUCCESS;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getIdErrorMessage() {
		return idErrorMessage;
	}

	public void setIdErrorMessage(String idErrorMessage) {
		this.idErrorMessage = idErrorMessage;
	}

	public String getPasswordErrorMessage() {
		return passwordErrorMessage;
	}

	public void setPasswordErrorMessage(String passwordErrorMessage) {
		this.passwordErrorMessage = passwordErrorMessage;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<ProductDTO> getProductDTOList() {
		return productDTOList;
	}

	public void setProductDTOList(ArrayList<ProductDTO> productDTOList) {
		this.productDTOList = productDTOList;
	}

	public boolean isSaveIdFlg() {
		return saveIdFlg;
	}

	public void setSaveIdFlg(boolean saveIdFlg) {
		this.saveIdFlg = saveIdFlg;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}