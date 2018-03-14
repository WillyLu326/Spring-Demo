package com.annotation.demo;

import org.springframework.stereotype.Component;

@Component
public class HappyGreetingService implements GreetingService {

	@Override
	public String greeting() {
		return "Hello Happy Greeting.";
	}

}
