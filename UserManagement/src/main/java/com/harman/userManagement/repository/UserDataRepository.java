package com.harman.userManagement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.harman.userManagement.entity.UserEntity;


@Repository
public interface UserDataRepository  extends CrudRepository<UserEntity, Integer>{
	
	

}
