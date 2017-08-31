package com.udemy.springmvc.component;

import org.springframework.stereotype.Component;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Component("exampleComponent")
public class ExampleComponent {

	private static final Log LOG=LogFactory.getLog(ExampleComponent.class);
	
	public void sayHello(){
		LOG.info("Hello from example component");
		
	}
}
