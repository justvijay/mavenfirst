package com.selenium.cucumber.utils;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Resources", plugin="json:target/cucumber.json")

public class RunnerCucumberTest{

}

