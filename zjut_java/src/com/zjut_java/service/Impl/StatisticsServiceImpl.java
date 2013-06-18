package com.zjut_java.service.Impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.zjut_java.charts.dao.CtcityavgDAO;
import com.zjut_java.charts.dao.CtdetailDAO;
import com.zjut_java.charts.dao.CtfunctionDAO;
import com.zjut_java.charts.dao.CtproavgDAO;
import com.zjut_java.charts.dao.CtquestionsDAO;
import com.zjut_java.charts.dao.CtunivavgDAO;
import com.zjut_java.charts.model.Ctcityavg;
import com.zjut_java.charts.model.Ctdetail;
import com.zjut_java.charts.model.Ctfunction;
import com.zjut_java.charts.model.Ctproavg;
import com.zjut_java.charts.model.Ctquestions;
import com.zjut_java.charts.model.Ctunivavg;
import com.zjut_java.dao.TbfunctionDAO;
import com.zjut_java.dao.TbuserhabitDAO;
import com.zjut_java.service.Interface.IStatisticsService;

public class StatisticsServiceImpl implements IStatisticsService,ServletRequestAware{

	private TbfunctionDAO tbfunctionDAO;
	private TbuserhabitDAO tbuserhabitDAO;
	private CtfunctionDAO ctfunctionDAO;
	private CtproavgDAO ctproavgDAO;
	private CtcityavgDAO ctcityavgDAO;
	private CtunivavgDAO ctunivavgDAO;
	private CtquestionsDAO ctquestionsDAO;
	private CtdetailDAO ctdetailDAO;
	
	private HttpServletRequest request;
	
	
	public HttpServletRequest getRequest() {
		return request;
	}
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
	public CtdetailDAO getCtdetailDAO() {
		return ctdetailDAO;
	}
	public void setCtdetailDAO(CtdetailDAO ctdetailDAO) {
		this.ctdetailDAO = ctdetailDAO;
	}
	public CtquestionsDAO getCtquestionsDAO() {
		return ctquestionsDAO;
	}
	public void setCtquestionsDAO(CtquestionsDAO ctquestionsDAO) {
		this.ctquestionsDAO = ctquestionsDAO;
	}
	
	public CtproavgDAO getCtproavgDAO() {
		return ctproavgDAO;
	}
	public void setCtproavgDAO(CtproavgDAO ctproavgDAO) {
		this.ctproavgDAO = ctproavgDAO;
	}
	public CtcityavgDAO getCtcityavgDAO() {
		return ctcityavgDAO;
	}
	public void setCtcityavgDAO(CtcityavgDAO ctcityavgDAO) {
		this.ctcityavgDAO = ctcityavgDAO;
	}
	public CtunivavgDAO getCtunivavgDAO() {
		return ctunivavgDAO;
	}
	public void setCtunivavgDAO(CtunivavgDAO ctunivavgDAO) {
		this.ctunivavgDAO = ctunivavgDAO;
	}
	public CtfunctionDAO getCtfunctionDAO() {
		return ctfunctionDAO;
	}
	public void setCtfunctionDAO(CtfunctionDAO ctfunctionDAO) {
		this.ctfunctionDAO = ctfunctionDAO;
	}
	public TbuserhabitDAO getTbuserhabitDAO() {
		return tbuserhabitDAO;
	}
	public void setTbuserhabitDAO(TbuserhabitDAO tbuserhabitDAO) {
		this.tbuserhabitDAO = tbuserhabitDAO;
	}
	public TbfunctionDAO getTbfunctionDAO() {
		return tbfunctionDAO;
	}
	public void setTbfunctionDAO(TbfunctionDAO tbfunctionDAO) {
		this.tbfunctionDAO = tbfunctionDAO;
	}
	
