package com.zjut_java.charts.model;

/**
 * Ctcityavg entity. @author MyEclipse Persistence Tools
 */

public class Ctcityavg implements java.io.Serializable {

	// Fields

	private String city;
	private String province;
	private Double avgscore;

	// Constructors

	/** default constructor */
	public Ctcityavg() {
	}

	/** full constructor */
	public Ctcityavg(String province, Double avgscore) {
		this.province = province;
		this.avgscore = avgscore;
	}

	// Property accessors

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public Double getAvgscore() {
		return this.avgscore;
	}

	public void setAvgscore(Double avgscore) {
		this.avgscore = avgscore;
	}

}