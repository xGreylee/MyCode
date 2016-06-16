package sms.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.opensymphony.xwork2.ActionContext;

import sms.domain.TCourses;
import sms.domain.TStudents;
import sms.domain.TTeachers;
import sms.utils.HibernateSessionFactory;

public class CourseDaoImp implements CourseDao {

	private TStudents stu;
	private TTeachers tcr;
	@SuppressWarnings("finally")
	private String sno;
	private String tno;
	ActionContext context = ActionContext.getContext();
	
	public List<TCourses> classScheduleQuery(String hql) {
		
		sno = (String) context.getSession().get("sno");
		hql = "select c.cname,c.classtime,c.classroom from TCourses as c,TSelectCourse as sc, TStudents as s  where sc.TCourses.cno=c.cno and sc.TStudents.sno=s.sno and s.sno="
				+ sno;
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery(hql);
		List result = query.list();
		List<TCourses> courses = new ArrayList<TCourses>();
		
		for(int i=0;i<result.size();i++){
			
			Object[] obj = (Object[]) result.get(i);
			TCourses courses2 = new TCourses();
			courses2.setCname(obj[0].toString());
			courses2.setClasstime(obj[1].toString());
			courses2.setClassroom(obj[2].toString());
			
			courses.add(courses2);
		}
		return courses;
		
	}

	
	@SuppressWarnings({ "unchecked", "finally" })
	@Override
	public List<TCourses> getCourses() {
		List<TCourses> cours = null;
		Session session = null;
		try{
			session = HibernateSessionFactory.getSession();
			Query query = session.createQuery("from TCourses as c");
			cours = query.list();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.closeSession();
			return cours;
		}
		
	
	}
	
	public List<TCourses> teacherClassScheduleQuery(String hql){
		
		tno = (String) context.getSession().get("tno");
		hql="select c.cname,c.classtime,c.classroom from TCourses as c where c.TTeachers.tno=?";
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery(hql);
		query.setParameter(0, tno);

		List result = query.list();
		List<TCourses> courses = new ArrayList<TCourses>();
		
		for(int i=0;i<result.size();i++){
			
			Object[] obj = (Object[]) result.get(i);
			TCourses courses2 = new TCourses();
			courses2.setCname(obj[0].toString());
			courses2.setClasstime(obj[1].toString());
			courses2.setClassroom(obj[2].toString());
			
			courses.add(courses2);
		}
		return courses;
		
	}

	
	
	

	

	
	
}
