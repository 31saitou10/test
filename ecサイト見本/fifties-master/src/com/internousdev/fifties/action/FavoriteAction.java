/*/*
 * 作成　中嶋
 *
 */
package com.internousdev.fifties.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.fifties.dao.FavoriteDAO;
import com.internousdev.fifties.dto.ProductDTO;
import com.internousdev.fifties.util.PageNation;
import com.opensymphony.xwork2.ActionSupport;

public class FavoriteAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;
	private int productId;
	private String userId;
	private boolean loginFlg;
	private String createFlg = null;
	//削除機能
	private String deleteFlg;
	private Collection<String> deleteList;
	private String favoriteMessage;
	private String deleteMessage;
	FavoriteDAO favoriteDAO = new FavoriteDAO();
	private List<ProductDTO> allFavoriteList = new ArrayList<>();
	private List<ProductDTO> favoriteList = new ArrayList<>();
	private List<Integer> pageList = new ArrayList<>();
	private int pageSelect;
	private ArrayList<ArrayList<ProductDTO>> mainList = new ArrayList<>();

	public String execute() throws SQLException {
		String result = ERROR;
		loginFlg = (boolean) session.get("loginFlg");

		// ログインしているかの判別
		if (loginFlg == false) {
			return LOGIN;
		} else {

			// -----------------------お気に入り削除機能-----------------------------//
			// コードはほぼほぼDeleteFavoriteActionから引っ張ってきたものです。
			// また、これにあたり下記のフィールドを追加しました。
			// String deleteFlg
			// String deleteMessage;
			// Collection<Integer> deleteList
			// String deleteFlg
			// ご確認&必要があれば編集をお願いします！

			int deleteCount = 0;
			if (deleteFlg != null) {
				if (deleteList == null) {
					setDeleteMessage("削除したい商品にチェックをつけてください");
					result = SUCCESS;
				} else {
					userId = session.get("userId").toString();

					// お気に入りの削除、その後削除件数の確認
					deleteCount = favoriteDAO.deleteFavorite_info(userId, deleteList);

					if (deleteCount == 0) {
						setDeleteMessage("削除したい商品にチェックをつけてください");
						result = SUCCESS;

					} else {
						setDeleteMessage(deleteCount + "件のお気に入りを削除しました。");
						result = SUCCESS;
					}
				}
			} else {
				result = SUCCESS;
			}

			// ------------------------ここまで----------------------------//
			if (createFlg != null) {
				create();
			}

			// 登録されている件数によってメッセージを変更
			userId = session.get("userId").toString();
			setAllFavoriteList(favoriteDAO.getFavorite_Info(userId, productId));
			if (allFavoriteList.size() == 0) {
				setFavoriteMessage("お気に入りに商品が登録されていません");
			} else {
				int favoriteCount = allFavoriteList.size();
				String Count = Integer.toString(favoriteCount);
				setFavoriteMessage(Count + "件のお気に入りがあります");
			}

		}
		// ４個ずつに形を変更
		PageNation change = new PageNation();
		mainList = change.pageCange(allFavoriteList);

		for (int i = 0; i < mainList.size(); i++) {
			pageList.add(i + 1);
		}
		for (int i = 0; i < mainList.size(); i++) {
			if (i == pageSelect) {
				favoriteList = mainList.get(i);
				break;
			}
		}

		// リスト化したお気に入りを表示
		Iterator<ProductDTO> iterator = favoriteList.iterator();
		if (!(iterator.hasNext())) {
			favoriteList = null;
		}

		return result;
	}

	/*-------------------------------*/
	public void create() throws SQLException {
		int createCount = 0;
		userId = session.get("userId").toString();
		createCount = favoriteDAO.checkFavorite_info(userId, productId);

		if (createCount > 0) {
			setDeleteMessage("お気に入り登録されています");


		} else {
			favoriteDAO.insertFavorite_info(userId, productId);
			setDeleteMessage("お気に入り登録しました");


		}
	}



	/*--------------------------------------- */
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<ProductDTO> getFavoriteList() {
		return favoriteList;
	}

	public void setFavoriteList(List<ProductDTO> favoriteList) {
		this.favoriteList = favoriteList;
	}

	public boolean isLoginFlg() {
		return loginFlg;
	}

	public void setLoginFlg(boolean loginFlg) {
		this.loginFlg = loginFlg;
	}

	public String getFavoriteMessage() {
		return favoriteMessage;
	}

	public void setFavoriteMessage(String favoriteMessage) {
		this.favoriteMessage = favoriteMessage;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;

	}

	public ArrayList<ArrayList<ProductDTO>> getMainList() {
		return mainList;
	}

	public void setMainList(ArrayList<ArrayList<ProductDTO>> mainList) {
		this.mainList = mainList;
	}

	public List<Integer> getPageList() {
		return pageList;
	}

	public void setPageList(List<Integer> pageList) {
		this.pageList = pageList;
	}

	public int getPageSelect() {
		return pageSelect;
	}

	public void setPageSelect(int pageSelect) {
		this.pageSelect = pageSelect;
	}

	public List<ProductDTO> getAllFavoriteList() {
		return allFavoriteList;
	}

	public void setAllFavoriteList(List<ProductDTO> allFavoriteList) {
		this.allFavoriteList = allFavoriteList;
	}

	public Collection<String> getDeleteList() {
		return deleteList;
	}

	public void setDeleteList(Collection<String> deleteList) {
		this.deleteList = deleteList;
	}

	public String getDeleteMessage() {
		return deleteMessage;
	}

	public void setDeleteMessage(String deleteMessage) {
		this.deleteMessage = deleteMessage;
	}

	public String getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

	public String getCreateFlg() {
		return createFlg;
	}

	public void setCreateFlg(String createFlg) {
		this.createFlg = createFlg;
	}

}
