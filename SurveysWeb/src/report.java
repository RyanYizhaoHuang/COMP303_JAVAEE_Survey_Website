

public class report {

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
	public int getAnswerTrueNum() {
		return answerTrueNum;
	}
	public void setAnswerTrueNum(int answerTrueNum) {
		this.answerTrueNum = answerTrueNum;
	}
	public int getAnswerFalseNum() {
		return answerFalseNum;
	}
	public void setAnswerFalseNum(int answerFalseNum) {
		this.answerFalseNum = answerFalseNum;
	}
	int surveyId;
	int questionId;
	String question;
	int answerTrueNum;
	int answerFalseNum;
}
