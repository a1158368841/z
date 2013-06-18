package com.zjut_java.model;

/**
 * TbtestdeployId entity. @author MyEclipse Persistence Tools
 */

public class TbtestdeployId implements java.io.Serializable {

	// Fields

	private Integer testTime;
	private Integer amount;
	private Integer mcamount;
	private Integer tofamount;
	private Integer saamount;
	private Integer famount;
	private Integer pamount;

	// Constructors

	/** default constructor */
	public TbtestdeployId() {
	}

	/** full constructor */
	public TbtestdeployId(Integer testTime, Integer amount, Integer mcamount,
			Integer tofamount, Integer saamount, Integer famount,
			Integer pamount) {
		this.testTime = testTime;
		this.amount = amount;
		this.mcamount = mcamount;
		this.tofamount = tofamount;
		this.saamount = saamount;
		this.famount = famount;
		this.pamount = pamount;
	}

	// Property accessors

	public Integer getTestTime() {
		return this.testTime;
	}

	public void setTestTime(Integer testTime) {
		this.testTime = testTime;
	}

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getMcamount() {
		return this.mcamount;
	}

	public void setMcamount(Integer mcamount) {
		this.mcamount = mcamount;
	}

	public Integer getTofamount() {
		return this.tofamount;
	}

	public void setTofamount(Integer tofamount) {
		this.tofamount = tofamount;
	}

	public Integer getSaamount() {
		return this.saamount;
	}

	public void setSaamount(Integer saamount) {
		this.saamount = saamount;
	}

	public Integer getFamount() {
		return this.famount;
	}

	public void setFamount(Integer famount) {
		this.famount = famount;
	}

	public Integer getPamount() {
		return this.pamount;
	}

	public void setPamount(Integer pamount) {
		this.pamount = pamount;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TbtestdeployId))
			return false;
		TbtestdeployId castOther = (TbtestdeployId) other;

		return ((this.getTestTime() == castOther.getTestTime()) || (this
				.getTestTime() != null && castOther.getTestTime() != null && this
				.getTestTime().equals(castOther.getTestTime())))
				&& ((this.getAmount() == castOther.getAmount()) || (this
						.getAmount() != null && castOther.getAmount() != null && this
						.getAmount().equals(castOther.getAmount())))
				&& ((this.getMcamount() == castOther.getMcamount()) || (this
						.getMcamount() != null
						&& castOther.getMcamount() != null && this
						.getMcamount().equals(castOther.getMcamount())))
				&& ((this.getTofamount() == castOther.getTofamount()) || (this
						.getTofamount() != null
						&& castOther.getTofamount() != null && this
						.getTofamount().equals(castOther.getTofamount())))
				&& ((this.getSaamount() == castOther.getSaamount()) || (this
						.getSaamount() != null
						&& castOther.getSaamount() != null && this
						.getSaamount().equals(castOther.getSaamount())))
				&& ((this.getFamount() == castOther.getFamount()) || (this
						.getFamount() != null && castOther.getFamount() != null && this
						.getFamount().equals(castOther.getFamount())))
				&& ((this.getPamount() == castOther.getPamount()) || (this
						.getPamount() != null && castOther.getPamount() != null && this
						.getPamount().equals(castOther.getPamount())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTestTime() == null ? 0 : this.getTestTime().hashCode());
		result = 37 * result
				+ (getAmount() == null ? 0 : this.getAmount().hashCode());
		result = 37 * result
				+ (getMcamount() == null ? 0 : this.getMcamount().hashCode());
		result = 37 * result
				+ (getTofamount() == null ? 0 : this.getTofamount().hashCode());
		result = 37 * result
				+ (getSaamount() == null ? 0 : this.getSaamount().hashCode());
		result = 37 * result
				+ (getFamount() == null ? 0 : this.getFamount().hashCode());
		result = 37 * result
				+ (getPamount() == null ? 0 : this.getPamount().hashCode());
		return result;
	}

}