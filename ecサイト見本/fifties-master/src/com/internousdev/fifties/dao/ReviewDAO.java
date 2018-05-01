/*
 * 中嶋　作成
 */

package com.internousdev.fifties.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.internousdev.fifties.dto.ReviewDTO;
import com.internousdev.fifties.util.DBConnector;
import com.internousdev.fifties.util.DateUtil;

public class ReviewDAO {
	List<ReviewDTO> myReviewList = new ArrayList<>();
	List<ReviewDTO> reviewList = new ArrayList<>();

	// レビュー投稿一覧のデータ取得
	public List<ReviewDTO> getMyReview_info(String userId, int productId) throws SQLException {
		DBConnector dbconnector = new DBConnector();
		Connection con = dbconnector.getConnection();
		String sql = "SELECT*FROM review WHERE review_id LIKE '" + userId + "' AND product_id LIKE '" + productId
				+ "'";

		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				ReviewDTO dto = new ReviewDTO();
				dto.setProductId(rs.getInt("productId"));
				dto.setUserId(rs.getString("userId"));
				dto.setReviewTitle(rs.getString("reviewTitle"));
				dto.setReviewBody(rs.getString("reviewBody"));
				dto.setReviewScore(rs.getInt("reviewScore"));
				myReviewList.add(dto);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return myReviewList;
	}

	// 商品ごとのレビュー一覧
	public List<ReviewDTO> getReview_info(int productId) throws SQLException {
		DBConnector dbconnector = new DBConnector();
		Connection con = dbconnector.getConnection();

		String sql = "SELECT*FROM review WHERE product_id LIKE ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,productId);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				ReviewDTO dto = new ReviewDTO();
				dto.setProductId(rs.getInt("product_id"));
				dto.setUserId(rs.getString("user_id"));
				dto.setReviewTitle(rs.getString("review_title"));
				dto.setReviewBody(rs.getString("review_body"));
				dto.setReviewScore(rs.getInt("review_score"));
				dto.setInsertDate(rs.getString("insert_date"));
				reviewList.add(dto);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return reviewList;
	}

	// 投稿履歴をチェック
	public int checkReview_info(String userId, int productId) throws SQLException {
		DBConnector dbconnector = new DBConnector();
		Connection con = dbconnector.getConnection();
		int result = 0;

		String sql = "SELECT COUNT(product_id) as count FROM review WHERE product_id = '" + productId
				+ "' AND user_id = '" + userId + "'";

		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				result = rs.getInt("count");

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

	// 投稿されたレビューをデータベースに入力

	public int insertReview_info(String userId, int productId, String reviewTitle, String reviewBody, int reviewScore)
			throws SQLException {
		DBConnector dbconnector = new DBConnector();
		Connection con = dbconnector.getConnection();
		int result = 0;

		String sql = "INSERT INTO review(user_id, product_id, review_title,review_body,review_score, insert_date) VALUES(?,?,?,?,?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setInt(2, productId);
			ps.setString(3, reviewTitle);
			ps.setString(4, reviewBody);
			ps.setInt(5, reviewScore);
			ps.setString(6, new DateUtil().getDate());

			result = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return result;
	}

	// レビューを削除
	public int deleteReview_info(String userId, Collection<Integer> deleteList) throws SQLException {
		DBConnector dbconnector = new DBConnector();
		Connection con = dbconnector.getConnection();
		int result = 0;

		String sql = "DELETE FROM review WHERE user_id LIKE ? AND product_id LIKE ? ";

		try {

			for (int value : deleteList) {
				int productId = value;
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, userId);
				ps.setInt(2, productId);

				result += ps.executeUpdate();
			}
		} catch (

		SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return result;
	}
}

