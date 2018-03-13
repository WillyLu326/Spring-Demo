package com.willy.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// Get Bean Container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Get the Bean
		Coach coach = context.getBean("coach", Coach.class);
		
		// Run Bean Method
		System.out.println(coach.getWorkon());
		
		// Close Container
		context.close();

	}

}
