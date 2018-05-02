package com.internousdev.zen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.zen.dto.MyPageDTO;
import com.internousdev.zen.util.DBConnector;



public class MyPageDAO {


	public ArrayList<MyPageDTO> getMyPageUserInfo(String user_info_id) throws SQLException{


		ArrayList<MyPageDTO> myPageList = new ArrayList<MyPageDTO>();
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();


		String sql = "SELECT ui.id,ui.family_name,ui.first_name,ui.family_name_kana,ui.first_name_kana,ui.sex,ui.email,ui.user_id,ui.password FROM user_info ui WHERE ui.user_id=?";

		try{

			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user_info_id);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()){
				MyPageDTO dto = new MyPageDTO();
				dto.setUserId(resultSet.getString("id"));
				dto.setFamilyName(resultSet.getString("family_name"));
				dto.setFirstName(resultSet.getString("first_name"));
				dto.setFamilyNameKana(resultSet.getString("family_name_kana"));
				dto.setFirstNameKana(resultSet.getString("first_name_kana"));
				dto.setSex(resultSet.getString("sex"));
				dto.setEmail(resultSet.getString("email"));
				dto.setUserId(resultSet.getString("user_id"));
				dto.setPassword(resultSet.getString("password"));
				myPageList.add(dto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return myPageList;

	}

}
