package com.cg.moodanalyser;

import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyserTest {
	@Test
	public void MoodTest() {
		
		MoodAnalyser obj = new MoodAnalyser(null);
		String mood = obj.analyseMood("I am Happy");
		System.out.println(mood);
		Assert.assertEquals("Happy", mood);	
}
}
