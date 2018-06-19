package com.selenium.cucumber.step_def;

import com.selenium.cucumber.page_object.HeaderPage;
import com.selenium.cucumber.page_object.ResultPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.lang3.Range;
import org.hamcrest.Matchers;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Every.everyItem;


public class FilterSteps {

    private HeaderPage headerPage = new HeaderPage();
    private ResultPage resultPage = new ResultPage();

//    @Given("^I am on the home page\\.$")
//    public void i_am_on_the_home_page() throws Throwable {
//
//    }

    @When("^I search for product\"([^\"]*)\"$")
    public void i_search_for_product(String Product) throws Throwable {
        headerPage.search(Product);

    }

    @And("^I select filter \"([^\"]*)\"$")
    public void iSelectFilter(String value) throws Throwable {
       resultPage.selectFilter(value);
    }

//    @Then("^I should get respective product filtered by \"([^\"]*)\"$")
//    public void iShouldGetRespectiveProductFilteredBy(Double expectedvalue) throws Throwable {
//        List<Double> actualList = resultPage.getAllrating();
       // assertThat(actualList,everyItem(Matchers.greaterThan()expectedvalue)));

     //}

//    @Then("^I should get respective product greater than \"([^\"]*)\" and less than \"([^\"]*)\"$")
//    public void iShouldGetRespectiveProductGreaterThanAndLessThan(Double minvalue, Double maxvalue) throws Throwable {
//        List<Double> actualList = resultPage.getAllrating();
//        assertThat(actualList,everyItem(greaterThan(minvalue)));
//        assertThat(actualList,everyItem(lessThan(maxvalue)));
//    }

    @Then("^I should get respective product with \"([^\"]*)\"$")
    public void iShouldGetRespectiveProductWith(Double expectedvalue) throws Throwable {
        List<Double> actualList = resultPage.getAllrating();
        assertThat(actualList,everyItem(greaterThan(expectedvalue)));
    }
}
