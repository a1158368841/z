package com.zjut_java.model;

/**
 * Tbppt entity. @author MyEclipse Persistence Tools
 */

public class Tbppt implements java.io.Serializable {

	// Fields

	private Integer pptid;
	private Tbusers tbusers;
	private String pptname;
	private String pptsavepath;
	private Integer pptsize;
	private Integer counts;
	private String pptsection;

	// Constructors

	/** default constructor */
	public Tbppt() {
	}

	/** minimal constructor */
	public Tbppt(Integer pptid) {
		this.pptid = pptid;
	}

	/** full constructor */
	public Tbppt(Integer pptid, Tbusers tbusers, String pptname,
			String pptsavepath, Integer pptsize, Integer counts,
			String pptsection) {
		this.pptid = pptid;
		this.tbusers = tbusers;
		this.pptname = pptname;
		this.pptsavepath = pptsavepath;
		this.pptsize = pptsize;
		this.counts = counts;
		this.pptsection = pptsection;
	}

	// Property accessors

	public Integer getPptid() {
		return this.pptid;
	}

	public void setPptid(Integer pptid) {
		this.pptid = pptid;
	}

	public Tbusers getTbusers() {
		return this.tbusers;
	}

	public void setTbusers(Tbusers tbusers) {
		this.tbusers = tbusers;
	}

	public String getPptname() {
		return this.pptname;
	}

	public void setPptname(String pptname) {
		this.pptname = pptname;
	}

	public String getPptsavepath() {
		return this.pptsavepath;
	}

	public void setPptsavepath(String pptsavepath) {
		this.pptsavepath = pptsavepath;
	}

	public Integer getPptsize() {
		return this.pptsize;
	}

	public void setPptsize(Integer pptsize) {
		this.pptsize = pptsize;
	}

	public Integer getCounts() {
		return this.counts;
	}

	public void setCounts(Integer counts) {
		this.counts = counts;
	}

	public String getPptsection() {
		return this.pptsection;
	}

	public void setPptsection(String pptsection) {
		this.pptsection = pptsection;
	}

}