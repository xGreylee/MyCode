package sms.dao;

import java.io.Serializable;
import java.util.List;

import sms.domain.TStudents;

public interface StuDao {
	public boolean stucheckLogin(String sno,String pwd);
	public List<TStudents> getStudents();

//	public TStudents getStu(Class clazz, Serializable id);
	public TStudents getStu(String id);
	public boolean updateStu(TStudents entity);
	public boolean deleteStu(String id);
	public boolean addStu(TStudents entity);
	public List<TStudents> showStuList(String hql);
}
