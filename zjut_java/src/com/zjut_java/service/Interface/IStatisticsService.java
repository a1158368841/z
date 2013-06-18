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
	 * ����ģ���ʱ�ε����
	 * @return
	 */
	public boolean countByFunction();
	
	/**
	 * ����ģ���ܵ����
	 * @return
	 */
	public boolean countByFunctionSum();
	/**
	 * ������ʱ�ֲ�
	 * @return ÿ�β�����ʱ����
	 */
	public boolean countByTime();
	
	/**
	 * ��ʡ�ɼ��ֲ�
	 * @return
	 */
	public boolean countByProvince();
	
	/**
	 * ĳʡ���гɼ��ֲ�
	 * @param province
	 * @return
	 */
	public boolean countByCity(String province);
	
	/**
	 * ĳ�и�ѧУ�ֲ�
	 * @param province
	 * @param city
	 * @return
	 */
	public boolean countByUnivisity(String province,String city);

	/**
	 * ���ݴ������Ĵ���ֲ�
	 * @return
	 */
	public boolean countByQuestion1();
	
	public void detailByQuestion1();
	
	public boolean countByQuestion1Tb();
	/**
	 * ���ݴ����ʵĴ���ֲ�
	 * @return
	 */
	public boolean countByQuestion2();
	
}
