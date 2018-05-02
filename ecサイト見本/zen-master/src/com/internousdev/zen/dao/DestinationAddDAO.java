package com.internousdev.zen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.zen.dto.DestinationAddDTO;
import com.internousdev.zen.util.DBConnector;

public class DestinationAddDAO {

	// destination_infoテーブルに宛先情報を書き込む
	public int AddDestination(
			String user_id,
			String family_name,
			String first_name,
			String family_name_kana,
			String first_name_kana,
			String user_address,
			String tel_number,
			String email) {

		int result = 0;
		// 入力された宛先情報をdestination_infoテーブルに入力する
		String sql = "INSERT INTO destination_info(user_id,family_name,first_name,family_name_kana,first_name_kana,user_address,tel_number,email,regist_date) VALUES(?,?,?,?,?,?,?,?,NOW())";

		try {
			DBConnector db = new DBConnector();
			Connection con = db.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, user_id);
			ps.setString(2, family_name);
			ps.setString(3, first_name);
			ps.setString(4, family_name_kana);
			ps.setString(5, first_name_kana);
			ps.setString(6, user_address);
			ps.setString(7, tel_number);
			ps.setString(8, email);

			result = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	// destination_infoからユーザIDと一致した複数の宛先情報を取得
	public ArrayList<DestinationAddDTO> getDestinationList(String user_id) throws SQLException {
		ArrayList<DestinationAddDTO> destinationList = new ArrayList<DestinationAddDTO>();


		// 登録した宛先情報をdestination_infoから取ってくる
		String sql = "select id,family_name,first_name,family_name_kana,first_name_kana,user_address,tel_number,email from destination_info where user_id = ?";

		try {
			DBConnector db = new DBConnector();
			Connection con = db.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, user_id);

			ResultSet rs = ps.executeQuery();

			// 宛先情報が複数あればその分だけdestinationListに追加していく
			while (rs.next()) {
				DestinationAddDTO destinationAddDTO = new DestinationAddDTO();
				destinationAddDTO.setId(rs.getInt("id"));
				destinationAddDTO.setFamily_name(rs.getString("family_name"));
				destinationAddDTO.setFirst_name(rs.getString("first_name"));
				destinationAddDTO.setFamily_name_kana(rs.getString("family_name_kana"));
				destinationAddDTO.setFirst_name_kana(rs.getString("first_name_kana"));
				destinationAddDTO.setUser_address(rs.getString("user_address"));
				destinationAddDTO.setTel_number(rs.getString("tel_number"));
				destinationAddDTO.setEmail(rs.getString("email"));

				// 宛先情報のかたまりをdestinationDTOListに格納していく
				destinationList.add(destinationAddDTO);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return destinationList;
	}
}
