package com.internousdev.zen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.zen.dto.CartDTO;
import com.internousdev.zen.dto.PaymentDTO;
import com.internousdev.zen.util.DBConnector;
import com.internousdev.zen.util.DateUtil;

public class PaymentCompleteDAO {


	private int res;


	// カートの情報を持ってくる
	public CartDTO getpaymentInfo(int user_id)throws SQLException{
		DBConnector dbConnector=new DBConnector();
		 Connection connection=dbConnector.getConnection();
		CartDTO dto = new CartDTO();

		String sql= "SELECT * FROM cart_info";
		try{
			PreparedStatement ps = connection.prepareStatement(sql);
			@SuppressWarnings("unused")
			ResultSet rs = ps.executeQuery();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return dto;
		}

	// 商品購入履歴テーブルにインサート
		public int insertPurchaseHistory(String userId,String image_file_path,String productName,String product_name_kana,String release_company,String product_count,String price)throws SQLException{
			DBConnector dbConnector = new DBConnector();
			Connection connection = dbConnector.getConnection();
			DateUtil util=new DateUtil();

			int res = 0;
			String sql="INSERT INTO purchase_history_info(user_id,image_file_path,product_name,product_name_kana,release_company,product_count,price,regist_date) VALUES(?,?,?,?,?,?,?,?)";

			try{
				PreparedStatement ps = connection.prepareStatement(sql);
				ps.setString(1, userId);
				ps.setString(2, image_file_path);
				ps.setString(3, productName);
				ps.setString(4, product_name_kana);
				ps.setString(5, release_company);
				ps.setString(6, product_count);
				ps.setString(7, price);
				ps.setString(8,util.getDate());
				res = ps.executeUpdate();
			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				connection.close();
			}
			return  res;
		}



		// カートテーブルの情報を取得
		public ArrayList<PaymentDTO> cartInfo(String userId,String productName,String product_count,String price)throws SQLException{
			DBConnector dbConnector = new DBConnector();
			Connection connection = dbConnector.getConnection();
			String sql="SELECT * FROM cart_info WHERE user_id=? and product_count=? and price=?";

//			String sql="INSERT INTO purchase_history_info(user_id,product_name,product_count,price,regist_date)";

			ArrayList<PaymentDTO> cartList= new ArrayList<PaymentDTO>();

			try{
				PreparedStatement ps = connection.prepareStatement(sql);

				ps.setString(1, userId);
				ps.setString(2, product_count);
				ps.setString(3, price);
				ResultSet rs = ps.executeQuery();


				while(rs.next()){
					PaymentDTO dto = new PaymentDTO();
					dto.setUserID(Integer.parseInt(rs.getString("user_id")));
					dto.setProductCount(rs.getString("product_count"));
					dto.setPrice(rs.getString("price"));
					cartList.add(dto);
				}
			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				connection.close();
			}
			return cartList;
		}

	// カートの情報を削除
		public int deleteCartItems(String userId)throws SQLException {
			DBConnector dbConnector = new DBConnector();
			Connection connection = dbConnector.getConnection();

			String sql = "DELETE FROM cart_info WHERE user_id = ?";
			try{
				PreparedStatement ps = connection.prepareStatement(sql);
				ps.setString(1, userId);
				res= ps.executeUpdate();
			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				connection.close();
			}
			return res;
		}


}
