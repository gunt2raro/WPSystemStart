package com.wpsystem.data;

import java.util.List;

import com.wpsystem.DTOs.UserDTO;

public interface UserDao {
	List<UserDTO> getUsers();
}//End of UserDao Interface
