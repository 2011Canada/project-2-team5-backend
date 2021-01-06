package com.revature.project2.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_table")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_Id")
	private int userId;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "user_password")
	private String userPassword;

	@Column(name = "alias")
	private String alias;

	@Column(name = "leadboard")
	private int leadboard;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public int getLeadboard() {
		return leadboard;
	}

	public void setLeadboard(int leadboard) {
		this.leadboard = leadboard;
	}

	public User(int userId, String userName, String userPassword, String alias, int leadboard) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.alias = alias;
		this.leadboard = leadboard;
	}

	public User() {

	}

}
