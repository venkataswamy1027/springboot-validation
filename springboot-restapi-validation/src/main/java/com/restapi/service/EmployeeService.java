package com.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.entity.Employee;
import com.restapi.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee saveEmp(Employee employee) {
		return employeeRepository.save(employee);
	}

	public List<Employee> getAllEmps() {
		return employeeRepository.findAll();
	}

}
