package com.zjut_java.model;

/**
 * Tbtestdetails entity. @author MyEclipse Persistence Tools
 */

public class Tbtestdetails implements java.io.Serializable {

	// Fields

	private TbtestdetailsId id;
	private Tbtestlibrary tbtestlibrary;
	private String userId;
	private String answer;
	private short result;

	// Constructors

	/** default constructor */
	public Tbtestdetails() {
	}

	/** minimal constructor */
	public Tbtestdetails(TbtestdetailsId id) {
		this.id = id;
	}

	/** full constructor */
	public Tbtestdetails(TbtestdetailsId id, Tbtestlibrary tbtestlibrary,
			String userId, String answer, short result) {
		this.id = id;
		this.tbtestlibrary = tbtestlibrary;
		this.userId = userId;
		this.answer = answer;
		this.result = result;
	}

	// Property accessors

	public TbtestdetailsId getId() {
		return this.id;
	}

	public void setId(TbtestdetailsId id) {
		this.id = id;
	}

	public Tbtestlibrary getTbtestlibrary() {
		return this.tbtestlibrary;
	}

	public void setTbtestlibrary(Tbtestlibrary tbtestlibrary) {
		this.tbtestlibrary = tbtestlibrary;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public short getResult() {
		return this.result;
	}

	public void setResult(short result) {
		this.result = result;
	}

}