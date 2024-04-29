package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootProjApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootProjApplication.class, args);
		System.out.println("Bootify Spring  ");
		System.out.println("BootProjApplication.main()"+Object.class);
		System.err.println("Final method () ---");
	}

}
