package com.zjut_java.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Tbtest entity. @author MyEclipse Persistence Tools
 */

public class Tbtest implements java.io.Serializable {

	// Fields

	private TbtestId id;
	private Date startTime;
	private Date finishTime;
	private Integer score;
	private Set tbtestdetailses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Tbtest() {
	}

	/** minimal constructor */
	public Tbtest(TbtestId id, Date startTime, Date finishTime) {
		this.id = id;
		this.startTime = startTime;
		this.finishTime = finishTime;
	}

	/** full constructor */
	public Tbtest(TbtestId id, Date startTime, Date finishTime, Integer score,
			Set tbtestdetailses) {
		this.id = id;
		this.startTime = startTime;
		this.finishTime = finishTime;
		this.score = score;
		this.tbtestdetailses = tbtestdetailses;
	}

	// Property accessors

	public TbtestId getId() {
		return this.id;
	}

	public void setId(TbtestId id) {
		this.id = id;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getFinishTime() {
		return this.finishTime;
	}

	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}

	public Integer getScore() {
		return this.score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Set getTbtestdetailses() {
		return this.tbtestdetailses;
	}

	public void setTbtestdetailses(Set tbtestdetailses) {
		this.tbtestdetailses = tbtestdetailses;
	}

}