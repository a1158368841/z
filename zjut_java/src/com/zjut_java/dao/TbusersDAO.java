package com.zjut_java.dao;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zjut_java.model.Tbusers;

/**
 * A data access object (DAO) providing persistence and search support for
 * Tbusers entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.zjut_java.model.Tbusers
 * @author MyEclipse Persistence Tools
 */

public class TbusersDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(TbusersDAO.class);
	// property constants
	public static final String UNIV_ID = "univId";
	public static final String NAME = "name";
	public static final String STUDENT_ID = "studentId";
	public static final String PWD = "pwd";
	public static final String CELL_PHONE = "cellPhone";
	public static final String CLASS_ = "class_";
	public static final String MAJOR = "major";
	public static final String USER_TYPE = "userType";
	public static final String LOGON_COUNT = "logonCount";

	protected void initDao() {
		// do nothing
	}

	public boolean save(Tbusers transientInstance) {
		log.debug("saving Tbusers instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
			return true;
		} catch (RuntimeException re) {
			log.error("save failed", re);
			System.out.println(re.getMessage());
			//throw re;
			return false;
		}
	}

	public void delete(Tbusers persistentInstance) {
		log.debug("deleting Tbusers instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Tbusers findById(java.lang.String id) {
		log.debug("getting Tbusers instance with id: " + id);
		try {
			Tbusers instance = (Tbusers) getHibernateTemplate().get(
					"com.zjut_java.model.Tbusers", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Tbusers instance) {
		log.debug("finding Tbusers instance by example");
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
		log.debug("finding Tbusers instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Tbusers as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUnivId(Object univId) {
		return findByProperty(UNIV_ID, univId);
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByStudentId(Object studentId) {
		return findByProperty(STUDENT_ID, studentId);
	}

	public List findByPwd(Object pwd) {
		return findByProperty(PWD, pwd);
	}

	public List findByCellPhone(Object cellPhone) {
		return findByProperty(CELL_PHONE, cellPhone);
	}

	public List findByClass_(Object class_) {
		return findByProperty(CLASS_, class_);
	}

	public List findByMajor(Object major) {
		return findByProperty(MAJOR, major);
	}

	public List findByUserType(Object userType) {
		return findByProperty(USER_TYPE, userType);
	}

	public List findByLogonCount(Object logonCount) {
		return findByProperty(LOGON_COUNT, logonCount);
	}

	public List findAll() {
		log.debug("finding all Tbusers instances");
		try {
			String queryString = "from Tbusers";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}


	public boolean update(Tbusers tbusers) {
		// TODO Auto-generated method stub
			Session session= getSession();
			String hql="update Tbusers set UnivId=?,name=?,birthday=?,studentId=?," +
					"cellPhone=?,class_=?,major=?,email = ?where userId = ?";
			Query query = session.createQuery(hql);
			query.setInteger(0,tbusers.getUnivId() );
			query.setString(1,tbusers.getName());
			query.setDate(2,tbusers.getBirthday());
			query.setString(3,tbusers.getStudentId() );
			query.setString(4,tbusers.getCellPhone() );
			query.setString(5,tbusers.getClass_() );
			query.setString(6,tbusers.getMajor() );
			query.setString(7,tbusers.getEmail() );
			query.setString(8,tbusers.getUserId());
			
			query.executeUpdate();
			session.close();
			return true;
	}

	public boolean changepwd(String userid, String oldpwd,String newpwd) {
		// TODO Auto-generated method stub
		if(check(userid, oldpwd) != null){
			Session session= getSession();
			String hql="update Tbusers set pwd = ? where userid = ?";
			Query query = session.createQuery(hql);
			query.setString(0, newpwd);
			query.setString(1, userid);
			query.executeUpdate();
			
			session.close();
			return true;
		}
		return false;
	}

	public Tbusers check(String userid, String pwd) {
		// TODO Auto-generated method stub
		Session session =getSession();
		String hql = "from Tbusers where userId=? and pwd=?";
		Query query = session.createQuery(hql);
		query.setString(0,userid);
		query.setString(1,pwd);
		List<Tbusers> list = query.list();
		
		session.close();
		if(!list.isEmpty()){
			return list.get(0);
		}else {
			return null;
		}
		
	}
	
	public boolean incLogonCount(String userid){
		Session session= getSession();
		String hql="update Tbusers set logonCount =logonCount+1 where userId =?";
		Query query = session.createQuery(hql);
		query.setString(0, userid);
		query.executeUpdate();
		session.close();
		return true;
	}
}