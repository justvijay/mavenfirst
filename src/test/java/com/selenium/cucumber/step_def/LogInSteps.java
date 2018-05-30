package com.selenium.cucumber.step_def;

import com.selenium.cucumber.page_object.HeaderPage;
import com.selenium.cucumber.page_object.LogInPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jdk.nashorn.internal.runtime.Undefined;
import sun.security.util.Password;

public class LogInSteps {
    private HeaderPage headerPage=new HeaderPage();
    private LogInPage logInPage=new LogInPage();

    @Given("^I am a registered user on the home page$")
    public void iAmARegisteredUserOnTheHomePage() throws Throwable {

    }

    @When("^I click on SignIn button$")
    public void i_click_on_SignIn_button() throws Throwable {
        headerPage.goToLogin();
    }
    @Then("^I should be able to go on Login page$")
    public void iShouldBeAbleToGoOnLoginPage() throws Throwable {

    }


    @When("^I enter  MyEmailAddress field as \"([^\"]*)\" and MyPassword field as \"([^\"]*)\"$")
    public void i_enter_MyEmailAddress_field_as_and_MyPassword_field_as(String EmailID, String MyPassword) throws Throwable {
        logInPage.enterFields(EmailID,MyPassword);
    }

    @When("^I click on  submit button$")
    public void i_click_on_submit_button() throws Throwable {
       logInPage.clickLogin();
    }

    @Then("^I should be able to login$")
    public void i_should_be_able_to_login() throws Throwable {

    }


    @Given("^I am  on the home page as not registered user$")
    public void iAmOnTheHomePageAsNotRegisteredUser() throws Throwable {

    }

    @Then("^I should be failed to login$")
    public void iShouldBeFailedToLogin() throws Throwable {

    }

    @And("^I should get error Login  message$")
    public void iShouldGetErrorLoginMessage() throws Throwable {

    }
}
