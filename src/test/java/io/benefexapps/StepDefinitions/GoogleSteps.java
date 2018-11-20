package io.benefexapps.StepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSteps {

    private final WebDriver driver = new ChromeDriver();


    @Given("I am on google")
    public void i_am_on_google() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://google.com");

    }

    @When("I search for {string}")
    public void i_search_for(String string) {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("I am shown results of {string}")
    public void i_am_shown_results_of(String string) {
        // Write code here that turns the phrase above into concrete actions
    }


    @After
    public void afterScenario(){
        driver.quit();
    }}
