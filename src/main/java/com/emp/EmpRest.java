package com.emp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmpRest {

	@GetMapping("/employees")
	public List<Object> getEmployees() {

	    System.out.println("employees");

	    List<Object> employees = new ArrayList<>();

	    employees.add(new EmpDTO(1L, "Siva", "IT", 50000.0));
	    employees.add(new EmpDTO(2L, "Ravi", "HR", 45000.0));
	    employees.add(new EmpDTO(3L, "Kumar", "Finance", 60000.0));

	    System.out.println("############");

	    return employees;
	}
	
	public void name1() {
		
	}
}