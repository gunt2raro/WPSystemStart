package com.wpsystem.business;
import java.util.List;

import com.wpsystem.DTOs.UserDTO;

public interface UserService {
	List<UserDTO> getUsers();
	Boolean addUser( String username, String password, int permissionid );
}//End of UserService Interface
