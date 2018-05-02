package com.internousdev.zen.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.zen.dao.ProductSearchDAO;
import com.internousdev.zen.dto.ProductDTO;
import com.internousdev.zen.util.ProductListChange;
import com.internousdev.zen.util.ToKana;
import com.opensymphony.xwork2.ActionSupport;

public class ProductSearchAction extends ActionSupport implements SessionAware{

	private String category;
	private String searchWord;
	private String searchMessage;

	public Map<String, Object> session;

	private ArrayList<ProductDTO> productList = new ArrayList<ProductDTO>();

	private ArrayList<ArrayList<ProductDTO>> list = new ArrayList<>();

	private List<Integer> pageList = new ArrayList<>();

	private int pageSelect;

	private int pageCount;

	public String execute() throws SQLException {

		ProductSearchDAO productSearchDAO = new ProductSearchDAO();

		ToKana toKana = new ToKana();

		productList = productSearchDAO.getItemInfo(searchWord, category);

		if (searchWord.matches("^[\\u30A0-\\u30FFー]+$")) {
			searchWord = toKana.toZenkakuHiragana(searchWord);
		}

		Pattern p = Pattern.compile("^[0-9a-zA-Z_\\p{InHiragana}\\p{InCjkUnifiedIdeographs}ー]*$");
		Matcher m = p.matcher(searchWord);

		boolean isFind = m.find();


				if (isFind) {

					if (productList.size() > 0) {

						int searchItemCount = productList.size();
						String count = Integer.toString(searchItemCount);
						this.searchMessage=count + "件の商品があります。";

					} else {
						this.searchMessage="検索結果がありません。";
					}

				} else{

					this.searchMessage="入力された文字が不正です。";
				}


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
		Iterator<ProductDTO> iterator = productList.iterator();
		if (!(iterator.hasNext())) {
			productList = null;
		}
		return SUCCESS;

}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSearchWord() {
		return searchWord;
	}

	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}

	public String getSearchMessage() {
		return searchMessage;
	}

	public void setSearchMessage(String searchMessage) {
		this.searchMessage = searchMessage;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
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

	public List<Integer> getPageList() {
		return pageList;
	}

	public void setPageList(List<Integer> pageList) {
		this.pageList = pageList;
	}

}