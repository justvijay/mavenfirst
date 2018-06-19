package com.selenium.cucumber.page_object;

import com.selenium.cucumber.drivers.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ResultPage extends DriverFactory {
    public void selectFilter(String value) throws InterruptedException {


        List<WebElement> allFilters = driver.findElements(By.cssSelector(".ac-facet__label"));
        for (WebElement filter : allFilters) {
            if (filter.getText().equalsIgnoreCase(value)) {
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
