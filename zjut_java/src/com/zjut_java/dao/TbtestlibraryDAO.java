package com.zjut_java.dao;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zjut_java.model.Tbtestlibrary;
import com.zjut_java.model.Tbusers;

/**
 * A data access object (DAO) providing persistence and search support for
 * Tbtestlibrary entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.zjut_java.model.Tbtestlibrary
 * @author MyEclipse Persistence Tools
 */

public class TbtestlibraryDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TbtestlibraryDAO.class);
	// property constants
	public static final String QUESTION_TYPE = "questionType";
	public static final String QUESTION_SECTION = "questionSection";
	public static final String QUESTION = "question";
	public static final String SELECT_A = "selectA";
	public static final String SELECT_B = "selectB";
	public static final String SELECT_C = "selectC";
	public static final String SELECT_D = "selectD";
	public static final String ANSWER = "answer";

	protected void initDao() {
		// do nothing
	}

	public boolean save(Tbtestlibrary transientInstance) {
		log.debug("saving Tbtestlibrary instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
			return true;
		} catch (RuntimeException re) {
			log.error("save failed", re);
			System.out.println(re.getMessage());
			//throw re;
			return false;
		}
	}

	public boolean delete(Tbtestlibrary persistentInstance) {
		log.debug("deleting Tbtestlibrary instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
			return true;
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			System.out.println(re.getMessage());
			//throw re;
			return false;
		}
	}
	
	public List findByTypeAndNum(String type,int num){
		Session session =getSession();
		String hql = "FROM tbtestlibrary WHERE QuestionID >= (SELECT floor( RAND() * ((SELECT MAX(QuestionID) FROM tbtestlibrary)-(SELECT MIN(QuestionID) FROM tbtestlibrary)) + (SELECT MIN(QuestionID) FROM tbtestlibrary))) AND QuestionType = ?  ORDER BY QuestionID LIMIT ?";
		Query query = session.createQuery(hql);
		query.setString(0,type);
		query.setInteger(1, num);
		List<Tbusers> list = query.list();
		return list;
	}

	public Tbtestlibrary findById(java.lang.Integer id) {
		log.debug("getting Tbtestlibrary instance with id: " + id);
		try {
			Tbtestlibrary instance = (Tbtestlibrary) getHibernateTemplate()
					.get("com.zjut_java.model.Tbtestlibrary", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Tbtestlibrary instance) {
		log.debug("finding Tbtestlibrary instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Tbtestlibrary instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Tbtestlibrary as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByQuestionType(Object questionType) {
		return findByProperty(QUESTION_TYPE, questionType);
	}

	public List findByQuestionSection(Object questionSection) {
		return findByProperty(QUESTION_SECTION, questionSection);
	}

	public List findByQuestion(Object question) {
		return findByProperty(QUESTION, question);
	}

	public List findBySelectA(Object selectA) {
		return findByProperty(SELECT_A, selectA);
	}

	public List findBySelectB(Object selectB) {
		return findByProperty(SELECT_B, selectB);
	}

	public List findBySelectC(Object selectC) {
		return findByProperty(SELECT_C, selectC);
	}

	public List findBySelectD(Object selectD) {
		return findByProperty(SELECT_D, selectD);
	}

	public List findByAnswer(Object answer) {
		return findByProperty(ANSWER, answer);
	}

	public List findAll() {
		log.debug("finding all Tbtestlibrary instances");
		try {
			String queryString = "from Tbtestlibrary";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Tbtestlibrary merge(Tbtestlibrary detachedInstance) {
		log.debug("merging Tbtestlibrary instance");
		try {
			Tbtestlibrary result = (Tbtestlibrary) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Tbtestlibrary instance) {
		log.debug("attaching dirty Tbtestlibrary instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Tbtestlibrary instance) {
		log.debug("attaching clean Tbtestlibrary instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TbtestlibraryDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TbtestlibraryDAO) ctx.getBean("TbtestlibraryDAO");
	}
	
	public boolean update(Tbtestlibrary instance) {
		// TODO Auto-generated method stub
			Session session= getSession();
			String hql="update Tbtestlibrary set QuestionID=?,QuestionType=?,QuestionSection=?,Question=?," +
					"SelectA=?,SelectB=?,SelectC=?,SelectD = ?,Answer = ?where QuestionID = ?";
			Query query = session.createQuery(hql);
			query.setInteger(0,instance.getQuestionId() );
			query.setString(1,instance.getQuestionType());
			query.setString(2,instance.getQuestionSection());
			query.setString(3,instance.getQuestion() );
			query.setString(4,instance.getSelectA() );
			query.setString(5,instance.getSelectB() );
			query.setString(6,instance.getSelectC() );
			query.setString(7,instance.getSelectD() );
			query.setString(8,instance.getAnswer());
			query.setInteger(9,instance.getQuestionId() );
			
			query.executeUpdate();
			return true;
	}
}