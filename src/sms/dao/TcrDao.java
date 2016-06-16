package sms.dao;

import java.util.List;

import sms.domain.TTeachers;

public interface TcrDao {
	public boolean tcrcheckLogin(String sno,String pwd);
	public List<TTeachers> getTeachers();
}
