package com.internousdev.zen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.zen.dto.CartDTO;
import com.internousdev.zen.util.DBConnector;

public class CartDAO {

	// ユーザが追加した商品をカートに登録
	public int putIntoCart(int product_id, String user_id,
			int product_count, int price, String loginFlg) {
		int result = 0;
		DBConnector db;
		Connection con;

		try {
			db = new DBConnector();
			con = db.getConnection();

			// ユーザIDでログインしているなら
			if (loginFlg.equals("yes")) {

				// カート情報テーブルのproduct_countを取得する
				String count_sql = "select product_count from cart_info where user_id=? and product_id=?";
				PreparedStatement count_ps = con.prepareStatement(count_sql);
				count_ps.setString(1, user_id);
				count_ps.setInt(2, product_id);
				ResultSet count_rs = count_ps.executeQuery();

				if (count_rs.next()) {
					product_count += count_rs.getInt("product_count");

					//カート情報テーブルの商品個数の数を更新する
					String sql = "update cart_info set product_count=? where user_id=? and product_id=?";

					PreparedStatement ps = con.prepareStatement(sql);
					ps.setInt(1, product_count);
					ps.setString(2, user_id);
					ps.setInt(3, product_id);
					result = ps.executeUpdate();
				} else {

					//カート情報テーブルにユーザID、商品ID、商品個数を挿入する
					String sql = "insert into cart_info(user_id, product_id, product_count, price,regist_date)values(?, ?, ?, ?, NOW())";

					PreparedStatement ps = con.prepareStatement(sql);
					ps.setString(1, user_id);
					ps.setInt(2, product_id);
					ps.setInt(3, product_count);
					ps.setInt(4, price);
					result = ps.executeUpdate();
				}

				// ゲストIDなら
			} else {

				// カート情報テーブルのproduct_countを取得する
				String count_sql = "select product_count from cart_info where temp_user_id=? and product_id=?";
				PreparedStatement count_ps = con.prepareStatement(count_sql);
				count_ps.setString(1, user_id);
				count_ps.setInt(2, product_id);
				ResultSet count_rs = count_ps.executeQuery();

				if (count_rs.next()) {
					product_count += count_rs.getInt("product_count");

					//カート情報テーブルの商品個数の数を更新する
					String sql = "update cart_info set product_count=? where temp_user_id=? and product_id=?";

					PreparedStatement ps = con.prepareStatement(sql);
					ps.setInt(1, product_count);
					ps.setString(2, user_id);
					ps.setInt(3, product_id);
					result = ps.executeUpdate();
				} else {

					//カート情報テーブルにユーザID、商品ID、商品個数を挿入する
					String sql = "insert into cart_info(user_id,temp_user_id, product_id, product_count, price,regist_date)values(?, ?, ?, ?, ?, NOW())";

					PreparedStatement ps = con.prepareStatement(sql);
					ps.setString(1, " ");
					ps.setString(2, user_id);
					ps.setInt(3, product_id);
					ps.setInt(4, product_count);
					ps.setInt(5, price);
					result = ps.executeUpdate();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	// 商品情報からカートに入れた商品の価格を取り出す
	public int takePrice(int product_id) {
		int price = 0;

		DBConnector db;
		Connection con;

		db = new DBConnector();
		con = db.getConnection();

		String sql = "select price from product_info where product_id=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, product_id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				price = rs.getInt("price");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return price;
	}

	// ユーザIDに対応したカートの商品情報を表示する
	public ArrayList<CartDTO> select(String user_id, String loginFlg) {
		int product_total_price = 0;

		DBConnector db;
		Connection con;

		// カートの商品の数だけlistに格納する
		ArrayList<CartDTO> list = new ArrayList<>();

		db = new DBConnector();
		con = db.getConnection();

		if (loginFlg.equals("yes")) {
			// cart_infoとproduct_infoを結合してユーザIDに対応するものを表示する
			String sql = "select * from cart_info c inner join product_info p on c.product_id = p.product_id where user_id = ?";

			try {
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, user_id);
				ResultSet rs = ps.executeQuery();

				while (rs.next()) {
					CartDTO dto = new CartDTO();

					// product_infoテーブル
					dto.setProduct_id(rs.getInt("p.product_id"));
					dto.setProduct_name(rs.getString("p.product_name"));
					dto.setProduct_name_kana(rs.getString("p.product_name_kana"));
					dto.setPrice(rs.getInt("p.price"));
					dto.setProduct_description(rs.getString("p.product_description"));
					dto.setImage_file_path(rs.getString("p.image_file_path"));
					dto.setImage_file_name(rs.getString("p.image_file_name"));
					dto.setRelease_company(rs.getString("p.release_company"));
					dto.setRelease_date(rs.getString("p.release_date"));

					// cart_infoテーブル
					dto.setProduct_id(rs.getInt("c.product_id"));
					dto.setProduct_count(rs.getInt("c.product_count"));

					// 商品ごとの合計金額を計算する
					product_total_price = rs.getInt("p.price") * rs.getInt("c.product_count");
					dto.setProduct_total_price(product_total_price);

					// listにカートの商品情報を１つずつ入れる
					list.add(dto);
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		} else {

			// cart_infoとproduct_infoを結合してゲストIDに対応するものを表示する
			String sql = "select * from cart_info c inner join product_info p on c.product_id = p.product_id where temp_user_id = ?";

			try {

				PreparedStatement ps = con.prepareStatement(sql);

				ps.setString(1, user_id);

				ResultSet rs = ps.executeQuery();

				// CartDTOにカートの商品情報を格納する
				while (rs.next()) {
					CartDTO dto = new CartDTO();

					// product_infoテーブル
					dto.setProduct_id(rs.getInt("p.product_id"));
					dto.setProduct_name(rs.getString("p.product_name"));
					dto.setProduct_name_kana(rs.getString("p.product_name_kana"));
					dto.setPrice(rs.getInt("p.price"));
					dto.setProduct_description(rs.getString("p.product_description"));
					dto.setImage_file_path(rs.getString("p.image_file_path"));
					dto.setImage_file_name(rs.getString("p.image_file_name"));
					dto.setRelease_company(rs.getString("p.release_company"));
					dto.setRelease_date(rs.getString("p.release_date"));

					// cart_infoテーブル
					dto.setProduct_id(rs.getInt("c.product_id"));
					dto.setProduct_count(rs.getInt("c.product_count"));

					// 商品ごとの合計金額を計算する
					product_total_price = rs.getInt("p.price") * rs.getInt("c.product_count");
					dto.setProduct_total_price(product_total_price);

					// listにカートの商品情報を１つずつ入れる
					list.add(dto);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	// ユーザIDに対応するカートの商品情報を削除する
	public int deleteCart(ArrayList<Integer> chooseList, String user_id, String loginFlg) {
		int result = 0;

		DBConnector db;
		Connection con;

		if (loginFlg.equals("yes")) {

			// cart_infoから条件のユーザIDに合う商品を全て削除
			String sql = "delete from cart_info where user_id=? and product_id = ?";
			try {
				db = new DBConnector();
				con = db.getConnection();
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, user_id);
				for (Integer product_id : chooseList) {
					ps.setInt(2, product_id);
					result += ps.executeUpdate();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			String sql = "delete from cart_info where temp_user_id=? and product_id = ?";
			try {
				db = new DBConnector();
				con = db.getConnection();
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, user_id);
				for (Integer product_id : chooseList) {
					ps.setInt(2, product_id);
					result += ps.executeUpdate();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	// カート内の商品を全件削除する
	public int allDeleteCart(String user_id, String loginFlg) {
		int result = 0;

		DBConnector db;
		Connection con;

		if (loginFlg.equals("yes")) {
			System.out.println("user_id is " + user_id);
			String sql = "delete from cart_info where user_id=?";
			try {
				db = new DBConnector();
				con = db.getConnection();

				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, user_id);
				result = ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			String sql = "delete from cart_info where temp_user_id=?";
			try {
				db = new DBConnector();
				con = db.getConnection();

				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, user_id);
				result = ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}
