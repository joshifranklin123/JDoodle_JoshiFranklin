package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",glue = "com.Stepdefinition",dryRun = false,
                  plugin= "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",tags = "@product")



public class Runner{
	
	
	
	
	
	
}
