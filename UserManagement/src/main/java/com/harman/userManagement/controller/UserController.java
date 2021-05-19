package com.harman.userManagement.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.harman.userManagement.dto.UserDTO;
import com.harman.userManagement.exception.UserException;
import com.harman.userManagement.service.UserManagementService;
import com.harman.userManagement.dto.ResponseMessage;

@RequestMapping(value="user")
@RestController
public class UserController {
	
	
@Autowired
 UserManagementService userService; 

private final Logger log = LoggerFactory.getLogger(this.getClass());


	@RequestMapping(value = "/getUserById", method = RequestMethod.GET)
	public UserDTO getUserById(@RequestParam String userID) throws UserException {
		log.info("getUserById  Started");
		UserDTO user = userService.getUserByID(Integer.valueOf(userID) );
		log.info("getUserById completed");
		return user;	
	}
	
	/**
	 * Adding new user
	 * Should accept all the user data except the User ID, it would be generated at the DB level
	 * @param userData
	 * @return
	 */
	@RequestMapping(value = "/addSingleUser", method = RequestMethod.POST)
	public com.harman.userManagement.dto.ResponseMessage addSingleUser(@RequestBody UserDTO userData) {
		log.info("Add Single user Started");
		ResponseMessage response = new ResponseMessage();
		try {
			response.setMessage( userService.addSingleUser(userData));
			log.info("Response:" +response.getMessage());
			return response;
		}catch(Exception e) {
			log.error("Error occurred Adding User Data:" + userData.getUserId());
			response.setMessage( "Error occurred while Adding Single User");
			log.info("Response:" +response.getMessage());
			return response;
		}
		
	}
	
	/**
	 * Update user
	 * Should accept the user data with the fields that needs to be updated 
	 * User ID will be the key to update
	 * Data would be updated with the update timestamp.
	 * @param userData
	 * @return
	 */
	@RequestMapping(value = "/updateUser", method = RequestMethod.POST)
	public com.harman.userManagement.dto.ResponseMessage updateUser(@RequestBody UserDTO userData) {
		log.info("Update Single User Started");
		ResponseMessage response = new ResponseMessage();
		try {
			response.setMessage( userService.updateUser(userData));
			log.info("Response:" +response.getMessage());
			return response;
		}catch(Exception e) {
			log.error("Error occurred while updating User Data:" + userData.getUserId());
			response.setMessage( "Error occurred while updating User Data");
			log.info("Response:" +response.getMessage());
			return response;
		}
		
	}
	
}
