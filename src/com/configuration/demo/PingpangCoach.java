package com.configuration.demo;

import org.springframework.stereotype.Component;

@Component
public class PingpangCoach implements Coach3 {

	@Override
	public String getWorkon() {
		return "Play Pingpang is very good.";
	}

}
