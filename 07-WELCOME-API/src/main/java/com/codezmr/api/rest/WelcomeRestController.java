package com.codezmr.api.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codezmr.api.GreetClient;

@RestController
public class WelcomeRestController {
	
	@Autowired
	GreetClient greetClient;
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		
		String welcomeMsg = "Welcome To CodeZMR...!!";
		
		String greetMessage = greetClient.invokeGreetApi();
		
		return greetMessage + ", "+ welcomeMsg;
		
	}
}
