package com.zjut_java.charts.model;

/**
 * Ctunivavg entity. @author MyEclipse Persistence Tools
 */

public class Ctunivavg implements java.io.Serializable {

	// Fields

	private String univname;
	private String province;
	private String city;
	private Double avgscore;

	// Constructors

	/** default constructor */
	public Ctunivavg() {
	}

	/** full constructor */
	public Ctunivavg(String province, String city, Double avgscore) {
		this.province = province;
		this.city = city;
		this.avgscore = avgscore;
	}

	// Property accessors

	public String getUnivname() {
		return this.univname;
	}

	public void setUnivname(String univname) {
		this.univname = univname;
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

	public Double getAvgscore() {
		return this.avgscore;
	}

	public void setAvgscore(Double avgscore) {
		this.avgscore = avgscore;
	}

}