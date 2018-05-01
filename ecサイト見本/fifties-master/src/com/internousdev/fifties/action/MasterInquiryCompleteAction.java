package com.internousdev.fifties.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.fifties.dao.MasterInquiryDAO;
import com.internousdev.fifties.dto.InquiryDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MasterInquiryCompleteAction extends ActionSupport implements SessionAware {

	private String ErrorMessage;

	Collection<String> checkList ;


	List<InquiryDTO> inquiryDTOList = new ArrayList<InquiryDTO>();
	private Map<String, Object> session;

	public String execute() throws SQLException {



		String result = ERROR;

		if ( checkList == null) {

			MasterInquiryDAO dao = new MasterInquiryDAO();
			inquiryDTOList = dao.getInquiry();
			return result;
		} else {

			MasterInquiryDAO dao = new MasterInquiryDAO();
			System.out.println("チェック"+checkList);
			int count = 0;
			for (String check : checkList) {
				int inquiryId = Integer.parseInt(check);
				count += dao.inquiryDelete(inquiryId);
			}
			if (count > 0) {
				result = SUCCESS;
				return result;
			} else {
				result = ERROR;
				return result;
			}
		}

	}

	public Collection<String> getCheckList() {
		return checkList;
	}

	public void setCheckList(Collection<String> checkList) {
		this.checkList = checkList;
	}

	public String getErrorMessage() {
		return ErrorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		ErrorMessage = errorMessage;
	}

	public List<InquiryDTO> getInquiryDTOList() {
		return inquiryDTOList;
	}

	public void setInquiryDTOList(List<InquiryDTO> inquiryDTOList) {
		this.inquiryDTOList = inquiryDTOList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
