package com.zjut_java.charts.model;

import java.util.Date;

/**
 * Ctdetail entity. @author MyEclipse Persistence Tools
 */

public class Ctdetail implements java.io.Serializable {

	// Fields

	private Integer testid;
	private String userid;
	private String province;
	private String city;
	private String univname;
	private Date starttime;
	private Date finishtime;
	private double useTime;
	private Integer score;

	// Constructors

	/** default constructor */
	public Ctdetail() {
	}

	/** minimal constructor */
	public Ctdetail(Integer testid, String userid, Date starttime,
			Date finishtime, double useTime) {
		this.testid = testid;
		this.userid = userid;
		this.starttime = starttime;
		this.finishtime = finishtime;
		this.useTime = useTime;
	}

	/** full constructor */
	public Ctdetail(Integer testid, String userid, String province,
			String city, String univname, Date starttime, Date finishtime,
			double useTime, Integer score) {
		this.testid = testid;
		this.userid = userid;
		this.province = province;
		this.city = city;
		this.univname = univname;
		this.starttime = starttime;
		this.finishtime = finishtime;
		this.useTime = useTime;
		this.score = score;
	}

	// Property accessors

	public Integer getTestid() {
		return this.testid;
	}

	public void setTestid(Integer testid) {
		this.testid = testid;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getUnivname() {
		return this.univname;
	}

	public void setUnivname(String univname) {
		this.univname = univname;
	}

	public Date getStarttime() {
		return this.starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public Date getFinishtime() {
		return this.finishtime;
	}

	public void setFinishtime(Date finishtime) {
		this.finishtime = finishtime;
	}

	public double getUseTime() {
		return this.useTime;
	}

	public void setUseTime(double useTime) {
		this.useTime = useTime;
	}

	public Integer getScore() {
		return this.score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

}