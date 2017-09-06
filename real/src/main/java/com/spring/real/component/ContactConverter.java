package com.spring.real.component;

import org.springframework.stereotype.Component;

import com.spring.real.entity.Contact;
import com.spring.real.model.ContactModel;

@Component("contactConverter")
public class ContactConverter {

	public Contact convertContactModelToContact(ContactModel modelo) {
		Contact c = new Contact();
		c.setCity(modelo.getCity());
		c.setFirstname(modelo.getFirstname());
		c.setId(modelo.getId());
		c.setLastname(modelo.getLastname());
		c.setTelefhone(modelo.getTelefhone());
		return c;
	}
	
	public ContactModel convertContactToContactModel(Contact contacto){
		ContactModel modelo=new ContactModel();
		modelo.setCity(contacto.getCity());
		modelo.setFirstname(contacto.getFirstname());
		modelo.setId(contacto.getId());
		modelo.setLastname(contacto.getLastname());
		modelo.setTelefhone(contacto.getTelefhone());
		return modelo;
	}
}
