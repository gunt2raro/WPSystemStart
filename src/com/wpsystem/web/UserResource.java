package com.wpsystem.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
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
	
	@POST
	@Produces(MediaType.TEXT_HTML)
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	public String newUser(  @FormParam("username") String username, @FormParam("password") String password, @Context HttpServletResponse response ) throws IOException{
		
		Boolean res = this.userService.addUser(username, password, 2);
		return res.toString();
		
	}//End of new User Method
	
	
}//End of UserResource Class
