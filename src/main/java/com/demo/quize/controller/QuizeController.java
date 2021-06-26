package com.demo.quize.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.quize.model.Options;
import com.demo.quize.model.Question;
import com.demo.quize.services.QuizeService;


@RestController
@RequestMapping("/quize")
public class QuizeController {
	
	
	public QuizeService quizeService = new QuizeService();
	
	@PostMapping("/addQuestions")
	public ResponseClass createQuestions(@RequestBody Question question) {
			String questionId = quizeService.addQuestions(question);
			return new ResponseClass(200,"Question Added with QuestionId : "+questionId);
		
	}
	@PostMapping("/addOptions/{questionId}")
	public ResponseClass addOptions(@RequestBody Options option, @PathVariable String questionId) {
		if(quizeService.addOptions(questionId,option)) {
			return new ResponseClass(200,"OptionAdded");
		} else {
			return new ResponseClass(403,"Internal Error");
		}
	}
	@PostMapping("/createQuize")
	public ResponseClass createQuize(@RequestBody List<String> questionIds) {
		
			String quizeId = quizeService.createQuize(questionIds);
			return new ResponseClass(200,"Quize created with id : "+quizeId);
			
	
	}
	
	@GetMapping("/viewAllQuize")
	public ResponseClass viewAllQuize() {
		
		String quize = quizeService.viewAllQuize();
		return new ResponseClass(200,"Quize created with id : "+quize);
			
	}
	
	
}
