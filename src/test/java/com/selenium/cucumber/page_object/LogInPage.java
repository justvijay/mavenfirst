package com.selenium.cucumber.page_object;

import com.selenium.cucumber.drivers.DriversDepot;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class LogInPage extends DriversDepot {
    public void enterFields(String EmailID,String MyPassword) {
        driver.findElement(By.id("email-address")).sendKeys(EmailID);
        driver.findElement(By.id("current-password")).sendKeys(MyPassword);
        clickLogin();
    }
    public void clickLogin(){
        driver.findElement(By.cssSelector(".button")).click();
       sleep(4000);
    }
}