package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/index")
	public String index() {
		return "<!DOCTYPE html>\n"
				+ "<html>"
				+ "<body>"
				+ "<p>Welcome to PlantPlaces!</br>"
				+ "Your specimen is:</p>"
				+ "<p>43 39.74 -84.51 A beautiful Eastern Redbud</p>"
				+ "</body>"
				+ "</html>";
	}

}
