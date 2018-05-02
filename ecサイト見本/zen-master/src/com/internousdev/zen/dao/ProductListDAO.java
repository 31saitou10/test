package com.internousdev.zen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.zen.dto.ProductDTO;
import com.internousdev.zen.util.DBConnector;

public class ProductListDAO {
	//商品情報の取得
	public ArrayList<ProductDTO> getProductInfo()throws SQLException{
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		ArrayList<ProductDTO> productList = new ArrayList<ProductDTO>();
		String sql = "select * from product_info order by product_id asc";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				ProductDTO productListDTO = new ProductDTO();

				productListDTO.setId(rs.getInt("id"));
				productListDTO.setProduct_id(rs.getInt("product_id"));
				productListDTO.setProduct_name(rs.getString("product_name"));
				productListDTO.setProduct_name_kana(rs.getString("product_name_kana"));
				productListDTO.setCategory_id(rs.getInt("category_id"));
				productListDTO.setPrice(String.format("%,d",rs.getInt("price")));
				productListDTO.setImage_file_path(rs.getString("image_file_path"));
				productListDTO.setImage_file_name(rs.getString("image_file_name"));
				productList.add(productListDTO);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return productList;
	}
}
