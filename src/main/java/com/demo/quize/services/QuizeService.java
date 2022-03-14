package com.demo.quize.services;


import java.util.ArrayList;
import java.util.List;

import com.demo.quize.model.Options;
import com.demo.quize.model.Question;
import com.demo.quize.model.Quize;
import com.demo.quize.repo.OptionsRepository;
import com.demo.quize.repo.QuestionRepository;
import com.demo.quize.repo.QuizeRepository;


public class QuizeService {
	//testing git commands
	//testing another command
	
	public String addQuestions(Question question) {
		Question q = new Question(question.getQuestion(),question.getCorrectAnswer());
		
		QuestionRepository.questions.put(q.getQuestionId(), q);
		return q.getQuestionId();
	}
	
	public boolean addOptions(String questionId,Options options) {
		OptionsRepository.options.put(questionId, options);
		return true;
	}
	
	public String createQuize(List<String> questionIds) {
		List<Question> questionsInAQuize = new ArrayList<>();
		Quize q = new Quize("Animals");
		
		for(String question : questionIds) {
			questionsInAQuize.add(QuestionRepository.questions.get(question));
		}
		QuizeRepository.quize.put(q.getQuizeId(), questionsInAQuize);
		return q.getQuizeId();
	}
	public String viewAllQuize() {
		return QuizeRepository.quize.toString();
	}
	
}
