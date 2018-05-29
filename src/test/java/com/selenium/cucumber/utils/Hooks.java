package com.selenium.cucumber.utils;

import com.selenium.cucumber.drivers.DriversDepot;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks {
    DriversDepot driversDepot=new DriversDepot();
    @Before
    public void openUp(){
        driversDepot.openBrowser();
        driversDepot.navigateToUrl("http://www.argos.co.uk/");
        driversDepot.maxWindow();
        driversDepot.applyImpWait();


    }
    //@After
    //public void shutDown(){
      //  driversDepot.closeBrowser();
    }


