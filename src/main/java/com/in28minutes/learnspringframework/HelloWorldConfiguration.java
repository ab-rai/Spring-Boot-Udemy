package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {};
record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String name() {
		return "Devesh Singh";
	}
	@Bean
	public int age() {
		return 25;
	}
	@Bean
	public Person person() {
		Person person1 = new Person("Abhishek",26);
		return person1;
	}
	@Bean
	public Address address() {
		return new Address("Lane No.3 Kailashpuri","Deoria");
	}
}
	