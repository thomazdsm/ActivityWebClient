package com.activity.webclientactivity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TableController {

	@RequestMapping("/tabela")
	public String form() {
		return "chart/table";
	}

}
