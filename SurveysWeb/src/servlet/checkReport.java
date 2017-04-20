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

import mapModel.Report;
import model.Question;
import model.Survey;
import service.SurveysDAO;

/**
 * Servlet implementation class checkReport
 */
@WebServlet("/checkReport")
public class checkReport extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	//SurveysDAO
	SurveysDAO surveyDao = new SurveysDAO();
	List<Question> questions = null;
	Survey survey = null;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public checkReport() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Report> reports = new  ArrayList<Report>();
		int surveyid = Integer.parseInt(request.getParameter("id"));
		questions = surveyDao.findAllQuestionsBySruveyId(surveyid);
		survey = surveyDao.findSurveyById(surveyid);
		List<Object[]> reportList = surveyDao.checkAnswer(surveyid);
		//transfer data from reportList to report
		if(!reportList.isEmpty())
		{
			//if just one respond
			if(reportList.size()== questions.size())
			{
				for (int count = 0 ; count < reportList.size(); count++) {
					Report singleReport = new Report();
				    singleReport.setSurveyId(surveyid);
				    singleReport.setQuestionId((Integer)reportList.get(count)[2]);
				    //Check if answer:true
				    if((Integer)reportList.get(count)[3]==1)
				    {
				    	singleReport.setAnswerTrueNum((Long)reportList.get(count)[0]);
				    }
				    else
				    {
				    	singleReport.setAnswerFalseNum((Long)reportList.get(count)[0]);
				    }
				    reports.add(singleReport);
				}
			}
			//if more than one respond
			if(reportList.size()> questions.size())
			{
				for (int count = 0 ; count < reportList.size() -1; count = count + 2) {
					Report singleReport = new Report();
				    singleReport.setSurveyId(surveyid);
				    singleReport.setQuestionId((Integer)reportList.get(count)[2]);
				    //singleReport.setQuestion(question);
				    singleReport.setAnswerTrueNum((Long)reportList.get(count)[0]);
				    singleReport.setAnswerFalseNum((Long)reportList.get(count+1)[0]);
				    System.out.println("True: " + singleReport.getAnswerTrueNum());
				    System.out.println("False: " + singleReport.getAnswerFalseNum());
				    reports.add(singleReport);
				}
			}
		}
		if(!questions.isEmpty())
		{
			request.setAttribute("Questions", questions);
			
		}
		if(survey != null)
		{
			request.setAttribute("Survey", survey);
		}
		request.setAttribute("Reports", reports);
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/report.jsp");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
