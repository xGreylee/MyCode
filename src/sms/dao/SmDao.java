package sms.dao;

import java.util.List;


import sms.domain.TSysManager;

public interface SmDao {
	public boolean smcheckLogin(String id,String pwd);
	public List<TSysManager> getSysManager();
}
