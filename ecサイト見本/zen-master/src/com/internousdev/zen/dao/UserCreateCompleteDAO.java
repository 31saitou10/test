package com.internousdev.zen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.zen.util.DBConnector;


public class UserCreateCompleteDAO {
	public int createUser(String family_name,String first_name,String family_name_kana,String first_name_kana,String sex,String email,String user_id,String password)throws SQLException{
	    int result=0;
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		String sql = "INSERT INTO user_info(family_name,first_name,family_name_kana,first_name_kana,sex,email,user_id,password,regist_date)VALUES(?,?,?,?,?,?,?,?,NOW())";
		try{

			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, family_name);
			preparedStatement.setString(2, first_name);
			preparedStatement.setString(3, family_name_kana);
			preparedStatement.setString(4, first_name_kana);


			if(sex.equals("男")){
				preparedStatement.setString(5, "1");
			}else if(sex.equals("女")){
				preparedStatement.setString(5, "2");
			}
			preparedStatement.setString(6, email);
			preparedStatement.setString(7,user_id);
			preparedStatement.setString(8,password);

			result = preparedStatement.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return result;
	}


}
