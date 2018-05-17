package com.internousdev.miamiburger.action;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class MasterAddAction extends ActionSupport implements SessionAware {
//session情報
	public Map<String, Object> session;
//情報を受け取る為の変数の定義（画像情報）
	private File userImage;
	private String userImageContentType;
	private String userImageFileName;
	public String execute() throws SQLException {

//ファイルアップロードの処理（userImageFileNameが空でない場合）
		if(!(userImageFileName == null)){
			String filePath = ServletActionContext.getServletContext().getRealPath("/").concat("img");
			System.out.println("Image Location:" + filePath);
			File fileToCreate = new File(filePath, userImageFileName);

			try {
				FileUtils.copyFile(userImage, fileToCreate);
				session.put("image_file_name", userImageFileName);
				session.put("image_file_path", userImageFileName);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

//result結果、SUCCESSを挿入する
		String result = SUCCESS;
		return result;
	}

//以下、getter/setter
	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public File getUserImage() {
		return userImage;
	}

	public void setUserImage(File userImage) {
		this.userImage = userImage;
	}

	public String getUserImageContentType() {
		return userImageContentType;
	}

	public void setUserImageContentType(String userImageContentType) {
		this.userImageContentType = userImageContentType;
	}

	public String getUserImageFileName() {
		return userImageFileName;
	}

	public void setUserImageFileName(String userImageFileName) {
		this.userImageFileName = userImageFileName;
	}


}
