package com.cy.car.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/")
public class Carcontroller {
	@RequestMapping("CarUI")	
	public String CarUI() {
		return "Login";

	}
}
