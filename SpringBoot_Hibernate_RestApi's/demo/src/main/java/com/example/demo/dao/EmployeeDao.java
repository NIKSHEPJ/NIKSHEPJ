package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.EmployeeDto;


public interface EmployeeDao extends JpaRepository<EmployeeDto, Long>{



}
