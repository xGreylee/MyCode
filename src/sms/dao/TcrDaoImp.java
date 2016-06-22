package sms.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.opensymphony.xwork2.ActionContext;

import sms.domain.TStudents;
import sms.domain.TTeachers;
import sms.utils.HibernateSessionFactory;
import sms.utils.HibernateUtil;

public class TcrDaoImp implements TcrDao{

	private String tno;
	private String pwd;
	
	@Override
	public boolean tcrcheckLogin(String tno, String pwd) {
		Session session = HibernateSessionFactory.getSession();
		String hql = "from TTeachers as t where t.tno=? and t.pwd=?";
		Query query = session.createQuery(hql);
		query.setParameter(0, tno);
		query.setParameter(1, pwd);
		
		List list = query.list();
		
		if(list.size() > 0) {
			return true;
		}

		return false;
	}

	
	@SuppressWarnings({ "unchecked", "finally" })
	@Override
	public List<TTeachers> getTeachers() {
		
		List<TTeachers> tcr = null;
		Session session = null;
		ActionContext context = ActionContext.getContext();
		
		try{
			tno= (String) context.getSession().get("tno");
			session = HibernateSessionFactory.getSession();
			Query query = session.createQuery( "from TTeachers as t where t.tno=?");
			query.setParameter(0, tno);
			tcr = query.list();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.closeSession();
			return tcr;
		}
	}
	
	
	public TTeachers getTcr(String id) {
    	try {
			Session session = HibernateSessionFactory.getSession();
			
			String sql = "from TTeachers as t where t.tno=?";
			Query query = session.createQuery(sql);
			query.setParameter(0, id);
			List result = query.list();
			if(result.size()>0) {
				for(Iterator it=result.iterator(); it.hasNext();) {
					TTeachers tcr = (TTeachers)it.next();
					return tcr;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			HibernateSessionFactory.closeSession();
			
		}
    	return null;
    }
	
	
	public List<TTeachers> showTcrList(String hql) {
		Session session = HibernateSessionFactory.getSession();
		hql = "select t.tno,t.tname from TTeachers as t order by t.tno";
		List<TTeachers> teacher = new ArrayList<TTeachers>();
		Query query = session.createQuery(hql);
		List result = query.list();

		for (int i = 0; i < result.size(); i++) {
			Object[] obj = (Object[]) result.get(i);
			TTeachers teacher2 = new TTeachers();
			teacher2.setTno(obj[0].toString());
			teacher2.setTname(obj[1].toString());
			teacher.add(teacher2);

		}
		HibernateSessionFactory.closeSession();
		return teacher;
	}
	
	
//	public TTeachers getTcr(Class clazz, Serializable id) {
//
//		return HibernateUtil.select(clazz, id) != null ? (TTeachers) HibernateUtil
//				.select(clazz, id) : null;
//
//	}

	public boolean updateTcr(TTeachers entity) {

		return HibernateUtil.updateTcr(entity);

	}

	public boolean deleteTcr(String id) {

		return HibernateUtil.deleteTcr(id);

	}

	public boolean addTcr(TTeachers entity) {

		return HibernateUtil.add(entity);

	}
}
