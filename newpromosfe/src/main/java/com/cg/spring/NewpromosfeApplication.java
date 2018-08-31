package com.cg.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.cg.spring")
public class NewpromosfeApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewpromosfeApplication.class, args);
	}
}
