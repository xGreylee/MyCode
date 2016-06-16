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
import sms.domain.TCourses;
import sms.domain.TStudents;
import sms.domain.TSysManager;
import sms.domain.TTeachers;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String flag;
	private TStudents stu;
	private TTeachers tcr;
	private TSysManager sm;
	private String method;
	
	StuDao sdi = new StuDaoImp() ;
	TcrDao tdi = new TcrDaoImp();
	SmDao  mdi = new SmDaoImp();
	
	
	private String username;
//	private String sno;
//	private String tno;
//	private String id;
	private String pwd;
	
	
	public String execute() throws Exception{
		
		if(flag.equals("a")){
			if(sdi.stucheckLogin(username, pwd)){
				ActionContext context = ActionContext.getContext();
				context.getSession().put("sno", username);
				context.getSession().put("oldpwd",pwd);

				return "student";
			}
		}else if(flag.equals("b")){
			if(tdi.tcrcheckLogin(username, pwd)){
				ActionContext context = ActionContext.getContext();
				context.getSession().put("tno", username);
				
				return "teacher";
			}
		}else if(flag.equals("c")){
			if(mdi.smcheckLogin(username, pwd)){
				ActionContext context = ActionContext.getContext();
				context.getSession().put("id", username);
				
				return "manager";
			}
		}
		return INPUT;
		 
	}

	
	public TStudents getStu() {
		return stu;
	}

	public void setStu(TStudents stu) {
		this.stu = stu;
	}


//	public String getSno() {
//		return sno;
//	}
//
//	public void setSno(String sno) {
//		this.sno = sno;
//	}

	public TTeachers getTcr() {
		return tcr;
	}

	public void setTcr(TTeachers tcr) {
		this.tcr = tcr;
	}

	public TSysManager getSm() {
		return sm;
	}

	public void setSm(TSysManager sm) {
		this.sm = sm;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	
}
