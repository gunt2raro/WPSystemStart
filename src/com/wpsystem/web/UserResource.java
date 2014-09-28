package com.wpsystem.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;


import com.google.inject.Inject;
import com.google.inject.servlet.RequestScoped;
import com.wpsystem.DTOs.UserDTO;
import com.wpsystem.business.UserService;

@Path("/User")
@RequestScoped
public class UserResource {

	private final UserService userService;
	
	@Inject
	public UserResource( UserService userService ){
		
		this.userService = userService;
		
	}//End of UserResource Constructor
	
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<UserDTO> getUsers( @Context HttpServletRequest request ){		
		return this.userService.getUsers();
	}//End of getUsers Method
	
}//End of UserResource Class
