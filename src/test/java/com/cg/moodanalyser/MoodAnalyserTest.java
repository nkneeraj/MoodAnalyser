package com.cg.moodanalyser;
import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyserTest {
	@Test
	public void StringHasHappy() {
		MoodAnalyser moodObj = new MoodAnalyser();
		String mood = moodObj.analyseMood("I am Happy");
		Assert.assertEquals("Happy",mood);
	}
}
