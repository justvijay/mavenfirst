package com.selenium.cucumber.page_object;

import com.selenium.cucumber.drivers.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.By;

public class BasketPage extends DriverFactory {
//    static Random R = new Random();

//    public void selectRandom() throws InterruptedException {
//
//        List<WebElement> allproducts = driver.findElements(By.cssSelector(".ac-product-name.ac-product-card__name"));
//        int randomproduct = R.nextInt(allproducts.size());
//        allproducts.get(randomproduct).click();
//        Thread.sleep(3000);
//    }




        public void addToTrolly() {
            driver.findElement(By.cssSelector("div.ac-product-card:nth-child(29)")).click();//product added to trolly
            sleep(3000);
        }
        public void goToTrolly() {
            driver.findElement(By.cssSelector("a.button:nth-child(1)")).click();//go to trolly
            sleep(3000);
        }
        public void verifyTrolly(){
            String Vj = driver.findElements(By.cssSelector(".description > strong:nth-child(1) > a:nth-child(1))")).get(0).getText();//prouct in my trolly
            Boolean Condition = Vj.contains("Adidas");
            Assert.assertTrue(Condition);

        }
}
