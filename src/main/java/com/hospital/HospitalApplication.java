package com.hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = { "http://localhost:4200" }, maxAge = 6000)
public class HospitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalApplication.class, args);
		System.out.println("hello world");
	}
}
