package com.harman.userManagement.dao;

import java.sql.Timestamp;
import java.util.Calendar;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.harman.userManagement.dto.UserDTO;
import com.harman.userManagement.entity.UserEntity;
import com.harman.userManagement.exception.UserException;
import com.harman.userManagement.repository.UserDataRepository;


@Component
public class UserManagementDAOImpl implements UserManagementDAO {

	@Autowired 
	UserDataRepository userDataRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public UserDTO getUserByID(Integer userID) throws UserException {
		java.util.Optional<UserEntity> userEntityObj =  userDataRepository.findById(userID);
		System.out.println(userEntityObj);
		
		if(!userEntityObj.isPresent()) {
			throw new UserException("USER NOT FOUND", "There are no user available with the given ID");
		}
		
		// UserEntity entity = userEntityObj.get();
		UserDTO userDTO = modelMapper.map(userEntityObj.get(), UserDTO.class);
		
		return userDTO;
	}

	@Override
	public String addSingleUser(UserDTO userDTOObj) throws UserException {
		//UserEntity userEntityObj = modelMapper.map(userEntityObj.get(), UserDTO.class);
		UserEntity userEntityObj = modelMapper.map(userDTOObj, UserEntity.class);
		try {
			//UserEntity userEntityObj = setUserData(userDTOObj);
			userEntityObj.setAddDt(new Timestamp(Calendar.getInstance().getTimeInMillis()));
			userEntityObj.setModDt(new Timestamp(Calendar.getInstance().getTimeInMillis()));
			
			userDataRepository.save(userEntityObj);
		}catch(Exception e) {
			throw new UserException("Error while adding new User", e.getMessage());
		}
		return "USER added successfully";
	}
	
	@Override
	public String updateUser(UserDTO userData) throws UserException {
		try {
			UserEntity userEntityObj = modelMapper.map(userData, UserEntity.class);
			userEntityObj.setModDt(new Timestamp(Calendar.getInstance().getTimeInMillis()));
			userDataRepository.save(userEntityObj);
		}catch(Exception e) {
			throw new UserException("Error while updating User data", e.getMessage());
		}
		
		return "USER updated successfully";
		
		
	
	}
	
	private UserEntity setUserData(UserDTO userData) {
		UserEntity userEntityObj = new UserEntity();
		//userEntityObj.setUserId(userData.getUserId());
		userEntityObj.setDob(userData.getDob());
		userEntityObj.setAge(userData.getAge());
		userEntityObj.setFirstName(userData.getFirstName());
		userEntityObj.setLastName(userData.getLastName());
		userEntityObj.setMiddleName(userData.getMiddleName());
		userEntityObj.setMarriedInd(userData.getMarriedInd());
		userEntityObj.setMarriedDt(userData.getMarriedDt());
		userEntityObj.setAddDt(new Timestamp(Calendar.getInstance().getTimeInMillis()));
		//userEntityObj.setModDt(new Timestamp(Calendar.getInstance().getTimeInMillis()));
		
		userEntityObj.setPriEmailId(userData.getPriEmailId());
		userEntityObj.setPriMobNo(userData.getPriMobNo());
		
		userEntityObj.setProfilePic(userData.getProfilePic());
		userEntityObj.setRoleId(userData.getRoleId());
		userEntityObj.setSubId(userData.getSubId());

		return userEntityObj; 
		
	}


}
