package com.internousdev.fifties.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.fifties.dao.AddressDAO;
import com.internousdev.fifties.dto.AddressDTO;
import com.opensymphony.xwork2.ActionSupport;
//林作成
public class AddressSelectAction extends ActionSupport implements SessionAware {

	AddressDAO addressDAO = new AddressDAO();
	AddressDTO addressDTO = new AddressDTO();

	private ArrayList<AddressDTO> addressInfoListDTO = new ArrayList<AddressDTO>();

	public Map<String, Object> session;

	String result;


	public String execute() throws SQLException{
		result = SUCCESS;

		//getではマズイかも
		addressInfoListDTO.addAll(addressDAO.getAddressInfo(session.get("userId").toString()));

		if(addressInfoListDTO.get(0) == null) {

			result = ERROR;
		}

		return result;

	}

	public ArrayList<AddressDTO> getAddressInfoListDTO(){

		return addressInfoListDTO;
	}

	public void setAddressInfoListDTO(ArrayList<AddressDTO> addressInfoListDTO) {

		this.addressInfoListDTO = addressInfoListDTO;
	}

	@Override
	public void setSession(Map<String, Object> session) {

		this.session = session;
	}
}