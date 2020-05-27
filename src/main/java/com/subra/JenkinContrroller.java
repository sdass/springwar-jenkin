package com.subra;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinContrroller {

	@GetMapping("/greet")
		String sayHi(){
			System.out.println("in sayHi()...");
			return "Test Jenkins works indeed!";
		}
}
