package com.zjut_java.dao;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zjut_java.model.Tbtest;
import com.zjut_java.model.TbtestId;

/**
 * A data access object (DAO) providing persistence and search support for
 * Tbtest entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.zjut_java.model.Tbtest
 * @author MyEclipse Persistence Tools
 */

public class TbtestDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(TbtestDAO.class);

	// property constants

	protected void initDao() {
		// do nothing
	}

	public void save(Tbtest transientInstance) {
		log.debug("saving Tbtest instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Tbtest persistentInstance) {
		log.debug("deleting Tbtest instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Tbtest findById(com.zjut_java.model.TbtestId id) {
		log.debug("getting Tbtest instance with id: " + id);
		try {
			Tbtest instance = (Tbtest) getHibernateTemplate().get(
					"com.zjut_java.model.Tbtest", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Tbtest instance) {
		log.debug("finding Tbtest instance by example");
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
		log.debug("finding Tbtest instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Tbtest as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all Tbtest instances");
		try {
			String queryString = "from Tbtest";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Tbtest merge(Tbtest detachedInstance) {
		log.debug("merging Tbtest instance");
		try {
			Tbtest result = (Tbtest) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Tbtest instance) {
		log.debug("attaching dirty Tbtest instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Tbtest instance) {
		log.debug("attaching clean Tbtest instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TbtestDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TbtestDAO) ctx.getBean("TbtestDAO");
	}
}