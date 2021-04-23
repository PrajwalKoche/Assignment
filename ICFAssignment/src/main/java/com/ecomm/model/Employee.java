package com.ecomm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee 
{
 @Id
 @Column
 private String id;
 @Column
 private String firstName;
 @Column
 private String lastName;
 @Column
 private String startDate;
 @Column
 private String endDate;
 @Column
 private String designation;
 @Column
 private String department;
 @Column
 private String status;
 @Column
 private String dob;
 @Column
 private String reportingManager;
 @Column
 private String gender;
 @Column
 private String bloodGroup;
 @Column
 private String address;
 

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
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
public String getStartDate() {
	return startDate;
}
public void setStartDate(String startDate) {
	this.startDate = startDate;
}
public String getEndDate() {
	return endDate;
}
public void setEndDate(String endDate) {
	this.endDate = endDate;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getReportingManager() {
	return reportingManager;
}
public void setReportingManager(String reportingManager) {
	this.reportingManager = reportingManager;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getBloodGroup() {
	return bloodGroup;
}
public void setBloodGroup(String bloodGroup) {
	this.bloodGroup = bloodGroup;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

	
}
