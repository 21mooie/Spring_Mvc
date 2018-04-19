package com.pluralsight.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pluralsight.model.Activity;
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
	
	@RequestMapping(value="/activities", method=RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities() {
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity run = new Activity();
		run.setDesc("Run");
		activities.add(run);
		
		Activity bike = new Activity();
		bike.setDesc("Bike");
		activities.add(bike);
		
		Activity swim = new Activity();
		swim.setDesc("Swim");
		activities.add(swim);
		
		return activities;
	}
	
//	@RequestMapping(value="/addMinutes")
//	public String addMoreMinutes(@ModelAttribute("exercise") Exercise exercise) {
//		System.out.println("exercise: " + exercise.getMinutes());
//		
//		return "addMinutes";
//	}

}
