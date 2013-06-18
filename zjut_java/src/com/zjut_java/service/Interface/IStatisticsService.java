package com.zjut_java.service.Interface;

import java.util.List;
import java.util.Map;

import com.zjut_java.charts.dao.CtfunctionDAO;
import com.zjut_java.charts.model.Ctcityavg;
import com.zjut_java.charts.model.Ctdetail;
import com.zjut_java.charts.model.Ctfunction;
import com.zjut_java.charts.model.Ctproavg;
import com.zjut_java.charts.model.Ctunivavg;

import com.zjut_java.model.Tbfunction;
import com.zjut_java.model.Tbuserhabit;

public interface IStatisticsService {

	/**
	 * 各个模块各时段点击率
	 * @return
	 */
	public boolean countByFunction();
	
	/**
	 * 各个模块总点击率
	 * @return
	 */
	public boolean countByFunctionSum();
	/**
	 * 测试用时分布
	 * @return 每次测试用时秒数
	 */
	public boolean countByTime();
	
	/**
	 * 各省成绩分布
	 * @return
	 */
	public boolean countByProvince();
	
	/**
	 * 某省各市成绩分布
	 * @param province
	 * @return
	 */
	public boolean countByCity(String province);
	
	/**
	 * 某市各学校分布
	 * @param province
	 * @param city
	 * @return
	 */
	public boolean countByUnivisity(String province,String city);

	/**
	 * 根据错误数的错题分布
	 * @return
	 */
	public boolean countByQuestion1();
	
	public void detailByQuestion1();
	
	public boolean countByQuestion1Tb();
	/**
	 * 根据错误率的错题分布
	 * @return
	 */
	public boolean countByQuestion2();
	
}
