package com.spring.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping("/")
	public ModelAndView boardMain(ModelAndView modelAndView) {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>메인페이지접속");
		modelAndView.setViewName("/home");
		return modelAndView;
	}

}