package sms.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.opensymphony.xwork2.ActionContext;

import sms.domain.TSysManager;
import sms.domain.TTeachers;
import sms.utils.HibernateSessionFactory;


public class SmDaoImp implements SmDao {

	private String id;
	@SuppressWarnings("rawtypes")
	@Override
	public boolean smcheckLogin(String id, String pwd) {
		Session session = HibernateSessionFactory.getSession();
//		session.beginTransaction();
		String hql = "from TSysManager as m where m.id=? and m.pwd=?";
		Query query = session.createQuery(hql);
		query.setParameter(0, id);
		query.setParameter(1, pwd);
		
		List list = query.list();
		
		if(list.size() > 0) {
			return true;
		}

		
		return false;
		
	}

	@SuppressWarnings({ "unchecked", "finally" })
	@Override
	public List<TSysManager> getSysManager() {
		List<TSysManager> sm = null;
		Session session = null;
		ActionContext context = ActionContext.getContext();
		
		try{
			id= (String) context.getSession().get("id");
			session = HibernateSessionFactory.getSession();
			Query query = session.createQuery("from TSysManager as m where m.id="+id);
			sm = query.list();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.closeSession();
			return sm;
		}
	}
	
}
