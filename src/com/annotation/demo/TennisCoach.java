package com.annotation.demo;

import org.springframework.stereotype.Component;

import com.willy.demo.Coach;

@Component("tennisCoach")
public class TennisCoach implements Coach {

	@Override
	public String getWorkon() {
		return "Play Tennis is Very Helpful.";
	}

}
