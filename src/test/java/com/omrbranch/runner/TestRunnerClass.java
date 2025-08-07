package com.omrbranch.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.omrbranch.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = ("@login"),dryRun = false, monochrome = false, plugin = {
		"pretty",
		"json:target\\Output1.json" }, glue = "com.omrbranch.stepdefinition", features = "src\\test\\resources")

public class TestRunnerClass {


	@AfterClass
	public static void afterClass() {
		
		Reporting.generateJvmReports(System.getProperty("user.dir")+"\\target\\Output1.json");
	}
}
