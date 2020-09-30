package com.maveric;



import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;
import net.masterthought.cucumber.json.support.Status;

public class TestRunnerNotes{
	
	@Test
    public void testParallel() {
        Results results = Runner.path("classpath:com/maveric/UserDetails.feature","classpath:com/maveric/UserDetails2.feature","classpath:com/maveric/UserDetails3.feature").tags("~@ignore").parallel(5);
        assertTrue(results.getErrorMessages(), results.getFailCount() == 0);
    
	File reportOutputDirectory = new File("E:\\Ellipse - Gtech\\program\\MobAuto\\SriKarateFrame\\Notes\\target");
	List<String> jsonFiles = new ArrayList<String>();
	jsonFiles.add("cucumber-report-1.json");
	jsonFiles.add("cucumber-report-2.json");

	String buildNumber = "1";
	String projectName = "cucumberProject";

	Configuration configuration = new Configuration(reportOutputDirectory, projectName);
	
	//configuration.setNotFailingStatuses(Collections.singleton(Status.SKIPPED));
	configuration.setBuildNumber(buildNumber);
	
	
	configuration.addClassifications("Platform", "Windows");
	
	configuration.addClassifications("Branch", "release/1.0");

	
	ArrayList<String> classificationFiles = new ArrayList<String>();
	classificationFiles.add("properties-1.properties");
	classificationFiles.add("properties-2.properties");
	//configuration.addClassificationFiles(classificationFiles);

	ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
	Reportable result = reportBuilder.generateReports();

	
	
	
	
	
	}
}




