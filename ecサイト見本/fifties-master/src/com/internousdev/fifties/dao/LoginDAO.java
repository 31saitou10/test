package com.internousdev.fifties.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.fifties.dto.LoginDTO;
import com.internousdev.fifties.util.DBConnector;

public class LoginDAO {

	public LoginDTO getUserInfo(String userId, String password) throws SQLException {
		LoginDTO loginDTO = new LoginDTO();
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		String sql = "SELECT user_id, password, family_name, first_name, family_name_kana, first_name_kana, email, m_flg FROM user_info WHERE user_id = ? AND password = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, userId);
			preparedStatement.setString(2, password);
			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()) {
				loginDTO.setUserId(resultSet.getString("user_id"));
				loginDTO.setPassword(resultSet.getString("password"));
				loginDTO.setFamilyName(resultSet.getString("family_name"));
				loginDTO.setFirstName(resultSet.getString("first_name"));
				loginDTO.setFamilyNameKana(resultSet.getString("family_name_kana"));
				loginDTO.setFirstName(resultSet.getString("first_name_kana"));
				loginDTO.setEmail(resultSet.getString("email"));
				loginDTO.setMasterFlg(resultSet.getString("m_flg"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return loginDTO;
	}


}