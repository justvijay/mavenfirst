package com.selenium.cucumber.step_def;

import com.selenium.cucumber.page_object.BasketPage;
import com.selenium.cucumber.page_object.HeaderPage;
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

    @Given("^I am on the product  page\\.$")
    public void i_am_on_the_product_page() throws Throwable {
        headerPage.search("");
        resultPage.selectFilter("");
    }


    @When("^I click on AddToTrolly button of a <product>\\.$")
    public void iClickOnAddToTrollyButtonOfAProduct() throws Throwable {
       // basketPage.chooseproduct("product");
        basketPage.addtrolly();
        basketPage.goToTrolly();
    }

    @Then("^I should find  the <SelectedProduct> added in basket\\.$")
    public void iShouldFindTheSelectedProductAddedInBasket() throws Throwable {

    }
}
