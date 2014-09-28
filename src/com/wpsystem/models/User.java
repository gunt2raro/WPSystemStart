package com.wpsystem.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/***
 * User Model
 * @author gunt_raro@hotmail.com
 *******************************/
@Entity
public class User {
	
	//Private attributes
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userid;
	private String username;
	private String password;
	private int permissionid;
	
	//Getters and Setters 
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPermissionid() {
		return permissionid;
	}
	public void setPermissionid(int permissionid) {
		this.permissionid = permissionid;
	}

}//End of User Model
