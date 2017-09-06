package com.spring.real.service;


import java.util.List;

import com.spring.real.entity.Contact;
import com.spring.real.model.ContactModel;

public interface ContactService {

	public abstract ContactModel addContact(ContactModel modelo);
	public abstract List<ContactModel>lisAllContactModel();
	public abstract Contact findContactById(int id);
	public abstract void removeContact(int id);
	public ContactModel findContactModelById(int id);
}
