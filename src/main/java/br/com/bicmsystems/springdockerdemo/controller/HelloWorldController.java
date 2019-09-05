package br.com.bicmsystems.springdockerdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloWorldController {

	@Value("${app.name}")
	private String app;

    @GetMapping("/hello")
    public String helloWorld(){

        return "Hello World docker 2 " + app;

    }

}