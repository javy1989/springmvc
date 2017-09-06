package com.spring.real.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.spring.real.model.ContactModel;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
public class RestController {

	@GetMapping("/checkrest")
	public ResponseEntity<ContactModel> checkRest() {
		ContactModel cm = new ContactModel();
		cm.setCity("quito");
		cm.setFirstname("ecuador");
		cm.setId(2);
		cm.setLastname("america");
		cm.setTelefhone("4654654");
		return new ResponseEntity<ContactModel>(cm, HttpStatus.OK);
	}
}
