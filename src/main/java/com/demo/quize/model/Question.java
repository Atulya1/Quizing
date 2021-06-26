package com.demo.quize.model;

import java.util.UUID;
import java.util.*;
public class Question {
	
	private String questionId;
	private String question;
	private String correctAnswer; 
	
	public Question(String question,String correctAnswer) {
		super();
		this.questionId = UUID.randomUUID().toString();
		this.question = question;
		this.correctAnswer = correctAnswer;
	}
	
	public String getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", correctAnswer=" + correctAnswer
				+ "]";
	}
	
}
