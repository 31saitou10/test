package com.internousdev.fifties.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.fifties.util.DBConnector;

public class CartDeleteDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection con = null;

	//チェックされたカートの商品を削除するメソッド
	public int deleteUserCart(String userId, int productId) throws SQLException{
		String sql = "DELETE FROM cart_info WHERE user_id = ? AND product_id = ?";
		int count = 0;
		try {
			con = dbConnector.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setInt(2, productId);
			count = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
		return count;
	}

	//決済完了時にカート情報を削除する
	public int deleteAllCartInfo(String userId) throws SQLException{
		String sql = "DELETE FROM cart_info WHERE user_id = ?";
		int result = 0;
		try{
			con = dbConnector.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			result = ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
		return result;
	}

}
