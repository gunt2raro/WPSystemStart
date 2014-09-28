package com.wpsystem.business;
import java.util.List;

import com.wpsystem.DTOs.PermissionDTO;

public interface PermissionService {
	List<PermissionDTO> getPermissions();
}//End of Permission service interface