package com.zjut_java.service.Impl;

import java.util.List;

import com.zjut_java.dao.TbtestDAO;
import com.zjut_java.dao.TbtestdetailsDAO;
import com.zjut_java.dao.TbtestlibraryDAO;
import com.zjut_java.model.Tbtestdetails;
import com.zjut_java.model.Tbtestlibrary;

public class TestServiceImpl {
	
	TbtestlibraryDAO tbtestlibraryDAO;
	
	TbtestdetailsDAO tbtestdetailsDAO;
	
	TbtestDAO tbtestDAO;
	
	public TbtestlibraryDAO getTbtestlibraryDAO() {
		return tbtestlibraryDAO;
	}
	public void setTbtestlibraryDAO(TbtestlibraryDAO tbtestlibraryDAO) {
		this.tbtestlibraryDAO = tbtestlibraryDAO;
	}
	
	public TbtestdetailsDAO getTbtestdetailsDAO() {
		return tbtestdetailsDAO;
	}
	public void setTbtestdetailsDAO(TbtestdetailsDAO tbtestdetailsDAO) {
		this.tbtestdetailsDAO = tbtestdetailsDAO;
	}
	
	public TbtestDAO getTbtestDAO() {
		return tbtestDAO;
	}
	public void setTbtestDAO(TbtestDAO tbtestDAO) {
		this.tbtestDAO = tbtestDAO;
	}
	
	//*��������*//
	public boolean addQuestion(Tbtestlibrary tbtestlibrary){
		boolean result= false;
		if(tbtestlibraryDAO.save(tbtestlibrary)){
			result =true;
		}
		return result;
	}
	
	//*�޸�����*//
	public boolean updateQuestion(Tbtestlibrary tbtestlibrary){
		boolean result= false;
		if(tbtestlibraryDAO.update(tbtestlibrary)){
			result =true;
		}
		return result;
	}
	
	//*ɾ������*//
	public boolean deleteQuestion(Tbtestlibrary tbtestlibrary){
		boolean result= false;
		if(tbtestlibraryDAO.delete(tbtestlibrary)){
			result =true;
		}
		return result;
	}
	
	//*������Ŀ���ͺ������������*//
	public List<Tbtestlibrary> findTestByTestAndNum(String type,int num){
		List<Tbtestlibrary> list = tbtestlibraryDAO.findByTypeAndNum(type, num);
		return list;
	}

	public boolean saveTbtestdetails(Tbtestdetails tbtestdetails){
		if(tbtestdetailsDAO.save(tbtestdetails))
			return true;
		else
			return false;
	}
	
	
}
