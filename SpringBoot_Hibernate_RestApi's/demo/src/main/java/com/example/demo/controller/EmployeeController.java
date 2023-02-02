package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.service.EmployeeService;
@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	
	private EmployeeService employeeSerivce;

	public EmployeeController(EmployeeService employeeSerivce) {
		super();
		this.employeeSerivce = employeeSerivce;
	}
	@PostMapping()  
	public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employee){
		 
		return new ResponseEntity<EmployeeDto>(employeeSerivce.saveEmployee(employee), HttpStatus.CREATED);
		
	}

	@GetMapping
	public List<EmployeeDto> getAllEmployees(){
		
	return employeeSerivce.getAllEmployees(); 	
	}
	
	@GetMapping ("{id}")
	public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable ("id") long Eid){
		return new ResponseEntity<EmployeeDto>(employeeSerivce.getEmployeeId(Eid), HttpStatus.OK);
		
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") long empid){
		
		 employeeSerivce.deleteEmployee(empid);
		return new ResponseEntity<String> ("Deleted", HttpStatus.OK);
		
	}
	
}
