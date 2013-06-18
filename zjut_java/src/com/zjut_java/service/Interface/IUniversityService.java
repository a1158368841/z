package com.zjut_java.service.Interface;

import com.zjut_java.model.Tbuniversity;

public interface IUniversityService {

	/**
	 * 添加学校
	 * @param tbuniversity
	 * @return
	 */
	public boolean add(Tbuniversity tbuniversity);
	
	/**
	 * 更新学校
	 * @param tbuniversity
	 * @return
	 */
	public boolean update(Tbuniversity tbuniversity);
	
	/**
	 * 删除学校
	 * @param tbuniversity
	 * @return
	 */
	public boolean delete(Tbuniversity tbuniversity);
}
