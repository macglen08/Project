package com.eureka.discoveryserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/helloEureka")
	public String hello( ) {
		return "hello from discovery-server";
	}
	

}
