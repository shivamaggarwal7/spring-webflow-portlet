package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.portlet.ModelAndView;


@Controller
public class AppointmentController {

	
	public ModelAndView addEmp(Employee emp)
	{
		ModelAndView modelView =new ModelAndView();
		modelView.addObject("empBean", emp);
		System.out.println("Inside controller");
		
		return modelView;
	}

}
