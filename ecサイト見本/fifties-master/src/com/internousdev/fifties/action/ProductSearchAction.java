//作成　中嶋
package com.internousdev.fifties.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.fifties.dao.ProductSearchDAO;
import com.internousdev.fifties.dto.ProductDTO;
import com.internousdev.fifties.util.InputChecker;
import com.internousdev.fifties.util.PageNation;
import com.opensymphony.xwork2.ActionSupport;

public class ProductSearchAction extends ActionSupport implements SessionAware {
	private String category = "0";
	private String searchWord = "";
	private String searchMessage = null;
	private String searchErrorMessage = null;

	public Map<String, Object> session;

	// 検索結果の詳細をリストに格納
	private ProductSearchDAO searchDAO = new ProductSearchDAO();
	private List<ProductDTO> allSearchList = new ArrayList<ProductDTO>();
	private List<ProductDTO> searchList = new ArrayList<ProductDTO>();
	// 検索結果を１ページに９個格納する箱
	private ArrayList<ArrayList<ProductDTO>> mainList = new ArrayList<>();
	private int pageSelect;
	private int pageCount;
	private List<String> searchWordList = new ArrayList<>();
	private List<Integer> pageList = new ArrayList<>();

	public String execute() throws SQLException {

		if (!(searchWord.equals(""))) {
			String check;
			InputChecker wordchk = new InputChecker();
			check = wordchk.keywordChk(searchWord);
			setSearchErrorMessage(check);
		}
		/*
		 * if (!(searchWord.length() <= 16)) {
		 * setSearchMessage("検索ワードは16文字以内で入力してください。"); return SUCCESS; }
		 */

		// 複数検索
		searchWord = searchWord.replaceAll("　", " ");
		setSearchWordList(Arrays.asList(searchWord.split(" ")));
		setAllSearchList(searchDAO.getProduct_Info(searchWordList, category));
		// 検索Ｈｉｔ件数
		if (allSearchList.size() > 0) {
			int searchItemCount = allSearchList.size();
			String Count = Integer.toString(searchItemCount);
			setSearchMessage(Count + "件の商品があります");

		} else {
			setSearchMessage("検索結果がありません。");
		}

		// productListを9個づつ格納
		PageNation change = new PageNation();
		mainList = change.pageNation(allSearchList);

		for (int i = 0; i < mainList.size(); i++) {
			pageList.add(i + 1);
		}
		for (int i = 0; i < mainList.size(); i++) {
			if (i == pageSelect) {
				searchList = mainList.get(i);
				break;
			}
		}

		Iterator<ProductDTO> iterator = searchList.iterator();
		if (!(iterator.hasNext())) {
			searchList = null;
		}
		return SUCCESS;
	}

	// あとで追加
	// 検索ワードを検索後もインプットBOXに出力
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

	public ProductSearchDAO getSearchDAO() {
		return searchDAO;
	}

	public void setSearchDAO(ProductSearchDAO searchDAO) {
		this.searchDAO = searchDAO;
	}

	public List<ProductDTO> getSearchList() {
		return searchList;
	}

	public void setSearchList(List<ProductDTO> searchList) {
		this.searchList = searchList;
	}

	public ArrayList<ArrayList<ProductDTO>> getMainList() {
		return mainList;
	}

	public void setTrueList(ArrayList<ArrayList<ProductDTO>> mainList) {
		this.mainList = mainList;
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

	public List<String> getSearchWordList() {
		return searchWordList;
	}

	public void setSearchWordList(List<String> searchWordList) {
		this.searchWordList = searchWordList;
	}

	public List<ProductDTO> getAllSearchList() {
		return allSearchList;
	}

	public void setAllSearchList(List<ProductDTO> allSearchList) {
		this.allSearchList = allSearchList;
	}

	public void setMainList(ArrayList<ArrayList<ProductDTO>> mainList) {
		this.mainList = mainList;
	}

	public String getSearchErrorMessage() {
		return searchErrorMessage;
	}

	public void setSearchErrorMessage(String searchErrorMessage) {
		this.searchErrorMessage = searchErrorMessage;
	}

}
