package com.selenium.cucumber.page_object;

import com.selenium.cucumber.drivers.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HeaderPage extends DriverFactory {
        public void search(String Product){

        driver.findElement(By.id("searchTerm")).sendKeys(Product);
        driver.findElement(By.id("searchTerm")).sendKeys(Keys.ENTER);
        sleep(3000);
    }
    public void goToLogin() {
        driver.findElement(By.cssSelector(".font-condensed.uppercase.argos-header__link.argos-header__link--signin")).click();

        sleep(3000);


    }
}


