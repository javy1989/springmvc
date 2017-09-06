package com.spring.real.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring.real.component.ContactConverter;
import com.spring.real.entity.Contact;
import com.spring.real.model.ContactModel;
import com.spring.real.repository.ContactRepository;
import com.spring.real.service.ContactService;

@Service("contactServiceImpl")
public class ContactServiceImpl implements ContactService {

	@Autowired
	@Qualifier("contactRepository")
	private ContactRepository contactRepository;

	@Autowired
	@Qualifier("contactConverter")
	private ContactConverter contactConverter;

	@Override
	public ContactModel addContact(ContactModel modelo) {
		Contact contacto = contactRepository.save(contactConverter.convertContactModelToContact(modelo));
		return contactConverter.convertContactToContactModel(contacto);
	}

	@Override
	public List<ContactModel> lisAllContactModel() {
		List<Contact> contacts = contactRepository.findAll();
		List<ContactModel> contactsModelList = new ArrayList<>();
		for (Contact c : contacts) {
			contactsModelList.add(contactConverter.convertContactToContactModel(c));
		}
		return contactsModelList;
	}

	@Override
	public Contact findContactById(int id) {
		return contactRepository.findById(id);
	}

	@Override
	public ContactModel findContactModelById(int id) {
		return contactConverter.convertContactToContactModel(findContactById(id));
	}

	@Override
	public void removeContact(int id) {
		Contact contact = contactRepository.findById(id);
		if (contact != null) {
			contactRepository.delete(contact);
		}

	}

}
