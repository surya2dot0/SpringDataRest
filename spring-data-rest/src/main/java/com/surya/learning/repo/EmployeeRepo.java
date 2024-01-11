package com.surya.learning.repo;

import org.springframework.data.repository.CrudRepository;

import com.surya.learning.entities.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Long> {

	
}
