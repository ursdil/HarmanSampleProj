package com.harman.userManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harman.userManagement.dao.UserManagementDAO;
import com.harman.userManagement.dto.UserDTO;
import com.harman.userManagement.exception.UserException;

@Service
public class UserManagementServiceImpl implements UserManagementService {

	@Autowired
	UserManagementDAO userDao;
	
	@Override
	public UserDTO getUserByID(Integer userID) throws UserException {
		
		
		return userDao.getUserByID(userID) ;
	}

	@Override
	public String addSingleUser(UserDTO userData) throws UserException {
		 return userDao.addSingleUser(userData);
	}

	@Override
	public String updateUser(UserDTO userData) throws UserException {
		 return userDao.updateUser(userData);
	}
	
	

}
