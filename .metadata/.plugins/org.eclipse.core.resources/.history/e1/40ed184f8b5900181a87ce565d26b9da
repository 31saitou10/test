package com.internousdev.miamiburger.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.miamiburger.dto.UserInfoDTO;
import com.internousdev.miamiburger.util.DBConnector;
public class LoginDAO {


	public UserInfoDTO login(String userId,String password){

		UserInfoDTO dto = new UserInfoDTO();		//DTO


		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "SELECT * FROM user_info WHERE user_id = ? AND password = ?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){

					dto.setUserId(rs.getString("user_id"));
					dto.setPassword(rs.getString("password"));
					dto.setFamilyName(rs.getString("family_name"));
					dto.setFirstName(rs.getString("first_name"));
					dto.setFamilyNameKana(rs.getString("family_name_kana"));
					dto.setFirstNameKana(rs.getString("first_name_kana"));
					dto.setSex(rs.getInt("sex"));
					dto.setEmail(rs.getString("email"));
					dto.setStatus(rs.getInt("status"));
					dto.setLogined("1");				//ログインフラグ

					//現在は空ですが、マスター用のIDを設定しそれによってフラグを立てます
					if(userId.equals("admin")){
					dto.setMasterFlg(1);
					}else{
					dto.setMasterFlg(0);
					}

					dto.setSecretQuestion(rs.getString("secret_question"));
					dto.setSecretAnswer(rs.getString("secret_answer"));
					dto.setInsertDate(rs.getString("regist_date"));
					dto.setUpdateDate(rs.getString("update_date"));


			}


		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return dto;
	}

	public void changeUserCart(String userId,String tempUserId){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql = "UPDATE cart_info SET user_id = ? WHERE temp_user_id = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, tempUserId);
			ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}

	}

}

