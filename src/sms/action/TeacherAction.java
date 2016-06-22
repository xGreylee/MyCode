package sms.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import sms.dao.TcrDao;
import sms.dao.TcrDaoImp;
import sms.domain.TStudents;
import sms.domain.TTeachers;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class TeacherAction extends ActionSupport {
	
	private String method;
	private String hql;
	private String id;
	private String newpwd;
	private TTeachers teacher;
	TcrDao td = new TcrDaoImp();
	List<TTeachers> tcr = td.getTeachers();

	
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

	public TTeachers getTeacher() {
		return teacher;
	}

	public void setTeacher(TTeachers teacher) {
		this.teacher = teacher;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}
	
	
	public String execute() throws Exception {
		
		if (method.equals("selectTcrInfo")) {

			if (tcr.size() != 0) {
				HttpServletRequest request = ServletActionContext.getRequest();
				request.setAttribute("tcrlist", tcr);
				return "tcrlist";
			}else{
				System.out.println("error");
			}
		}
		
		if (method.equals("toaddtcr")) {
			return "toaddtcr";
		}

		if (method.equals("toupdatetcr")) {
			teacher = td.getTcr(id);
			return "toupdatetcr";
		}
		
		if(method.equals("toselecttcr")){
			return "toselecttcr";
		}
		
		if(method.equals("toRepwd")){
			return "toRepwd";
		}
		
		if (method.equals("updatetcr")) {
			td.updateTcr(teacher);
			List<TTeachers> tcr2 = td.showTcrList(hql);
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setAttribute("alltcr", tcr2);
			return "alltcr";
		}

		if (method.equals("addtcr")) {
			if (td.addTcr(teacher)) {
				List<TTeachers> tcr2 = td.showTcrList(hql);
				HttpServletRequest request = ServletActionContext.getRequest();
				request.setAttribute("alltcr", tcr2);
				return "alltcr";
			}
		}

		if (method.equals("deletetcr")) {
			if (td.deleteTcr(id)) {
				List<TTeachers> tcr2 = td.showTcrList(hql);
				HttpServletRequest request = ServletActionContext.getRequest();
				request.setAttribute("alltcr", tcr2);
				return "alltcr";
			}
		}
		
		if(method.equals("selecttcr")){
			
			this.teacher = td.getTcr(teacher.getTno());
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setAttribute("selectTcrResult", teacher );
			return "selectTcrResult";
		}
		
		if(method.equals("updatetcrpwd")){
			HttpServletRequest request = ServletActionContext.getRequest();
			ActionContext context = ActionContext.getContext();
			id = (String) context.getSession().get("tno");
			TTeachers teachers =td.getTcr(id);
			teachers.setTno(id);
			teachers.setPwd(newpwd);
			td.updateTcr(teachers);
			List<TTeachers> tcrs = td.getTeachers();
		
			request.setAttribute("tcrlist", tcrs);
			return "tcrlist";
		}
		return ERROR;
	}


}
