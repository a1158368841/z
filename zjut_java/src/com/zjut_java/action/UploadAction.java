package com.zjut_java.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zjut_java.model.Tbppt;
import com.zjut_java.model.Tbusers;
import com.zjut_java.service.Interface.IPPTService;

public class UploadAction extends ActionSupport {
	
	private IPPTService pptService;
	private Tbppt tbPPT;
	

	public IPPTService getPptService() {
		return pptService;
	}

	public void setPptService(IPPTService pptService) {
		this.pptService = pptService;
	}

	public Tbppt getTbPPT() {
		return tbPPT;
	}

	public void setTbPPT(Tbppt tbPPT) {
		this.tbPPT = tbPPT;
	}

	private HttpServletRequest request = null;

	private String title;
	private File upload;
	private String uploadContentType;
	private String uploadFileName;
	private String allowTypes;
	// 接受依赖注入的属性
	private String savePath;
	private Tbusers user;
	private String section;
	
	// 接受依赖注入的方法
	public void setSavePath(String value) {
		this.savePath = value;
	}

	private String getSavePath() throws Exception {
		return ServletActionContext.getServletContext().getRealPath(savePath);
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String getTitle() {
		return (this.title);
	}

	public File getUpload() {
		return (this.upload);
	}

	public String getUploadContentType() {
		return (this.uploadContentType);
	}

	public String getUploadFileName() {
		return (this.uploadFileName);
	}

	public String uploadPpt() throws Exception {

		// 判断是否允许上传
		String filterResult = filterType(this.getAllowTypes().split(","));
		if (filterResult != null) {
			ActionContext.getContext().put("typeError", "您要上传的文件类型不正确");
			return filterResult;
		}
		// 以服务器的文件保存地址和原文件名建立上传文件输出流
		FileOutputStream fos = new FileOutputStream(getSavePath() + "\\"
				+ getUploadFileName());
		FileInputStream fis = new FileInputStream(getUpload());
		byte[] buffer = new byte[1024];
		int len = 0;
		while ((len = fis.read(buffer)) > 0) {
			fos.write(buffer, 0, len);
		}
		System.out.println(upload.getName());
		
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		user=(Tbusers)session.getAttribute("user");
		section = request.getParameter("section");
		pptService.save(upload,user,section);
		return SUCCESS;
	}

	public String finderAll(){
		List<Tbppt> list = pptService.findAll();
		if (list.size() > 0) {
			request.setAttribute("list", list);
			System.out.print(list.get(0).getPptid());
			return "success";
		}
		return "fail";
	}
	
	public String finderByExample(){
		List<Tbppt> list = pptService.findByExample(tbPPT);
		if (list.size() > 0) {
			request.setAttribute("list", list);
			System.out.print(list.get(0).getPptid());
			return "success";
		}
		return "fail";
	}

	public String filterType(String[] types) {
		String fileType = this.getUploadContentType();
		System.out.println(fileType);
		for (String type : types) {
			if (type.equals(fileType)) {
				return null;
			}
		}
		return INPUT;
	}

	public String getAllowTypes() {
		return allowTypes;
	}

	public void setAllowTypes(String allowTypes) {
		this.allowTypes = allowTypes;
	}
}