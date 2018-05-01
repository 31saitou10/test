package com.internousdev.fifties.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import com.internousdev.fifties.dto.UserUpdateDTO;
import com.internousdev.fifties.util.DBConnector;

//林作成
public class UserUpdateConfirmDAO {

	public Map<String, Object> session;


	public UserUpdateDTO getUserInfo(String user_id) throws SQLException {
		UserUpdateDTO userUpdateDTO = new UserUpdateDTO();

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "SELECT * FROM user_info WHERE user_id = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user_id);
			ResultSet rs = ps.executeQuery();

			if(rs.next()) {
				userUpdateDTO.setUser_id(rs.getString("user_id"));
				userUpdateDTO.setPassword(rs.getString("password"));
				userUpdateDTO.setEmail(rs.getString("email"));
				userUpdateDTO.setFamilyName(rs.getString("family_name"));
				userUpdateDTO.setFirstName(rs.getString("first_name"));
				userUpdateDTO.setFamilyNameKana(rs.getString("family_name_kana"));
				userUpdateDTO.setFirstNameKana(rs.getString("first_name_kana"));
			}

		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			con.close();
		}

		return userUpdateDTO;
	}

}
