package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {};
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
		return new Person("Abhishek",26, new Address("Baltikara","Deoria"));
	}
	@Bean
	public Person person2MethodCall() {
		return new Person(name(),age(), address());
	}@Bean
	public Person person2Parameter(String name, int age, Address address3) {
		return new Person(name, age, address3);
	}
	@Bean(name = "address2")
	public Address address() {
		return new Address("Lane No.3 Kailashpuri","Deoria");
	}
	@Bean(name = "address3")
	public Address addressOther() {
		return new Address("Bangali Tola","Delhi");
	}
}
	