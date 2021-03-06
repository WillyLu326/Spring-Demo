package com.willy.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// Get Bean Container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Get the Bean
		BaseballCoach coach = context.getBean("coach", BaseballCoach.class);
		
		// Run Bean Method
		System.out.println(coach.getWorkon());
		System.out.println(coach.getEmail());
		System.out.println(coach.getTeam());
		System.out.println(coach.getName());
		System.out.println(coach.getDescription());
		
		// Create Two Beans
		Coach firstCoach = context.getBean("coach", BaseballCoach.class);
		Coach secondCoach = context.getBean("coach", BaseballCoach.class);
		
		System.out.println("Are two coaches same? " + (firstCoach == secondCoach));
		
		// Close Container
		context.close();

	}

}
