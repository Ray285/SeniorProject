package com.wayne.edu;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.wayne.edu.entities.System;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String home() {
	   return "home";
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
	    model.addAttribute("issueTrackerUrl", system.getIssueTrackerUrl());
	    model.addAttribute("programmingLang", system.getProgrammingLang());
	    model.addAttribute("versionControlUrl", system.getversionControlUrl());
	      
	    return "showSystems";
	}
	  
}
