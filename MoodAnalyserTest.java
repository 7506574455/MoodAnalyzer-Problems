package com.moodanalyser.MoodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	    //TC1.1
	    @Test
	    public void givenMessage_WhenSad_ShouldReturnSad() {
	        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
	        String mood = moodAnalyser.analyseMood("I am in Sad Mood");

	    }
        //TC1.2
	    @Test
	    public void givenMessage_WhenNotSad_ShouldReturnHappy() {
	        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
	        String mood = moodAnalyser.analyseMood("I am in Any Mood");
	        Assert.assertEquals("HAPPY", mood);
	    }
}
