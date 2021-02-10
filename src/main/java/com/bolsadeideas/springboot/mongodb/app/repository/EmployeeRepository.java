package com.bolsadeideas.springboot.mongodb.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.bolsadeideas.springboot.mongodb.app.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
