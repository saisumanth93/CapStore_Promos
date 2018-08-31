package com.cg.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.cg.spring")
public class NewpromosbeApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewpromosbeApplication.class, args);
	}
}
