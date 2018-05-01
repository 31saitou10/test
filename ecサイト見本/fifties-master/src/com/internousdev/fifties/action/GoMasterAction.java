package com.internousdev.fifties.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.fifties.dao.MasterDAO;
import com.internousdev.fifties.dto.ProductDTO;
import com.opensymphony.xwork2.ActionSupport;

public class GoMasterAction extends ActionSupport implements SessionAware {

	private ArrayList<ProductDTO> productDTOList = new ArrayList<ProductDTO>();

	Map<String, Object> session;

	public String execute() throws SQLException {
		String result = ERROR;
		MasterDAO dao = new MasterDAO();
		productDTOList = dao.getProductInfo();
		if (session.containsKey("MasterFlg")) {
			result = SUCCESS;
		} else {
			result = ERROR;
		}
		return result;
	}



	public ArrayList<ProductDTO> getProductDTOList() {
		return productDTOList;
	}

	public void setProductDTOList(ArrayList<ProductDTO> productDTOList) {
		this.productDTOList = productDTOList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
