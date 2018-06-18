package com.selenium.cucumber.page_object;

import com.selenium.cucumber.drivers.DriversDepot;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class LogInPage extends DriversDepot {
    public void enteremail(String EmailID) {
        driver.findElement(By.id("email-address")).sendKeys(EmailID);
            }
            public void enterpassword(String MyPassword){
                driver.findElement(By.id("current-password")).sendKeys(MyPassword);
                sleep(6000);

            }
    public void clickLogin(){
        driver.findElement(new By.ByClassName("button")).click();
       sleep(4000);
    }
}