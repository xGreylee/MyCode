package sms.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * TStudents entity. @author MyEclipse Persistence Tools
 */

public class TStudents implements java.io.Serializable {

	// Fields

	private String sno;
	private String pwd;
	private String sname;
	private Integer age;
	private String sex;
	private String institudes;
	private String classes;
	private Set TSelectCourses = new HashSet(0);

	// Constructors

	/** default constructor */
	public TStudents() {
	}

	/** minimal constructor */
	public TStudents(String sno) {
		this.sno = sno;
	}

	/** full constructor */
	public TStudents(String sno, String pwd, String sname, Integer age,
			String sex, String institudes, String classes, Set TSelectCourses) {
		this.sno = sno;
		this.pwd = pwd;
		this.sname = sname;
		this.age = age;
		this.sex = sex;
		this.institudes = institudes;
		this.classes = classes;
		this.TSelectCourses = TSelectCourses;
	}

	// Property accessors

	public String getSno() {
		return this.sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getInstitudes() {
		return this.institudes;
	}

	public void setInstitudes(String institudes) {
		this.institudes = institudes;
	}

	public String getClasses() {
		return this.classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public Set getTSelectCourses() {
		return this.TSelectCourses;
	}

	public void setTSelectCourses(Set TSelectCourses) {
		this.TSelectCourses = TSelectCourses;
	}

}