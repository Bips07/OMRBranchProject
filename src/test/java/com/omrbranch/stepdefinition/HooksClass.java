package com.omrbranch.stepdefinition;

import com.omrbranch.baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {
	
	@Before
	public void before() {
		
	}
	
	@After
	public void after() {
		
		closeWindow();
	}

}
