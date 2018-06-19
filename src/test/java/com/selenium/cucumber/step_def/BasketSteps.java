package com.selenium.cucumber.step_def;

import com.selenium.cucumber.page_object.BasketPage;
import com.selenium.cucumber.page_object.HeaderPage;
import com.selenium.cucumber.page_object.ProductPage;
import com.selenium.cucumber.page_object.ResultPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BasketSteps {
    BasketPage basketPage = new BasketPage();
    HeaderPage headerPage = new HeaderPage();
    ResultPage resultPage = new ResultPage();
    ProductPage productPage=new ProductPage();

    @Given("^I am on the home page\\.$")
    public void i_am_on_the_home_page() throws Throwable {

    }

    @When("^I search for a product \"([^\"]*)\"$")
    public void iSearchForAProduct(String Product) throws Throwable {
        headerPage.search(Product);
    }

    @When("^I select a random product$")
    public void i_select_a_random_product() throws Throwable {
        productPage.selectRandom();
    }

    @When("^I click on addToTrolly button$")
    public void i_click_on_addToTrolly_button() throws Throwable {
        basketPage.addToTrolly();
        basketPage.goToTrolly();
    }

    @Then("^I should find  the <selectedProduct> in the basket\\.$")
    public void iShouldFindTheSelectedProductInTheBasket() throws Throwable {
        basketPage.verifyTrolly();
    }



}
