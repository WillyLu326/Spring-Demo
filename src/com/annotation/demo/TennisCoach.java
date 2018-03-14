package com.annotation.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class TennisCoach implements Coach2 {

	@Autowired
	private HappyGreetingService happyGreetingService;
	
//	@Autowired
//	public TennisCoach(HappyGreetingService happyGreetingService) {
//		this.happyGreetingService = happyGreetingService;
//	}
	
	@Override
	public String getWorkon() {
		return "Play Tennis is Very Helpful.";
	}

	@Override
	public String getGreeting() {
		return this.happyGreetingService.greeting();
	}

}
