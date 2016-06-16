package sms.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.opensymphony.xwork2.ActionContext;

import sms.domain.TStudents;
import sms.domain.TTeachers;
import sms.utils.HibernateSessionFactory;

public class TcrDaoImp implements TcrDao{

	private String tno;
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
	
}
