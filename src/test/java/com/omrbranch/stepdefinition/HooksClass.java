package com.omrbranch.stepdefinition;

import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.omrbranch.baseclass.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass extends BaseClass {

	@Before
	public void before() {

	}

	@After
	public void after(Scenario s) throws IOException {

		if (s.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			//screenshot(s.getName());
			byte[] b = ts.getScreenshotAs(OutputType.BYTES);
			s.attach(b,"image/png",s.getName());
		}
		closeWindow();
	}

}
