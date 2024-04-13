package com.pandiaaman.question.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pandiaaman.question.entities.Question;
import com.pandiaaman.question.repositories.QuestionRepository;
import com.pandiaaman.question.services.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

	
	private QuestionRepository questionRepository;
	
	public QuestionServiceImpl(QuestionRepository questionRepository) {
		super();
		this.questionRepository = questionRepository;
	}

	@Override
	public Question addQuestion(Question question) {
		// TODO Auto-generated method stub
		return questionRepository.save(question);
	}

	@Override
	public List<Question> getAllQuestions() {
		// TODO Auto-generated method stub
		return questionRepository.findAll();
	}

	@Override
	public Question getOneQuestion(Long questionId) {
		// TODO Auto-generated method stub
		return questionRepository.findById(questionId).orElseThrow(() -> new RuntimeException("question not found"));
	}

	@Override
	public List<Question> getQuestionsByQuizId(Long quizId) {
		// TODO Auto-generated method stub
		return questionRepository.findByQuizId(quizId);
	}

}
