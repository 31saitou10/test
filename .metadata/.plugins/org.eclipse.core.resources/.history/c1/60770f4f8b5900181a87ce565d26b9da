package com.internousdev.miamiburger.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miamiburger.dao.PurchaseHistoryDAO;
import com.internousdev.miamiburger.dao.PurchaseHistryDeleteDAO;
import com.internousdev.miamiburger.dto.PurchaseHistoryDTO;
import com.internousdev.miamiburger.dto.PurchaseListDTO;
import com.internousdev.miamiburger.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class PurchaseHistoryAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;
	private PurchaseHistoryDAO purchaseHistoryDAO = new PurchaseHistoryDAO();
	private PurchaseHistoryDTO purchaseHistoryDTO = new PurchaseHistoryDTO();
	private PurchaseListDTO purchaseListDTO = new PurchaseListDTO();
	private boolean deleteFlg = false;
	private String result;


	private ArrayList<PurchaseHistoryDTO> purchaseList = new ArrayList<>(); // 全購入履歴
	private ArrayList<PurchaseHistoryDTO> setPurchaseHistoryDTOList = new ArrayList<>(); // 日時ごとの購入履歴
	private ArrayList<List<PurchaseHistoryDTO>> AllsetPurchaseList = new ArrayList<>(); // 全ての日時ごとの購入履歴
	private ArrayList<PurchaseListDTO> purchaseListDTOList = new ArrayList<>();
	private UserInfoDTO userInfoDTO = new UserInfoDTO();

	private String emptyMessage;

	public String execute() {
		userInfoDTO = (UserInfoDTO) session.get("userInfoDTO");
		String userId = userInfoDTO.getUserId().toString();

		if (!deleteFlg) {
			purchaseList = purchaseHistoryDAO.getPurchaseHistory(userId); // purchaseListに全情報が入っている
			if(purchaseList.isEmpty()){
				emptyMessage = "購入履歴はありません。";
				result = SUCCESS;
			}else{
			String item_date = purchaseList.get(0).getRegistDate();
			int total = 0;
			int Number = 0;

			for (int i = 0; i < purchaseList.size(); i++) {
				if (item_date.equals(purchaseList.get(i).getRegistDate())) {
					setPurchaseHistoryDTOList.add(purchaseList.get(i)); // setPurchaseHistoryDTOList（詳細）に同じ時間のpurchaseListをいれていく
					total += purchaseList.get(i).getPrice(); // 同時に金額をtotalに足していく
				} else {
					// 履歴表示用のDTO格納----------------------------------
					purchaseListDTO = new PurchaseListDTO(); // ←時間が切り替わった
					purchaseListDTO.setRegistDate(item_date);
					purchaseListDTO.setTotalPrice(total);
					purchaseListDTO.setAllPurchaseListNumber(Number);
					purchaseListDTOList.add(purchaseListDTO);
					// -----------------------------------------------------
					AllsetPurchaseList.add(setPurchaseHistoryDTOList);
					item_date = purchaseList.get(i).getRegistDate();
					setPurchaseHistoryDTOList = new ArrayList<>();
					total = 0;
					setPurchaseHistoryDTOList.add(purchaseList.get(i));
					total += purchaseList.get(i).getPrice();
					Number++;
				}

			}
			AllsetPurchaseList.add(setPurchaseHistoryDTOList);
			purchaseListDTO = new PurchaseListDTO();
			purchaseListDTO.setRegistDate(item_date);
			purchaseListDTO.setTotalPrice(total);
			purchaseListDTO.setAllPurchaseListNumber(Number);
			purchaseListDTOList.add(purchaseListDTO);
			session.put("purchaseListDTOList", purchaseListDTOList);
			session.put("AllsetPurchaseList", AllsetPurchaseList);

			result= SUCCESS;
			}

		}else {
			PurchaseHistryDeleteDAO deleteDAO = new PurchaseHistryDeleteDAO();
			int check = deleteDAO.deletePurchaseHistory(userId);
			if(check == 0){
				result = ERROR;
			}
			result= "delete";
		}
		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public PurchaseHistoryDAO getPurchaseHistoryDAO() {
		return purchaseHistoryDAO;
	}

	public void setPurchaseHistoryDAO(PurchaseHistoryDAO purchaseHistoryDAO) {
		this.purchaseHistoryDAO = purchaseHistoryDAO;
	}

	public PurchaseHistoryDTO getPurchaseHistoryDTO() {
		return purchaseHistoryDTO;
	}

	public void setPurchaseHistoryDTO(PurchaseHistoryDTO purchaseHistoryDTO) {
		this.purchaseHistoryDTO = purchaseHistoryDTO;
	}

	public PurchaseListDTO getPurchaseListDTO() {
		return purchaseListDTO;
	}

	public void setPurchaseListDTO(PurchaseListDTO purchaseListDTO) {
		this.purchaseListDTO = purchaseListDTO;
	}



	public boolean isDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(boolean deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public ArrayList<PurchaseHistoryDTO> getPurchaseList() {
		return purchaseList;
	}

	public void setPurchaseList(ArrayList<PurchaseHistoryDTO> purchaseList) {
		this.purchaseList = purchaseList;
	}

	public ArrayList<PurchaseHistoryDTO> getSetPurchaseHistoryDTOList() {
		return setPurchaseHistoryDTOList;
	}

	public void setSetPurchaseHistoryDTOList(ArrayList<PurchaseHistoryDTO> setPurchaseHistoryDTOList) {
		this.setPurchaseHistoryDTOList = setPurchaseHistoryDTOList;
	}

	public ArrayList<List<PurchaseHistoryDTO>> getAllsetPurchaseList() {
		return AllsetPurchaseList;
	}

	public void setAllsetPurchaseList(ArrayList<List<PurchaseHistoryDTO>> allsetPurchaseList) {
		AllsetPurchaseList = allsetPurchaseList;
	}

	public ArrayList<PurchaseListDTO> getPurchaseListDTOList() {
		return purchaseListDTOList;
	}

	public void setPurchaseListDTOList(ArrayList<PurchaseListDTO> purchaseListDTOList) {
		this.purchaseListDTOList = purchaseListDTOList;
	}

	public String getEmptyMessage() {
		return emptyMessage;
	}

	public void setEmptyMessage(String emptyMessage) {
		this.emptyMessage = emptyMessage;
	}


}
