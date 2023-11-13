package com.example.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.test.modals.Alien;
import com.example.test.services.AlienServices;

@Controller
public class MyController {
	
	AlienServices alienServices;
	
	public MyController(AlienServices alienServices) {
		this.alienServices = alienServices;
	}
	
	@GetMapping("firstPage")
	public ModelAndView firstPageView() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FirstPage");
		mv.addObject("name", "mani");
		return mv;
	}
	
	@GetMapping("getAlienDetails")
	@ResponseBody
	public Alien getAlienDetails() {
		return alienServices.getAlienDetails();
	}
}
