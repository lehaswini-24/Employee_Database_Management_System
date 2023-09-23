package com.eaiesb.employee;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Employee2Repository extends MongoRepository<Employee2, String>{

}


