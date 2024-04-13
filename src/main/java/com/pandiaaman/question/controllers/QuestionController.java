package com.pandiaaman.question.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pandiaaman.question.entities.Question;
import com.pandiaaman.question.services.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	private QuestionService questionService;

	public QuestionController(QuestionService questionService) {
		super();
		this.questionService = questionService;
	}
	
	@PostMapping("")
	public Question addQuestion(@RequestBody Question question) {
		return questionService.addQuestion(question);
	}
	
	@GetMapping("")
	public List<Question> getAllQuestions(){
		return questionService.getAllQuestions();
	}
	
	@GetMapping("/{questionId}")
	public Question getOneQuestion(@PathVariable Long questionId) {
		return questionService.getOneQuestion(questionId);
	}
	
	@GetMapping("/quiz/{quizId}")
	public List<Question> getQusetionsForQuizId(@PathVariable Long quizId){
		return questionService.getQuestionsByQuizId(quizId);
	}
}
