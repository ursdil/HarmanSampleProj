package com.harman.userManagement.dto;

import java.sql.Timestamp;
import java.util.Date;

import lombok.Data;

@Data
public class UserDTO {
	
	private Integer userId;

	private Integer companyId;

	private Date dob;
	
	private Integer age;

	private String firstName;

	private String lastName;
	
	private String middleName;
	
	private String gender;

	private String marriedInd;
	
	private Date marriedDt;

	private Timestamp addDt;
	
	private Timestamp modDt;

	private String priEmailId;

	private Long priMobNo;

	private String profilePic;

	private Integer roleId;

	private Integer subId;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMarriedInd() {
		return marriedInd;
	}

	public void setMarriedInd(String marriedInd) {
		this.marriedInd = marriedInd;
	}

	public Date getMarriedDt() {
		return marriedDt;
	}

	public void setMarriedDt(Date marriedDt) {
		this.marriedDt = marriedDt;
	}

	public Timestamp getAddDt() {
		return addDt;
	}

	public void setAddDt(Timestamp addDt) {
		this.addDt = addDt;
	}

	public Timestamp getModDt() {
		return modDt;
	}

	public void setModDt(Timestamp modDt) {
		this.modDt = modDt;
	}

	public String getPriEmailId() {
		return priEmailId;
	}

	public void setPriEmailId(String priEmailId) {
		this.priEmailId = priEmailId;
	}

	public Long getPriMobNo() {
		return priMobNo;
	}

	public void setPriMobNo(Long priMobNo) {
		this.priMobNo = priMobNo;
	}

	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getSubId() {
		return subId;
	}

	public void setSubId(Integer subId) {
		this.subId = subId;
	}
	

	

}
