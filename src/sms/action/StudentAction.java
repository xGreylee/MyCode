package sms.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import sms.dao.StuDao;
import sms.dao.StuDaoImp;
import sms.domain.TStudents;

import com.opensymphony.xwork2.ActionSupport;

public class StudentAction extends ActionSupport {

	private String method;
	StuDao sd = new StuDaoImp();
	List<TStudents> stu = sd.getStudents();

	public String execute() throws Exception {
		
		if (method.equals("selectStuInfo")) {
			if (stu.size() != 0) {
				HttpServletRequest request = ServletActionContext.getRequest();
				request.setAttribute("stulist", stu);
				return "stulist";
			}
		}
		return ERROR;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

}
