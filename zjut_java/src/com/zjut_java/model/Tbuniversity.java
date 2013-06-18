package com.zjut_java.model;

/**
 * Tbuniversity entity. @author MyEclipse Persistence Tools
 */

public class Tbuniversity implements java.io.Serializable {

	// Fields

	private Integer univId;
	private String univName;
	private String city;
	private String province;
	private String address;
	private String postCode;
	private String telephone;
	private String url;
	private short u211;
	private short u985;

	// Constructors

	/** default constructor */
	public Tbuniversity() {
	}

	/** minimal constructor */
	public Tbuniversity(Integer univId) {
		this.univId = univId;
	}

	/** full constructor */
	public Tbuniversity(Integer univId, String univName, String city,
			String province, String address, String postCode, String telephone,
			String url, short u211, short u985) {
		this.univId = univId;
		this.univName = univName;
		this.city = city;
		this.province = province;
		this.address = address;
		this.postCode = postCode;
		this.telephone = telephone;
		this.url = url;
		this.u211 = u211;
		this.u985 = u985;
	}

	// Property accessors

	public Integer getUnivId() {
		return this.univId;
	}

	public void setUnivId(Integer univId) {
		this.univId = univId;
	}

	public String getUnivName() {
		return this.univName;
	}

	public void setUnivName(String univName) {
		this.univName = univName;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostCode() {
		return this.postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public short getU211() {
		return this.u211;
	}

	public void setU211(short u211) {
		this.u211 = u211;
	}

	public short getU985() {
		return this.u985;
	}

	public void setU985(short u985) {
		this.u985 = u985;
	}

}