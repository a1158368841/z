package com.zjut_java.action;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.zjut_java.model.Tbusers;
import com.zjut_java.service.Impl.UserServiceImpl;
import com.zjut_java.service.Interface.IUserService;

public class UserAction extends ActionSupport implements ServletRequestAware{

	private Tbusers tbusers;
	private UserServiceImpl userServiceImpl;
	private HttpServletRequest request;
	private HttpSession session;


	public Tbusers getTbusers() {
		return tbusers;
	}

	public void setTbusers(Tbusers tbusers) {
		this.tbusers = tbusers;
	}

	public UserServiceImpl getUserServiceImpl() {
		return userServiceImpl;
	}

	public void setUserServiceImpl(UserServiceImpl userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}
	
	public String view(){
		return "view";
	}

	/**
	 * ע��
	 * @return
	 */
	public String regist(){	
		if(userServiceImpl.regist(tbusers)){
			return "login";
		}else{
			return "regist";
		}
		
	}
	
	/**
	 * �û���¼
	 * @return
	 */
	public String login(){
		
		int vercode = Integer.parseInt(request.getParameter("vercode"));
		int num = Integer.parseInt((String)session.getAttribute("numrand"));
		if (vercode != num) {
			super.addActionMessage("��֤�����");
			return "login";
		}
		Tbusers user = new Tbusers();
		user=userServiceImpl.login(tbusers.getUserId(),tbusers.getPwd());
		if(user != null){
			if("0".equals(user.getUserType())){
				session.setAttribute("user", user);
				return "normal";
			}
			
		}
		super.addActionMessage("�û������������");
		return "login";

	}
	
	
	/**
	 * ����Ա��¼
	 * @return
	 */
	public String admin_login(){
		
		int vercode = Integer.parseInt(request.getParameter("vercode"));
		int num = Integer.parseInt((String)session.getAttribute("numrand"));
		if (vercode != num) {
			super.addActionMessage("��֤�����");
			return "fail";
		}
		Tbusers user = new Tbusers();
		user=userServiceImpl.login(tbusers.getUserId(),tbusers.getPwd());
		if(user != null){
			if ("1".equals(user.getUserType())) {
				session.setAttribute("admin", user);
				return "admin";
			}
		}
		super.addActionMessage("�û������������");
		return "fail";

	}
	
	
	
	
	public String changepwdlink(){
		return "changepwd";
	}
	
	/**
	 * �޸�����
	 * @return
	 */
	public String changepwd(){
		String userid = ((Tbusers)session.getAttribute("user")).getUserId();
		String oldpwd = request.getParameter("oldpwd");
		String newpwd = request.getParameter("newpwd");
		if(userServiceImpl.changepwd(userid,oldpwd, newpwd)){
			this.addActionMessage("�����޸ĳɹ�");
		}else{
			this.addActionMessage("�����޸�ʧ��");
		}
		
		return "changepwd";
		
	}
	
	
	public String updatelink(){
		return "update";
	}
	
	/**
	 * �޸ĸ�����Ϣ
	 * @return
	 */
	public String update(){
		
		if(userServiceImpl.update(tbusers)){
			this.addActionMessage("�����޸ĳɹ�");
		}else{
			this.addActionMessage("�����޸�ʧ��");
		}
		
		return "update";
		
	}


	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		request = arg0;
		session = request.getSession();
	}


	
}
