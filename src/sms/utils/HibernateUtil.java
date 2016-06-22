package sms.utils;


import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sms.domain.TStudents;
import sms.domain.TSysManager;
import sms.domain.TTeachers;


public class HibernateUtil {

	
	// 增加操作
	public static boolean add(Object entity) {
		Session session = null;
		Transaction tran = null;
		
		try {
			session = HibernateSessionFactory.getSession();
			tran = session.beginTransaction();
			session.save(entity);
			tran.commit();
			return true;
		} catch (Exception e) {
			System.out.println("插入数据出错");
			return false;
		}finally{
			HibernateSessionFactory.closeSession();
		}

	}

	// 删除操作
	public static boolean deleteStu(String id) {
		Session session = null;
		Transaction tran = null;
		
		try {
			session = HibernateSessionFactory.getSession();
			tran = session.beginTransaction();
			TStudents stu =(TStudents)session.load(TStudents.class, id);
			session.delete(stu);
			tran.commit();
			return true;
		} catch (Exception e) {
			System.out.println("删除数据出错");
			return false;
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}

	public static boolean deleteTcr(String id) {
		Session session = null;
		Transaction tran = null;
		
		try {
			session = HibernateSessionFactory.getSession();
			tran = session.beginTransaction();
			TTeachers tcr =(TTeachers)session.load(TTeachers.class, id);
			session.delete(tcr);
			tran.commit();
			return true;
		} catch (Exception e) {
			System.out.println("删除数据出错");
			return false;
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}
	// 更新操作
	public static boolean updateStu(TStudents entity) {
		Session session = null;
		Transaction tran = null;
//		TStudents newStu = new TStudents();
		try {
			session = HibernateSessionFactory.getSession();
			tran = session.beginTransaction();
			session.update(entity);
			tran.commit();
			return true;
		} catch (Exception e) {
			System.out.println("更新数据出错");
			e.printStackTrace();
			return false;
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}

	public static boolean updateTcr(TTeachers entity) {
		Session session = null;
		Transaction tran = null;
		
		try {
			session = HibernateSessionFactory.getSession();
			tran = session.beginTransaction();
			session.update(entity);
			tran.commit();
			return true;
		} catch (Exception e) {
			System.out.println("更新数据出错");
			return false;
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}
	
	public static boolean updateSm(TSysManager entity) {
		Session session = null;
		Transaction tran = null;
		
		try {
			session = HibernateSessionFactory.getSession();
			tran = session.beginTransaction();
			session.update(entity);
			tran.commit();
			return true;
		} catch (Exception e) {
			System.out.println("更新数据出错");
			e.printStackTrace();
			return false;
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}
	
	// session查询操作
	@SuppressWarnings("finally")
	public static Object select(Class clazz, Serializable id) {
		Session session = null;
//		Transaction tran = null;
		Object obj = null;
		try {
			session = HibernateSessionFactory.getSession();
		//	tran = s.beginTransaction();
			obj = session.get(clazz, id);
		//	tran.commit();
		} catch (Exception e) {
			System.out.println("查询发生错误");
		}finally{
			HibernateSessionFactory.closeSession();
			return obj;
		}
		
		
	}
	
	





	
}

