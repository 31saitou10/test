package com.internousdev.fifties.dao;
//妹尾作成
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.fifties.dto.CartInfoDTO;
import com.internousdev.fifties.util.DBConnector;

/*
 * 決済ボタンを押した後のアクション
 */

public class BuyItemCompleteDAO {
	/*
	 * カート内情報を取得しCartInfoDTOにsetするメソッド
	 */
	public ArrayList<CartInfoDTO> getCartInfo(String userId)throws SQLException {
		DBConnector dbConnector = new DBConnector();
		Connection connection= dbConnector.getConnection();
		ArrayList<CartInfoDTO> cartInfoLIst=new ArrayList<CartInfoDTO>();


		 //↓cart_info,product_info内の共通product_idで２つのテーブルを結合
		String sql = "SELECT pi.product_stock as product_stock, "
				+ "ci.user_id as userId, "
				+ "ci.id as cartId,"
				+ "ci.product_id as product_id, "
				+ "pi.product_name as product_name, "
				+ "pi.product_name_kana as product_name_kana, "
				+ "pi.image_file_path as image_file_path, "
				+ "pi.price as price, "
				+ "ci.product_count as product_count, "
				+ "pi.release_company as release_company, "
				+ "pi.release_date as release_date "
				+ "FROM cart_info as ci LEFT JOIN product_info as pi ON ci.product_id = pi.product_id WHERE ci.user_id = ?";
		try{
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setString(1, userId);
			ResultSet rs=ps.executeQuery();

			while(rs.next()){
				CartInfoDTO dto=new CartInfoDTO();
				//product_infoテーブル
				dto.setProductName(rs.getString("product_name"));
				dto.setProductNameKana(rs.getString("product_name_kana"));
				dto.setImageFilePath(rs.getString("image_file_path"));
				dto.setReleaseCompany(rs.getString("release_company"));
				dto.setReleaseDate(rs.getString("release_date"));
				dto.setStock(rs.getInt("product_stock"));
				dto.setPrice(rs.getInt("price"));
				//cart_infoテーブル
				dto.setUserId(rs.getString("userId"));
				dto.setProductId(rs.getInt("product_id"));
				dto.setProductCount(rs.getInt("product_count"));

				if(rs.getInt("product_count")>rs.getInt("product_stock")){
					dto.setStockFlg(true);
				}

				cartInfoLIst.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return cartInfoLIst;



	}
	//product内の情報を取得しproductDTOに格納するメソッド
	public int updateProductCount(ArrayList<CartInfoDTO> purchasedItems){
		DBConnector dbConnector = new DBConnector();
		Connection connection= dbConnector.getConnection();
		int result=0;
		String sql="UPDATE product_info set product_stock = ?,update_date = now() WHERE product_id=?";

		try{
			PreparedStatement ps=connection.prepareStatement(sql);

			for(CartInfoDTO item:purchasedItems){

				ps.setInt(1, item.getStock() - item.getProductCount());
				ps.setInt(2, item.getProductId());

				result += ps.executeUpdate();

			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
			connection.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return result;



	}

	/*
	 * purchase_history_infoテーブルに登録
	 *
	 */
	public int setPurchseHistory(List<CartInfoDTO> cartList) throws SQLException{
		DBConnector db= new DBConnector();
		Connection con = db.getConnection();

		int ret =0;

		//for文でカート情報の商品件数ぶん商品情報を商品購入履歴に登録する。その件数処理数がretに入る

		try{
			for(int i=0; i<cartList.size(); i++){
				String sql="INSERT INTO purchase_history_info(user_id,product_id,product_count,price,insert_date,update_date)VALUES(?,?,?,?,NOW(),NOW())";
				PreparedStatement ps=con.prepareStatement(sql);

				ps.setString(1, cartList.get(i).getUserId());
				ps.setInt(2, cartList.get(i).getProductId());
				ps.setInt(3, cartList.get(i).getProductCount());
				ps.setInt(4, cartList.get(i).getPrice());

				ret += ps.executeUpdate();

			}
			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				con.close();
			}
			return ret;
		}


	/*
	 * cart_infoテーブル内のアイテムを削除
	 */

	public int deleteCartItems(String userId,ArrayList<CartInfoDTO> purchasedItems){
		DBConnector db= new DBConnector();
		Connection con = db.getConnection();

		int ret=0;

		//userIdとproductIdが一致する項目を削除
		String sql = "DELETE FROM cart_info where user_id =? and product_id =?";

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			//購入したアイテムの数だけdeleteを行う
			for(CartInfoDTO item:purchasedItems){
				ps.setString(1, userId);
				ps.setInt(2, item.getProductId());
				ret += ps.executeUpdate();

			}

		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return ret;
	}
}




