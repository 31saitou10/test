package com.internousdev.zen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.zen.dto.InquiryDTO;
import com.internousdev.zen.util.DBConnector;

public class InquiryCompleteDAO {

	ArrayList<InquiryDTO> inquiryDTOList = new ArrayList<InquiryDTO>();

	public List<InquiryDTO> select(){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "select * from inquiry";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				InquiryDTO dto = new InquiryDTO();
				dto.setName(rs.getString("name"));
				dto.setMailaddress(rs.getString("mailaddress"));
				dto.setQtype(rs.getString("qtype"));
				dto.setBody(rs.getString("body"));
				inquiryDTOList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return inquiryDTOList;
	}

	public int insert(String name,String mailaddress,String qtype,String body){
		int ret = 0;
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "INSERT INTO inquiry(name, mailaddress,qtype,body) VALUE(?,?,?,?)";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, mailaddress);
			ps.setString(3, qtype);
			ps.setString(4, body);
			ret = ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return ret;
	}

}
