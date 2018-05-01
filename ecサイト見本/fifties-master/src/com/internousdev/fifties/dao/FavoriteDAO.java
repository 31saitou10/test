//作成　中嶋

//ログインしているユーザーIDに
//お気に入りの商品情報をListで格納
//(登録されていない場合も空のListを返す)

package com.internousdev.fifties.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.internousdev.fifties.dto.ProductDTO;
import com.internousdev.fifties.util.DBConnector;
import com.internousdev.fifties.util.DateUtil;

//一覧表示部分

public class FavoriteDAO {
	List<ProductDTO> FavoriteList = new ArrayList<ProductDTO>();

	// userIDを参照し、お気に入り情報をデータベースから取り出す
	public List<ProductDTO> getFavorite_Info(String userId, int productId) throws SQLException {
		DBConnector dbConnector = new DBConnector();
		Connection con = dbConnector.getConnection();

		String sql = "SELECT*FROM favorite_info LEFT OUTER JOIN product_info ON favorite_info.product_id = product_info.product_id WHERE favorite_info.favorite_id LIKE '"
				+ userId + "'";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				ProductDTO dto = new ProductDTO();
				dto.setId(rs.getInt("id"));
				dto.setProduct_id(rs.getInt("product_id"));
				dto.setProduct_name(rs.getString("product_name"));
				dto.setProduct_name_kana(rs.getString("product_name_kana"));
				dto.setImage_file_name(rs.getString("image_file_name"));
				dto.setImage_file_path(rs.getString("image_file_path"));
				dto.setPrice(rs.getInt("price"));
				dto.setRelease_date(rs.getString("release_date"));
				dto.setRelease_company(rs.getString("release_company"));
				FavoriteList.add(dto);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return FavoriteList;
	}

	// 重複チェック
	public int checkFavorite_info(String userId, int productId) throws SQLException {
		DBConnector dbConnector = new DBConnector();
		Connection con = dbConnector.getConnection();

		int result = 0;

		String sql = "SELECT COUNT(product_id) as count FROM favorite_info WHERE product_id= '" + productId
				+ "'  AND favorite_id= '" + userId + "'";

		try {
			// 重複チェック
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				result = rs.getInt("count");
			}
			// result = stmt.getUpdateCount();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return result;
	}

	// お気に入りをデータベースに追加

	public int insertFavorite_info(String userId, int productId) throws SQLException {
		DBConnector dbConnector = new DBConnector();
		Connection con = dbConnector.getConnection();

		int result = 0;

		String sql = "insert into favorite_info(favorite_id,product_id,insert_date) VALUES(?,?,?)";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, userId);
			stmt.setInt(2, productId);
			stmt.setString(3, new DateUtil().getDate());

			result = stmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return result;
	}

	// お気に入りをデータベースから削除

	public int deleteFavorite_info(String userId, Collection<String> deleteList) throws SQLException {
		DBConnector dbConnector = new DBConnector();
		Connection con = dbConnector.getConnection();

		int result = 0;

		String sql = "DELETE FROM favorite_info WHERE favorite_id LIKE ? AND product_id LIKE ?";

		try {

			for (String value : deleteList) {
				int productId = new Integer(value).intValue();
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(1, userId);
				stmt.setInt(2, productId);

				result += stmt.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return result;
	}

}
