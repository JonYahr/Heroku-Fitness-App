package com.example.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Exercise;
import com.example.service.ExerciseService;

@Controller
public class ExerciseController {
	
	@Autowired
	ExerciseService exerciseService;

	@GetMapping("/home") 
	public ModelAndView homeController() {
		
		ModelAndView mav = new ModelAndView("home");
		
		mav.addObject("exerciseListToday", exerciseService.findByCurrentDate());
		mav.addObject("exercise", new Exercise());
		
		return mav;
		
	}
	
	@PostMapping("/home") 
	public ModelAndView formSubmission(@ModelAttribute Exercise exercise) {
		
		System.out.println("this is a logging test");
		
		exercise.setDate(new Date());
		exerciseService.saveExercise(exercise);
		
		ModelAndView mav = new ModelAndView("home");
		
		mav.addObject("exerciseListToday", exerciseService.findByCurrentDate());
		mav.addObject("exercise", new Exercise());
		
		return mav;
		
	}

	@RequestMapping(value="/deleteExercise/{id}", method=RequestMethod.GET)
	public ModelAndView deleteExercise(@PathVariable String id) {
		
		ModelAndView mav = new ModelAndView("home");
		
		exerciseService.deleteById(new Long(id));
		
		mav.addObject("exerciseListToday", exerciseService.findByCurrentDate());
		mav.addObject("exercise", new Exercise());
		
		return mav;
		
	}
	
}
