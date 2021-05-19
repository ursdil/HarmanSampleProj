package com.harman.userManagement.service;

import org.springframework.stereotype.Service;

import com.harman.userManagement.dto.UserDTO;
import com.harman.userManagement.exception.UserException;

@Service
public interface UserManagementService {

	UserDTO getUserByID(Integer userID) throws UserException ;

	String addSingleUser(UserDTO userData)throws UserException ;

	String updateUser(UserDTO userData)throws UserException ;

}
