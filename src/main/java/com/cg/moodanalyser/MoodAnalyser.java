package com.cg.moodanalyser;

public class MoodAnalyser {

	private String msg;

	public MoodAnalyser() {
	}

	public MoodAnalyser(String msg) {
		this.msg = msg;
		analyseMood();
	}

	public String analyseMood(String msg) {
		this.msg = msg;
		return analyseMood();
	}

	public String analyseMood() {
		try {
			if (msg.contains("Happy"))
				return "Happy";
			else
				return "Sad";
		} catch (Exception e) {
			return "Happy";
		}
	}
}
