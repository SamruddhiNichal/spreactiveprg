package com.spreactiveprg.spreactiveprg.controller;

import com.spreactiveprg.spreactiveprg.model.Employee;
import com.spreactiveprg.spreactiveprg.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
public class EmployeeContoller {

    @Autowired
    private EmployeeRepo employeeRepo;



     @PostMapping("/saveEmp")
    public Mono<Employee> saveEmployee(@RequestBody Employee employee){
        Mono<Employee> emp =employeeRepo.save(employee);
        return emp;
     }

     @GetMapping("/getEmp")
     public Flux<Employee> getEmp(){
         return employeeRepo.findAll();
     }
}
