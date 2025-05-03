package com.Confign.Client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Confign.Client.Service.QuizService;

@RestController
public class QuizController {
	@Autowired
	QuizService quizServ;
	@GetMapping(value = "/takequiz")
	public void callQuiz() {
		quizServ.setQuiz();
	}
}
