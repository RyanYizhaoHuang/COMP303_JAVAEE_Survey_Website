package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Question;
import model.Survey;

public class SurveysDAO implements  ISurvey{

	static EntityManager em;
	//Constructor
	public SurveysDAO()
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SurveysJPA");
		em = emf.createEntityManager();
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Survey> findAllSurveys() {
		Query q = em.createNamedQuery("Survey.findAll");
		return q.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Survey> findByName(String name)
	{
		Query q = em.createQuery("SELECT s from Survey s WHERE s.surveyTopic LIKE :name ");
		q.setParameter("name","%" + name+ "%" );
		if(q.getResultList() != null)
		{
			return q.getResultList();
		}
		return null;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Question> findAllQuestions(int surveyid) {
		Query q = em.createQuery("SELECT qs from Survey s JOIN s.questions qs WHERE s.surveyid = :key_word");
		q.setParameter("key_word",surveyid);
		System.out.println(q.toString());
		if(q.getResultList() != null)
		{
			return q.getResultList();
		}
		return null;
	}

}
