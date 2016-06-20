package sms.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Query;
import org.hibernate.Session;

import sms.dao.CourseDao;
import sms.dao.CourseDaoImp;
import sms.domain.Score;
import sms.domain.TCourses;
import sms.domain.TSelectCourse;
import sms.utils.HibernateSessionFactory;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CourseAction extends ActionSupport {

	private String method;
	public String sno;
	public String tno;
	private TCourses course;
	private String hql;
	

	CourseDao cd = new CourseDaoImp();
	ActionContext context = ActionContext.getContext();

	public String execute() throws Exception {

		if (method.equals("scheduleQuery")) {

			List<TCourses> courses = cd.classScheduleQuery(hql);
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setAttribute("list", courses);
			return "list";
			
		}
		
		if (method.equals("tcrScheduleQuery")) {

			List<TCourses> courses =cd.teacherClassScheduleQuery(hql);
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setAttribute("tclist", courses);
			return "tclist";
			
		}
		
		
		if(method.equals("scoreQuery")){
			
			List<Score> score2 = new ArrayList<Score>();
			score2  = cd.ScoreQuery(hql);
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setAttribute("scorelist", score2);
			return "scorelist";
		}
		
		
		
		
		
		return ERROR;
	}

	
	
	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	 public TCourses getCourse() {
	 return course;
	 }
	
	 public void setCourse(TCourses course) {
	 this.course = course;
	 }

}
