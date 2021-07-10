package com.moodanalyser.MoodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    
	//TC1.1
	@Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Sad Mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD", mood);
    }
    //TC1.2
    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Happy Mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }
}
