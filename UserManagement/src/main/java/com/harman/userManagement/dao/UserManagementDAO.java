package com.harman.userManagement.dao;

import org.springframework.stereotype.Component;

import com.harman.userManagement.dto.UserDTO;
import com.harman.userManagement.exception.UserException;

@Component
public interface UserManagementDAO {

	UserDTO getUserByID(Integer userID) throws UserException ;

	String addSingleUser(UserDTO userData) throws UserException ;

	String updateUser(UserDTO userData)throws UserException ;

}
