package com.spinalski.stylist.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StylistController {

	@RequestMapping("/")
	public String index() {
		return "Stylist!";
	}
}
