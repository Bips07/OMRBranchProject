package com.omrbranch.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.omrbranch.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(	dryRun = false, 
					monochrome = false, 
					plugin = {"pretty","json:target\\Search.json"}, 
					glue = "com.omrbranch.stepdefinition", 
					features = "@src\\\\test\\\\resources\\\\Rerun\\\\rerun.txt")

public class ReRunnerClass {


	@AfterClass
	public static void afterClass() {
		
		Reporting.generateJvmReports(System.getProperty("user.dir")+"\\target\\Search.json");
	}
}
