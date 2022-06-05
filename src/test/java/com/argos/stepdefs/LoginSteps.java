package com.argos.stepdefs;

import com.argos.commonLibraries.CommonFunctions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import static org.junit.Assert.assertEquals;


public class LoginSteps extends CommonFunctions {

    @Given("I am on page  {string}")
    public void iAmOnPage(String url) {

        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.of(10, ChronoUnit.SECONDS));
        driver.findElement(By.id("consent_prompt_submit")).click();

    }


    @When("I click on My email field and enter the term {string}")
    public void iClickOnMyEmailFieldAndEnterTheTerm(String email) {

        driver.findElement(By.id("email-address")).sendKeys(email);


    }


    @And("I click on My password field and enter the term {string}")
    public void iClickOnMyPasswordFieldAndEnterTheTerm(String password) {

        driver.findElement(By.id("current-password")).sendKeys(password);

    }

    @And("I click on button SING IN SECURELY")
    public void iClickOnButtonSINGINSECURELY() {

        driver.findElement(By.className("button")).click();

    }

    @Then("I should login successfully")
    public void iShouldLoginSuccessfully() {
        assertEquals("Sai", driver.findElement(By.className("_2WxI4")).getText());
        System.out.println("Result is : "+"login Successful");
    }
}
