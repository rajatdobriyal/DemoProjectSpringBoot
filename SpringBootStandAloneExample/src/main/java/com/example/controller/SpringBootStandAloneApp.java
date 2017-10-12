package main.java.com.example.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("main.java.com.example")
public class SpringBootStandAloneApp {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootStandAloneApp.class, args);

	}
}
