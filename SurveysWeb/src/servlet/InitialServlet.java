package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Survey;
import service.SurveysDAO;

/**
 * Servlet implementation class InitialServlet
 */
@WebServlet(description = "Route Index Page", urlPatterns = { "" })
public class InitialServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//SurveysDAO
	SurveysDAO surveyDao = new SurveysDAO();
	List<Survey> surveys = null;
       

    public InitialServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		surveys = surveyDao.findAllSurveys();
		
		request.setAttribute("numberOfSurveys", surveys.size());
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");
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
