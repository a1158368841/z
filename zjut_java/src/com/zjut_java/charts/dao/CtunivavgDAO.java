package com.zjut_java.charts.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zjut_java.charts.model.Ctunivavg;

/**
 * A data access object (DAO) providing persistence and search support for
 * Ctunivavg entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.zjut_java.charts.model.Ctunivavg
 * @author MyEclipse Persistence Tools
 */

public class CtunivavgDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(CtunivavgDAO.class);
	// property constants
	public static final String PROVINCE = "province";
	public static final String CITY = "city";
	public static final String AVGSCORE = "avgscore";

	protected void initDao() {
		// do nothing
	}

	public void save(Ctunivavg transientInstance) {
		log.debug("saving Ctunivavg instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Ctunivavg persistentInstance) {
		log.debug("deleting Ctunivavg instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Ctunivavg findById(java.lang.String id) {
		log.debug("getting Ctunivavg instance with id: " + id);
		try {
			Ctunivavg instance = (Ctunivavg) getHibernateTemplate().get(
					"com.zjut_java.charts.model.Ctunivavg", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Ctunivavg instance) {
		log.debug("finding Ctunivavg instance by example");
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
		log.debug("finding Ctunivavg instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Ctunivavg as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByProvince(Object province) {
		return findByProperty(PROVINCE, province);
	}

	public List findByCity(Object city) {
		return findByProperty(CITY, city);
	}

	public List findByAvgscore(Object avgscore) {
		return findByProperty(AVGSCORE, avgscore);
	}

	public List findAll() {
		log.debug("finding all Ctunivavg instances");
		try {
			String queryString = "from Ctunivavg";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Ctunivavg merge(Ctunivavg detachedInstance) {
		log.debug("merging Ctunivavg instance");
		try {
			Ctunivavg result = (Ctunivavg) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Ctunivavg instance) {
		log.debug("attaching dirty Ctunivavg instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Ctunivavg instance) {
		log.debug("attaching clean Ctunivavg instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CtunivavgDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CtunivavgDAO) ctx.getBean("CtunivavgDAO");
	}
}