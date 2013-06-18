package com.zjut_java.service.Interface;

import java.io.File;
import java.util.List;

import com.zjut_java.model.Tbppt;
import com.zjut_java.model.Tbusers;

public interface IPPTService {

	public abstract void save(File file,Tbusers tbusers,String section);
	
	public abstract List<Tbppt> findAll();
	
	public abstract List<Tbppt> findByExample(Tbppt tbppt);

}