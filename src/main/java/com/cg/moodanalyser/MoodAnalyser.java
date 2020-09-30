package com.cg.moodanalyser;

public class MoodAnalyser {
	
	private String msg;

	public String analyseMood(String msg) {
		this.msg = msg;
		return analyseMood();
	}

	public String analyseMood() {
		if (msg.contains("Happy"))
			return "Happy";
		else
			return "Sad";
	}
}
