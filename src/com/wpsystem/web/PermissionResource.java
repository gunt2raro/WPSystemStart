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
import com.wpsystem.DTOs.PermissionDTO;
import com.wpsystem.business.PermissionService;

@Path("/Permission")
@RequestScoped
public class PermissionResource {

	private final PermissionService permissionService;
	
	@Inject
	public PermissionResource( PermissionService permissionService ){
		
		this.permissionService = permissionService;
		
	}//End of PermissionResource Constructor
	
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<PermissionDTO> getUsers( @Context HttpServletRequest request ){
		
		return this.permissionService.getPermissions();
		
	}//End of getUsers Method
	
}//End of PermissionResource Class
