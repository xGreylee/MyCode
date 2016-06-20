package sms.utils;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.opensymphony.xwork2.ActionContext;

import sms.domain.Score;
import sms.domain.TStudents;
import junit.framework.TestCase;

public class Test extends TestCase {
	public void test(){
		
		Session session = HibernateSessionFactory.getSession();
		String hql = "select s.sno,s.sname from TStudents as s order by s.sno";
		List<TStudents> student = new ArrayList<TStudents>();
		Query query = session.createQuery(hql);
		List result = query.list();

		for (int i = 0; i < result.size(); i++) {
			Object[] obj = (Object[]) result.get(i);
			TStudents student2 = new TStudents();
			System.out.println(obj[0].toString());
			System.out.println(obj[1].toString());
//			student2.setSno(obj[0].toString());
//			student2.setSname(obj[1].toString());
//			student.add(student2);

		}
	}
}
