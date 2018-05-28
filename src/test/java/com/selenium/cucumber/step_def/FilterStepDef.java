package com.selenium.cucumber.step_def;

import com.selenium.cucumber.page_object.HeaderPage;
import com.selenium.cucumber.page_object.ResultPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Every.everyItem;


public class FilterStepDef {

    private HeaderPage headerPage = new HeaderPage();
    private ResultPage resultPage = new ResultPage();

    @Given("^I am on the home page\\.$")
    public void i_am_on_the_home_page() throws Throwable {

    }

    @When("^I search for product\"([^\"]*)\"$")
    public void i_search_for_product(String product) throws Throwable {
        headerPage.search(product);

    }

    @And("^I select filter \"([^\"]*)\"$")
    public void iSelectFilter(String arg0) throws Throwable {
       resultPage.selectFilter("");
    }

    @Then("^I should get respective product filtered by \"([^\"]*)\"$")
    public void iShouldGetRespectiveProductFilteredBy(String arg0) throws Throwable {
        List<Double> actualList = resultPage.getAllrating();
        assertThat(actualList, everyItem(greaterThan(3.0)));
    }
}
