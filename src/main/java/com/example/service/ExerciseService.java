package com.example.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Exercise;
import com.example.repository.ExerciseRepository;

@Service("exerciseService")
public class ExerciseService {

	@Autowired
	ExerciseRepository exerciseRepository;
	
	public void saveExercise(Exercise exercise) {
		exerciseRepository.save(exercise);
	}
	
	public void deleteById(Long id) {
		exerciseRepository.deleteById(id);
	}
	
	public List<Exercise> findByCurrentDate() {
		return exerciseRepository.findByDate(new Date());
	}
	
	public List<Exercise> findByDate(Date date) {
		return exerciseRepository.findByDate(date);
	}
	
}
