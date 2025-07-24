package com.omrbranch.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.omrbranch.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(name = "Verifying login with valid credentials without Enter Key" ,tags = (""),dryRun = false, monochrome = true, plugin = {
		"pretty",
		"json:target\\Output.json" }, glue = "com.omrbranch.stepdefinition", features = "src\\test\\resources")

public class TestRunnerClass {


//	@AfterClass
//	public static void afterClass() {
//		
//		Reporting.generateJvmReports(System.getProperty("user.dir")+"\\target\\Output.json");
//	}
}
