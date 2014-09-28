package com.wpsystem.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/***
 * Persmission Model
 * @author gunt_raro@hotmail.com
 ******************************/
@Entity
public class Permission {

	//Private Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int permissionid;
	private String name;
	private int value;
	
	//Getters and Setters
	public int getPermissionid() {
		return permissionid;
	}
	public void setPermissionid(int permissionid) {
		this.permissionid = permissionid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
}//End of Permission Model
