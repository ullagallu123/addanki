package com.example.addanki;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Addanki {
	
	@RequestMapping("/")
	public String welcome() {
		return "<h1>Welcome to Addanki</h1>";
	}
	@RequestMapping("/welcome")
	public String welcom() {
		return "<h1>Welcome to Singarakonda</h1>";
	}

}
