package com.internousdev.fifties.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.fifties.util.DBConnector;
import com.internousdev.fifties.util.DateUtil;


public class InquiryCompleteDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	private DateUtil dateUtil = new DateUtil();
	private String sql="insert into inquiry(name,email,inquiry_type,inquiry_body,insert_date) values(?,?,?,?,?)";

	/**DBに問い合わせ内容をinsertするメソッド
	 *
	 *@return  boolean result
	 *
	 * */
	public boolean insertInquiry(String inquiryName, String inquiryEmail, String qtype, String inquiryBody)throws SQLException{

		boolean result = false;

		try{PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, inquiryName);
			ps.setString(2, inquiryEmail);
			ps.setString(3, qtype);
			ps.setString(4, inquiryBody);
			ps.setString(5, dateUtil.getDate());

			int count = ps.executeUpdate();
			if(count > 0){
				result = true;
			}

		}catch(Exception e){
			e.printStackTrace();

		}finally{
			con.close();
		}

	return result;
	}
}
