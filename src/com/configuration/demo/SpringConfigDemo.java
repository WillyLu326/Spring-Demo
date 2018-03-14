package com.configuration.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringConfigDemo {

	public static void main(String[] args) {
		
		// Get the Beans Container
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// Reterive the Bean

	}

}
