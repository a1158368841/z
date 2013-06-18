package com.zjut_java.service.Impl;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.zjut_java.dao.TbusersDAO;
import com.zjut_java.model.Tbusers;
import com.zjut_java.service.Interface.IUserService;
import com.zjut_java.util.MD5;

public class UserServiceImpl implements IUserService{

	private TbusersDAO tbusersDAO;
	public TbusersDAO getTbusersDAO() {
		return tbusersDAO;
	}

	public void setTbusersDAO(TbusersDAO tbusersDAO) {
		this.tbusersDAO = tbusersDAO;
	}

	@Override
	public boolean regist(Tbusers tbusers) {
		// TODO Auto-generated method stub
		boolean result =false;
		HttpServletRequest request = ServletActionContext.getRequest();

		//取当前时间
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		tbusers.setRegTime(Timestamp.valueOf(sdf.format(date)));
		
		//设置登录次数为0
		tbusers.setLogonCount(0);
		
		tbusers.setPwd(MD5.md5(tbusers.getPwd()));
		
		System.out.println(tbusers.getUserId());
		result =tbusersDAO.save(tbusers);
		return result;
	}

	@Override
	public Tbusers login(String userid, String pwd) {
		// TODO Auto-generated method stub
		Tbusers user=tbusersDAO.check(userid,MD5.md5(pwd));
		HttpServletRequest request= ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		if(user!=null){
			tbusersDAO.incLogonCount(userid);
			return user;
		}
		
		return null;
	}

	@Override
	public boolean changepwd(String userid,String oldpwd,String newpwd) {
		// TODO Auto-generated method stub
		boolean result = false;
		result = tbusersDAO.changepwd(userid, MD5.md5(oldpwd),MD5.md5(newpwd));
		System.out.println("修改密码:"+result);
		return result;
	}

	@Override
	public boolean update(Tbusers tbusers) {
		// TODO Auto-generated method stub
		return tbusersDAO.update(tbusers);
	}

}
