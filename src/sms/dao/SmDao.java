package sms.dao;

import java.util.List;



import sms.domain.TSysManager;

public interface SmDao {
	public boolean smcheckLogin(String id,String pwd);
	public List<TSysManager> getSysManager();
	public TSysManager getSm(String id);
	public boolean updateSm(TSysManager entity);
}
