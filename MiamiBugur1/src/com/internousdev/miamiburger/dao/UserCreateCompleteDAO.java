package com.internousdev.miamiburger.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.miamiburger.util.DBConnector;
import com.internousdev.miamiburger.util.DateUtil;

public class UserCreateCompleteDAO {



	public int createUser(String userid, String password, String familyname, String firstname, String familynamekana,String firstnamekana, int sex, String email, String secretquestion, String secretanswer) throws SQLException {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		DateUtil dateUtil = new DateUtil();

		String sql="INSERT INTO user_info(user_id,password,family_name,first_name,family_name_kana,first_name_kana,sex,email,secret_question,secret_answer,regist_date) VALUES(?,?,?,?,?,?,?,?,?,?,?)";


		int result=0;
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
			preparedStatement.setString(11, dateUtil.getDate());

			result = preparedStatement.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return result;
	}

}
