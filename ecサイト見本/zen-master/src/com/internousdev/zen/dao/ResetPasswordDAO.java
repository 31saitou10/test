package com.internousdev.zen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.zen.util.DBConnector;

public class ResetPasswordDAO {

		public int resetPassword(String loginUserId,String loginPassword) throws SQLException{
			DBConnector dbConnector=new DBConnector();
			Connection connection=dbConnector.getConnection();

			String sql="update user_info set password = ? where user_id = ?";

			int count = 0;
			try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1,loginPassword);
			preparedStatement.setString(2,loginUserId);
			count = preparedStatement.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
				connection.close();
		}
			return count;
	}
}
