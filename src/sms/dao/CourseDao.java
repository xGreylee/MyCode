package sms.dao;

import java.util.ArrayList;
import java.util.List;

import sms.domain.Score;
import sms.domain.TCourses;
import sms.domain.TSysManager;

public interface CourseDao {
	public List<TCourses> classScheduleQuery(String hql);
	public List<TCourses> getCourses();
	public List<TCourses> teacherClassScheduleQuery(String hql);
	public List<Score>ScoreQuery(String hql);

}
