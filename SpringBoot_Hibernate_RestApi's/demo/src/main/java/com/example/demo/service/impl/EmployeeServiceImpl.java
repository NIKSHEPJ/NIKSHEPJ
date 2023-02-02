package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.dto.EmployeeDto;
import com.example.demo.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeedao;
	
	public EmployeeServiceImpl(EmployeeDao employeedao) {
		super();
		this.employeedao = employeedao;
	}

	@Override
	public EmployeeDto saveEmployee(EmployeeDto em) {
		return employeedao.save(em);
	}

	@Override
	public List<EmployeeDto> getAllEmployees() {
		// TODO Auto-generated method stub
		
		return employeedao.findAll()  ;
	}

	@Override
	public EmployeeDto getEmployeeId(long id) {
		// TODO Auto-generated method stub
		Optional<EmployeeDto>employee=employeedao.findById(id);
		return employee.get();
		
	}

	@Override
	public void  deleteEmployee(long id) {
		
		employeedao.deleteById(id); ;
	}

}
