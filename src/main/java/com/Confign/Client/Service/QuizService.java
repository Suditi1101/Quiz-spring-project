package com.Confign.Client.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import com.Confign.Client.model.Answer;
import com.Confign.Client.model.Quiz;

@Component
public class QuizService {
	
	public void setQuiz() {
		List<Quiz> quiz = new ArrayList<>();
		quiz.add(new Quiz("Which file is used configure Spring Boot Properties?", new Answer("application.properties")));
		quiz.add(new Quiz("How many profiles can be active at a time?", new Answer(1)));
		quiz.add(new Quiz("What is the latest version of Spring boot?", new Answer(3.4d)));
		quiz.add(new Quiz("Does @RestController include @ResponseBody by default?", new Answer(true)));
		
		takeQuiz(quiz);
		
	}

	private void takeQuiz(List<Quiz> quiz) {
		
		quiz.stream().forEach(q -> {
			
			System.out.println("Let's start the quiz");
			System.out.println(q.getQuest());
			Scanner sc = new Scanner(System.in);
			String userInput = sc .nextLine();
			Answer correctAns = q.getAns();
			boolean isCorrect = false;
			
			if(correctAns.getType().equals("string")) {
				isCorrect = userInput.equalsIgnoreCase(correctAns.getStrAns());
			}else if(correctAns.getType().equals("integer")) {
				int inputVal = Integer.parseInt(userInput.trim());
                isCorrect = inputVal == correctAns.getIntAns();
			}else if(correctAns.getType().equals("double")) {
				double inputVal = Double.parseDouble(userInput.trim());
                isCorrect = inputVal == correctAns.getDoubleAns();
			}else if(correctAns.getType().equals("boolean")) {
				boolean inputVal = Boolean.parseBoolean(userInput.trim());
                isCorrect = inputVal == correctAns.isBoolAns();
			}
			System.out.println(isCorrect? "Right": "Wrong");
		});
	}
	
}
