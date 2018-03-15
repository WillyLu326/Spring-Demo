package com.configuration.demo;

import org.springframework.beans.factory.annotation.Value;

public class SwinCoach implements Coach3 {

	@Value("willyl,,...")
	private String name;
	
	@Value("email")
	private String team;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}


	@Override
	public String getWorkon() {
		return "Swim is good";
	}

}
