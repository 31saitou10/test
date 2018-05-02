package com.internousdev.zen.util;

import java.util.ArrayList;

import com.internousdev.zen.dto.ProductDTO;

public class ProductListChange {
	public ArrayList<ArrayList<ProductDTO>> productListChange(ArrayList<ProductDTO> productList){
		ArrayList<ArrayList<ProductDTO>> list = new ArrayList<>();

		int i= 0;
		list.add(new ArrayList<ProductDTO>());
		for(int j = 1; j <= productList.size(); j++){
			list.get(i).add(productList.get(j - 1));
				if(j % 9 == 0 && j != 0){
					i++;
					list.add(new ArrayList<ProductDTO>());
				}
		}
		System.out.println(list);
		return list;
	}
}
