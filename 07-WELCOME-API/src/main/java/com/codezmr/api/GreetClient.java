package com.codezmr.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="GREET-API") //feignClient is use for inter-service communication
public interface GreetClient {
	
	@GetMapping("/greet")
	public String invokeGreetApi();
}
