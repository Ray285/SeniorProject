package com.wayne.edu;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.wayne.edu.entities.Student;
import com.wayne.edu.entities.System;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView student() {
	   return new ModelAndView("home", "command", new Student());
	}
	   
	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("student")Student student, 
	ModelMap model) {
		model.addAttribute("name", student.getName());
	    model.addAttribute("age", student.getAge());
	    model.addAttribute("id", student.getId());
	      
	    return "result";
	}
	
	@RequestMapping(value = "/addSystem", method = RequestMethod.GET)
	public ModelAndView system() {
	   return new ModelAndView("addSystems", "command", new System());
	}
	   
	@RequestMapping(value = "/showSystems", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("system")System system, 
	ModelMap model) {
		model.addAttribute("id", system.getId());
		model.addAttribute("name", system.getName());
	    model.addAttribute("vcsUrl", system.getVCSUrl());
	    model.addAttribute("issueTrackerUrl", system.getIssueTrackerUrl());
	    model.addAttribute("programmingLang", system.getProgrammingLang());
	      
	    return "showSystems";
	}
	  
}
