package com.zjut_java.model;

/**
 * Tbtestdeploy entity. @author MyEclipse Persistence Tools
 */

public class Tbtestdeploy implements java.io.Serializable {

	// Fields

	private TbtestdeployId id;

	// Constructors

	/** default constructor */
	public Tbtestdeploy() {
	}

	/** full constructor */
	public Tbtestdeploy(TbtestdeployId id) {
		this.id = id;
	}

	// Property accessors

	public TbtestdeployId getId() {
		return this.id;
	}

	public void setId(TbtestdeployId id) {
		this.id = id;
	}

}