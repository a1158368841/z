package com.zjut_java.charts.model;

/**
 * Ctfunction entity. @author MyEclipse Persistence Tools
 */

public class Ctfunction implements java.io.Serializable {

	// Fields

	private CtfunctionId id;

	// Constructors

	/** default constructor */
	public Ctfunction() {
	}

	/** full constructor */
	public Ctfunction(CtfunctionId id) {
		this.id = id;
	}

	// Property accessors

	public CtfunctionId getId() {
		return this.id;
	}

	public void setId(CtfunctionId id) {
		this.id = id;
	}

}