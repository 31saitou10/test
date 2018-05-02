package com.internousdev.zen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.zen.dto.ProductDTO;
import com.internousdev.zen.util.DBConnector;

public class ProductSearchDAO {





	public ArrayList<ProductDTO> getItemInfo(String searchWord, String category) throws SQLException {
		ArrayList<ProductDTO> searchList = new ArrayList<ProductDTO>();
		 DBConnector dbConnector = new DBConnector();

		 Connection connection = dbConnector.getConnection();

		if (category.equals("焼酎")) {
			String sql = "SELECT * FROM product_info WHERE category_id = 1";

			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet resultSet = preparedStatement.executeQuery();

				while (resultSet.next()) {
					String productName = resultSet.getString("product_name");
					String productNameKana = resultSet.getString("product_name_kana");
					String productKeyWord = resultSet.getString("keywords");

					if (productName.matches(".*" + searchWord + ".*")
							|| productNameKana.matches(".*" + searchWord + ".*")
								|| productKeyWord.matches(".*" + searchWord + ".*")) {
						ProductDTO dto = new ProductDTO();
						dto.setId(resultSet.getInt("id"));
						dto.setProduct_id(resultSet.getInt("product_id"));
						dto.setProduct_name(resultSet.getString("product_name"));
						dto.setProduct_name_kana(resultSet.getString("product_name_kana"));
						dto.setProduct_description(resultSet.getString("product_description"));
						dto.setCategory_id(resultSet.getInt("category_id"));
						dto.setPrice(String.format("%,d",resultSet.getInt("price")));
						dto.setImage_file_path(resultSet.getString("image_file_path"));
						dto.setImage_file_name(resultSet.getString("image_file_name"));
						dto.setRelease_date(resultSet.getString("release_date"));
						dto.setRelease_company(resultSet.getString("release_company"));
						dto.setKeywords(resultSet.getString("keywords"));
						searchList.add(dto);
					}

				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				connection.close();
			}

		} else if (category.equals("日本酒")) {
			String sql = "SELECT * FROM product_info WHERE category_id = 2";

			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet resultSet = preparedStatement.executeQuery();

				while (resultSet.next()) {
					String productName = resultSet.getString("product_name");
					String productNameKana = resultSet.getString("product_name_kana");
					String productKeyWord = resultSet.getString("keywords");

					if (productName.matches(".*" + searchWord + ".*")
							|| productNameKana.matches(".*" + searchWord + ".*")
								|| productKeyWord.matches(".*" + searchWord + ".*")) {
						ProductDTO dto = new ProductDTO();
						dto.setId(resultSet.getInt("id"));
						dto.setProduct_id(resultSet.getInt("product_id"));
						dto.setProduct_name(resultSet.getString("product_name"));
						dto.setProduct_name_kana(resultSet.getString("product_name_kana"));
						dto.setProduct_description(resultSet.getString("product_description"));
						dto.setCategory_id(resultSet.getInt("category_id"));
						dto.setPrice(String.format("%,d",resultSet.getInt("price")));
						dto.setImage_file_path(resultSet.getString("image_file_path"));
						dto.setImage_file_name(resultSet.getString("image_file_name"));
						dto.setRelease_date(resultSet.getString("release_date"));
						dto.setRelease_company(resultSet.getString("release_company"));
						dto.setKeywords(resultSet.getString("keywords"));
						searchList.add(dto);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				connection.close();
			}

		} else if (category.equals("ウィスキー")) {
			String sql = "SELECT * FROM product_info WHERE category_id = 3";

			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet resultSet = preparedStatement.executeQuery();

				while (resultSet.next()) {
					String productName = resultSet.getString("product_name");
					String productNameKana = resultSet.getString("product_name_kana");
					String productKeyWord = resultSet.getString("keywords");

					if (productName.matches(".*" + searchWord + ".*")
							|| productNameKana.matches(".*" + searchWord + ".*")
								|| productKeyWord.matches(".*" + searchWord + ".*")) {
						ProductDTO dto = new ProductDTO();
						dto.setId(resultSet.getInt("id"));
						dto.setProduct_id(resultSet.getInt("product_id"));
						dto.setProduct_name(resultSet.getString("product_name"));
						dto.setProduct_name_kana(resultSet.getString("product_name_kana"));
						dto.setProduct_description(resultSet.getString("product_description"));
						dto.setCategory_id(resultSet.getInt("category_id"));
						dto.setPrice(String.format("%,d",resultSet.getInt("price")));
						dto.setImage_file_path(resultSet.getString("image_file_path"));
						dto.setImage_file_name(resultSet.getString("image_file_name"));
						dto.setRelease_date(resultSet.getString("release_date"));
						dto.setRelease_company(resultSet.getString("release_company"));
						dto.setKeywords(resultSet.getString("keywords"));
						searchList.add(dto);
					}
				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				connection.close();
			}
		} else if(category.equals("ワイン")){

			String sql = "SELECT * FROM product_info WHERE category_id = 4";

			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet resultSet = preparedStatement.executeQuery();

				while (resultSet.next()) {
					String productName = resultSet.getString("product_name");
					String productNameKana = resultSet.getString("product_name_kana");
					String productKeyWord = resultSet.getString("keywords");

					if (productName.matches(".*" + searchWord + ".*")
							|| productNameKana.matches(".*" + searchWord + ".*")
								|| productKeyWord.matches(".*" + searchWord + ".*")) {
						ProductDTO dto = new ProductDTO();
						dto.setId(resultSet.getInt("id"));
						dto.setProduct_id(resultSet.getInt("product_id"));
						dto.setProduct_name(resultSet.getString("product_name"));
						dto.setProduct_name_kana(resultSet.getString("product_name_kana"));
						dto.setProduct_description(resultSet.getString("product_description"));
						dto.setCategory_id(resultSet.getInt("category_id"));
						dto.setPrice(String.format("%,d",resultSet.getInt("price")));
						dto.setImage_file_path(resultSet.getString("image_file_path"));
						dto.setImage_file_name(resultSet.getString("image_file_name"));
						dto.setRelease_date(resultSet.getString("release_date"));
						dto.setRelease_company(resultSet.getString("release_company"));
						dto.setKeywords(resultSet.getString("keywords"));
						searchList.add(dto);
					}

				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				connection.close();
			}
		} else if(category.equals("全商品")){

			String sql = "SELECT * FROM product_info";

			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet resultSet = preparedStatement.executeQuery();

				while (resultSet.next()) {
					String productName = resultSet.getString("product_name");
					String productNameKana = resultSet.getString("product_name_kana");
					String productKeyWord = resultSet.getString("keywords");

					if (productName.matches(".*" + searchWord + ".*")
							|| productNameKana.matches(".*" + searchWord + ".*")
								|| productKeyWord.matches(".*" + searchWord + ".*")) {
						ProductDTO dto = new ProductDTO();
						dto.setId(resultSet.getInt("id"));
						dto.setProduct_id(resultSet.getInt("product_id"));
						dto.setProduct_name(resultSet.getString("product_name"));
						dto.setProduct_name_kana(resultSet.getString("product_name_kana"));
						dto.setProduct_description(resultSet.getString("product_description"));
						dto.setCategory_id(resultSet.getInt("category_id"));
						dto.setPrice(String.format("%,d",resultSet.getInt("price")));
						dto.setImage_file_path(resultSet.getString("image_file_path"));
						dto.setImage_file_name(resultSet.getString("image_file_name"));
						dto.setRelease_date(resultSet.getString("release_date"));
						dto.setRelease_company(resultSet.getString("release_company"));
						dto.setKeywords(resultSet.getString("keywords"));
						searchList.add(dto);
					}

				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				connection.close();
			}
		} else if(category.equals("")){

			String sql = "SELECT * FROM product_info";

			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet resultSet = preparedStatement.executeQuery();

				while (resultSet.next()) {
					String productName = resultSet.getString("product_name");
					String productNameKana = resultSet.getString("product_name_kana");
					String productKeyWord = resultSet.getString("keywords");

					if (productName.matches(".*" + searchWord + ".*")
							|| productNameKana.matches(".*" + searchWord + ".*")
								|| productKeyWord.matches(".*" + searchWord + ".*")) {
						ProductDTO dto = new ProductDTO();
						dto.setId(resultSet.getInt("id"));
						dto.setProduct_id(resultSet.getInt("product_id"));
						dto.setProduct_name(resultSet.getString("product_name"));
						dto.setProduct_name_kana(resultSet.getString("product_name_kana"));
						dto.setProduct_description(resultSet.getString("product_description"));
						dto.setCategory_id(resultSet.getInt("category_id"));
						dto.setPrice(String.format("%,d",resultSet.getInt("price")));
						dto.setImage_file_path(resultSet.getString("image_file_path"));
						dto.setImage_file_name(resultSet.getString("image_file_name"));
						dto.setRelease_date(resultSet.getString("release_date"));
						dto.setRelease_company(resultSet.getString("release_company"));
						dto.setKeywords(resultSet.getString("keywords"));
						searchList.add(dto);
					}

				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				connection.close();
			}
		}


		return searchList;
	}
}