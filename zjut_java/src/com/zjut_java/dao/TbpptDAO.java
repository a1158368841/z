package com.zjut_java.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zjut_java.model.Tbppt;

/**
 * A data access object (DAO) providing persistence and search support for Tbppt
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.zjut_java.model.Tbppt
 * @author MyEclipse Persistence Tools
 */

public class TbpptDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(TbpptDAO.class);
	// property constants
	public static final String PPTNAME = "pptname";
	public static final String PPTSAVEPATH = "pptsavepath";
	public static final String PPTSIZE = "pptsize";
	public static final String COUNTS = "counts";
	public static final String PPTSECTION = "pptsection";

	protected void initDao() {
		// do nothing
	}

	public void save(Tbppt transientInstance) {
		log.debug("saving Tbppt instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Tbppt persistentInstance) {
		log.debug("deleting Tbppt instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Tbppt findById(java.lang.Integer id) {
		log.debug("getting Tbppt instance with id: " + id);
		try {
			Tbppt instance = (Tbppt) getHibernateTemplate().get(
					"com.zjut_java.model.Tbppt", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Tbppt instance) {
		log.debug("finding Tbppt instance by example");
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
		log.debug("finding Tbppt instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Tbppt as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPptname(Object pptname) {
		return findByProperty(PPTNAME, pptname);
	}

	public List findByPptsavepath(Object pptsavepath) {
		return findByProperty(PPTSAVEPATH, pptsavepath);
	}

	public List findByPptsize(Object pptsize) {
		return findByProperty(PPTSIZE, pptsize);
	}

	public List findByCounts(Object counts) {
		return findByProperty(COUNTS, counts);
	}

	public List findByPptsection(Object pptsection) {
		return findByProperty(PPTSECTION, pptsection);
	}

	public List findAll() {
		log.debug("finding all Tbppt instances");
		try {
			String queryString = "from Tbppt";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Tbppt merge(Tbppt detachedInstance) {
		log.debug("merging Tbppt instance");
		try {
			Tbppt result = (Tbppt) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Tbppt instance) {
		log.debug("attaching dirty Tbppt instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Tbppt instance) {
		log.debug("attaching clean Tbppt instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TbpptDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TbpptDAO) ctx.getBean("TbpptDAO");
	}
}