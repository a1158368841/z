package com.zjut_java.charts.model;

/**
 * Ctproavg entity. @author MyEclipse Persistence Tools
 */

public class Ctproavg implements java.io.Serializable {

	// Fields

	private String province;
	private Double avgscore;

	// Constructors

	/** default constructor */
	public Ctproavg() {
	}

	/** full constructor */
	public Ctproavg(Double avgscore) {
		this.avgscore = avgscore;
	}

	// Property accessors

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