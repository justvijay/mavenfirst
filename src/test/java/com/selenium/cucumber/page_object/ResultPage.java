package com.selenium.cucumber.page_object;

import com.selenium.cucumber.drivers.DriversDepot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ResultPage extends DriversDepot {
    public void selectFilter(String fvalue) throws InterruptedException {


        List<WebElement> allFilters = driver.findElements(By.cssSelector(".ac-facet__label.ac-facet__label"));
        for (WebElement filter : allFilters) {
            if (filter.getText().equalsIgnoreCase(fvalue)) {
                filter.click();
                break;
            }
        }


        sleep(5000);


    }
        public List<Double> getAllrating() {
            List<Double> collectedRatings = new ArrayList<>();
            List<WebElement> ratings =
                    driver.findElements(By.cssSelector(".ac-star-rating"));
            for (WebElement rating : ratings) {
                String ratingInString = rating.getAttribute("data-star-rating");
                Double ratingInDouble = Double.parseDouble(ratingInString);
                collectedRatings.add(ratingInDouble);
            }
            return collectedRatings;
        }



}
