package com.zjut_java.model;

/**
 * TbtestId entity. @author MyEclipse Persistence Tools
 */

public class TbtestId implements java.io.Serializable {

	// Fields

	private Integer testId;
	private Tbusers tbusers;

	// Constructors

	/** default constructor */
	public TbtestId() {
	}

	/** full constructor */
	public TbtestId(Integer testId, Tbusers tbusers) {
		this.testId = testId;
		this.tbusers = tbusers;
	}

	// Property accessors

	public Integer getTestId() {
		return this.testId;
	}

	public void setTestId(Integer testId) {
		this.testId = testId;
	}

	public Tbusers getTbusers() {
		return this.tbusers;
	}

	public void setTbusers(Tbusers tbusers) {
		this.tbusers = tbusers;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TbtestId))
			return false;
		TbtestId castOther = (TbtestId) other;

		return ((this.getTestId() == castOther.getTestId()) || (this
				.getTestId() != null && castOther.getTestId() != null && this
				.getTestId().equals(castOther.getTestId())))
				&& ((this.getTbusers() == castOther.getTbusers()) || (this
						.getTbusers() != null && castOther.getTbusers() != null && this
						.getTbusers().equals(castOther.getTbusers())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTestId() == null ? 0 : this.getTestId().hashCode());
		result = 37 * result
				+ (getTbusers() == null ? 0 : this.getTbusers().hashCode());
		return result;
	}

}