package com.sinu.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController 
{

	@RequestMapping(value="/process")
	public ModelAndView saywelcome()
	{
		ModelAndView mav=new ModelAndView("welcome");
		return mav;
	}
}
