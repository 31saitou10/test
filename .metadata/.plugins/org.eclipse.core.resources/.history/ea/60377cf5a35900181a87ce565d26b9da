package com.internousdev.miamiburger.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.miamiburger.util.DBConnector;
import com.internousdev.miamiburger.util.DateUtil;

public class UserCreateCompleteDAO {

	public int createUser(String userid, String password, String familyname, String firstname, String familynamekana,
			String firstnamekana, int sex, String email, String secretquestion, String secretanswer)
			throws SQLException {

		int check =0;
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		DateUtil dateUtil = new DateUtil();

		String sql = "INSERT INTO user_info(user_id,password,family_name,first_name,family_name_kana,first_name_kana,sex,email,secret_question,secret_answer,status,logined,regist_date) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, userid);
			preparedStatement.setString(2, password);
			preparedStatement.setString(3, familyname);
			preparedStatement.setString(4, firstname);
			preparedStatement.setString(5, familynamekana);
			preparedStatement.setString(6, firstnamekana);
			preparedStatement.setInt(7, sex);
			preparedStatement.setString(8, email);
			preparedStatement.setString(9, secretquestion);
			preparedStatement.setString(10, secretanswer);
			preparedStatement.setInt(11, 1);
			preparedStatement.setInt(12, 1);
			preparedStatement.setString(13, dateUtil.getDate());


			check = preparedStatement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return check;
	}

}
