package com.zjut_java.service.Interface;

import com.zjut_java.dao.TbusersDAO;
import com.zjut_java.model.Tbusers;

public interface IUserService {

	/**
	 * ×¢²á
	 * @param tbusers
	 * @return
	 */
	public boolean regist(Tbusers tbusers);
	
	/**
	 * µÇÂ¼
	 * @param name
	 * @param pwd
	 * @return
	 */
	public Tbusers login(String name,String pwd);
	
	/**
	 * ĞŞ¸ÄÃÜÂë
	 * @param oldpwd
	 * @param newpwd
	 * @return
	 */
	public boolean changepwd(String userid,String oldpwd,String newpwd);
	
	/**
	 * ĞŞ¸ÄĞÅÏ¢
	 * @param tbusers
	 * @return
	 */
	public boolean update(Tbusers tbusers);
	
}
