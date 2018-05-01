package com.internousdev.fifties.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.fifties.dto.InquiryDTO;
import com.internousdev.fifties.util.DBConnector;
import com.internousdev.fifties.util.DateUtil;

public class MasterInquiryDAO {



	DateUtil dateUtil = new DateUtil();
	DBConnector dbConnector = new DBConnector();
	Connection connection = dbConnector.getConnection();

	public ArrayList<InquiryDTO> getInquiry() throws SQLException{

		ArrayList<InquiryDTO> inquiryDTOList = new ArrayList<InquiryDTO>();

		String sql = "SELECT * FROM inquiry";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()){
				InquiryDTO dto = new InquiryDTO();
				dto.setId(resultSet.getInt("id"));
				dto.setName(resultSet.getString("name"));
				dto.setEmail(resultSet.getString("email"));
				dto.setInquiry_type(resultSet.getString("inquiry_type"));
				dto.setInquiry_body(resultSet.getString("inquiry_body"));
				dto.setInsert_date(resultSet.getString("insert_date"));
				inquiryDTOList.add(dto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		try{
			connection.close();
		}catch (SQLException e){
			e.printStackTrace();
		}finally {
			connection.close();
		}
		return inquiryDTOList;
	}
	 public int inquiryDelete(int id) throws SQLException  {

			DBConnector dbConnector = new DBConnector();
			Connection connection = dbConnector.getConnection();

		 String sql="DELETE FROM inquiry WHERE id=? ";
		 PreparedStatement preparedStatement;

		 int result=0;
		 try{
			 preparedStatement=connection.prepareStatement(sql);
			 preparedStatement.setInt(1,id);
			result=preparedStatement.executeUpdate();
		 }catch(SQLException e){
			 e.printStackTrace();
		 }finally {
			 connection.close();
		 }
		 return result;

	}

}
