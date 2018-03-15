package com.configuration.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwinCoach implements Coach3 {

	@Value("willylu")
	private String name;
	
	@Value("${foo.email}")
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
