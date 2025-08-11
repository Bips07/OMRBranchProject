package com.omrbranch.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.omrbranch.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = ("@search"),dryRun = false, monochrome = false, plugin = {
		"pretty",
		"json:target\\Search.json" }, glue = "com.omrbranch.stepdefinition", features = "src\\test\\resources")

public class TestRunnerClass2 {


	@AfterClass
	public static void afterClass() {
		
		Reporting.generateJvmReports(System.getProperty("user.dir")+"\\target\\Search.json");
	}
}
