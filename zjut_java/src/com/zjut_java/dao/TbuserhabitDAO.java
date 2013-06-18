package com.zjut_java.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zjut_java.model.Tbuserhabit;
import com.zjut_java.model.TbuserhabitId;

/**
 * A data access object (DAO) providing persistence and search support for
 * Tbuserhabit entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.zjut_java.model.Tbuserhabit
 * @author MyEclipse Persistence Tools
 */

public class TbuserhabitDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TbuserhabitDAO.class);
	// property constants
	public static final String COUNT1 = "count1";
	public static final String COUNT2 = "count2";
	public static final String COUNT3 = "count3";
	public static final String COUNT4 = "count4";
	public static final String COUNT5 = "count5";
	public static final String COUNT6 = "count6";
	public static final String COUNT7 = "count7";
	public static final String COUNT8 = "count8";
	public static final String COUNT9 = "count9";
	public static final String COUNT10 = "count10";
	public static final String COUNT11 = "count11";
	public static final String COUNT12 = "count12";
	public static final String COUNT13 = "count13";
	public static final String COUNT14 = "count14";
	public static final String COUNT15 = "count15";
	public static final String COUNT16 = "count16";
	public static final String COUNT17 = "count17";
	public static final String COUNT18 = "count18";
	public static final String COUNT19 = "count19";
	public static final String COUNT20 = "count20";
	public static final String COUNT21 = "count21";
	public static final String COUNT22 = "count22";
	public static final String COUNT23 = "count23";
	public static final String COUNT24 = "count24";

	protected void initDao() {
		// do nothing
	}

	public void save(Tbuserhabit transientInstance) {
		log.debug("saving Tbuserhabit instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Tbuserhabit persistentInstance) {
		log.debug("deleting Tbuserhabit instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Tbuserhabit findById(com.zjut_java.model.TbuserhabitId id) {
		log.debug("getting Tbuserhabit instance with id: " + id);
		try {
			Tbuserhabit instance = (Tbuserhabit) getHibernateTemplate().get(
					"com.zjut_java.model.Tbuserhabit", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Tbuserhabit instance) {
		log.debug("finding Tbuserhabit instance by example");
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
		log.debug("finding Tbuserhabit instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Tbuserhabit as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCount1(Object count1) {
		return findByProperty(COUNT1, count1);
	}

	public List findByCount2(Object count2) {
		return findByProperty(COUNT2, count2);
	}

	public List findByCount3(Object count3) {
		return findByProperty(COUNT3, count3);
	}

	public List findByCount4(Object count4) {
		return findByProperty(COUNT4, count4);
	}

	public List findByCount5(Object count5) {
		return findByProperty(COUNT5, count5);
	}

	public List findByCount6(Object count6) {
		return findByProperty(COUNT6, count6);
	}

	public List findByCount7(Object count7) {
		return findByProperty(COUNT7, count7);
	}

	public List findByCount8(Object count8) {
		return findByProperty(COUNT8, count8);
	}

	public List findByCount9(Object count9) {
		return findByProperty(COUNT9, count9);
	}

	public List findByCount10(Object count10) {
		return findByProperty(COUNT10, count10);
	}

	public List findByCount11(Object count11) {
		return findByProperty(COUNT11, count11);
	}

	public List findByCount12(Object count12) {
		return findByProperty(COUNT12, count12);
	}

	public List findByCount13(Object count13) {
		return findByProperty(COUNT13, count13);
	}

	public List findByCount14(Object count14) {
		return findByProperty(COUNT14, count14);
	}

	public List findByCount15(Object count15) {
		return findByProperty(COUNT15, count15);
	}

	public List findByCount16(Object count16) {
		return findByProperty(COUNT16, count16);
	}

	public List findByCount17(Object count17) {
		return findByProperty(COUNT17, count17);
	}

	public List findByCount18(Object count18) {
		return findByProperty(COUNT18, count18);
	}

	public List findByCount19(Object count19) {
		return findByProperty(COUNT19, count19);
	}

	public List findByCount20(Object count20) {
		return findByProperty(COUNT20, count20);
	}

	public List findByCount21(Object count21) {
		return findByProperty(COUNT21, count21);
	}

	public List findByCount22(Object count22) {
		return findByProperty(COUNT22, count22);
	}

	public List findByCount23(Object count23) {
		return findByProperty(COUNT23, count23);
	}

	public List findByCount24(Object count24) {
		return findByProperty(COUNT24, count24);
	}

	public List findAll() {
		log.debug("finding all Tbuserhabit instances");
		try {
			String queryString = "from Tbuserhabit";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Tbuserhabit merge(Tbuserhabit detachedInstance) {
		log.debug("merging Tbuserhabit instance");
		try {
			Tbuserhabit result = (Tbuserhabit) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Tbuserhabit instance) {
		log.debug("attaching dirty Tbuserhabit instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Tbuserhabit instance) {
		log.debug("attaching clean Tbuserhabit instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TbuserhabitDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TbuserhabitDAO) ctx.getBean("TbuserhabitDAO");
	}
}