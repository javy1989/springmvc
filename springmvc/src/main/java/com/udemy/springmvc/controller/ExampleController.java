package com.udemy.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.springmvc.component.ExampleComponent;
import com.udemy.springmvc.model.Person;

@Controller
@RequestMapping("/example")
public class ExampleController {

	public static final String EXAMPLE_VIEW = "example";

	 @Autowired
	 @Qualifier("exampleComponent")
	 private ExampleComponent exampleComponent;
	 
	// primera forma
	@GetMapping("/exampleString")
	public String exampleString(Model model) {
		exampleComponent.sayHello();
		model.addAttribute("people",getPeople());
		return EXAMPLE_VIEW;
	}

	// segunda forma
	// funciona datos extensos
	@GetMapping("/exampleMAV")
	public ModelAndView exampleMAV() {
		ModelAndView mav = new ModelAndView(EXAMPLE_VIEW);
		mav.addObject("people",getPeople());
		return mav;
	}
	
	private List<Person>getPeople(){
		List<Person>people=new  ArrayList<>();
		people.add(new Person("Jose", 12));
		people.add(new Person("Andres", 20));
		people.add(new Person("Maria", 50));
		people.add(new Person("Sebas", 18));
		people.add(new Person("Antonio", 25));
		return people;
	}
}

