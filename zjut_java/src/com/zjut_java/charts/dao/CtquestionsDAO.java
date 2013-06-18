package com.zjut_java.charts.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zjut_java.charts.model.Ctquestions;

/**
 * A data access object (DAO) providing persistence and search support for
 * Ctquestions entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.zjut_java.charts.model.Ctquestions
 * @author MyEclipse Persistence Tools
 */

public class CtquestionsDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(CtquestionsDAO.class);
	// property constants
	public static final String SUMNUM = "sumnum";
	public static final String WRONGNUM = "wrongnum";
	public static final String WRONG = "wrong";

	protected void initDao() {
		// do nothing
	}

	public void save(Ctquestions transientInstance) {
		log.debug("saving Ctquestions instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Ctquestions persistentInstance) {
		log.debug("deleting Ctquestions instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Ctquestions findById(java.lang.Integer id) {
		log.debug("getting Ctquestions instance with id: " + id);
		try {
			Ctquestions instance = (Ctquestions) getHibernateTemplate().get(
					"com.zjut_java.charts.model.Ctquestions", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Ctquestions instance) {
		log.debug("finding Ctquestions instance by example");
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
		log.debug("finding Ctquestions instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Ctquestions as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findBySumnum(Object sumnum) {
		return findByProperty(SUMNUM, sumnum);
	}

	public List findByWrongnum(Object wrongnum) {
		return findByProperty(WRONGNUM, wrongnum);
	}

	public List findByWrong(Object wrong) {
		return findByProperty(WRONG, wrong);
	}

	public List findAll() {
		log.debug("finding all Ctquestions instances");
		try {
			String queryString = "from Ctquestions";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Ctquestions merge(Ctquestions detachedInstance) {
		log.debug("merging Ctquestions instance");
		try {
			Ctquestions result = (Ctquestions) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Ctquestions instance) {
		log.debug("attaching dirty Ctquestions instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Ctquestions instance) {
		log.debug("attaching clean Ctquestions instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CtquestionsDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (CtquestionsDAO) ctx.getBean("CtquestionsDAO");
	}
	
	public List<Ctquestions> findByNum(){
		Session session = getSession();
		Criteria criteria = session.createCriteria(Ctquestions.class);
		criteria.addOrder(Order.desc("wrongnum"));
		criteria.setFirstResult(0);
		criteria.setMaxResults(10);
		List<Ctquestions> list = criteria.list();
		
		session.close();
		return list;
	}
	
	public List<Ctquestions> findByRate(){
		Session session = getSession();
		Criteria criteria = session.createCriteria(Ctquestions.class);
		criteria.addOrder(Order.desc("wrong"));
		criteria.setFirstResult(0);
		criteria.setMaxResults(10);
		List<Ctquestions> list = criteria.list();
		
		session.close();
		return list;
	}
}