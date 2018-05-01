//@中嶋

package com.internousdev.fifties.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.fifties.dto.ProductDTO;
import com.internousdev.fifties.util.DBConnector;

public class ProductSearchDAO {
	List<ProductDTO> searchDTOList = new ArrayList<ProductDTO>();
	DBConnector dbConnector = new DBConnector();
	Connection con = dbConnector.getConnection();

	public List<ProductDTO> getProduct_Info(List<String> searchWordList, String category) throws SQLException {

		String sql = "SELECT*FROM product_info WHERE ";
		// 選択されたカテゴリID、検索ワードと一致する場合
		if (category.equals("0")) {

			int i = 1;
			for (String searchWord : searchWordList) {
				if (i == 1) {
					sql = sql + "(product_name LIKE '%" + searchWord + "%' OR product_name_kana LIKE '%" + searchWord+ "%' OR product_description LIKE '%"+searchWord+"%' OR release_company LIKE '"+searchWord+"')";
				} else {
					sql = sql + "AND (product_name LIKE '%" + searchWord + "%' OR product_name_kana LIKE '%"+ searchWord + "%' OR product_description LIKE '%"+searchWord+"%' OR release_company LIKE '"+searchWord+"')";
				}
				i = i + 1;
			}
		} else {
			sql = sql + "category_id LIKE '%" + category + "%'";
			for (String searchWord : searchWordList) {
				sql = sql + "AND (product_name LIKE '%" + searchWord + "%' OR product_name_kana LIKE '%" + searchWord+ "%' OR product_description LIKE '%"+searchWord+"%' OR release_company LIKE '"+searchWord+"')";
			}
		}

		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				ProductDTO dto = new ProductDTO();
				dto.setId(rs.getInt("id"));
				dto.setProduct_id(rs.getInt("product_id"));
				dto.setProduct_name(rs.getString("product_name"));
				dto.setProduct_name_kana(rs.getString("product_name_kana"));
				dto.setProduct_description(rs.getString("product_description"));
				dto.setCategory_id(rs.getInt("category_id"));
				dto.setProduct_stock(rs.getInt("product_stock"));
				dto.setPrice(rs.getInt("price"));
				dto.setImage_file_path(rs.getString("image_file_path"));
				dto.setImage_file_name(rs.getString("image_file_name"));
				dto.setRelease_date(rs.getString("release_date"));
				dto.setRelease_company(rs.getString("release_company"));
				dto.setStatus(rs.getInt("status"));
				dto.setInsert_date(rs.getString("insert_date"));
				dto.setUpdate_date(rs.getString("update_date"));
				searchDTOList.add(dto);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return searchDTOList;

	}
}
