package com.activity.webclientactivity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TeamController {

	@RequestMapping("/equipe")
	public String form() {
		return "team/team";
	}
}