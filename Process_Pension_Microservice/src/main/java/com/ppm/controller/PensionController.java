package com.ppm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ppm.entity.Pension;
import com.ppm.service.IPensionService;

@RestController
public class PensionController {
	
	@Autowired
	IPensionService iPensionService;

	@GetMapping("/")
	public String hello() {
		return "This is Process Pension Microservice";
	}
	
	@GetMapping("/{aadhar}")
	public Pension getPensionDetails(@PathVariable("aadhar") Long aadhar){
		Pension pension=iPensionService.getPensionDetails(aadhar);
		return pension;
	}
}
