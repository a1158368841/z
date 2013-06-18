/**
 * 
 */
package com.zjut_java.service.Impl;

import java.io.File;
import java.util.List;

import com.zjut_java.dao.TbpptDAO;
import com.zjut_java.model.Tbppt;
import com.zjut_java.model.Tbusers;
import com.zjut_java.service.Interface.IPPTService;




/**
 * create time2013-4-18ÏÂÎç12:56:27
 * @author czx
 *
 */
public class PPTServiceImpl implements IPPTService {

	private TbpptDAO tbpptDAO;
	public TbpptDAO getTbpptDAO() {
		return tbpptDAO;
	}

	public void setTbpptDAO(TbpptDAO tbpptDAO) {
		this.tbpptDAO = tbpptDAO;
	}

	
	
	@Override
	public void save(File file,Tbusers u,String section){
		Tbppt ppt = new Tbppt();
		ppt.setPptid(null);
		ppt.setCounts(0);
		ppt.setPptname(file.getName());
		ppt.setPptsize((int)file.length());
		ppt.setTbusers(u);
		ppt.setPptsection(section);
		tbpptDAO.save(ppt);
	}
	
	@Override
	public List<Tbppt> findAll(){
		List<Tbppt> list = tbpptDAO.findAll();
		return list;
	}
	
	@Override
	public List<Tbppt> findByExample(Tbppt tbppt){
		List<Tbppt> list = tbpptDAO.findByExample(tbppt);
		return list;
	}
}
