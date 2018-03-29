package com.demo.demo.service1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service1Controller {
	@GetMapping("/service1/hello")
	public String method1() {
		return "hello service 1";
	}
}
