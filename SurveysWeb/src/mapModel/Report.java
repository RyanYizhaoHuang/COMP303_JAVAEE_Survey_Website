package mapModel;

public class Report {

	public int getSurveyId() {
		return surveyId;
	}
	public void setSurveyId(int surveyId) {
		this.surveyId = surveyId;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Long getAnswerTrueNum() {
		return answerTrueNum;
	}
	public void setAnswerTrueNum(Long answerTrueNum) {
		this.answerTrueNum = answerTrueNum;
	}
	public Long getAnswerFalseNum() {
		return answerFalseNum;
	}
	public void setAnswerFalseNum(Long answerFalseNum) {
		this.answerFalseNum = answerFalseNum;
	}
	int surveyId;
	int questionId;
	String question;
	Long answerTrueNum;
	Long answerFalseNum;
}
