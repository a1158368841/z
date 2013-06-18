package com.zjut_java.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.zjut_java.model.Tbtestlibrary;
import com.zjut_java.service.Impl.TestServiceImpl;

public class TestlibraryAction extends ActionSupport implements ServletRequestAware{

	private Tbtestlibrary tbtestlibrary;
	private TestServiceImpl testServiceImpl;
	private HttpServletRequest request;
	
	
	public Tbtestlibrary getTbtestlibrary() {
		return tbtestlibrary;
	}


	public void setTbtestlibrary(Tbtestlibrary tbtestlibrary) {
		this.tbtestlibrary = tbtestlibrary;
	}


	public TestServiceImpl getTestServiceImpl() {
		return testServiceImpl;
	}


	public void setTestServiceImpl(TestServiceImpl testServiceImpl) {
		this.testServiceImpl = testServiceImpl;
	}
	
	public String regist(){
		if(testServiceImpl.addQuestion(tbtestlibrary)){
			this.addActionMessage("添加成功");
		}else{
			this.addActionMessage("添加失败");
		}
		return "regist";
	}
	
	public String findByExample(){
		return "find";
	}
	
	public String update(){
		return "update";
	}
	
	public String viewRegist(){
		return "viewRegist";
	}
	
	public String viewFind(){
		return "find";
	}
	
	public String viewUpdate(){
		return "update";
	}


	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		request = arg0;
	}
}
