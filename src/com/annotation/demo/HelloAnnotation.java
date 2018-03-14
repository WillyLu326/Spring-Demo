package com.annotation.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloAnnotation {
	public static void main(String[] args) {
		
		// Get Container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationAnnotationContext.xml");
		
		// Retrieve the bean
		Coach2 coach = context.getBean("tennisCoach", Coach2.class);
		
		// Use bean object
		System.out.println(coach.getWorkon());
		System.out.println(coach.getGreeting());
		
		// Close Container
		context.close();
		
	}
}
