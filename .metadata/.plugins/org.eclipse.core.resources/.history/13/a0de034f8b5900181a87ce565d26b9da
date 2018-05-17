package com.internousdev.miamiburger.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miamiburger.dao.InsertCartDAO;
import com.internousdev.miamiburger.dao.InsertCreateBurgerDAO;
import com.internousdev.miamiburger.dao.InsertProductInfoCreateBurgerDAO;
import com.internousdev.miamiburger.dto.BurgerOptionsDTO;
import com.internousdev.miamiburger.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

/*
 * 作成したクリエイトバーガーの内容をcreate_burgerテーブル、product_infoテーブル、cart_infoテーブルに格納する。
 */
public class CreateBurgerCompleteAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;

	@SuppressWarnings("unchecked")
	public String execute() {
		InsertCreateBurgerDAO insertCreateBurgerDAO = new InsertCreateBurgerDAO();
		InsertProductInfoCreateBurgerDAO insertProductInfoDAO = new InsertProductInfoCreateBurgerDAO();
		InsertCartDAO insertCartDAO = new InsertCartDAO();

//		create_burgerテーブルに作成したクリエイトバーガーを登録する。---------------------------------
		String userId = null;
		if(session.containsKey("userInfoDTO")){
			UserInfoDTO loginDTO = (UserInfoDTO) session.get("userInfoDTO");
			userId = loginDTO.getUserId();
		}
		int price = (int) session.get("createPrice");
		List<Integer> selectOptionIdList = new ArrayList<>();
		selectOptionIdList = (List<Integer>) session.get("selectOptionIdList");

		int checkDAO = insertCreateBurgerDAO.insertCreateBurger(userId, price, selectOptionIdList);
		if(checkDAO == 0){
			return ERROR;
		}
//		------------------------------------------------------------------------------------

//		product_infoテーブルに作成したクリエイトバーガーの情報を登録する--------------------------------
		List<BurgerOptionsDTO> burgerOptionsList = new ArrayList<>();
		burgerOptionsList = (List<BurgerOptionsDTO>) session.get("burgerOptionsList");
		//		product_tableの商品詳細に登録するテキストを作成。
		String product_description = "選択されたオプション：";
		for(int i = 0; i < selectOptionIdList.size() ; i++ ){
		 product_description += "オプション"+ (i+1) +"："+ burgerOptionsList.get(selectOptionIdList.get(i)-1).getOptionName() + " ";
		}

		int maxProductId = insertProductInfoDAO.getMaxProductId();
		int category_id = 5;
		String image_file_path = "./images/hunburger1.jpg";
		String image_file_name = "クリエイトバーガー";

		int checkNum = insertProductInfoDAO.insertProductInfo(maxProductId+1, product_description, category_id, price, image_file_path, image_file_name);
		if(checkNum == 0){
			return ERROR;
		}
//		--------------------------------------------------------------------------------------------------

//		cart_infoテーブルに作成したクリエイトバーガーを登録する---------------------------------
		String tempUserId  = session.get("temp_user_id").toString();
		int productCount = (Integer) session.get("createProduct_count");
		int totalPrice = productCount * price;
		int check = insertCartDAO.insertCart(userId, tempUserId, maxProductId+1, productCount, totalPrice);
		if(check == 0){
			return ERROR;
		}
//		-----------------------------------------------------------------------
		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
