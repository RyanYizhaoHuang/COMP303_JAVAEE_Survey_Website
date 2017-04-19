package service;

import java.util.List;

import model.Answer;
import model.Question;
import model.Survey;

public interface ISurvey {

	//find the list of survey topic
	List<Survey> findAllSurveys();
	

	
	//find the list of questions
	List<Question> findAllQuestions(int surveyid);
	
	//find the list if answers
	//List<Answer> findAllAnswers();
	
	//Add new survey
	//void addNewSurvey(Survey survey);
	
	//Add questions
	//void addQuestions(List<Question> questions);
	
	
	
}
