package com.zjut_java.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Tbusers entity. @author MyEclipse Persistence Tools
 */

public class Tbusers implements java.io.Serializable {

	// Fields

	private String userId;
	private Integer univId;
	private String name;
	private Date birthday;
	private String studentId;
	private String pwd;
	private String cellPhone;
	private String class_;
	private String major;
	private String userType;
	private Integer logonCount;
	private Date regTime;
	private String email;
	private Set tbuserhabits = new HashSet(0);
	private Set tbppts = new HashSet(0);
	private Set tbtests = new HashSet(0);

	// Constructors

	/** default constructor */
	public Tbusers() {
	}

	/** minimal constructor */
	public Tbusers(String userId, String name, Date birthday, String studentId,
			String pwd) {
		this.userId = userId;
		this.name = name;
		this.birthday = birthday;
		this.studentId = studentId;
		this.pwd = pwd;
	}

	/** full constructor */
	public Tbusers(String userId, Integer univId, String name, Date birthday,
			String studentId, String pwd, String cellPhone, String class_,
			String major, String userType, Integer logonCount, Date regTime,
			String email, Set tbuserhabits, Set tbppts, Set tbtests) {
		this.userId = userId;
		this.univId = univId;
		this.name = name;
		this.birthday = birthday;
		this.studentId = studentId;
		this.pwd = pwd;
		this.cellPhone = cellPhone;
		this.class_ = class_;
		this.major = major;
		this.userType = userType;
		this.logonCount = logonCount;
		this.regTime = regTime;
		this.email = email;
		this.tbuserhabits = tbuserhabits;
		this.tbppts = tbppts;
		this.tbtests = tbtests;
	}

	// Property accessors

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getUnivId() {
		return this.univId;
	}

	public void setUnivId(Integer univId) {
		this.univId = univId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getStudentId() {
		return this.studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getCellPhone() {
		return this.cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getClass_() {
		return this.class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Integer getLogonCount() {
		return this.logonCount;
	}

	public void setLogonCount(Integer logonCount) {
		this.logonCount = logonCount;
	}

	public Date getRegTime() {
		return this.regTime;
	}

	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set getTbuserhabits() {
		return this.tbuserhabits;
	}

	public void setTbuserhabits(Set tbuserhabits) {
		this.tbuserhabits = tbuserhabits;
	}

	public Set getTbppts() {
		return this.tbppts;
	}

	public void setTbppts(Set tbppts) {
		this.tbppts = tbppts;
	}

	public Set getTbtests() {
		return this.tbtests;
	}

	public void setTbtests(Set tbtests) {
		this.tbtests = tbtests;
	}

}