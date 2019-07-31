package com.crx.pojo;

import java.util.Date;

public class User {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.id
	 * @mbg.generated  Tue Jul 30 21:22:56 CST 2019
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.username
	 * @mbg.generated  Tue Jul 30 21:22:56 CST 2019
	 */
	private String username;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.password
	 * @mbg.generated  Tue Jul 30 21:22:56 CST 2019
	 */
	private String password;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.birth
	 * @mbg.generated  Tue Jul 30 21:22:56 CST 2019
	 */
	private Date birth;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.email
	 * @mbg.generated  Tue Jul 30 21:22:56 CST 2019
	 */
	private String email;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.locked
	 * @mbg.generated  Tue Jul 30 21:22:56 CST 2019
	 */
	private Integer locked;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.regTime
	 * @mbg.generated  Tue Jul 30 21:22:56 CST 2019
	 */
	private Date regtime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.salt
	 * @mbg.generated  Tue Jul 30 21:22:56 CST 2019
	 */
	private String salt;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.id
	 * @return  the value of user.id
	 * @mbg.generated  Tue Jul 30 21:22:56 CST 2019
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.id
	 * @param id  the value for user.id
	 * @mbg.generated  Tue Jul 30 21:22:56 CST 2019
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.username
	 * @return  the value of user.username
	 * @mbg.generated  Tue Jul 30 21:22:56 CST 2019
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.username
	 * @param username  the value for user.username
	 * @mbg.generated  Tue Jul 30 21:22:56 CST 2019
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.password
	 * @return  the value of user.password
	 * @mbg.generated  Tue Jul 30 21:22:56 CST 2019
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.password
	 * @param password  the value for user.password
	 * @mbg.generated  Tue Jul 30 21:22:56 CST 2019
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.birth
	 * @return  the value of user.birth
	 * @mbg.generated  Tue Jul 30 21:22:56 CST 2019
	 */
	public Date getBirth() {
		return birth;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.birth
	 * @param birth  the value for user.birth
	 * @mbg.generated  Tue Jul 30 21:22:56 CST 2019
	 */
	public void setBirth(Date birth) {
		this.birth = birth;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.email
	 * @return  the value of user.email
	 * @mbg.generated  Tue Jul 30 21:22:56 CST 2019
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.email
	 * @param email  the value for user.email
	 * @mbg.generated  Tue Jul 30 21:22:56 CST 2019
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.locked
	 * @return  the value of user.locked
	 * @mbg.generated  Tue Jul 30 21:22:56 CST 2019
	 */
	public Integer getLocked() {
		return locked;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.locked
	 * @param locked  the value for user.locked
	 * @mbg.generated  Tue Jul 30 21:22:56 CST 2019
	 */
	public void setLocked(Integer locked) {
		this.locked = locked;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.regTime
	 * @return  the value of user.regTime
	 * @mbg.generated  Tue Jul 30 21:22:56 CST 2019
	 */
	public Date getRegtime() {
		return regtime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.regTime
	 * @param regtime  the value for user.regTime
	 * @mbg.generated  Tue Jul 30 21:22:56 CST 2019
	 */
	public void setRegtime(Date regtime) {
		this.regtime = regtime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.salt
	 * @return  the value of user.salt
	 * @mbg.generated  Tue Jul 30 21:22:56 CST 2019
	 */
	public String getSalt() {
		return salt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.salt
	 * @param salt  the value for user.salt
	 * @mbg.generated  Tue Jul 30 21:22:56 CST 2019
	 */
	public void setSalt(String salt) {
		this.salt = salt;
	}
}