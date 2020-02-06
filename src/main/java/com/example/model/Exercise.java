package com.example.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Exercise {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long exerciseId;
	
	String exerciseName;
	
	@Temporal(TemporalType.DATE)
	Date date;
	
	int sets;
	int reps;
	int weight;
	
	public Long getExerciseId() {
		return exerciseId;
	}
	public void setExerciseId(Long exerciseId) {
		this.exerciseId = exerciseId;
	}
	public String getExerciseName() {
		return exerciseName;
	}
	public void setExerciseName(String exerciseName) {
		this.exerciseName = exerciseName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getSets() {
		return sets;
	}
	public void setSets(int sets) {
		this.sets = sets;
	}
	public int getReps() {
		return reps;
	}
	public void setReps(int reps) {
		this.reps = reps;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
