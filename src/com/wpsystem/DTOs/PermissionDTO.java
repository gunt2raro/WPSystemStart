package com.wpsystem.DTOs;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PermissionDTO {

	//Private Attributes
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
	
}//End of permission data transfer object
