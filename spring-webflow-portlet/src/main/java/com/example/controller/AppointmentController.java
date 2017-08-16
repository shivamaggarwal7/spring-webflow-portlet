package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.portlet.ModelAndView;

import com.example.beans.Appointment;
import com.example.beans.Child;
import com.example.beans.Employee;


@Controller
public class AppointmentController {

	
	public ModelAndView addEmp(Employee emp)
	{
		ModelAndView modelView =new ModelAndView();
		modelView.addObject("emp", emp);
		System.out.println("Inside controller");
		
		return modelView;
	}
	
	public ModelAndView addChild(Child child,Employee emp)
	{
		ModelAndView modelView =new ModelAndView();
		emp.setChild(child);
		child.setEmp(emp);
		//modelView.addObject("empBean", emp);
		System.out.println("Inside CHild controller");
		
		
		return modelView;
	}
	
	public void intitateAppnt(Child child,Employee emp,Appointment appnt)
	{
		appnt.setChild(child);
		appnt.setEmp(emp);
	}
	
	public void finalAppnt(Appointment appnt)
	{
		
		System.out.println("Final appnt");
	}

}
