package com.zjut_java.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zjut_java.model.Tbtestdetails;
import com.zjut_java.model.TbtestdetailsId;

/**
 * A data access object (DAO) providing persistence and search support for
 * Tbtestdetails entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.zjut_java.model.Tbtestdetails
 * @author MyEclipse Persistence Tools
 */

public class TbtestdetailsDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TbtestdetailsDAO.class);

	// property constants

	protected void initDao() {
		// do nothing
	}

	public boolean save(Tbtestdetails transientInstance) {
		log.debug("saving Tbtestdetails instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
			return true;
		} catch (RuntimeException re) {
			log.error("save failed", re);
		//	throw re;
			return false;
		}
	}

	public void delete(Tbtestdetails persistentInstance) {
		log.debug("deleting Tbtestdetails instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Tbtestdetails findById(com.zjut_java.model.TbtestdetailsId id) {
		log.debug("getting Tbtestdetails instance with id: " + id);
		try {
			Tbtestdetails instance = (Tbtestdetails) getHibernateTemplate()
					.get("com.zjut_java.model.Tbtestdetails", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Tbtestdetails instance) {
		log.debug("finding Tbtestdetails instance by example");
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
		log.debug("finding Tbtestdetails instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Tbtestdetails as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all Tbtestdetails instances");
		try {
			String queryString = "from Tbtestdetails";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Tbtestdetails merge(Tbtestdetails detachedInstance) {
		log.debug("merging Tbtestdetails instance");
		try {
			Tbtestdetails result = (Tbtestdetails) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Tbtestdetails instance) {
		log.debug("attaching dirty Tbtestdetails instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Tbtestdetails instance) {
		log.debug("attaching clean Tbtestdetails instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TbtestdetailsDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TbtestdetailsDAO) ctx.getBean("TbtestdetailsDAO");
	}
}