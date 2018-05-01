package com.internousdev.fifties.action;
//妹尾作成
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.fifties.dao.AddressDAO;
import com.internousdev.fifties.dao.BuyItemCompleteDAO;
import com.internousdev.fifties.dao.CartDeleteDAO;
import com.internousdev.fifties.dao.CartInfoDAO;
import com.internousdev.fifties.dto.AddressDTO;
import com.internousdev.fifties.dto.CartInfoDTO;
/*
 * 決済確認画面に行くためのアクション
 * ログイン状態の確認
 * 宛先情報の取得
 */
import com.opensymphony.xwork2.ActionSupport;


public class BuyItemConfirmAction extends ActionSupport implements SessionAware {

	private Map<String,Object> session;
	private int totalPrice=0;//合計金額
	private int productCount;//個数
	private List<CartInfoDTO> cartList=new ArrayList<CartInfoDTO>();//カート情報一覧
	private ArrayList<AddressDTO> addressDTOList = new ArrayList<AddressDTO>();//宛先情報一覧

	public ArrayList<AddressDTO> addressList= new ArrayList<AddressDTO>();
	private int finallyTotalPrice;
	private ArrayList<CartInfoDTO> cartInfoList= new ArrayList<CartInfoDTO>();
	private int cartTotalPrice;
	private String errorMessage;

/*
 * カートの決済ボタンを押下後のアクション
 * ①ログイン判定
 * ②カート情報の取得
 * ③別アカからの同時購入などの在庫オーバー時の処理
 * ④カート内の合計金額計算
 * ⑤宛先情報の有無による処理
 *
 */


	public String execute() throws SQLException{
		String result =ERROR;
		String userId;
	//ログイン判定
	if((boolean)session.get("loginFlg")){
		userId=session.get("userId").toString();
	}
	else{
		userId=session.get("tempUserId").toString();
	}
	//ログインユーザーのカート情報取得
	CartInfoDAO cartInfoDAO=new CartInfoDAO();
	cartList=cartInfoDAO.getUserCartList(userId);

	if((boolean)session.get("loginFlg")){
		AddressDAO addressInfoDAO=new AddressDAO();
		addressDTOList.addAll(addressInfoDAO.getAddressInfo(session.get("userId").toString()));
	}
	else{
		return ERROR; //login.jspへ
	}

	if(cartList.size() == 0){
		return "other"; //cart.jspへ
	}

	//在庫オーバー時の処理
	BuyItemCompleteDAO buyItemCompleteDAO = new BuyItemCompleteDAO();
	cartInfoList=buyItemCompleteDAO.getCartInfo(userId);
	CartDeleteDAO cartDeleteDAO = new CartDeleteDAO();
	int stockOverDelete;

	if(cartInfoList.size()>0){
		for(CartInfoDTO cartInfoDTO:cartInfoList){
			//trueのとき在庫オーバー
			if(cartInfoDTO.getStockFlg()){
				//オーバーした商品を削除
				stockOverDelete=cartDeleteDAO.deleteUserCart(userId,cartInfoDTO.getProductId());
				//があるとき
				if(stockOverDelete > 0){

				//残りのカート情報を取得する
				cartList=cartInfoDAO.getUserCartList(userId);

				//カートの合計金額を計算する
				for(CartInfoDTO dto: cartInfoList){
					cartTotalPrice += dto.getTotalPrice();
				}
				errorMessage = "申し訳ありません。在庫が不足しています。不足した商品をカートから削除しました。";
				return "other"; //cart.jspへ
			}return ERROR;
		}
			//在庫オーバーでないときはカート内の商品合計へ

	}
	}
	//カート内の合計
	for(CartInfoDTO dto:cartList){
		totalPrice += dto.getPrice();
	}
	for(int i=0; i<cartList.size(); i++){
		finallyTotalPrice += cartList.get(i).getTotalPrice();
	}

	if(addressDTOList.size()>0){
		result = SUCCESS; //決済完了画面へ
	}
	else{
		result="NoAddress";//宛先新規画面へ
	}
	return result;

}


public List<CartInfoDTO> getCartList(){
	return cartList;
}
public void setCartList(List<CartInfoDTO> cartList){
	this.cartList=cartList;
}

public int getTotalPrice(){
	return totalPrice;
}
public void setTotalPrice(int totalPrice){
	this.totalPrice=totalPrice;
}


public int getFinallyTotalPrice(){
	return finallyTotalPrice;
	}
public void setFinalyTotalPrice(int finallyTotalPrice){
	this.finallyTotalPrice=finallyTotalPrice;
}

public ArrayList<AddressDTO> getAddressDTOList(){
	return addressDTOList;
}
public void setAddressDTOList(ArrayList<AddressDTO> addressDTOList){
	this.addressDTOList=addressDTOList;
}

public int getProductCount(){
	return productCount;
}
public void setProductCount(int productCount){
	this.productCount=productCount;
}



//session
public Map<String ,Object>getSession(){
	return session;
}

public void setSession(Map<String,Object>session){
	this.session=session;
}



public String getErrorMessage(){
	return errorMessage;
}
public void setErrorMessage(String errorMessage){
	this.errorMessage=errorMessage;
}

public ArrayList<CartInfoDTO> GetcartInfoList() {
	return cartInfoList;
}

public void setCartInfoDTOList(ArrayList<CartInfoDTO> cartInfoList) {
	this.cartInfoList = cartInfoList;
}


public int getCartTotalPrice() {
	return cartTotalPrice;
}

public void setCartTotalPrice(int cartTotalPrice) {
	this.cartTotalPrice = cartTotalPrice;
}



}


