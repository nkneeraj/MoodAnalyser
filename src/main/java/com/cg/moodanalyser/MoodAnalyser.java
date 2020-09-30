package com.cg.moodanalyser;

public class MoodAnalyser {

	private String msg;

	public MoodAnalyser() {
		
	}

	public String MoodAnalyser(String msg) {
		this.msg = msg;
		return analyseMood();
	}

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
