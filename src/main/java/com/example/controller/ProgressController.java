package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProgressController {

	@GetMapping("/progress")
	public ModelAndView progress() {
		ModelAndView mav = new ModelAndView("progress");
		return mav;
	}
	
}
