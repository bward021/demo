package com.bward;

import org.springframework.stereotype.Component;

@Component
public class MyService {

	public String sayHi(String hiToWho) {
		return "Hi " + hiToWho;
	}
}
