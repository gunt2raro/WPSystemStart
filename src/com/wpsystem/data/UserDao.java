package com.wpsystem.data;

import java.util.List;

import com.wpsystem.DTOs.UserDTO;

public interface UserDao {
	List<UserDTO> getUsers();
	Boolean addUser( UserDTO dto );
}//End of UserDao Interface
