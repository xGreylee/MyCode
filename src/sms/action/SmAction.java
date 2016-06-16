package sms.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import sms.dao.SmDao;
import sms.dao.SmDaoImp;
import sms.domain.TSysManager;

import com.opensymphony.xwork2.ActionSupport;

public class SmAction extends ActionSupport {
	private String method;
	SmDao md = new SmDaoImp();
	List<TSysManager> sm = md.getSysManager();

	public String execute() throws Exception {
		
//		if (method.equals("")) {
//				return SUCCESS;
//			}
//		}
		return ERROR;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}
}
