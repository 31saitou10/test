package com.internousdev.fifties.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.fifties.util.DBConnector;
import com.internousdev.fifties.util.DateUtil;

public class UserCreateCompleteDAO {

	private DBConnector db;
	private Connection con;
	private DateUtil dateUtil;
	int i;

	public int createUser(String userId, String password, String familyName, String firstName, String familyNameKana,
			String firstNameKana, int sex, String email, String question, String answer) throws SQLException {

		db = new DBConnector();
		con = db.getConnection();
		dateUtil = new DateUtil();
		String sql = "INSERT INTO user_info(user_id,password,family_name,first_name,family_name_kana,first_name_kana,sex,email,question,answer,insert_date)VALUES(?,?,?,?,?,?,?,?,?,?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, password);
			ps.setString(3, familyName);
			ps.setString(4, firstName);
			ps.setString(5, familyNameKana);
			ps.setString(6, firstNameKana);
			ps.setInt(7, sex);
			ps.setString(8, email);
			ps.setString(9, question);
			ps.setString(10, answer);
			ps.setString(11, dateUtil.getDate());
			i = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return i;
	}

}
