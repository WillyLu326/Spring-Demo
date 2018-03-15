package com.annotation.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.configuration.demo.SwinCoach;


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
		
		Coach2 firstCoach = context.getBean("tennisCoach", Coach2.class);
		Coach2 secondCoach = context.getBean("tennisCoach", Coach2.class);
		
		System.out.println("Are two objects same? " + (firstCoach == secondCoach));
		
		// Close Container
		context.close();
		
	}
}
