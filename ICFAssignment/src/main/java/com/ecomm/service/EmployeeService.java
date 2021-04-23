package com.ecomm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomm.model.Employee;
import com.ecomm.repository.EmployeesRepository;

@Service
public class EmployeeService 
{
	@Autowired
	
	EmployeesRepository employeesRepository;
	
	public List<Employee>getAllEmployee()
	{
	List<Employee> employees=new ArrayList<Employee>();
	
	 employeesRepository.findAll().forEach(employee1 -> employees.add(employee1));
	 
	 return employees;
	}
	
	public Employee getEmployeeById(String id)   
	{  
	return employeesRepository.findById(id).get();  
	}  
	
	public void saveOrUpdate(Employee employees)   
	{  
	employeesRepository.save(employees);  
	}  
	
	public void delete(String id)   
	{  
	employeesRepository.deleteById(id);  
	}  
	
	public void update(Employee employees, String id)   
	{  
	employeesRepository.save(employees);  
	}  
}
