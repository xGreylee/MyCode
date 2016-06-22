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

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SmAction extends ActionSupport {
	
	private String method;
	private String hql;
	private String smid;
	private String newpwd;
	private TSysManager manager;
	
	SmDao md = new SmDaoImp();
	StuDao sd = new StuDaoImp();
	TcrDao td = new TcrDaoImp();
	
	
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
		
		if(method.equals("toRepwd")){
			return "toRepwd";
		}
		
		if(method.equals("updatesmpwd")){
			HttpServletRequest request = ServletActionContext.getRequest();
			ActionContext context = ActionContext.getContext();
			smid = (String) context.getSession().get("id");
			TSysManager managers = md.getSm(smid);
			managers.setId(smid);
			managers.setPwd(newpwd);
			md.updateSm(managers);
			List<TSysManager> sm = md.getSysManager();
			
			request.setAttribute("smlist", sm);
			return "smlist";
		}

		return ERROR;
		}
		
	

	public String getSmid() {
		return smid;
	}

	public void setSmid(String smid) {
		this.smid = smid;
	}
	
	public String getNewpwd() {
		return newpwd;
	}

	public void setNewpwd(String newpwd) {
		this.newpwd = newpwd;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public TSysManager getManager() {
		return manager;
	}

	public void setManager(TSysManager manager) {
		this.manager = manager;
	}
	
	
}
