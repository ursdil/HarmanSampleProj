package com.harman.userManagement.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="user_data")

public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private Integer userId;

	@Column(name="company_id")
	private Integer companyId;

	@Temporal(TemporalType.DATE)
	private Date dob;
	
	private Integer age;

	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;
	
	@Column(name="middle_name")
	private String middleName;
	
	private String gender;

	@Column(name="married_ind")
	private String marriedInd;
	
	@Temporal(TemporalType.DATE)
	@Column(name="married_dt")
	private Date marriedDt;

	@Column(name="add_dt")
	private Timestamp addDt;
	
	@Column(name="mod_dt")
	private Timestamp modDt;

	@Column(name="pri_email_id")
	private String priEmailId;

	@Column(name="pri_mob_no")
	private Long priMobNo;

	@Column(name="profile_pic")
	private String profilePic;

	@Column(name="role_id")
	private Integer roleId;

	@Column(name="sub_id")
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
	
	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", companyId=" + companyId + ", dob=" + dob + ", age=" + age
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName + ", gender="
				+ gender + ", marriedInd=" + marriedInd + ", marriedDt=" + marriedDt + ", addDt=" + addDt + ", modDt="
				+ modDt + ", priEmailId=" + priEmailId + ", priMobNo=" + priMobNo + ", profilePic=" + profilePic
				+ ", roleId=" + roleId + ", subId=" + subId + "]";
	}
	
	


}



	