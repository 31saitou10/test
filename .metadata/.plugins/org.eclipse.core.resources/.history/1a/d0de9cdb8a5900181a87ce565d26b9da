package com.internousdev.miamiburger.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.miamiburger.util.DBConnector;


public class UserCreateConfirmDAO {
	private DBConnector dbConnector = new DBConnector();

	public String getConfirmUser(String userId) throws SQLException {
//		ArrayList<UserCreateDTO> userCreateDTOList = new ArrayList<UserCreateDTO>();
		Connection connection = dbConnector.getConnection();

		String checkUserId ="";
		System.out.println(userId);
		String sql = "SELECT * FROM user_info WHERE user_id = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, userId);

			ResultSet resultSet =preparedStatement.executeQuery();

			if(resultSet.next()) {
				checkUserId = resultSet.getString("user_id");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try{
				connection.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return checkUserId;
	}
}
