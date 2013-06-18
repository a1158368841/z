package com.zjut_java.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Tbfunction entity. @author MyEclipse Persistence Tools
 */

public class Tbfunction implements java.io.Serializable {

	// Fields

	private Integer funId;
	private String funName;
	private Set tbuserhabits = new HashSet(0);
	private Set tbsystemlogs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Tbfunction() {
	}

	/** minimal constructor */
	public Tbfunction(Integer funId) {
		this.funId = funId;
	}

	/** full constructor */
	public Tbfunction(Integer funId, String funName, Set tbuserhabits,
			Set tbsystemlogs) {
		this.funId = funId;
		this.funName = funName;
		this.tbuserhabits = tbuserhabits;
		this.tbsystemlogs = tbsystemlogs;
	}

	// Property accessors

	public Integer getFunId() {
		return this.funId;
	}

	public void setFunId(Integer funId) {
		this.funId = funId;
	}

	public String getFunName() {
		return this.funName;
	}

	public void setFunName(String funName) {
		this.funName = funName;
	}

	public Set getTbuserhabits() {
		return this.tbuserhabits;
	}

	public void setTbuserhabits(Set tbuserhabits) {
		this.tbuserhabits = tbuserhabits;
	}

	public Set getTbsystemlogs() {
		return this.tbsystemlogs;
	}

	public void setTbsystemlogs(Set tbsystemlogs) {
		this.tbsystemlogs = tbsystemlogs;
	}

}