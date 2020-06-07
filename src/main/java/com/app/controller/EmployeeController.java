package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.Employee;

@Controller
public class EmployeeController {

	 //display form
		@RequestMapping("/reg")
		public String showPage() {
			return "Register";
		}

	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String readData(
			@ModelAttribute Employee employee,
			ModelMap map) {
		System.out.println(employee);
		System.out.println("welcome");
		map.addAttribute("emp",employee);
		return "Data";
	}
}

	
	
	
	

