package com.restapi.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.entity.Employee;
import com.restapi.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	final static Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeService empService;

	@PostMapping("/add")
	public ResponseEntity<Employee> addEmployee(@Valid @RequestBody Employee employee) {
		logger.info("addEmployee method executed");
		employee = empService.saveEmp(employee);
		logger.debug("Added:: {}", employee);
		return new ResponseEntity<>(employee, HttpStatus.CREATED);
	}

	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		logger.info("getAllEmployees method executed");
		List<Employee> employees = empService.getAllEmps();
		if (employees.isEmpty()) {
			logger.debug("Employees does not exists");
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		logger.debug("Employeescount {}", employees.size());
		return new ResponseEntity<>(employees, HttpStatus.OK);
	}
}