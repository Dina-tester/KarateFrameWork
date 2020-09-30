package com.maveric;

import com.intuit.karate.KarateOptions;
import com.intuit.karate.junit5.Karate;

public class SampleTest {

	@Karate.Test
	Karate testSample() {
		
		return Karate.run("com\\maveric\\sample.feature").relativeTo(getClass());
	}
	
	
	
	
	
	
}
