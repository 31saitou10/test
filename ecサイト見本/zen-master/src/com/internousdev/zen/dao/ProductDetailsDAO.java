package com.internousdev.zen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.zen.dto.ProductDTO;
import com.internousdev.zen.util.DBConnector;


public class ProductDetailsDAO {
	//単体の商品情報取得
	public ProductDTO getProductDetailsInfo(String product_id)throws SQLException{
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		ProductDTO productDTO = new ProductDTO();
		String sql = "select * from product_info where product_id=?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, product_id);
			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				productDTO.setId(rs.getInt("id"));
				productDTO.setProduct_id(rs.getInt("product_id"));
				productDTO.setProduct_name(rs.getString("product_name"));
				productDTO.setProduct_name_kana(rs.getString("product_name_kana"));
				productDTO.setProduct_description(rs.getString("product_description"));
				productDTO.setCategory_id(rs.getInt("category_id"));
				productDTO.setPrice(String.format("%,d",rs.getInt("price")));
				productDTO.setImage_file_path(rs.getString("image_file_path"));
				productDTO.setImage_file_name(rs.getString("image_file_name"));
				productDTO.setRelease_date(rs.getString("release_date"));
				productDTO.setRelease_company(rs.getString("release_company"));
			}else{
				return null;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return productDTO;
	}
	//商品詳細情報取得
	public List<ProductDTO> getProductDetailsInfoList(String[] productIdList)throws SQLException{
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		List<ProductDTO> detailsList = new ArrayList<ProductDTO>();


		for(int i = 0; i < productIdList.length; i++){
			String sql = "select * from product_info where product_id = ?";
			try{
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, String.valueOf(productIdList[i]));
				ResultSet rs = ps.executeQuery();

				while(rs.next()){
					ProductDTO detailsDTO = new ProductDTO();

					detailsDTO.setId(rs.getInt("id"));
					detailsDTO.setProduct_id(rs.getInt("product_id"));
					detailsDTO.setProduct_name(rs.getString("product_name"));
					detailsDTO.setProduct_name_kana(rs.getString("id"));
					detailsDTO.setProduct_description(rs.getString("product_description"));
					detailsDTO.setCategory_id(rs.getInt("category_id"));
					detailsDTO.setPrice(String.format("%,d",rs.getInt("price")));
					detailsDTO.setImage_file_path(rs.getString("image_file_path"));
					detailsDTO.setImage_file_name(rs.getString("image_file_name"));
					detailsDTO.setRelease_date(rs.getString("release_date"));
					detailsDTO.setRelease_company(rs.getString("release_company"));
					detailsList.add(detailsDTO);
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return detailsList;
	}
	//おすすめ商品リスト
	//現在選択している商品との重複を避けるために、カテゴリーは一致させつつ同じ商品を持ってこないようにする。
	public ArrayList<ProductDTO> getSugestProductInfo(int category_id, int product_id) throws SQLException {
		ArrayList<ProductDTO> sugestList = new ArrayList<ProductDTO>();
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "select * from product_info where category_id = ? and product_id != ? order by rand() limit 3";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, category_id);
			ps.setInt(2, product_id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				ProductDTO sugestDTO = new ProductDTO();

				sugestDTO.setId(rs.getInt("id"));
				sugestDTO.setProduct_id(rs.getInt("product_id"));
				sugestDTO.setProduct_name(rs.getString("product_name"));
				sugestDTO.setProduct_name_kana(rs.getString("product_name_kana"));
				sugestDTO.setProduct_description(rs.getString("product_description"));
				sugestDTO.setCategory_id(rs.getInt("category_id"));
				sugestDTO.setPrice(String.format("%,d",rs.getInt("price")));
				sugestDTO.setImage_file_path(rs.getString("image_file_path"));
				sugestDTO.setImage_file_name(rs.getString("image_file_name"));
				sugestDTO.setRelease_date(rs.getString("release_date"));
				sugestDTO.setRelease_company(rs.getString("release_company"));
				sugestList.add(sugestDTO);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return sugestList;
	}
}
