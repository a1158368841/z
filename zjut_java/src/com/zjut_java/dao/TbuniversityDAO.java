package com.zjut_java.dao;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zjut_java.model.Tbuniversity;
import com.zjut_java.model.Tbusers;

/**
 * A data access object (DAO) providing persistence and search support for
 * Tbuniversity entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.zjut_java.model.Tbuniversity
 * @author MyEclipse Persistence Tools
 */

public class TbuniversityDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TbuniversityDAO.class);
	// property constants
	public static final String UNIV_NAME = "univName";
	public static final String CITY = "city";
	public static final String PROVINCE = "province";
	public static final String ADDRESS = "address";
	public static final String POST_CODE = "postCode";
	public static final String TELEPHONE = "telephone";
	public static final String URL = "url";
	public static final String U211 = "u211";
	public static final String U985 = "u985";

	protected void initDao() {
		// do nothing
	}

	public boolean save(Tbuniversity transientInstance) {
		log.debug("saving Tbuniversity instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
			return true;
		} catch (RuntimeException re) {
			log.error("save failed", re);
			return false;
			//throw re;
		}
	}

	public boolean delete(Tbuniversity persistentInstance) {
		log.debug("deleting Tbuniversity instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
			return true;
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			//throw re;
			return false;
		}
	}

	public Tbuniversity findById(java.lang.Integer id) {
		log.debug("getting Tbuniversity instance with id: " + id);
		try {
			Tbuniversity instance = (Tbuniversity) getHibernateTemplate().get(
					"com.zjut_java.model.Tbuniversity", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Tbuniversity instance) {
		log.debug("finding Tbuniversity instance by example");
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
		log.debug("finding Tbuniversity instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Tbuniversity as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUnivName(Object univName) {
		return findByProperty(UNIV_NAME, univName);
	}

	public List findByCity(Object city) {
		return findByProperty(CITY, city);
	}

	public List findByProvince(Object province) {
		return findByProperty(PROVINCE, province);
	}

	public List findByAddress(Object address) {
		return findByProperty(ADDRESS, address);
	}

	public List findByPostCode(Object postCode) {
		return findByProperty(POST_CODE, postCode);
	}

	public List findByTelephone(Object telephone) {
		return findByProperty(TELEPHONE, telephone);
	}

	public List findByUrl(Object url) {
		return findByProperty(URL, url);
	}

	public List findByU211(Object u211) {
		return findByProperty(U211, u211);
	}

	public List findByU985(Object u985) {
		return findByProperty(U985, u985);
	}

	public List findAll() {
		log.debug("finding all Tbuniversity instances");
		try {
			String queryString = "from Tbuniversity";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Tbuniversity merge(Tbuniversity detachedInstance) {
		log.debug("merging Tbuniversity instance");
		try {
			Tbuniversity result = (Tbuniversity) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}
	
	public boolean update(Tbuniversity u){
		try{
			getHibernateTemplate().update(u);
			return true;
		}catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
		
	}

	public static TbuniversityDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TbuniversityDAO) ctx.getBean("TbuniversityDAO");
	}
	
	public List<String> findProvinces(){
		Session session =getSession();
		String hql = "select province from Tbuniversity group by province";
		Query query = session.createQuery(hql);
		List<String> list = query.list();
		
		session.close();
		return list;
	}
	
	public List<String> findCities(String province){
		System.out.println(province);
		Session session =getSession();
		String hql = "select city from Tbuniversity where province=? group by city";
		Query query = session.createQuery(hql);
		query.setString(0, province);
		List<String> list = query.list();		
		session.close();
		return list;
	}
	
	public List<Tbuniversity> findUnivs(String province,String city){
		Session session =getSession();
		String hql = "from Tbuniversity where province=? and city=?";
		Query query = session.createQuery(hql);
		query.setString(0, province);
		query.setString(1, city);
		List<Tbuniversity> list = query.list();		
		session.close();
		return list;
	}
}