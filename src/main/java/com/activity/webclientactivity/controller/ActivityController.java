package com.activity.webclientactivity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ActivityController {
	
	@RequestMapping("/add_activity")
	public String form() {
		return "activity/formActivity";
	}
}
