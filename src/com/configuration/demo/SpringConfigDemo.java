package com.configuration.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringConfigDemo {

	public static void main(String[] args) {
		
		// Get the Beans Container
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// Retrieve the Bean
		Coach3 pingpangCoach = context.getBean("pingpangCoach", Coach3.class);
		
		// Run the Method
		System.out.println(pingpangCoach.getWorkon());
		
		SwinCoach swimCoach = context.getBean("swinCoach", SwinCoach.class);
		System.out.println(swimCoach.getName());
		System.out.println(swimCoach.getTeam());
		
		
		// Close Container
		context.close();

	}

}
