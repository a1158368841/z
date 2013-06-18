package com.zjut_java.charts.dao;

import java.sql.PreparedStatement;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zjut_java.charts.model.Ctdetail;
import com.zjut_java.charts.model.Ctquestions;

/**
 * A data access object (DAO) providing persistence and search support for
 * Ctdetail entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.zjut_java.charts.model.Ctdetail
 * @author MyEclipse Persistence Tools
 */

public class CtdetailDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(CtdetailDAO.class);
	// property constants
	public static final String USERID = "userid";
	public static final String PROVINCE = "province";
	public static final String CITY = "city";
	public static final String UNIVNAME = "univname";
	public static final String USE_TIME = "useTime";
	public static final String SCORE = "score";

	protected void initDao() {
		// do nothing
	}

	public void save(Ctdetail transientInstance) {
		log.debug("saving Ctdetail instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Ctdetail persistentInstance) {
		log.debug("deleting Ctdetail instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Ctdetail findById(java.lang.Integer id) {
		log.debug("getting Ctdetail instance with id: " + id);
		try {
			Ctdetail instance = (Ctdetail) getHibernateTemplate().get(
					"com.zjut_java.charts.model.Ctdetail", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Ctdetail instance) {
		log.debug("finding Ctdetail instance by example");
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
		log.debug("finding Ctdetail instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Ctdetail as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUserid(Object userid) {
		return findByProperty(USERID, userid);
	}

	public List findByProvince(Object province) {
		return findByProperty(PROVINCE, province);
	}

	public List findByCity(Object city) {
		return findByProperty(CITY, city);
	}

	public List findByUnivname(Object univname) {
		return findByProperty(UNIVNAME, univname);
	}

	public List findByUseTime(Object useTime) {
		return findByProperty(USE_TIME, useTime);
	}

	public List findByScore(Object score) {
		return findByProperty(SCORE, score);
	}

	public List findAll() {
		log.debug("finding all Ctdetail instances");
		try {
			String queryString = "from Ctdetail";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Ctdetail merge(Ctdetail detachedInstance) {
		log.debug("merging Ctdetail instance");
		try {
			Ctdetail result = (Ctdetail) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Ctdetail instance) {
		log.debug("attaching dirty Ctdetail instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Ctdetail instance) {
		log.debug("attaching clean Ctdetail instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CtdetailDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CtdetailDAO) ctx.getBean("CtdetailDAO");
	}
	
	public List<Ctdetail> queryTime(){
		Session session = getSession();
		String hql="from Ctdetail";
		Query query = session.createQuery(hql);
		List<Ctdetail> list = query.list();
		session.close();
		return list;
	}
}