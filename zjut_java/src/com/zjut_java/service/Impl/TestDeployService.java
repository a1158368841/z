package com.zjut_java.service.Impl;

import com.zjut_java.dao.TbtestdeployDAO;
import com.zjut_java.model.Tbtestdeploy;
import com.zjut_java.model.TbtestdeployId;

public class TestDeployService {

	TbtestdeployDAO deployDAO;
	public TbtestdeployDAO getDeployDAO() {
		return deployDAO;
	}
	public void setDeployDAO(TbtestdeployDAO deployDAO) {
		this.deployDAO = deployDAO;
	}
	public void add(){
		TbtestdeployId id= new TbtestdeployId();
		id.setAmount(100);
		Tbtestdeploy d = new Tbtestdeploy();
		d.setId(id);
		System.out.println(d);
		deployDAO.save(d);
	}
}
