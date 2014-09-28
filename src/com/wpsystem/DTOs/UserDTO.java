package com.wpsystem.DTOs;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserDTO {

	//Private attributes
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
	
}//End of User data tansfer object
