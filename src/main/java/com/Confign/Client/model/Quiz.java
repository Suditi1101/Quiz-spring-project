package com.Confign.Client.model;

public class Quiz {
	private String quest;
	private Answer ans;
	
	public Quiz(String quest, Answer ans) {
		super();
		this.quest = quest;
		this.ans = ans;
	}

	public String getQuest() {
		return quest;
	}

	public void setQuest(String quest) {
		this.quest = quest;
	}

	public Answer getAns() {
		return ans;
	}

	public void setAns(Answer ans) {
		this.ans = ans;
	}
	
	
}
