package com.demo.quize.model;

import java.util.List;
import java.util.UUID;

public class Quize {
	private String quizeId;
	private String QuizeName;
	public Quize(String QuizeName) {
		super();
		this.quizeId = UUID.randomUUID().toString();
		this.QuizeName = QuizeName;
		
	}
	public String getQuizeId() {
		return quizeId;
	}
	public String getQuizeName() {
		return QuizeName;
	}
	public void setQuizeName(String quizeName) {
		QuizeName = quizeName;
	}
	
	
	
	
	
	
}
