package com.eaiesb.employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Employee2Service {
	@Autowired
	public Employee2Repository empRepo;
	
	public Employee2 create(Employee2 emp) {
		return empRepo.save(emp);
	}

	public List<Employee2> getAll() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	public Optional<Employee2> getById(String id) {
		// TODO Auto-generated method stub
		return empRepo.findById(id);
	}

	public Employee2 update(String id, Employee2 emp) {
		// TODO Auto-generated method stub
		emp.set_id(id);
		return empRepo.save(emp);
	}

	public void delete(String id) {
		// TODO Auto-generated method stub
		empRepo.deleteById(id);
	}
}

