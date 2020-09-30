package com.cg.moodanalyser;

import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyserTest {
	@Test
	public void MoodTest() {
		MoodAnalyser obj = new MoodAnalyser();
		String mood = obj.analyseMood("I am in any mood");
		Assert.assertEquals("Happy", mood);
	}
}
