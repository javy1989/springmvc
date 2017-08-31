package com.udemy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/say")
public class HolaMundoController {

	@GetMapping("/holamundo")
	public String holamundo(){
		return "holamundo";
	}
}
