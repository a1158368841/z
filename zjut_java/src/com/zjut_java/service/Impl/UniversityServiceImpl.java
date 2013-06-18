package com.zjut_java.service.Impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.zjut_java.charts.model.Ctdetail;
import com.zjut_java.dao.TbuniversityDAO;
import com.zjut_java.model.Tbuniversity;
import com.zjut_java.service.Interface.IUniversityService;

public class UniversityServiceImpl implements IUniversityService{

	private TbuniversityDAO tbuniversityDAO;
	
	public TbuniversityDAO getTbuniversityDAO() {
		return tbuniversityDAO;
	}

	public void setTbuniversityDAO(TbuniversityDAO tbuniversityDAO) {
		this.tbuniversityDAO = tbuniversityDAO;
	}

	@Override
	public boolean add(Tbuniversity tbuniversity) {
		// TODO Auto-generated method stub
		boolean result= false;
		if(tbuniversityDAO.save(tbuniversity)){
			result =true;
		}
		return result;
	}

	@Override
	public boolean update(Tbuniversity tbuniversity) {
		// TODO Auto-generated method stub
		boolean result= false;
		if(tbuniversityDAO.update(tbuniversity)){
			result =true;
		}
		return result;
	}

	@Override
	public boolean delete(Tbuniversity tbuniversity) {
		// TODO Auto-generated method stub
		boolean result= false;
		if(tbuniversityDAO.delete(tbuniversity)){
			result =true;
		}
		return result;
	}
	
	public List<Tbuniversity> findAll(){
		List<Tbuniversity> list = tbuniversityDAO.findAll();
		return list;
	}
	
	public List<Tbuniversity> findByExample(Tbuniversity tbuniversity){
		List<Tbuniversity> list = tbuniversityDAO.findByExample(tbuniversity);
		return list;
	}
	
	public boolean findProvinces(){
		
		List<String> list = new ArrayList<String>();
		list = tbuniversityDAO.findProvinces();
		
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/plain");
		response.setCharacterEncoding("gb2312");
		try {
			PrintWriter pw =response.getWriter();
			JSONArray array = new JSONArray();
			JSONObject member=null;
			for (String string : list) {
				member = new JSONObject();
				member.put("province",string);
				array.put(member);
			}
			
			String string=array.toString();
			System.out.println(string);
			pw.print(string);			
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	
	public boolean findCities(String province){
		List<String> list = new ArrayList<String>();
		list = tbuniversityDAO.findCities(province);
		
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/plain");
		response.setCharacterEncoding("gb2312");
		try {
			PrintWriter pw =response.getWriter();
			JSONArray array = new JSONArray();
			JSONObject member=null;
			for (String string : list) {
				member = new JSONObject();
				member.put("city",string);
				array.put(member);
			}
			
			String string=array.toString();
			System.out.println(string);
			pw.print(string);			
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	
	public boolean findUnivs(String province,String city){
		List<Tbuniversity> list = new ArrayList<Tbuniversity>();
		list = tbuniversityDAO.findUnivs(province, city);
		
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/plain");
		response.setCharacterEncoding("gb2312");
		try {
			PrintWriter pw =response.getWriter();
			JSONArray array = new JSONArray();
			JSONObject member=null;
			for (Iterator iterator = list.iterator(); iterator.hasNext();) {
				Tbuniversity tbuniversity = (Tbuniversity) iterator.next();
				member = new JSONObject();
				member.put("univ",tbuniversity.getUnivName());
				member.put("value",tbuniversity.getUnivId());
				array.put(member);
			}

	
			String string=array.toString();
			System.out.println(string);
			pw.print(string);			
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

}
