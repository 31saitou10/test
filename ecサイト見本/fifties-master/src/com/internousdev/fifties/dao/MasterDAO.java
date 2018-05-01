package com.internousdev.fifties.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.fifties.dto.ProductDTO;
import com.internousdev.fifties.util.DBConnector;
import com.internousdev.fifties.util.DateUtil;

public class MasterDAO {

	private DateUtil dateUtil = new DateUtil();

	// 全商品一覧
	public ArrayList<ProductDTO> getProductInfo() throws SQLException {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		ArrayList<ProductDTO> productDTOList = new ArrayList<ProductDTO>();

		String sql = "SELECT id ,product_id ,product_name ,product_name_kana ,product_description,category_id,product_stock,price,image_file_path,image_file_name ,release_company FROM product_info";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				ProductDTO dto = new ProductDTO();
				dto.setId(resultSet.getInt("id"));
				dto.setProduct_id(resultSet.getInt("product_id"));
				dto.setProduct_name(resultSet.getString("product_name"));
				dto.setProduct_name_kana(resultSet.getString("product_name_kana"));
				dto.setProduct_description(resultSet.getString("product_description"));
				dto.setCategory_id(resultSet.getInt("category_id"));
				dto.setProduct_stock(resultSet.getInt("product_stock"));
				dto.setPrice(resultSet.getInt("price"));
				dto.setImage_file_path(resultSet.getString("image_file_path"));
				dto.setImage_file_name(resultSet.getString("image_file_name"));
				dto.setRelease_company(resultSet.getString("release_company"));
				productDTOList.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			connection.close();
		}
		return productDTOList;

	}

	// 商品削除
	public int productDelete(int product_id) throws SQLException {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		String sql = "DELETE FROM product_info WHERE product_id=?";
		PreparedStatement preparedStatement;

		int result = 0;
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, product_id);
			result = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			connection.close();
		}

		return result;
	}

	// 在庫追加
	public void updateStock(int product_stock, int productId) throws SQLException {

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		con = db.getConnection();
		String sql = "UPDATE product_info SET product_stock = ? WHERE product_id = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, product_stock);
			ps.setInt(2, productId);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			con.close();
		}

	}


	// 商品情報変更
	public void productUpdateInfo(int product_stock, String product_name, String product_name_kana, int price,
			String imageFileName, String image_file_name, String release_company, String product_description,
			int category_id, int product_id, int id) throws SQLException {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		String sql = "UPDATE product_info SET product_stock = ?,product_name=?,product_name_kana=?,price=?,image_file_path=?,image_file_name=?,release_company=?,product_description=?,category_id=?,update_date=? , product_id = ? WHERE id=?";
		try {
			String path = "./images/" + imageFileName;
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, product_stock);
			preparedStatement.setString(2, product_name);
			preparedStatement.setString(3, product_name_kana);
			preparedStatement.setInt(4, price);
			preparedStatement.setString(5, path);
			preparedStatement.setString(6, image_file_name);
			preparedStatement.setString(7, release_company);
			preparedStatement.setString(8, product_description);
			preparedStatement.setInt(9, category_id);
			preparedStatement.setString(10, dateUtil.getDate());
			preparedStatement.setInt(11, product_id);
			preparedStatement.setInt(12, id);
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
	}

	// 商品名等確認用
	public boolean checkItemInfo(String productName, String productKanaName, int productId) throws SQLException {
		DBConnector dbConnector = new DBConnector();
		 Connection connection = dbConnector.getConnection();
		String sql = "SELECT * FROM product_info where product_name= ? or product_name_kana = ? or product_id=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, productName);
			preparedStatement.setString(2, productKanaName);
			preparedStatement.setInt(3, productId);

			ResultSet resultSet = preparedStatement.executeQuery();
			return resultSet.next();
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			connection.close();
		}
	}

	// 下３つ指定商品名等確認
	public boolean checkItemNameInfo(String productName) throws SQLException {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		String sql = "SELECT * FROM product_info where product_name= ? ";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, productName);

			ResultSet resultSet = preparedStatement.executeQuery();
			return resultSet.next();
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			connection.close();
		}
	}

	public boolean checkItemKanaNameInfo(String product_name_kana) throws SQLException {
		DBConnector dbConnector = new DBConnector();
		 Connection connection = dbConnector.getConnection();
		String sql = "SELECT * FROM product_info where product_name_kana= ? ";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, product_name_kana);
			ResultSet resultSet = preparedStatement.executeQuery();
			return resultSet.next();
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			connection.close();
		}
	}

	public boolean checkItemIdInfo(int product_id) throws SQLException {
		DBConnector dbConnector = new DBConnector();
		 Connection connection = dbConnector.getConnection();
		String sql = "SELECT * FROM product_info where product_id= ? ";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, product_id);

			ResultSet resultSet = preparedStatement.executeQuery();
			return resultSet.next();
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			connection.close();
		}
	}

}
