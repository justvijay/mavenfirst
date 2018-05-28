package com.selenium.cucumber.page_object;

import com.selenium.cucumber.drivers.DriversDepot;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class LogInPage extends DriversDepot {
    public void enterFields(String EmailID,String MyPassword) {
        driver.findElement(By.id("email-address")).sendKeys("");
        driver.findElement(By.id("current-password")).sendKeys("");
    }
    public void clickLogin(){
        driver.findElement(By.id("current-password")).sendKeys(Keys.ENTER);
       sleep(4000);
    }
}