package com.zjut_java.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;



import com.opensymphony.xwork2.ActionSupport;
import com.zjut_java.charts.model.Ctfunction;
import com.zjut_java.model.Tbfunction;
import com.zjut_java.model.Tbuserhabit;
import com.zjut_java.service.Impl.StatisticsServiceImpl;

/**
 * 数据统计 create time2013-4-28下午2:02:13
 * 
 * @author czx
 * 
 */
public class StatisticsAction extends ActionSupport{

	private StatisticsServiceImpl statisticsServiceImpl;

	public StatisticsServiceImpl getStatisticsServiceImpl() {
		return statisticsServiceImpl;
	}

	public void setStatisticsServiceImpl(
			StatisticsServiceImpl statisticsServiceImpl) {
		this.statisticsServiceImpl = statisticsServiceImpl;
	}

	
	/*public String countByProvince(){
		detailList = statisticsServiceImpl.countByProvince();
		for (Tbdetail tbdetail : detailList) {
			System.out.println(tbdetail.toString());
		}
		return "list";
	}*/

	public void countByProvince(){
		statisticsServiceImpl.countByProvince();

	}
	
	public void countByCity(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String province=null;
		try {
			province = URLDecoder.decode(request.getParameter("province"),"utf-8");
			
			System.out.println("province--->"+province);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(province);
		
		statisticsServiceImpl.countByCity(province);
	}
	
	public void countByUnivisity(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String province=null;
		String city=null;
		try {
			province = URLDecoder.decode(request.getParameter("province"),"utf-8");
			city=URLDecoder.decode(request.getParameter("city"),"utf-8");
			System.out.println("province--->"+province);
			System.out.println("city--->"+city);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		statisticsServiceImpl.countByUnivisity(province, city);
	}
	
	
	public void countByFunction(){
		statisticsServiceImpl.countByFunction();
		
	}
	
	public void countByFunctionSum(){
		statisticsServiceImpl.countByFunctionSum();
		
	}

	public void countByQuestion1(){
		statisticsServiceImpl.countByQuestion1();
	}
	
	public String countByQuestion1Tb(){
		statisticsServiceImpl.countByQuestion1Tb();
		return "success";
	}
	
	public void countByQuestion2(){
		statisticsServiceImpl.countByQuestion2();
	}
	
	public void countByTime(){
		statisticsServiceImpl.countByTime();
	}
	
	public String detailByQuestion1(){
		statisticsServiceImpl.detailByQuestion1();
		return "library";
	}
	

}
