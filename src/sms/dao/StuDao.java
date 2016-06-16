package sms.dao;

import java.util.List;

import sms.domain.TStudents;

public interface StuDao {
	public boolean stucheckLogin(String sno,String pwd);
	public List<TStudents> getStudents();
	public boolean stuCorrectPwd(String oldpwd,String newpwd);
}
