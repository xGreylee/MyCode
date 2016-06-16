package sms.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.opensymphony.xwork2.ActionContext;

import sms.domain.TStudents;
import sms.utils.HibernateSessionFactory;

public class StuDaoImp implements StuDao {

	private String sno;
	@SuppressWarnings("rawtypes")
	@Override
	public boolean stucheckLogin(String sno, String pwd) {
		
		Session session = HibernateSessionFactory.getSession();
//		session.beginTransaction();
		String hql = "from TStudents as s where s.sno=? and s.pwd=?";
		Query query = session.createQuery(hql);
		query.setParameter(0, sno);
		query.setParameter(1, pwd);
		
		List list = query.list();
		
		if(list.size() > 0) {
			return true;
		}

		
		return false;
		
	}
	
	@SuppressWarnings("finally")
	public List<TStudents> getStudents(){
		
		List<TStudents> stu = null;
		Session session = null;
		ActionContext context = ActionContext.getContext();
		
		try{
			sno= (String) context.getSession().get("sno");
			session = HibernateSessionFactory.getSession();
			Query query = session.createQuery("from TStudents as s where s.sno="+sno);
			stu = query.list();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.closeSession();
			return stu;
		}
		
	}
	
	public boolean stuCorrectPwd(String oldpwd,String newpwd){
		
		return false;
	}

	
	

}
