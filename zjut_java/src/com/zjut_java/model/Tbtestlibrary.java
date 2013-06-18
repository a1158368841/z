package com.zjut_java.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Tbtestlibrary entity. @author MyEclipse Persistence Tools
 */

public class Tbtestlibrary implements java.io.Serializable {

	// Fields

	private Integer questionId;
	private String questionType;
	private String questionSection;
	private String question;
	private String selectA;
	private String selectB;
	private String selectC;
	private String selectD;
	private String answer;
	private Set tbtestdetailses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Tbtestlibrary() {
	}

	/** minimal constructor */
	public Tbtestlibrary(Integer questionId, String question, String answer) {
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
	}

	/** full constructor */
	public Tbtestlibrary(Integer questionId, String questionType,
			String questionSection, String question, String selectA,
			String selectB, String selectC, String selectD, String answer,
			Set tbtestdetailses) {
		this.questionId = questionId;
		this.questionType = questionType;
		this.questionSection = questionSection;
		this.question = question;
		this.selectA = selectA;
		this.selectB = selectB;
		this.selectC = selectC;
		this.selectD = selectD;
		this.answer = answer;
		this.tbtestdetailses = tbtestdetailses;
	}

	// Property accessors

	public Integer getQuestionId() {
		return this.questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public String getQuestionType() {
		return this.questionType;
	}

	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}

	public String getQuestionSection() {
		return this.questionSection;
	}

	public void setQuestionSection(String questionSection) {
		this.questionSection = questionSection;
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getSelectA() {
		return this.selectA;
	}

	public void setSelectA(String selectA) {
		this.selectA = selectA;
	}

	public String getSelectB() {
		return this.selectB;
	}

	public void setSelectB(String selectB) {
		this.selectB = selectB;
	}

	public String getSelectC() {
		return this.selectC;
	}

	public void setSelectC(String selectC) {
		this.selectC = selectC;
	}

	public String getSelectD() {
		return this.selectD;
	}

	public void setSelectD(String selectD) {
		this.selectD = selectD;
	}

	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Set getTbtestdetailses() {
		return this.tbtestdetailses;
	}

	public void setTbtestdetailses(Set tbtestdetailses) {
		this.tbtestdetailses = tbtestdetailses;
	}

}