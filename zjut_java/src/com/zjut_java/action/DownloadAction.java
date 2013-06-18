package com.zjut_java.action;
/**
 * 
 */


import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/**
 * create time2013-4-18ÏÂÎç7:17:05
 * @author czx
 *
 */
public class DownloadAction extends ActionSupport{

	private String fileName;
	private InputStream inputStream;
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public InputStream getInputStream() {
		return ServletActionContext.getServletContext().getResourceAsStream("/upload/"+fileName);
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	/**
	 * 
	 */

	public String execute(){
		System.out.println("filename--->"+fileName);
		return "success";
	}

}
