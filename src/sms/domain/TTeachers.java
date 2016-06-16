package sms.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * TTeachers entity. @author MyEclipse Persistence Tools
 */

public class TTeachers implements java.io.Serializable {

	// Fields

	private String tno;
	private String pwd;
	private String tname;
	private Integer age;
	private String institude;
	private Set TCourseses = new HashSet(0);
	private Set TCourseses_1 = new HashSet(0);

	// Constructors

	/** default constructor */
	public TTeachers() {
	}

	/** minimal constructor */
	public TTeachers(String tno) {
		this.tno = tno;
	}

	/** full constructor */
	public TTeachers(String tno, String pwd, String tname, Integer age,
			String institude, Set TCourseses, Set TCourseses_1) {
		this.tno = tno;
		this.pwd = pwd;
		this.tname = tname;
		this.age = age;
		this.institude = institude;
		this.TCourseses = TCourseses;
		this.TCourseses_1 = TCourseses_1;
	}

	// Property accessors

	public String getTno() {
		return this.tno;
	}

	public void setTno(String tno) {
		this.tno = tno;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getTname() {
		return this.tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getInstitude() {
		return this.institude;
	}

	public void setInstitude(String institude) {
		this.institude = institude;
	}

	public Set getTCourseses() {
		return this.TCourseses;
	}

	public void setTCourseses(Set TCourseses) {
		this.TCourseses = TCourseses;
	}

	public Set getTCourseses_1() {
		return this.TCourseses_1;
	}

	public void setTCourseses_1(Set TCourseses_1) {
		this.TCourseses_1 = TCourseses_1;
	}

}