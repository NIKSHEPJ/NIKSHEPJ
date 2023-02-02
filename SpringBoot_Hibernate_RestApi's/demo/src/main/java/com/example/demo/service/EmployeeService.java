package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.EmployeeDto;

public interface EmployeeService {

	EmployeeDto saveEmployee(EmployeeDto em);
	List <EmployeeDto> getAllEmployees();
	EmployeeDto getEmployeeId(long id);
	void deleteEmployee(long id);
}
