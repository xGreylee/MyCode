package sms.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * TCourses entity. @author MyEclipse Persistence Tools
 */

public class TCourses implements java.io.Serializable {

	// Fields

	private String cno;
	private TTeachers TTeachers;
	private String cname;
	private String classtime;
	private String classroom;
	private Set TSelectCourses = new HashSet(0);

	// Constructors

	/** default constructor */
	public TCourses() {
	}

	/** minimal constructor */
	public TCourses(String cno) {
		this.cno = cno;
	}

	/** full constructor */
	public TCourses(String cno, TTeachers TTeachers, String cname,
			String classtime, String classroom, Set TSelectCourses) {
		this.cno = cno;
		this.TTeachers = TTeachers;
		this.cname = cname;
		this.classtime = classtime;
		this.classroom = classroom;
		this.TSelectCourses = TSelectCourses;
	}

	// Property accessors

	public String getCno() {
		return this.cno;
	}

	public void setCno(String cno) {
		this.cno = cno;
	}

	public TTeachers getTTeachers() {
		return this.TTeachers;
	}

	public void setTTeachers(TTeachers TTeachers) {
		this.TTeachers = TTeachers;
	}

	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getClasstime() {
		return this.classtime;
	}

	public void setClasstime(String classtime) {
		this.classtime = classtime;
	}

	public String getClassroom() {
		return this.classroom;
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	public Set getTSelectCourses() {
		return this.TSelectCourses;
	}

	public void setTSelectCourses(Set TSelectCourses) {
		this.TSelectCourses = TSelectCourses;
	}

}