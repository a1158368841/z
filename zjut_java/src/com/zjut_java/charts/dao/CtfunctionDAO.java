package com.zjut_java.charts.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zjut_java.charts.model.Ctfunction;
import com.zjut_java.charts.model.CtfunctionId;

/**
 * A data access object (DAO) providing persistence and search support for
 * Ctfunction entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.zjut_java.charts.model.Ctfunction
 * @author MyEclipse Persistence Tools
 */

public class CtfunctionDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(CtfunctionDAO.class);

	// property constants

	protected void initDao() {
		// do nothing
	}

	public void save(Ctfunction transientInstance) {
		log.debug("saving Ctfunction instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Ctfunction persistentInstance) {
		log.debug("deleting Ctfunction instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Ctfunction findById(com.zjut_java.charts.model.CtfunctionId id) {
		log.debug("getting Ctfunction instance with id: " + id);
		try {
			Ctfunction instance = (Ctfunction) getHibernateTemplate().get(
					"com.zjut_java.charts.model.Ctfunction", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Ctfunction instance) {
		log.debug("finding Ctfunction instance by example");
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
		log.debug("finding Ctfunction instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Ctfunction as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all Ctfunction instances");
		try {
			String queryString = "from Ctfunction";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Ctfunction merge(Ctfunction detachedInstance) {
		log.debug("merging Ctfunction instance");
		try {
			Ctfunction result = (Ctfunction) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Ctfunction instance) {
		log.debug("attaching dirty Ctfunction instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Ctfunction instance) {
		log.debug("attaching clean Ctfunction instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CtfunctionDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CtfunctionDAO) ctx.getBean("CtfunctionDAO");
	}
}