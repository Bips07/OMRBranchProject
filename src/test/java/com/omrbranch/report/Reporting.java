package com.omrbranch.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {

	public static void generateJvmReports(String jsonfiles) {
		
		File file = new File(System.getProperty("user.dir")+"\\target");
		
		Configuration config = new Configuration(file, "OMR Web Application");
		
		config.addClassifications("WinOS", "11");
		config.addClassifications("Browser", "Chrome");
		config.addClassifications("Version", "137");
		
		List<String> jsonFile = new ArrayList<String>();
		jsonFile.add(jsonfiles);
		ReportBuilder build = new ReportBuilder(jsonFile, config);
		
		build.generateReports();
	}
}
