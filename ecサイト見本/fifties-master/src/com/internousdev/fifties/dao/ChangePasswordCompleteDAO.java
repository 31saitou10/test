package com.internousdev.fifties.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.fifties.util.DBConnector;

public class ChangePasswordCompleteDAO {

	private int result;

	public int changeComplete(String newpass, String userid) throws SQLException {
		result = 0;

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql = "update user_info set password=? where user_id=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, newpass);
			ps.setString(2, userid);
			ps.executeUpdate();
			result = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return result;

	}

}
