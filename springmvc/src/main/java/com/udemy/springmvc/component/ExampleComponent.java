package com.udemy.springmvc.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.udemy.springmvc.repository.CourseJpaRepository;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Component("exampleComponent")
public class ExampleComponent {

	private static final Log LOG=LogFactory.getLog(ExampleComponent.class);
	
	@Autowired
	@Qualifier("courseJpaRepository")
	private CourseJpaRepository  courseJpaRepository;
	
	public void sayHello(){
		LOG.info("Hello from example component");
		
	}
}
