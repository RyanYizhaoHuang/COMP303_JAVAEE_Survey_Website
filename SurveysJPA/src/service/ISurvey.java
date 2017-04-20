package service;

import java.util.List;

import model.Answer;
import model.Question;
import model.Survey;

public interface ISurvey {

	//find the list of survey topic
	List<Survey> findAllSurveys();
	
	//find survey by id
	Survey findSurveyById(int id);
	
	//find the list of questions
	List<Question> findAllQuestionsBySruveyId(int surveyid);
	
	//find the list if answers
	//List<Answer> findAllAnswers();
	
	//Add new survey
	void createSurvey(Survey survey);
	
	//Add questions
	//void addQuestions(List<Question> questions);
	
	//Respond question
	void respondAnswer(Answer answer);
	
	
	
}
