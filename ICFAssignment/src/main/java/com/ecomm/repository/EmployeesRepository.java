package com.ecomm.repository;

import org.springframework.data.repository.CrudRepository;

import com.ecomm.model.Employee;

public interface EmployeesRepository extends CrudRepository<Employee,String>
{

}
