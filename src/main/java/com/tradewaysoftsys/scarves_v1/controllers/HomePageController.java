package com.tradewaysoftsys.scarves_v1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

	@GetMapping("/scarves")
	public String showScarvesHome() {
		return "fragments/home";
	}

}
