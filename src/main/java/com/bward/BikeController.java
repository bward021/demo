package com.bward;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/bikes")
public class BikeController {

	@GetMapping(path = "/{id}")
	public String retrieveBikeById(@PathVariable("id") String name) {
		return "Not Implemented";
	} 
}
