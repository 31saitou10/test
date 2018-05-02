 package com.internousdev.zen.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.zen.dao.ProductListDAO;
import com.internousdev.zen.dto.ProductDTO;
import com.internousdev.zen.util.ProductListChange;
import com.opensymphony.xwork2.ActionSupport;

public class ProductListAction extends ActionSupport implements SessionAware{
	//セッション情報の取得
	public Map<String,Object> session;

	//商品情報の格納
	public ArrayList<ProductDTO> productList = new ArrayList<ProductDTO>();

	//上のリストを9個ごとに格納したリスト
	private ArrayList<ArrayList<ProductDTO>> list = new ArrayList<>();

	private int pageSelect;
	private int pageCount;
	private List<Integer> pageList = new ArrayList<>();

	//実行メソッド
	public String execute()throws SQLException{
		// 商品情報取得
		ProductListDAO productListDAO = new ProductListDAO();
		productList = productListDAO.getProductInfo();

		Iterator<ProductDTO> iterator = productList.iterator();
		if (!(iterator.hasNext())) {
			productList = null;
		}

		// productListを9個ごとに格納
		ProductListChange change = new ProductListChange();
		list = change.productListChange(productList);

		for (int i = 0; i < list.size(); i++) {
			pageList.add(i + 1);
		}

		for (int i = 0; i < list.size(); i++) {
			if (i == pageSelect) {
				productList = list.get(i);
				break;
			}
		}
		return SUCCESS;

	}

	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public ArrayList<ProductDTO> getProductList() {
		return productList;
	}

	public void setProductList(ArrayList<ProductDTO> productList) {
		this.productList = productList;
	}

	public ArrayList<ArrayList<ProductDTO>> getList() {
		return list;
	}

	public void setList(ArrayList<ArrayList<ProductDTO>> list) {
		this.list = list;
	}

	public int getPageSelect() {
		return pageSelect;
	}

	public void setPageSelect(int pageSelect) {
		this.pageSelect = pageSelect;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public List<Integer> getPageList() {
		return pageList;
	}

	public void setPageList(List<Integer> pageList) {
		this.pageList = pageList;
	}
}