	@Override
	public boolean countByFunction() {
		// TODO Auto-generated method stub
		
		List<Ctfunction> list = new ArrayList<Ctfunction>();
		list = ctfunctionDAO.findAll();
		
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/plain");
		response.setCharacterEncoding("gb2312");
		try {
			PrintWriter pw =response.getWriter();
			//List<CtFunction> list= new ArrayList<CtFunction>();
			JSONArray array=new JSONArray();
			JSONObject member=null;
			
			for (Ctfunction ctfunction : list) {
				//list.add(ctFunction);
				
				member=new JSONObject();
				member.put("name",ctfunction.getId().getFunname() );
				
				JSONArray data = new JSONArray();
				data.put(ctfunction.getId().getCount1());
				data.put(ctfunction.getId().getCount2());
				data.put(ctfunction.getId().getCount3());
				data.put(ctfunction.getId().getCount4());
				data.put(ctfunction.getId().getCount5());
				data.put(ctfunction.getId().getCount6());
				data.put(ctfunction.getId().getCount7());
				data.put(ctfunction.getId().getCount8());
				data.put(ctfunction.getId().getCount9());
				data.put(ctfunction.getId().getCount10());
				data.put(ctfunction.getId().getCount11());
				data.put(ctfunction.getId().getCount12());
				data.put(ctfunction.getId().getCount13());
				data.put(ctfunction.getId().getCount14());
				data.put(ctfunction.getId().getCount15());
				data.put(ctfunction.getId().getCount16());
				data.put(ctfunction.getId().getCount17());
				data.put(ctfunction.getId().getCount18());
				data.put(ctfunction.getId().getCount19());
				data.put(ctfunction.getId().getCount20());
				data.put(ctfunction.getId().getCount21());
				data.put(ctfunction.getId().getCount22());
				data.put(ctfunction.getId().getCount23());
				data.put(ctfunction.getId().getCount24());
				member.put("data", data);
				array.put(member);
				
			}
		
			
			/*for (CtFunction ctFunction : list) {
				
				member=new JSONObject();
				member.put("name", ctFunction.getFunName());
				
				JSONArray data = new JSONArray();
				data.put(ctFunction.getCount());
				
				member.put("data", data);
				array.put(member);
				
			}*/
			String string=array.toString();
			System.out.println("sss---->"+string);
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
	@Override
	public boolean countByTime() {
		// TODO Auto-generated method stub
		List<Ctdetail> list = new ArrayList<Ctdetail>();
		list = ctdetailDAO.queryTime();
		
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/plain");
		response.setCharacterEncoding("gb2312");
		try {
			PrintWriter pw =response.getWriter();
			JSONArray array=new JSONArray();
			JSONObject member=null;
			for (Iterator iterator = list.iterator(); iterator.hasNext();) {
				Ctdetail ctdetail = (Ctdetail) iterator.next();
				member=new JSONObject();
				member.put("name",ctdetail.getTestid() );
				
				JSONArray data = new JSONArray();
				data.put(ctdetail.getUseTime());
				member.put("data", data);
				array.put(member);
			}		
			
			String string=array.toString();
			System.out.println("bytime-->"+string);
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
	
	@Override
	public boolean countByProvince() {
		// TODO Auto-generated method stub
		List<Ctproavg> list = new ArrayList<Ctproavg>();
		list=ctproavgDAO.findAll();
		
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/plain");
		response.setCharacterEncoding("gb2312");
		try {
			PrintWriter pw =response.getWriter();
			JSONArray array=new JSONArray();
			JSONObject member=null;
			
			for (Ctproavg ctproavg : list) {
				
				
				member=new JSONObject();
				member.put("name",ctproavg.getProvince() );
				
				JSONArray data = new JSONArray();
				data.put(ctproavg.getAvgscore());
				member.put("data", data);
				array.put(member);
				
			}
		
			
			
			String string=array.toString();
			System.out.println("sss---->"+string);
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
	@Override
	public boolean countByCity(String province) {
		List<Ctcityavg> list = new ArrayList<Ctcityavg>();
		//list=ctcityavgDAO.findAll();
		list=ctcityavgDAO.findByProvince("�㽭ʡ");
		//list=ctcityavgDAO.findByAvgscore(new Double(85.0000));
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/plain");
		response.setCharacterEncoding("gb2312");
		try {
			PrintWriter pw =response.getWriter();
			JSONArray array=new JSONArray();
			JSONObject member=null;
			
			for (Ctcityavg ctcityavg : list) {

				member=new JSONObject();
				member.put("name",ctcityavg.getCity() );
				
				JSONArray data = new JSONArray();
				data.put(ctcityavg.getAvgscore());
				member.put("data", data);
				array.put(member);
				
			}
			String string=array.toString();
			System.out.println("sss---->"+string);
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
	
	
	@Override
	public boolean countByUnivisity(String province, String city) {
		List<Ctunivavg> list = new ArrayList<Ctunivavg>();
//		list=ctcityavgDAO.findByProvince(province);
		list=ctunivavgDAO.findAll();
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/plain");
		response.setCharacterEncoding("gb2312");
		try {
			PrintWriter pw =response.getWriter();
			JSONArray array=new JSONArray();
			JSONObject member=null;
			
			for (Ctunivavg Ctunivavg : list) {
				
				
				member=new JSONObject();
				member.put("name",Ctunivavg.getCity() );
				
				JSONArray data = new JSONArray();
				data.put(Ctunivavg.getAvgscore());
				member.put("data", data);
				array.put(member);
				
			}
			String string=array.toString();
			System.out.println("sss---->"+string);
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
	@Override
	public boolean countByFunctionSum() {
		// TODO Auto-generated method stub
		List<Ctfunction> list = new ArrayList<Ctfunction>();
		list = ctfunctionDAO.findAll();
		
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/plain");
		response.setCharacterEncoding("gb2312");
		try {
			PrintWriter pw =response.getWriter();
			//List<CtFunction> list= new ArrayList<CtFunction>();
			JSONArray array=new JSONArray();
			JSONObject member=null;
			
			for (Ctfunction ctfunction : list) {
				//list.add(ctFunction);
				
				member=new JSONObject();
				member.put("name",ctfunction.getId().getFunname() );
				
				JSONArray data = new JSONArray();
				data.put(ctfunction.getId().getCount());
				member.put("data", data);
				array.put(member);
				
			}
			String string=array.toString();
			System.out.println("sss---->"+string);
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
	
	
	@Override
	public boolean countByQuestion1() {
		// TODO Auto-generated method stub
		boolean result = false;
		List<Ctquestions> list = new ArrayList<Ctquestions>();
		list = ctquestionsDAO.findByNum();
	
		
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/plain");
		response.setCharacterEncoding("gb2312");
		try {
			PrintWriter pw =response.getWriter();
			//List<CtFunction> list= new ArrayList<CtFunction>();
			JSONArray array=new JSONArray();
			JSONObject member=null;
			
			for (Ctquestions ctquestions : list) {
				//list.add(ctFunction);
				
				member=new JSONObject();
				member.put("name",ctquestions.getQuestionid());
				
				JSONArray data = new JSONArray();
				data.put(ctquestions.getWrongnum());
				member.put("data", data);
				array.put(member);
				
			}
			String string=array.toString();
			System.out.println("sss---->"+string);
			pw.print(string);
			
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public void detailByQuestion1(){
		
		List<Ctquestions> list = new ArrayList<Ctquestions>();
		list = ctquestionsDAO.findByNum();
		request.setAttribute("list", list);
	}
	
	@Override
	public boolean countByQuestion2() {
		// TODO Auto-generated method stub
		boolean result = false;
		List<Ctquestions> list = new ArrayList<Ctquestions>();
		list = ctquestionsDAO.findByRate();
		
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/plain");
		response.setCharacterEncoding("gb2312");
		try {
			PrintWriter pw =response.getWriter();
			//List<CtFunction> list= new ArrayList<CtFunction>();
			JSONArray array=new JSONArray();
			JSONObject member=null;
			
			for (Ctquestions ctquestions : list) {
				//list.add(ctFunction);
				
				member=new JSONObject();
				member.put("name",ctquestions.getQuestionid());
				
				JSONArray data = new JSONArray();
				data.put(ctquestions.getWrong());
				member.put("data", data);
				array.put(member);
				
			}
			String string=array.toString();
			System.out.println("sss---->"+string);
			pw.print(string);
			
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		request = arg0;
	}
	
	@Override
	public boolean countByQuestion1Tb() {
		// TODO Auto-generated method stub
		boolean result = false;
		List<Ctquestions> list = new ArrayList<Ctquestions>();
		list = ctquestionsDAO.findByNum();
		HttpServletRequest request = ServletActionContext.getRequest();
		
		request.setAttribute("tb", list);
		result =true;
		return result;
	}

	
	
	

}
