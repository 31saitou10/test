package com.internousdev.fifties.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.fifties.util.DBConnector;

public class UserCreateConfirmDAO {

	/*-------ログインID重複確認メソッド-----------*/
	public boolean getUserId(String userId) {

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		boolean result = false;

		String sql = "SELECT * FROM user_info WHERE user_id=? ";

		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, userId);

			ResultSet rs = preparedStatement.executeQuery();

			if (rs.next()) {
				result = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;

	}

}
