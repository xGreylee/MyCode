package sms.dao;

import java.io.Serializable;
import java.util.List;

import sms.domain.TStudents;
import sms.domain.TTeachers;

public interface TcrDao {
	public boolean tcrcheckLogin(String sno,String pwd);
	public List<TTeachers> getTeachers();
	public List<TTeachers> showTcrList(String hql);
	public TTeachers getTcr(Class clazz, Serializable id);
	public boolean updateTcr(TTeachers entity);
	public boolean deleteTcr(String id);
	public boolean addTcr(TTeachers entity);
	
}
