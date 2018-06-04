package com.selenium.cucumber.utils;

import com.selenium.cucumber.page_object.HeaderPage;
import com.selenium.cucumber.page_object.LogInPage;
import com.selenium.cucumber.page_object.ResultPage;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import java.util.List;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Resources", plugin="json:target/cucumber.json")

public class RunnerCucumberTest{

}

