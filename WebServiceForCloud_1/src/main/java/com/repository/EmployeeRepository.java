package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.entity.Employee;

@RepositoryRestResource
public interface EmployeeRepository extends CrudRepository<Employee, Long>{
	
}