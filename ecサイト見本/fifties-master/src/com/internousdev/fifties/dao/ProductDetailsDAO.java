package com.internousdev.fifties.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.fifties.dto.ProductDTO;
import com.internousdev.fifties.util.DBConnector;

//戌亥
public class ProductDetailsDAO {
	// 商品詳細情報取得(単体)
		public ProductDTO getProductDetailsInfo(int product_id) throws SQLException {
			DBConnector dbConnector = new DBConnector();
			Connection connection = dbConnector.getConnection();
			ProductDTO productDTO = new ProductDTO();
			String sql = "SELECT * FROM product_info where product_id=? AND status = 0";

			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setInt(1, product_id);

				ResultSet resultSet = preparedStatement.executeQuery();

				if (resultSet.next()) {
					productDTO.setId(resultSet.getInt("id"));
					productDTO.setProduct_id(resultSet.getInt("product_id"));
					productDTO.setProduct_name(resultSet.getString("product_name"));
					productDTO.setProduct_name_kana(resultSet.getString("product_name_kana"));
					productDTO.setProduct_description(resultSet.getString("product_description"));
					productDTO.setCategory_id(resultSet.getInt("category_id"));
					productDTO.setPrice(resultSet.getInt("price"));
					productDTO.setImage_file_path(resultSet.getString("image_file_path"));
					productDTO.setImage_file_name(resultSet.getString("image_file_name"));
					productDTO.setRelease_date(resultSet.getString("release_date"));
					productDTO.setRelease_company(resultSet.getString("release_company"));
					productDTO.setProduct_stock(resultSet.getInt("product_stock"));
					productDTO.setInsert_date(resultSet.getString("insert_date"));
					productDTO.setUpdate_date(resultSet.getString("update_date"));
				} else {
					return null;
				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				connection.close();
			}
			return productDTO;
		}


		// おすすめ商品リスト
		public ArrayList<ProductDTO> getSugestProductInfo(int category_id,int product_id) throws SQLException {
			ArrayList<ProductDTO> sugestList = new ArrayList<ProductDTO>();
			DBConnector dbConnector = new DBConnector();
			Connection connection = dbConnector.getConnection();

			String sql = "SELECT * FROM product_info WHERE category_id=? AND product_id NOT IN(?) ORDER BY RAND() LIMIT 3 ";

			try {
				PreparedStatement statement = connection.prepareStatement(sql);
				statement.setInt(1, category_id);
				statement.setInt(2, product_id);


				ResultSet resultSet = statement.executeQuery();

				while (resultSet.next()) {

					ProductDTO dto = new ProductDTO();

					dto.setId(resultSet.getInt("id"));
					dto.setProduct_id(resultSet.getInt("product_id"));
					dto.setProduct_name(resultSet.getString("product_name"));
					dto.setProduct_name_kana(resultSet.getString("product_name_kana"));
					dto.setProduct_description(resultSet.getString("product_description"));
					dto.setCategory_id(resultSet.getInt("category_id"));
					dto.setPrice(resultSet.getInt("price"));
					dto.setImage_file_path(resultSet.getString("image_file_path"));
					dto.setImage_file_name(resultSet.getString("image_file_name"));
					dto.setRelease_date(resultSet.getString("release_date"));
					dto.setRelease_company(resultSet.getString("release_company"));
					dto.setProduct_stock(resultSet.getInt("product_stock"));
					dto.setInsert_date(resultSet.getString("insert_date"));
					dto.setUpdate_date(resultSet.getString("update_date"));
					sugestList.add(dto);

				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				connection.close();
			}
			return sugestList;
		}


}
