package com.accenture.cucumbertest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import junit.framework.TestCase;


@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\git_lip\\MyFramework\\src\\test\\java\\com\\accenture\\cucumbertest\\login.feature")

public class RunnerClass extends TestCase {
	
	

}
