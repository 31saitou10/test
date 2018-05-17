package com.internousdev.miamiburger.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.miamiburger.util.DBConnector;
import com.internousdev.miamiburger.util.DateUtil;

public class UserUpdateCompleteDAO {


	public int UserUpdate(String userId,String familyName,String firstName,String familyNameKana,String firstNameKana,int sex,String email,String secretQuestion,String secretAnswer) throws SQLException {
		int check = 0;

		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		DateUtil dateUtil = new DateUtil();

		String sql = "UPDATE  user_info SET family_name=?, first_name=?, family_name_kana=?, first_name_kana=?, sex=?, email=?, secret_question=?, secret_answer=?, update_date=? WHERE user_id=?";

			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);

				preparedStatement.setString(1, familyName);
				preparedStatement.setString(2, firstName);
				preparedStatement.setString(3, familyNameKana);
				preparedStatement.setString(4, firstNameKana);
				preparedStatement.setInt(5, sex);
				preparedStatement.setString(6, email);
				preparedStatement.setString(7, secretQuestion);
				preparedStatement.setString(8, secretAnswer);
				preparedStatement.setString(9, dateUtil.getDate());
				preparedStatement.setString(10, userId);

				check = preparedStatement.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				connection.close();
		    }
			return check;
	}
}
