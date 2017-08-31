package com.udemy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.udemy.springmvc.model.Person;

@Controller
@RequestMapping("/example3")
public class Example3Controller {

	public static final String FORM_VIEW="form";
	public static final String RESUL_VIEW="result";
	
	//#1
	/*
	@GetMapping("/")
	public String redirect(){
		return "redirect:/example3/showform";
	}*/
	@GetMapping("/")
	public RedirectView redirect(){
		return new RedirectView("/example3/showform");
	}
	
	@GetMapping("/showform")
	public String showForm(Model model){
		model.addAttribute("person",new Person());
		int r=6/0;
		return FORM_VIEW;
	}
	
	
	@PostMapping("/addperson")
	public ModelAndView addPerson(@ModelAttribute(name="person")Person person){
		ModelAndView mav=new  ModelAndView(RESUL_VIEW);
		mav.addObject("person",person);
		return mav;
	}
}
