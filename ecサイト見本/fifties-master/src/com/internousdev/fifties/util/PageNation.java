package com.internousdev.fifties.util;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.fifties.dto.ProductDTO;
import com.internousdev.fifties.dto.PurchaseHistoryDTO;

public class PageNation {

	public ArrayList<ArrayList<ProductDTO>> pageNation(List<ProductDTO> searchList){
		ArrayList<ArrayList<ProductDTO>> mainList = new ArrayList<>();

		int t = 0;
		mainList.add(new ArrayList<ProductDTO>());
		for(int i=1; i<= searchList.size() ; i++){
			mainList.get(t).add(searchList.get(i - 1));
				if(i % 9 == 0 && i != 0){
					t++;
					mainList.add(new ArrayList<ProductDTO>());
				}
		}
		System.out.println(mainList);
		return mainList;



	}

	public ArrayList<ArrayList<ProductDTO>> pageCange(List<ProductDTO> productList){
		ArrayList<ArrayList<ProductDTO>> mainList = new ArrayList<>();

		int t = 0;
		mainList.add(new ArrayList<ProductDTO>());
		for(int i=1; i<= productList.size() ; i++){
			mainList.get(t).add(productList.get(i - 1));
				if(i % 4 == 0 && i != 0){
					t++;
					mainList.add(new ArrayList<ProductDTO>());
				}
		}
		System.out.println(mainList);
		return mainList;



	}

	public ArrayList<ArrayList<PurchaseHistoryDTO>> pageHistory(List<PurchaseHistoryDTO> allHistoryList){
		ArrayList<ArrayList<PurchaseHistoryDTO>> mainList = new ArrayList<>();

		int t = 0;
		mainList.add(new ArrayList<PurchaseHistoryDTO>());
		for(int i=1; i<= allHistoryList.size() ; i++){
			mainList.get(t).add(allHistoryList.get(i - 1));
				if(i % 4 == 0 && i != 0){
					t++;
					mainList.add(new ArrayList<PurchaseHistoryDTO>());
				}
		}
		System.out.println(mainList);
		return mainList;



	}

}