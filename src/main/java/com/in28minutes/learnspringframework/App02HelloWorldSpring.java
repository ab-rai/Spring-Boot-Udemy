package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		// 1: Launch a spring context
		var context = 
			new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		// 2: Configure the things that we want spring to manage
		//		i) Configuration class- We can create config. class 
		//				and define everything their
		// 3: Retrieve beans managed by spring
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("address"));
		
	}

}
