package com.selenium.cucumber.drivers;

import cucumber.api.Scenario;
import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class DriversDepot {
    private String browser="";
    public static WebDriver driver;

    public void openBrowser(){
        switch (browser){
            case "chrome":
                ChromeDriverManager.getInstance().setup();
                driver= new ChromeDriver();
                break;
            case"ie":
                InternetExplorerDriverManager.getInstance().setup();
                driver=new InternetExplorerDriver();
                break;
            case"opera":
                OperaDriverManager.getInstance().setup();
                driver=new OperaDriver();
                break;
            case"edge":
                EdgeDriverManager.getInstance().setup();
                driver=new EdgeDriver();
                break;
                default:
                    FirefoxDriverManager.getInstance().setup();
                    driver=new FirefoxDriver();
                    break;
        }
    }

    public void closeBrowser(){
        driver.quit();
    }
    public void  maxWindow(){
        driver.manage().window().maximize();
    }
    public  void applyImpWait(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }
    public void navigateToUrl(String url){
        driver.get(url);
    }
    public void sleep(int ms){


        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void embedScreenshot(Scenario scenario) {
        try {
            byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenShot, "image/.png");
        }catch (WebDriverManagerException e){
            System.out.println("took screen shot.");
        }
    }
}
