package com.zjut_java.model;

import java.util.Date;

/**
 * Tbsystemlog entity. @author MyEclipse Persistence Tools
 */

public class Tbsystemlog implements java.io.Serializable {

	// Fields

	private Integer id;
	private Tbfunction tbfunction;
	private String userId;
	private Date recDt;
	private String recContent;

	// Constructors

	/** default constructor */
	public Tbsystemlog() {
	}

	/** minimal constructor */
	public Tbsystemlog(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Tbsystemlog(Integer id, Tbfunction tbfunction, String userId,
			Date recDt, String recContent) {
		this.id = id;
		this.tbfunction = tbfunction;
		this.userId = userId;
		this.recDt = recDt;
		this.recContent = recContent;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Tbfunction getTbfunction() {
		return this.tbfunction;
	}

	public void setTbfunction(Tbfunction tbfunction) {
		this.tbfunction = tbfunction;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getRecDt() {
		return this.recDt;
	}

	public void setRecDt(Date recDt) {
		this.recDt = recDt;
	}

	public String getRecContent() {
		return this.recContent;
	}

	public void setRecContent(String recContent) {
		this.recContent = recContent;
	}

}