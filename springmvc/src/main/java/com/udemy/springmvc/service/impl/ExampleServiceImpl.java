package com.udemy.springmvc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.udemy.springmvc.model.Person;
import com.udemy.springmvc.service.ExampleService;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService {

	private static final Log LOG = LogFactory.getLog(ExampleServiceImpl.class);

	@Override
	public List<Person> getListPeople() {

		List<Person> people = new ArrayList<>();
		people.add(new Person("Jose", 12));
		people.add(new Person("Andres", 20));
		people.add(new Person("Maria", 50));
		people.add(new Person("Sebas", 18));
		people.add(new Person("Antonio", 25));
		LOG.info("Hello from services");
		return people;
	}

}
