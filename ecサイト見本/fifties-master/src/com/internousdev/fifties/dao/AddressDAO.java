package com.internousdev.fifties.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.fifties.dto.AddressDTO;
import com.internousdev.fifties.util.DBConnector;
//林作成
public class AddressDAO {

	DBConnector db = new DBConnector();
	Connection con = null;

	public boolean registerAddress(AddressDTO addressDTO) throws SQLException{

		int updateCount = 0;
		boolean result = false;


		String sql = "INSERT INTO destination_info(user_id, family_name, first_name, family_name_kana, first_name_kana, user_address, tel_number, email, postal_code, insert_date) VALUES(?,?,?,?,?,?,?,?,?,NOW())";

		try {
			con = db.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, addressDTO.getUserId());
			ps.setString(2, addressDTO.getFamilyName());
			ps.setString(3, addressDTO.getFirstName());
			ps.setString(4, addressDTO.getFamilyNameKana());
			ps.setString(5, addressDTO.getFirstNameKana());
			ps.setString(6, addressDTO.getAddr11());
			ps.setString(7, addressDTO.getTelNumber());
			ps.setString(8, addressDTO.getEmail());
			ps.setString(9, addressDTO.getZip11());

			updateCount = ps.executeUpdate();

		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			con.close();
		}

		if(updateCount == 1) {
			result = true;
		}
		return result;
	}


	public ArrayList<AddressDTO> getAddressInfo(String userId) throws SQLException{

		ArrayList<AddressDTO> addressList = new ArrayList<AddressDTO>();


		String sql = "SELECT id, family_name, first_name, family_name_kana, first_name_kana, user_address, tel_number, email, postal_code FROM destination_info WHERE user_id = ?";


		try {
			con = db.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				AddressDTO addressDTO = new AddressDTO();
				addressDTO.setId(rs.getInt("id"));
				addressDTO.setFamilyName(rs.getString("family_name"));
				addressDTO.setFirstName(rs.getString("first_name"));
				addressDTO.setFamilyNameKana(rs.getString("family_name_kana"));
				addressDTO.setFirstNameKana(rs.getString("first_name_kana"));
				addressDTO.setEmail(rs.getString("email"));
				addressDTO.setTelNumber(rs.getString("tel_number"));
				addressDTO.setZip11(rs.getString("postal_code"));
				addressDTO.setAddr11(rs.getString("user_address"));
				addressList.add(addressDTO);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
		return addressList;
	}
}
