package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pluralsight.model.Exercise;

@Controller
public class MinutesController {
	
	@RequestMapping(value="/addMinutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise) {
		System.out.println("exercise: " + exercise.getMinutes());
		
		return "addMinutes";
		//return "forward:addMoreMinutes.html"; sends value to next 
		//return "redirect:addMoreMinutes.html"; //ends request and starts new on
	}
	
//	@RequestMapping(value="/addMinutes")
//	public String addMoreMinutes(@ModelAttribute("exercise") Exercise exercise) {
//		System.out.println("exercise: " + exercise.getMinutes());
//		
//		return "addMinutes";
//	}

}
