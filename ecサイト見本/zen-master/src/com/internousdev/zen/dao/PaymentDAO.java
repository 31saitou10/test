package com.internousdev.zen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.internousdev.zen.dto.PaymentDTO;
import com.internousdev.zen.util.DBConnector;

public class PaymentDAO {


	public ArrayList<PaymentDTO> getPaymentInfo(String user_id){
		DBConnector dbConnector=new DBConnector();
		Connection connection=dbConnector.getConnection();
		PaymentDTO paymentDTO=new PaymentDTO();

		ArrayList<PaymentDTO>list=new ArrayList<PaymentDTO>();
		String sql="SELECT product_id,product_count FROM cart_info WHERE user_id = ?";
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, user_id);

			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()){
				paymentDTO.setproductId(resultSet.getString("product_id"));
				paymentDTO.setProductCount(resultSet.getString("product_count"));
				list.add(paymentDTO);
			}

		} catch(Exception e) {

				e.printStackTrace();

		}
		return list;

	}



	}


