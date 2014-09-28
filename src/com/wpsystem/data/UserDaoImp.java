package com.wpsystem.data;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.wpsystem.DTOs.UserDTO;
import com.wpsystem.models.User;

public class UserDaoImp implements UserDao{

	private Session session;
	private SessionFactory sessionFactory;
	
	/***
	 * getUsers 
	 * Method that returns all users from database
	 * @params none
	 * @rerturn List<UserDTO>
	 ******************************/
	@Override
	public List<UserDTO> getUsers(){
		
		sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		@SuppressWarnings("unchecked")
		List<User> listUserModel = session.createCriteria(User.class).list();
		List<UserDTO> listUserDTO = new ArrayList<UserDTO>();
		
		UserDTO dto = null;
		
		for( User u : listUserModel ){
			dto = this.ModelToDTO(u);
			listUserDTO.add(dto);
		}
		
		return listUserDTO;
		
	}//End of getUsers Method
	
	/***
	 * ModelToDTO 
	 * Method that transforms a model to a DTO
	 * @param Model u
	 * @return DTO
	 *********************************/
	public UserDTO ModelToDTO( User u ){
		
		UserDTO dto = new UserDTO();
		
		dto.setUserid( u.getUserid() );
		dto.setUsername( u.getUsername() );
		dto.setPassword( u.getPassword() );
		dto.setPermissionid( u.getPermissionid() );
		
		return dto;
		
	}//End of ModelToDTO Method
	
	/***
	 * DTOToModel
	 * Method that transforms a Data transfer objecto to Model
	 * @param Data Tansfer Object (DTO) dto
	 * @return Model
	 ************************************/
	public User DTOToModel( UserDTO dto ){
		
		User u = new User();
		
		u.setUserid( dto.getUserid() );
		u.setUsername( dto.getUsername() );
		u.setPassword( dto.getPassword() );
		u.setUserid( dto.getPermissionid() );
		
		return u;
		
	}//End of DTOToModel Method

}//End of UserDao Implementation Class
