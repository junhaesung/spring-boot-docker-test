package com.example.springbootdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@SpringBootApplication
@RestController
public class SpringBootDockerApplication {

	@RequestMapping("/hello")
	public String home() {
		return "Hello Docker World";
	}

	@RequestMapping("/time")
	public LocalDateTime time() {
		return LocalDateTime.now();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerApplication.class, args);
	}

}
