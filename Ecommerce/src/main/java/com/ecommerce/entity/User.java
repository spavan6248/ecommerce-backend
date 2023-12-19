package com.ecommerce.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="RegisteredUsers")
public class User{
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)  //WRITTEN BY PAVAN
	private long id;
	
	@Column(name="userName")
	private String userName;
	
	@Column(name="userPass")
	private String userPass;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public User(long id, String userName, String userPass) {
		super();
		this.id = id;
		this.userName = userName;
		this.userPass = userPass;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userPass=" + userPass + "]";
	}
	
	
	
	
}