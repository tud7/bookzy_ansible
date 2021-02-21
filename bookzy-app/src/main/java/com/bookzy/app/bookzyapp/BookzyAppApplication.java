package com.bookzy.app.bookzyapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
public class BookzyAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookzyAppApplication.class, args);
	}
}

@RestController
class GreetingController {
    
    @RequestMapping("/")
	public String index() {
		return "Hello from Bookzy by Tu Duong!";
	}
}
