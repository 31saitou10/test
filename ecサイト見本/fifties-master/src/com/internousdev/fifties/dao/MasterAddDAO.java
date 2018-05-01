package com.internousdev.fifties.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.fifties.util.DBConnector;
import com.internousdev.fifties.util.DateUtil;

public class MasterAddDAO {
	private DateUtil dateUtil = new DateUtil();
	private String sql = "INSERT INTO product_info(product_id,product_name,product_name_kana,price,product_stock,image_file_path,image_file_name,release_company,product_description,category_id,release_date,insert_date)VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

	public void buyItemeInfo(int product_id,String product_name, String product_name_kana, int price,int product_stock, String imageFileName,
			String image_file_name, String release_company,String product_description,int category_id) throws SQLException {

		DBConnector dbConnector = new DBConnector();
		 Connection connection = dbConnector.getConnection();

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			String path = "./images/" + imageFileName;

			preparedStatement.setInt(1,product_id);
			preparedStatement.setString(2, product_name);
			preparedStatement.setString(3, product_name_kana);
			preparedStatement.setInt(4, price);
			preparedStatement.setInt(5, product_stock);
			preparedStatement.setString(6, path);
			preparedStatement.setString(7, image_file_name);
			preparedStatement.setString(8, release_company);
			preparedStatement.setString(9,product_description);
			preparedStatement.setInt(10,category_id);
			preparedStatement.setString(11,dateUtil.getDate());
			preparedStatement.setString(12, dateUtil.getDate());
			preparedStatement.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			connection.close();
		}
	}



}
