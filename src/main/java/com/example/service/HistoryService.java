package com.example.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Exercise;
import com.example.repository.ExerciseRepository;

@Service("historyService")
public class HistoryService {
	
	@Autowired
	ExerciseRepository exerciseRepository;

	public List<Date> findAllDates() {
		
		List<Exercise> exerciseList = exerciseRepository.findAll();
		
		Set<Date> dateSet = new HashSet<>();
		
		for(Exercise exercise : exerciseList) {
			dateSet.add(exercise.getDate());
		}
		
		List<Date> dateList = new ArrayList<>(dateSet);
		Collections.sort(dateList);
		
		return dateList;
		
	}
	
}
