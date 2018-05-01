package com.internousdev.fifties.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.fifties.dao.MasterInquiryDAO;
import com.internousdev.fifties.dto.InquiryDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MasterInquiryAction extends ActionSupport implements SessionAware {

	private ArrayList<InquiryDTO> inquiryDTOList = new ArrayList<InquiryDTO>();

	private Map<String, Object> session;

	public String execute() throws SQLException{

		MasterInquiryDAO dao = new MasterInquiryDAO();
		inquiryDTOList = dao.getInquiry();
		String result = ERROR;
		if (session.containsKey("MasterFlg")) {
			result = SUCCESS;
		} else {
			result = ERROR;
		}
		return result;
	}
	public ArrayList<InquiryDTO> getInquiryDTOList() {
		return inquiryDTOList;
	}

	public void setInquiryDTOList(ArrayList<InquiryDTO> inquiryDTOList) {
		this.inquiryDTOList = inquiryDTOList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	}

