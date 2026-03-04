package com.dragonsoft.designpattern._04_action.oberserver;

public class NewsPapaer extends Subject{
	private String content;
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		notifyOberserver();
	}
}
