package com.pandiaaman.question.services;

import java.util.List;

import com.pandiaaman.question.entities.Question;

public interface QuestionService {

	Question addQuestion(Question question);
	
	List<Question> getAllQuestions();
	
	Question getOneQuestion(Long questionId);
	
	List<Question> getQuestionsByQuizId(Long quizId);
}
