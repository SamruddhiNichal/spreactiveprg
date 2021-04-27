package com.spreactiveprg.spreactiveprg.repository;

import com.spreactiveprg.spreactiveprg.model.Employee;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface EmployeeRepo extends ReactiveMongoRepository<Employee,String> {


}
