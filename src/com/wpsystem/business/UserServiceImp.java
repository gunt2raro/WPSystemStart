package com.wpsystem.business;

import java.util.List;

import com.google.inject.Inject;
import com.wpsystem.DTOs.UserDTO;
import com.wpsystem.data.UserDao;

public class UserServiceImp implements UserService {

	private final UserDao userDao;
	
	@Inject
	public UserServiceImp( UserDao userDao ){
	
		this.userDao = userDao;
	
	}//End of UserServiceImp
	
	@Override
	public List<UserDTO> getUsers() {

		return this.userDao.getUsers();

	}//End of getUsers Method

}//End of UserService Implementation
