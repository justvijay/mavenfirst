package com.selenium.cucumber.page_object;

import com.selenium.cucumber.drivers.DriversDepot;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HeaderPage extends DriversDepot {
        public void search(String product){

        driver.findElement(By.cssSelector("#searchTerm")).sendKeys(product);
        driver.findElement(By.cssSelector("#searchTerm")).sendKeys(Keys.ENTER);
        sleep(3000);
    }
    public void goToLogin() {
        driver.findElement(By.cssSelector(".font-condensed.uppercase.argos-header__link.argos-header__link--signin")).click();

        sleep(3000);


    }
}


