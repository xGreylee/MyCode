package sms.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import sms.dao.SmDao;
import sms.dao.SmDaoImp;
import sms.dao.StuDao;
import sms.dao.StuDaoImp;
import sms.dao.TcrDao;
import sms.dao.TcrDaoImp;
import sms.domain.TStudents;
import sms.domain.TSysManager;
import sms.domain.TTeachers;

import com.opensymphony.xwork2.ActionSupport;

public class SmAction extends ActionSupport {
	
	private String method;
	private String hql;
	
	SmDao md = new SmDaoImp();
	StuDao sd = new StuDaoImp();
	TcrDao td = new TcrDaoImp();
	List<TSysManager> sm = md.getSysManager();
	
	public String execute() throws Exception {
		
		if (method.equals("stumanage")) {
			List<TStudents> stu = sd.showStuList(hql);
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setAttribute("allstu", stu);
			return "allstu";
			}
		
		if (method.equals("tcrmanage")) {
			List<TTeachers> tcr = td.showTcrList(hql);
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setAttribute("alltcr", tcr);
			return "alltcr";
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
