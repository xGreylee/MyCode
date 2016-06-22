package sms.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.opensymphony.xwork2.ActionContext;

import sms.domain.TCourses;
import sms.domain.TStudents;
import sms.utils.HibernateSessionFactory;
import sms.utils.HibernateUtil;

public class StuDaoImp implements StuDao {

	private String sno;


	@SuppressWarnings("rawtypes")
	@Override
	public boolean stucheckLogin(String sno, String pwd) {

		Session session = HibernateSessionFactory.getSession();
		// session.beginTransaction();
		String hql = "from TStudents as s where s.sno=? and s.pwd=?";
		Query query = session.createQuery(hql);
		query.setParameter(0, sno);
		query.setParameter(1, pwd);

		List list = query.list();

		if (list.size() > 0) {
			return true;
		}

		return false;

	}

	@SuppressWarnings("finally")
	public List<TStudents> getStudents() {

		List<TStudents> stu = null;
		Session session = null;
		ActionContext context = ActionContext.getContext();

		try {
			sno = (String) context.getSession().get("sno");
			session = HibernateSessionFactory.getSession();
			Query query = session
					.createQuery("from TStudents as s where s.sno=" + sno);
			stu = query.list();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			HibernateSessionFactory.closeSession();
			return stu;
		}

	}

	
	public List<TStudents> showStuList(String hql) {
		Session session = HibernateSessionFactory.getSession();
		hql = "select s.sno,s.sname from TStudents as s order by s.sno";
		List<TStudents> student = new ArrayList<TStudents>();
		Query query = session.createQuery(hql);
		List result = query.list();

		for (int i = 0; i < result.size(); i++) {
			Object[] obj = (Object[]) result.get(i);
			TStudents student2 = new TStudents();
			student2.setSno(obj[0].toString());
			student2.setSname(obj[1].toString());
			student.add(student2);

		}
		HibernateSessionFactory.closeSession();
		return student;
	}

//	public TStudents getStu(Class clazz, Serializable id) {
//
//		return HibernateUtil.select(clazz, id) != null ? (TStudents) HibernateUtil
//				.select(clazz, id) : null;
//
//	}
	
	public TStudents getStu(String id) {
    	try {
			Session session = HibernateSessionFactory.getSession();
			
			String sql = "from TStudents as s where s.sno=?";
			Query query = session.createQuery(sql);
			query.setParameter(0, id);
			List result = query.list();
			if(result.size()>0) {
				for(Iterator it=result.iterator(); it.hasNext();) {
					TStudents stu = (TStudents)it.next();
					return stu;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			HibernateSessionFactory.closeSession();
			
		}
    	return null;
    }
	
	public boolean updateStu(TStudents entity) {

		return HibernateUtil.updateStu(entity);

	}

	public boolean deleteStu(String id) {

		return HibernateUtil.deleteStu(id);

	}

	public boolean addStu(TStudents entity) {

		return HibernateUtil.add(entity);

	}

}
