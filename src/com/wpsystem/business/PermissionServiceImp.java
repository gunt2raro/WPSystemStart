package com.wpsystem.business;

import java.util.List;

import com.google.inject.Inject;
import com.wpsystem.DTOs.PermissionDTO;
import com.wpsystem.data.PermissionDao;

public class PermissionServiceImp implements PermissionService{

	private final PermissionDao permissionDao;
	
	@Inject
	public PermissionServiceImp( PermissionDao permissionDao ){
		this.permissionDao = permissionDao;
	}//End of PermissionServiceImp Constructor
	
	@Override
	public List<PermissionDTO> getPermissions() {
		
		return this.permissionDao.getPersmissions();
	
	}//End of getPermissions Method

}
