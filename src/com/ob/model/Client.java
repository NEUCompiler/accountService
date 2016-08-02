package com.ob.model;

/**
 * Client entity. @author MyEclipse Persistence Tools
 */

public class Client implements java.io.Serializable {

	// Fields

	private Integer clientid;
	private String identityid;
	private String truename;
	private Integer sex;
	private String phone;
	private String mail;
	private String accounttype;
	private String username;
	private String userpassword;

	// Constructors

	/** default constructor */
	public Client() {
	}

	/** minimal constructor */
	public Client(String identityid, String truename, Integer sex,
			String username, String userpassword) {
		this.identityid = identityid;
		this.truename = truename;
		this.sex = sex;
		this.username = username;
		this.userpassword = userpassword;
	}

	/** full constructor */
	public Client(String identityid, String truename, Integer sex,
			String phone, String mail, String accounttype, String username,
			String userpassword) {
		this.identityid = identityid;
		this.truename = truename;
		this.sex = sex;
		this.phone = phone;
		this.mail = mail;
		this.accounttype = accounttype;
		this.username = username;
		this.userpassword = userpassword;
	}

	// Property accessors

	public Integer getClientid() {
		return this.clientid;
	}

	public void setClientid(Integer clientid) {
		this.clientid = clientid;
	}

	public String getIdentityid() {
		return this.identityid;
	}

	public void setIdentityid(String identityid) {
		this.identityid = identityid;
	}

	public String getTruename() {
		return this.truename;
	}

	public void setTruename(String truename) {
		this.truename = truename;
	}

	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAccounttype() {
		return this.accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpassword() {
		return this.userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

}