package com.internousdev.zen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.zen.dto.LoginDTO;
import com.internousdev.zen.util.DBConnector;

public class LoginDAO {

	private LoginDTO loginDTO = new LoginDTO();

	public LoginDTO select(String loginUserId, String loginPassword) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql = "select * from user_info where user_id=? and password=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, loginUserId);
			ps.setString(2, loginPassword);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				loginDTO.setLoginUserId(rs.getString("user_id"));
				loginDTO.setLoginPassword(rs.getString("password"));
				loginDTO.setFamilyName(rs.getString("family_name"));
				loginDTO.setFirstName(rs.getString("first_name"));
				loginDTO.setFamilyNameKana(rs.getString("family_name_kana"));
				loginDTO.setFirstNameKana(rs.getString("first_name_kana"));

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return loginDTO;

	}

	// ログイン判定
	public int login(LoginDTO loginDTO) throws SQLException {
		int count = 0;
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		// ログインしたユーザーのログインフラグの値を1にする
		String sql = "UPDATE user_info SET logined=1 WHERE user_id=?";
		try { // 例外が発生する可能性のある処理
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, loginDTO.getLoginUserId());
			count = ps.executeUpdate();

		} catch (SQLException e) { // 例外が発生した場合の処理(例外が発生しなければ行われない処理)

			e.printStackTrace();

		} finally { // 例外の有無に関わらず、最後に必ず実行される処理
			con.close();
		}
		return count;
	}

	// userIdが存在するかどうかのチェック
	public boolean existsLoginUserId(String loginUserId) throws SQLException {
		boolean result = false;
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "SELECT * FROM user_info WHERE user_id = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, loginUserId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				result = true;
			} else {
				result = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			con.close();
		}
		return result;
	}

	// loginPasswordが存在するかどうかのチェック
	public boolean existsLoginPassword(String loginPassword) throws SQLException {
		boolean result = false;
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "SELECT * FROM user_info WHERE password = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, loginPassword);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				result = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			con.close();
		}
		return result;
	}

	public boolean isExistsUser(String loginUserId, String loginPassword) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "SELECT * FROM user_info where user_id=? AND password=?";

		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);

			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2, loginPassword);

			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

	// ゲストユーザーで登録されたカート情報をログインユーザーに置き換える
	public int replaceUserId(String tempUserId, String loginUserId) throws SQLException {

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		int count = 0;
		String sql = "update cart_info set user_id = ? where temp_user_id = ?";

		PreparedStatement ps = con.prepareStatement(sql);
		ps = con.prepareStatement(sql);
		ps.setString(1, loginUserId);
		ps.setString(2, tempUserId);

		count = ps.executeUpdate();

		return count;
	}
}
