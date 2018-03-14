package com.annotation.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.willy.demo.Coach;

public class HelloAnnotation {
	public static void main(String[] args) {
		
		// Get Container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationAnnotationContext.xml");
		
		// Retrieve the bean
		Coach coach = context.getBean("tennisCoach", Coach.class);
		
		// Use bean object
		System.out.println(coach.getWorkon());
		
		// Close Container
		context.close();
		
	}
}
