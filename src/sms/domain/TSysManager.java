package sms.domain;

/**
 * TSysManager entity. @author MyEclipse Persistence Tools
 */

public class TSysManager implements java.io.Serializable {

	// Fields

	private String id;
	private String pwd;

	// Constructors

	/** default constructor */
	public TSysManager() {
	}

	/** minimal constructor */
	public TSysManager(String id) {
		this.id = id;
	}

	/** full constructor */
	public TSysManager(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}