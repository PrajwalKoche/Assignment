package com.ecomm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecomm.model.Employee;
import com.ecomm.service.EmployeeService;

@RestController
public class EmployeeController 
{
	@Autowired
	EmployeeService employeesService;

	@GetMapping("/employee")  
	private List<Employee> getAllEmployee()   
	{  
	return employeesService.getAllEmployee();  
	}  
	
	@GetMapping("/employee/{id}")  
	private Employee getEmployee(@PathVariable("id") String id)   
	{  
	return employeesService.getEmployeeById(id);
	}  
	
	@DeleteMapping("/employee/{id}")  
	private void deleteEmployee(@PathVariable("id") String id)   
	{  
	employeesService.delete(id);  
	}  
	
	@PostMapping("/employees")  
	private String saveEmployee(@RequestBody Employee employees)   
	{  
	employeesService.saveOrUpdate(employees);  
	return employees.getId();
	}  
	
	@PutMapping("/employees")  
	private Employee update(@RequestBody Employee employees)   
	{  
	employeesService.saveOrUpdate(employees);  
	return employees;  
	}  
}
