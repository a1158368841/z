package com.zjut_java.model;

/**
 * TbuserhabitId entity. @author MyEclipse Persistence Tools
 */

public class TbuserhabitId implements java.io.Serializable {

	// Fields

	private Tbusers tbusers;
	private Tbfunction tbfunction;

	// Constructors

	/** default constructor */
	public TbuserhabitId() {
	}

	/** full constructor */
	public TbuserhabitId(Tbusers tbusers, Tbfunction tbfunction) {
		this.tbusers = tbusers;
		this.tbfunction = tbfunction;
	}

	// Property accessors

	public Tbusers getTbusers() {
		return this.tbusers;
	}

	public void setTbusers(Tbusers tbusers) {
		this.tbusers = tbusers;
	}

	public Tbfunction getTbfunction() {
		return this.tbfunction;
	}

	public void setTbfunction(Tbfunction tbfunction) {
		this.tbfunction = tbfunction;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TbuserhabitId))
			return false;
		TbuserhabitId castOther = (TbuserhabitId) other;

		return ((this.getTbusers() == castOther.getTbusers()) || (this
				.getTbusers() != null && castOther.getTbusers() != null && this
				.getTbusers().equals(castOther.getTbusers())))
				&& ((this.getTbfunction() == castOther.getTbfunction()) || (this
						.getTbfunction() != null
						&& castOther.getTbfunction() != null && this
						.getTbfunction().equals(castOther.getTbfunction())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTbusers() == null ? 0 : this.getTbusers().hashCode());
		result = 37
				* result
				+ (getTbfunction() == null ? 0 : this.getTbfunction()
						.hashCode());
		return result;
	}

}