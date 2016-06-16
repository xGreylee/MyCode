package sms.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import sms.dao.TcrDao;
import sms.dao.TcrDaoImp;
import sms.domain.TTeachers;

import com.opensymphony.xwork2.ActionSupport;

public class TeacherAction extends ActionSupport {
	
	private String method;
	TcrDao td = new TcrDaoImp();
	List<TTeachers> tcr = td.getTeachers();

	public String execute() throws Exception {
		
		if (method.equals("selectTcrInfo")) {
			System.out.println("666");
			
			if (tcr.size() != 0) {
				System.out.println("777");
				HttpServletRequest request = ServletActionContext.getRequest();
				request.setAttribute("tcrlist", tcr);
				return "tcrlist";
			}else{
				System.out.println("error");
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
