package com.zjut_java.charts.model;

/**
 * Ctquestions entity. @author MyEclipse Persistence Tools
 */

public class Ctquestions implements java.io.Serializable {

	// Fields

	private Integer questionid;
	private String questionType;
	private String questionsection;
	private String question;
	private String selectA;
	private String selectB;
	private String selectC;
	private String selectD;
	private String answer;
	private long sumnum;
	private long wrongnum;
	private double wrong;

	// Constructors

	/** default constructor */
	public Ctquestions() {
	}

	/** minimal constructor */
	public Ctquestions(Integer questionid, String question, String answer,
			long sumnum, long wrongnum) {
		this.questionid = questionid;
		this.question = question;
		this.answer = answer;
		this.sumnum = sumnum;
		this.wrongnum = wrongnum;
	}

	/** full constructor */
	public Ctquestions(Integer questionid, String questionType,
			String questionsection, String question, String selectA,
			String selectB, String selectC, String selectD, String answer,
			long sumnum, long wrongnum, double wrong) {
		this.questionid = questionid;
		this.questionType = questionType;
		this.questionsection = questionsection;
		this.question = question;
		this.selectA = selectA;
		this.selectB = selectB;
		this.selectC = selectC;
		this.selectD = selectD;
		this.answer = answer;
		this.sumnum = sumnum;
		this.wrongnum = wrongnum;
		this.wrong = wrong;
	}

	// Property accessors

	public Integer getQuestionid() {
		return this.questionid;
	}

	public void setQuestionid(Integer questionid) {
		this.questionid = questionid;
	}

	public String getQuestionType() {
		return this.questionType;
	}

	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}

	public String getQuestionsection() {
		return this.questionsection;
	}

	public void setQuestionsection(String questionsection) {
		this.questionsection = questionsection;
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

	public long getSumnum() {
		return this.sumnum;
	}

	public void setSumnum(long sumnum) {
		this.sumnum = sumnum;
	}

	public long getWrongnum() {
		return this.wrongnum;
	}

	public void setWrongnum(long wrongnum) {
		this.wrongnum = wrongnum;
	}

	public double getWrong() {
		return this.wrong;
	}

	public void setWrong(double wrong) {
		this.wrong = wrong;
	}

}