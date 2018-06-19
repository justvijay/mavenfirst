package com.selenium.cucumber.page_object;

import com.selenium.cucumber.drivers.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class ProductPage extends DriverFactory {
    static Random R = new Random();

    public void selectRandom() throws InterruptedException {

        List<WebElement> allproducts = driver.findElements(By.cssSelector(".ac-product-name.ac-product-card__name"));
        int randomproduct = R.nextInt(allproducts.size());
        allproducts.get(randomproduct).click();
        Thread.sleep(3000);
    }
}


