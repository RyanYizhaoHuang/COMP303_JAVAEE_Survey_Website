package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the surveys database table.
 * 
 */
@Entity
@Table(name="surveys")
@NamedQuery(name="Survey.findAll", query="SELECT s FROM Survey s")
public class Survey implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int surveyid;

	@Column(name="survey_topic")
	private String surveyTopic;

	//bi-directional many-to-one association to Question
	@OneToMany(mappedBy="survey",cascade = CascadeType.PERSIST)
	private List<Question> questions;

	public Survey() {
	}

	public int getSurveyid() {
		return this.surveyid;
	}

	public void setSurveyid(int surveyid) {
		this.surveyid = surveyid;
	}

	public String getSurveyTopic() {
		return this.surveyTopic;
	}

	public void setSurveyTopic(String surveyTopic) {
		this.surveyTopic = surveyTopic;
	}

	public List<Question> getQuestions() {
		return this.questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public Question addQuestion(Question question) {
		getQuestions().add(question);
		question.setSurvey(this);

		return question;
	}

	public Question removeQuestion(Question question) {
		getQuestions().remove(question);
		question.setSurvey(null);

		return question;
	}

}