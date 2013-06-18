package com.zjut_java.model;

/**
 * TbtestdetailsId entity. @author MyEclipse Persistence Tools
 */

public class TbtestdetailsId implements java.io.Serializable {

	// Fields

	private Integer questionIndex;
	private Integer testId;

	// Constructors

	/** default constructor */
	public TbtestdetailsId() {
	}

	/** full constructor */
	public TbtestdetailsId(Integer questionIndex, Integer testId) {
		this.questionIndex = questionIndex;
		this.testId = testId;
	}

	// Property accessors

	public Integer getQuestionIndex() {
		return this.questionIndex;
	}

	public void setQuestionIndex(Integer questionIndex) {
		this.questionIndex = questionIndex;
	}

	public Integer getTestId() {
		return this.testId;
	}

	public void setTestId(Integer testId) {
		this.testId = testId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TbtestdetailsId))
			return false;
		TbtestdetailsId castOther = (TbtestdetailsId) other;

		return ((this.getQuestionIndex() == castOther.getQuestionIndex()) || (this
				.getQuestionIndex() != null
				&& castOther.getQuestionIndex() != null && this
				.getQuestionIndex().equals(castOther.getQuestionIndex())))
				&& ((this.getTestId() == castOther.getTestId()) || (this
						.getTestId() != null && castOther.getTestId() != null && this
						.getTestId().equals(castOther.getTestId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getQuestionIndex() == null ? 0 : this.getQuestionIndex()
						.hashCode());
		result = 37 * result
				+ (getTestId() == null ? 0 : this.getTestId().hashCode());
		return result;
	}

}