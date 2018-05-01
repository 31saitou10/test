package com.internousdev.fifties.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.fifties.util.DBConnector;
import com.internousdev.fifties.util.DateUtil;

//林作成
public class UserUpdateCompleteDAO {


	public int userUpdate(String newPassword, String newEmail, String familyName, String firstName, String familyNameKana, String firstNameKana, String user_id) throws SQLException{

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		DateUtil dateUtil = new DateUtil();

		String sql = "UPDATE user_info SET password = ?, email = ?, family_name = ?, first_name = ?, family_name_kana = ?, first_name_kana = ?, update_date = ? WHERE user_id = ?";

		int count = 0;


		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, newPassword);
			ps.setString(2, newEmail);
			ps.setString(3, familyName);
			ps.setString(4, firstName);
			ps.setString(5, familyNameKana);
			ps.setString(6, firstNameKana);
			ps.setString(7, dateUtil.getDate());
			ps.setString(8, user_id);
			count = ps.executeUpdate();

		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
		return count;
	}


	public int userUpdate2(String newEmail, String familyName, String firstName, String familyNameKana, String firstNameKana, String user_id) throws SQLException{

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		DateUtil dateUtil = new DateUtil();

		String sql = "UPDATE user_info SET email = ?, family_name = ?, first_name = ?, family_name_kana = ?, first_name_kana = ?, update_date = ? WHERE user_id = ?";

		int count = 0;


		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, newEmail);
			ps.setString(2, familyName);
			ps.setString(3, firstName);
			ps.setString(4, familyNameKana);
			ps.setString(5, firstNameKana);
			ps.setString(6, dateUtil.getDate());
			ps.setString(7, user_id);
			count = ps.executeUpdate();

		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
		return count;
	}

}
