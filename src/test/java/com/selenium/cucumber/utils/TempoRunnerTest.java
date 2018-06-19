package com.selenium.cucumber.utils;

import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

class TempoRunnerTest {
    public static WebDriver driver;
    public void runInOneGo(){
        driver= new FirefoxDriver();

        driver.get("http://www.argos.co.uk/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


    }
}
