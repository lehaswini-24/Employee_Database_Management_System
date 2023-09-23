package com.eaiesb.employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Employee2Controller {
@Autowired
public Employee2Service service;

@PostMapping("/employee")
public Employee2 createEmployee(@Validated @RequestBody Employee2 emp){
	return service.create(emp);
}

@GetMapping("/employees")
public List<Employee2> getAllEmployees(){
	return service.getAll();
}

@GetMapping("/employee/{id}")
public Optional<Employee2> getEmployeeById(@PathVariable String id){
	return service.getById(id);
}
@PutMapping("/employee/{id}")
public Employee2 updateEmployee(@PathVariable String id, @Validated @RequestBody Employee2 emp) {
	return service.update(id,emp);
}
@DeleteMapping("/employee/{id}")
public String deleteEmployee(@PathVariable String id) {
	service.delete(id);
	return "Employee with id : "+ id +" deleted successfully.";
}
}



