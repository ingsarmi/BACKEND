package com.example.Clinica2;


import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Clinica2Application {

	public static void main(String[] args) {
		SpringApplication.run(Clinica2Application.class, args);
		PropertyConfigurator.configure("log4j.properties");
	SpringApplication.run(Clinica2Application.class, args);
}
}