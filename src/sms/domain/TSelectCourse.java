package sms.domain;

/**
 * TSelectCourse entity. @author MyEclipse Persistence Tools
 */

public class TSelectCourse implements java.io.Serializable {

	// Fields

	private Integer id;
	private TCourses TCourses;
	private TStudents TStudents;
	private Integer score;

	// Constructors

	/** default constructor */
	public TSelectCourse() {
	}

	/** minimal constructor */
	public TSelectCourse(Integer id, TCourses TCourses, TStudents TStudents) {
		this.id = id;
		this.TCourses = TCourses;
		this.TStudents = TStudents;
	}

	/** full constructor */
	public TSelectCourse(Integer id, TCourses TCourses, TStudents TStudents,
			Integer score) {
		this.id = id;
		this.TCourses = TCourses;
		this.TStudents = TStudents;
		this.score = score;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TCourses getTCourses() {
		return this.TCourses;
	}

	public void setTCourses(TCourses TCourses) {
		this.TCourses = TCourses;
	}

	public TStudents getTStudents() {
		return this.TStudents;
	}

	public void setTStudents(TStudents TStudents) {
		this.TStudents = TStudents;
	}

	public Integer getScore() {
		return this.score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

}