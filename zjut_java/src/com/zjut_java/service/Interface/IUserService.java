package com.zjut_java.service.Interface;

import com.zjut_java.dao.TbusersDAO;
import com.zjut_java.model.Tbusers;

public interface IUserService {

	/**
	 * ע��
	 * @param tbusers
	 * @return
	 */
	public boolean regist(Tbusers tbusers);
	
	/**
	 * ��¼
	 * @param name
	 * @param pwd
	 * @return
	 */
	public Tbusers login(String name,String pwd);
	
	/**
	 * �޸�����
	 * @param oldpwd
	 * @param newpwd
	 * @return
	 */
	public boolean changepwd(String userid,String oldpwd,String newpwd);
	
	/**
	 * �޸���Ϣ
	 * @param tbusers
	 * @return
	 */
	public boolean update(Tbusers tbusers);
	
}
