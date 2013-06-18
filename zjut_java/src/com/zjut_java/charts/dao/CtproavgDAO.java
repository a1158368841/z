package com.zjut_java.charts.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zjut_java.charts.model.Ctproavg;

/**
 * A data access object (DAO) providing persistence and search support for
 * Ctproavg entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.zjut_java.charts.model.Ctproavg
 * @author MyEclipse Persistence Tools
 */

public class CtproavgDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(CtproavgDAO.class);
	// property constants
	public static final String AVGSCORE = "avgscore";

	protected void initDao() {
		// do nothing
	}

	public void save(Ctproavg transientInstance) {
		log.debug("saving Ctproavg instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Ctproavg persistentInstance) {
		log.debug("deleting Ctproavg instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Ctproavg findById(java.lang.String id) {
		log.debug("getting Ctproavg instance with id: " + id);
		try {
			Ctproavg instance = (Ctproavg) getHibernateTemplate().get(
					"com.zjut_java.charts.model.Ctproavg", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Ctproavg instance) {
		log.debug("finding Ctproavg instance by example");
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
		log.debug("finding Ctproavg instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Ctproavg as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByAvgscore(Object avgscore) {
		return findByProperty(AVGSCORE, avgscore);
	}

	public List findAll() {
		log.debug("finding all Ctproavg instances");
		try {
			String queryString = "from Ctproavg";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Ctproavg merge(Ctproavg detachedInstance) {
		log.debug("merging Ctproavg instance");
		try {
			Ctproavg result = (Ctproavg) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Ctproavg instance) {
		log.debug("attaching dirty Ctproavg instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Ctproavg instance) {
		log.debug("attaching clean Ctproavg instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CtproavgDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CtproavgDAO) ctx.getBean("CtproavgDAO");
	}
}