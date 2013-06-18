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
	 * 注册
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
	 * 用户登录
	 * @return
	 */
	public String login(){
		
		int vercode = Integer.parseInt(request.getParameter("vercode"));
		int num = Integer.parseInt((String)session.getAttribute("numrand"));
		if (vercode != num) {
			super.addActionMessage("验证码错误");
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
		super.addActionMessage("用户名或密码错误");
		return "login";

	}
	
	
	/**
	 * 管理员登录
	 * @return
	 */
	public String admin_login(){
		
		int vercode = Integer.parseInt(request.getParameter("vercode"));
		int num = Integer.parseInt((String)session.getAttribute("numrand"));
		if (vercode != num) {
			super.addActionMessage("验证码错误");
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
		super.addActionMessage("用户名或密码错误");
		return "fail";

	}
	
	
	
	
	public String changepwdlink(){
		return "changepwd";
	}
	
	/**
	 * 修改密码
	 * @return
	 */
	public String changepwd(){
		String userid = ((Tbusers)session.getAttribute("user")).getUserId();
		String oldpwd = request.getParameter("oldpwd");
		String newpwd = request.getParameter("newpwd");
		if(userServiceImpl.changepwd(userid,oldpwd, newpwd)){
			this.addActionMessage("密码修改成功");
		}else{
			this.addActionMessage("密码修改失败");
		}
		
		return "changepwd";
		
	}
	
	
	public String updatelink(){
		return "update";
	}
	
	/**
	 * 修改个人信息
	 * @return
	 */
	public String update(){
		
		if(userServiceImpl.update(tbusers)){
			this.addActionMessage("密码修改成功");
		}else{
			this.addActionMessage("密码修改失败");
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
