package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeOperationController {
	@GetMapping("/show")
	public ResponseEntity<String> showDBDetails() {
		return new ResponseEntity<String>("showing Employee details", HttpStatus.OK);
	}
}
