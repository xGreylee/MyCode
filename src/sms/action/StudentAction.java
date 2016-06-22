package sms.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import sms.dao.StuDao;
import sms.dao.StuDaoImp;
import sms.domain.TStudents;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class StudentAction extends ActionSupport {

	private String method;
	private String hql;
	private TStudents student;
	public String id;
	private String newpwd;
	
	StuDao sd = new StuDaoImp();
	List<TStudents> stu = sd.getStudents();

	public String getNewpwd() {
		return newpwd;
	}

	public void setNewpwd(String newpwd) {
		this.newpwd = newpwd;
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public TStudents getStudent() {
		return student;
	}

	public void setStudent(TStudents student) {
		this.student = student;
	}

	
	
	public String execute() throws Exception {

		if (method.equals("selectStuInfo")) {
			if (stu.size() != 0) {
				HttpServletRequest request = ServletActionContext.getRequest();
				request.setAttribute("stulist", stu);
				return "stulist";
			}
		}
		if(method.equals("tonewpwd")){
			return "tonewpwd";
		}
		
		if (method.equals("toaddstu")) {
			return "toaddstu";
		}

		if (method.equals("toupdatestu")) {
			student = sd.getStu(id);
			return "toupdatestu";
		}
		
		if(method.equals("toselectstu")){
			return "toselectstu";
		}
		
		if(method.equals("toRepwd")){
			return "toRepwd";
		}
		
		if (method.equals("updatestu")) {
			sd.updateStu(student);
			List<TStudents> stu2 = sd.showStuList(hql);
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setAttribute("allstu", stu2);
			return "allstu";
		}

		if (method.equals("addstu")) {
			if (sd.addStu(student)) {
				List<TStudents> stu2 = sd.showStuList(hql);
				HttpServletRequest request = ServletActionContext.getRequest();
				request.setAttribute("allstu", stu2);
				return "allstu";
			}
		}

		if (method.equals("deletestu")) {
			if (sd.deleteStu(id)) {
				List<TStudents> stu2 = sd.showStuList(hql);
				HttpServletRequest request = ServletActionContext.getRequest();
				request.setAttribute("allstu", stu2);
				return "allstu";
			}
		}
		
		if(method.equals("selectstu")){
			this.student = sd.getStu(student.getSno());
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setAttribute("selectResult", student );
			return "selectResult";
		}


		if(method.equals("updatestupwd")){
			HttpServletRequest request = ServletActionContext.getRequest();
			ActionContext context = ActionContext.getContext();
			id = (String) context.getSession().get("sno");
			TStudents students = sd.getStu(id);
			students.setSno(id);
			students.setPwd(newpwd);
		
			sd.updateStu(students);
			List<TStudents> stus=sd.getStudents();
		
			request.setAttribute("stulist", stus);
			return "stulist";

		}
		

		return ERROR;
	}

}
