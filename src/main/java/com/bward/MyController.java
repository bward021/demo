package com.bward;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {
	
	private static final Logger LOG = LoggerFactory.getLogger(MyController.class);
	
	@Autowired
	MyService myService;

	@GetMapping(path = "/say-hi-to/{name}")
	public String showMyName(@PathVariable("name") String name) {
		LOG.info("I'm saying hi for {}", name);
		System.out.println("This is standard output.");

		return myService.sayHi(name);
	} 
}
