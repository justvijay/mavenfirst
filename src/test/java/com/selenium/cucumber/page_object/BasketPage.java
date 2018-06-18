package com.selenium.cucumber.page_object;

import com.selenium.cucumber.drivers.DriversDepot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasketPage extends DriversDepot {
    public void chooseproduct(String product) {
        driver.findElement(By.cssSelector("#app > div > div > div:nth-child(4) > div > div > div.search > div.xs-row.xs-auto--negative.search__content.search__content--with-breadcrumb > div.xs-12--none.lg-9.xs-stack.search__container > div.xs-stack.sm-row.xs-auto--none.sm-auto--none.md-auto--none.lg-auto--negative.product-list > div:nth-child(6) > div > div.ac-product-card__cta > div > div")).click();
    }

    public void addtrolly() {
        driver.findElement(By.cssSelector("div.ac-product-card:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)")).click();

        sleep(3000);
    }
    public void goToTrolly(){
        driver.findElement(By.cssSelector("div.sm-6--none:nth-child(2)"));
        sleep(3000);
    }
}
