package ru.samples.sample2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.samples.sample2.components.TimerComponent;

@RestController
@RequestMapping("say")
public class HelloWorldController {

	@Autowired
	TimerComponent timer;

	@GetMapping(value = "hello",produces= "text/html")
	public String sayHello () {
		return 
"<!DOCTYPE html>"+
"<html>"+
"	<head><title>Hello world!</title></head>"+
"	<body>Hello world!<br>"+timer.getCurrentDate ()+"</body>"+
"</html>"
			;
	}
}
