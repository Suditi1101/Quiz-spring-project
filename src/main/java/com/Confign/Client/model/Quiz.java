package com.Confign.Client.model;

import java.util.List;

public class Quiz {
	
	private String quest;
	private List<?> ans;
//	private Answer ans;
	
	public Quiz(String quest, List<?> ans) {
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

	public List<?> getAns() {
		return ans;
	}

	public void setAns(List<?> ans) {
		this.ans = ans;
	}
	
	
}
