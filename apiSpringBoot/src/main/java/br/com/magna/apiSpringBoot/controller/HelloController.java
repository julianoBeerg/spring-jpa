package br.com.magna.apiSpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Declarando que é um controller e colocando endpoint
@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String olaMundo() {
		return "Hello World Spring";
	}

}
