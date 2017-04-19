package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the answer database table.
 * 
 */
@Entity
@NamedQuery(name="Answer.findAll", query="SELECT a FROM Answer a")
public class Answer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int answerid;

	private int answer;

	private int questionid;

	private int surveyid;

	public Answer() {
	}

	public int getAnswerid() {
		return this.answerid;
	}

	public void setAnswerid(int answerid) {
		this.answerid = answerid;
	}

	public int getAnswer() {
		return this.answer;
	}

	public void setAnswer(int answer) {
		this.answer = answer;
	}

	public int getQuestionid() {
		return this.questionid;
	}

	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}

	public int getSurveyid() {
		return this.surveyid;
	}

	public void setSurveyid(int surveyid) {
		this.surveyid = surveyid;
	}

}