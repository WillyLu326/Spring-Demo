package com.willy.demo;

public class BaseballCoach implements Coach {
	
	private String email;
	private String team;
	private String name;
	private String description;
	
	public BaseballCoach(String name, String description) {
		this.name = name;
		this.description = description;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}


	@Override
	public String getWorkon() {
		return "This is baseball coach workout";
	}

}
