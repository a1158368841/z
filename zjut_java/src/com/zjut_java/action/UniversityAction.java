package com.zjut_java.action;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.zjut_java.model.Tbuniversity;
import com.zjut_java.service.Impl.UniversityServiceImpl;

public class UniversityAction extends ActionSupport implements ServletRequestAware{

	private Tbuniversity tbuniversity;
	private UniversityServiceImpl universityServiceImpl;
	private HttpServletRequest request = null;
	

	public UniversityServiceImpl getUniversityServiceImpl() {
		return universityServiceImpl;
	}

	public void setUniversityServiceImpl(UniversityServiceImpl universityServiceImpl) {
		this.universityServiceImpl = universityServiceImpl;
	}
	
	
	
	public Tbuniversity getTbuniversity() {
		return tbuniversity;
	}

	public void setTbuniversity(Tbuniversity tbuniversity) {
		this.tbuniversity = tbuniversity;
	}

	public void findProvinces(){
		universityServiceImpl.findProvinces();
	}
	
	public String regist(){
		if(universityServiceImpl.add(tbuniversity)){
			this.addActionMessage("添加成功");
		}else{
			this.addActionMessage("添加失败");
		}
		return "update";
	}
	
	public String findAll(){
		List<Tbuniversity> list =  universityServiceImpl.findAll();
		if (list.size() > 0) {
			request.setAttribute("list", list);
		}else{
			this.addActionMessage("未找到符合条件的结果");
		}
		return "find";
	}
	
	public String findByExample(){
		List<Tbuniversity> list =  universityServiceImpl.findByExample(tbuniversity);
		if (list.size() > 0) {
			request.setAttribute("list", list);
		}else{
			this.addActionMessage("未找到符合条件的结果");
		}
		return "find";
	}
	
	public String viewFind(){
		return "viewFind";
	}
	
	public String viewUpdate(){
		return "viewUpdate";
	}
	
	public String viewRegist(){
		return "viewRegist";
	}
	
	public String update(){
		if(universityServiceImpl.update(tbuniversity))
		{
			this.addActionMessage("修改成功");
		}else{
			this.addActionMessage("修改失败");
		}
		return "update";
	}
	
	public void findCities(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String province=null;
		try {
			province  = URLDecoder.decode(request.getParameter("province"),"utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(province);
		universityServiceImpl.findCities(province);
	}
	
	public void findUnivs(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String province =null;
		String city = null;
		try {
			province =URLDecoder.decode(request.getParameter("province"),"utf-8");
			city = URLDecoder.decode(request.getParameter("city"),"utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		universityServiceImpl.findUnivs(province, city);
	}

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		request = arg0;
	}
	
}
