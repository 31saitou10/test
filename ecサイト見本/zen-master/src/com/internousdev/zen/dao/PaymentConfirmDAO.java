package com.internousdev.zen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.zen.dto.DestinationAddDTO;
import com.internousdev.zen.util.DBConnector;



public class PaymentConfirmDAO {


	public ArrayList<DestinationAddDTO> selectAddress(int id) throws SQLException{
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		ArrayList<DestinationAddDTO> selectAddList = new ArrayList<DestinationAddDTO>();

		String sql = "SELECT family_name,first_name,family_name_kana,first_name_kana,user_address,tel_number,email FROM destination_info WHERE id = ?";

		try{
			PreparedStatement ps = connection.prepareStatement(sql);

			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				DestinationAddDTO dto = new DestinationAddDTO();
				dto.setFamily_name(rs.getString("family_name"));
				dto.setFirst_name(rs.getString("first_name"));
				dto.setFamily_name_kana(rs.getString("family_name_kana"));
				dto.setFirst_name_kana(rs.getString("first_name_kana"));
				dto.setUser_address(rs.getString("user_address"));
				dto.setTel_number(rs.getString("tel_number"));
				dto.setEmail(rs.getString("email"));

				selectAddList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return selectAddList;
	}


}
