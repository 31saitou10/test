package com.internousdev.zen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.zen.dto.BuyItemHistoryDTO;
import com.internousdev.zen.util.DBConnector;

public class BuyItemHistoryDAO {

	public ArrayList<BuyItemHistoryDTO> getBuyItemHistory(String user_id) throws SQLException {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		ArrayList<BuyItemHistoryDTO> buyItemHistoryDTOList = new ArrayList<BuyItemHistoryDTO>();

		// 購入履歴を取得するｓｑｌ文。

		String sql = "SELECT * FROM purchase_history_info WHERE user_id = ? ORDER BY regist_date DESC";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user_id);

			ResultSet resultSet = preparedStatement.executeQuery();

//			if(resultSet.next()){                       //←ここで結果の1行目にカーソルが当たっている
//			    return null;
//			}

			while (resultSet.next()) {
				BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
				dto.setUser_id(resultSet.getString("user_id"));
				dto.setProduct_name(resultSet.getString("product_name"));
				dto.setProduct_namekana(resultSet.getString("product_name_kana"));
				dto.setProduct_count(resultSet.getString("product_count"));
				dto.setImage_file_path(resultSet.getString("image_file_path"));
				dto.setRelease_company(resultSet.getString("release_company"));
				dto.setPrice(resultSet.getString("price"));
				dto.setRegist_date(resultSet.getString("regist_date").replaceAll("\\.0$", ""));

				buyItemHistoryDTOList.add(dto);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return buyItemHistoryDTOList;

	}

	// ↓ＤＢから購入履歴を削除するためのメソッド

	public int buyItemHistoryDeleteAll(String user_id) throws SQLException {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		int result = 0;

		String sql = "DELETE FROM purchase_history_info WHERE user_id=?";

		PreparedStatement preparedStatement;

		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user_id);
			result = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return result;

	}

}
