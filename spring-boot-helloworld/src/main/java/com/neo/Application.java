package com.neo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/hello/{name}/index")
	public String greeting(@PathVariable String name) {
		System.out.println(name);
		return name+"Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
