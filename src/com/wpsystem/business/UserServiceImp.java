package com.wpsystem.business;

import java.util.List;

import com.google.inject.Inject;
import com.wpsystem.DTOs.UserDTO;
import com.wpsystem.data.UserDao;

public class UserServiceImp implements UserService {

	private final UserDao userDao;
	

	/***
	 * UserServiceImp
	 * Constructor Injector
	 * @param userDao
	 *********************/
	@Inject
	public UserServiceImp( UserDao userDao ){
	
		this.userDao = userDao;
	
	}//End of UserServiceImp
	
	/***
	 * getUsers
	 * Method that return all users form the database
	 * @params none
	 * @return List<UserDTO> a list of Users 
	 */
	@Override
	public List<UserDTO> getUsers() {

		return this.userDao.getUsers();

	}//End of getUsers Method

	/***
	 * addUser
	 * Method that adds a user to the database
	 * @param String username
	 * @param String password
	 * @param int permissionid
	 * @return Boolean
	 */
	@Override
	public Boolean addUser(String username, String password, int permissionid) {
		
		UserDTO dto = new UserDTO();
		dto.setUsername(username);
		dto.setPassword(password);
		dto.setPermissionid(permissionid);
		return this.userDao.addUser(dto);
		
	}//End of addUser Method

}//End of UserService Implementation
