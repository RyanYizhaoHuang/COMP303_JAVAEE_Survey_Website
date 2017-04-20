package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Question;
import model.Survey;
import service.SurveysDAO;

/**
 * Servlet implementation class CreateSurvey
 */
@WebServlet("/CreateSurvey")
public class CreateSurvey extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	//SurveysDAO
	SurveysDAO surveyDao = new SurveysDAO();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateSurvey() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		String surveyTopic = request.getParameter("topic");
		String type = request.getParameter("type");
		String numberOfQuestion = request.getParameter("numberOfQuestion");
		
		request.setAttribute("SurveyTopic", surveyTopic);
		request.setAttribute("numberofQuestion", numberOfQuestion);
		request.setAttribute("type", type);
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/createSurvey.jsp");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String surveyTopic = request.getParameter("topic");
		int numberOfQuestion = Integer.parseInt(request.getParameter("numberOfQuestion"));
		
		Survey survey = new Survey();
		List<Question> questions = new ArrayList<Question>();
		for (int i = 1 ; i <= numberOfQuestion ; ++i)
		{
			Question question = new Question();
			question.setQuestion(request.getParameter("questionTopic"+String.valueOf(i)));
			question.setSurvey(survey);
			questions.add(question);
		}
		
		survey.setQuestions(questions);
		survey.setSurveyTopic(surveyTopic);
		
		surveyDao.createSurvey(survey);
		
		List<Survey> surveys = surveyDao.findAllSurveys();
		
		request.setAttribute("numberOfSurveys", surveys.size());
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");
		rd.forward(request, response);
		
	}

}
