package com.internousdev.fifties.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.fifties.util.DBConnector;

//林作成
public class AddressDeleteDAO {

	//全削除メソッド
	public int deleteAllAddress(String userId) throws SQLException{

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "DELETE FROM destination_info where user_id = ?";

		int result = 0;

		try {
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

	//選択削除メソッド
	public int deletePartAddress(int id) throws SQLException{

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "DELETE FROM destination_info where id = ?";

		int result = 0;

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			result = ps.executeUpdate();

		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
		return result;
	}

}
