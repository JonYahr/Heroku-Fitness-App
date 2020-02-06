package com.example.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Exercise;
import com.example.service.ExerciseService;
import com.example.service.HistoryService;

@Controller
public class HistoryController {

	@Autowired
	HistoryService historyService;
	
	@Autowired
	ExerciseService exerciseService;
	
	@GetMapping("/history") 
	public ModelAndView homeController() {
		
		ModelAndView mav = new ModelAndView("history-list");
		
		mav.addObject("dateList", historyService.findAllDates());
		
		return mav;
	}
	
	@RequestMapping(value="/history/{dateText}", method=RequestMethod.GET)
	public ModelAndView deleteExercise(@PathVariable String dateText) throws ParseException {
		
		ModelAndView mav = new ModelAndView("history");
		
		Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateText);
		
		System.out.println("actual date being used in this controller: " + date.toString());
		System.out.println("date to string: " + new Date().toString());
		
		List<Exercise> exerciseList = exerciseService.findByDate(date);
		
		System.out.println(Arrays.toString(exerciseList.toArray()));
		
		mav.addObject("exerciseList", exerciseList);
		mav.addObject("timeStamp", dateText);
		
		return mav;
		
	}
	
	
	
	
}
