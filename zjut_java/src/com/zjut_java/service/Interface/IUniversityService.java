package com.zjut_java.service.Interface;

import com.zjut_java.model.Tbuniversity;

public interface IUniversityService {

	/**
	 * ���ѧУ
	 * @param tbuniversity
	 * @return
	 */
	public boolean add(Tbuniversity tbuniversity);
	
	/**
	 * ����ѧУ
	 * @param tbuniversity
	 * @return
	 */
	public boolean update(Tbuniversity tbuniversity);
	
	/**
	 * ɾ��ѧУ
	 * @param tbuniversity
	 * @return
	 */
	public boolean delete(Tbuniversity tbuniversity);
}
