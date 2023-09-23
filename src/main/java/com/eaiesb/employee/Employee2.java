package com.eaiesb.employee;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
@Data
@Document(collection="VIT_Employees")
public class Employee2 {
	@Id
	public String _id;

	

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}


	private String empNum;
	private String empFirstName;
	private String empLastName;
	private int empSalary;
	
}
