package com.loan_management.agri_controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/agri")
public class AgriController {
	@GetMapping("/message")
	public String message() {
		return "project is complitly working";
	}

}
