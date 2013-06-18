package com.zjut_java.dao;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zjut_java.model.Tbsystemlog;

/**
 * A data access object (DAO) providing persistence and search support for
 * Tbsystemlog entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.zjut_java.model.Tbsystemlog
 * @author MyEclipse Persistence Tools
 */

public class TbsystemlogDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TbsystemlogDAO.class);
	// property constants
	public static final String USER_ID = "userId";
	public static final String REC_CONTENT = "recContent";

	protected void initDao() {
		// do nothing
	}

	public void save(Tbsystemlog transientInstance) {
		log.debug("saving Tbsystemlog instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Tbsystemlog persistentInstance) {
		log.debug("deleting Tbsystemlog instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Tbsystemlog findById(java.lang.Integer id) {
		log.debug("getting Tbsystemlog instance with id: " + id);
		try {
			Tbsystemlog instance = (Tbsystemlog) getHibernateTemplate().get(
					"com.zjut_java.model.Tbsystemlog", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Tbsystemlog instance) {
		log.debug("finding Tbsystemlog instance by example");
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
		log.debug("finding Tbsystemlog instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Tbsystemlog as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List findByRecContent(Object recContent) {
		return findByProperty(REC_CONTENT, recContent);
	}

	public List findAll() {
		log.debug("finding all Tbsystemlog instances");
		try {
			String queryString = "from Tbsystemlog";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Tbsystemlog merge(Tbsystemlog detachedInstance) {
		log.debug("merging Tbsystemlog instance");
		try {
			Tbsystemlog result = (Tbsystemlog) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Tbsystemlog instance) {
		log.debug("attaching dirty Tbsystemlog instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Tbsystemlog instance) {
		log.debug("attaching clean Tbsystemlog instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TbsystemlogDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TbsystemlogDAO) ctx.getBean("TbsystemlogDAO");
	}
}