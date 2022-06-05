package com.argos.stepdefs;

import com.argos.commonLibraries.CommonFunctions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.MatcherAssert.assertThat;

public class SearchSteps extends CommonFunctions {


    @Given("I am on page {string}")
    public void iAmOnPage(String url ) {
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.of(10, ChronoUnit.SECONDS));
        driver.findElement(By.id("consent_prompt_submit")).click();
    }

    @When("I click on search field and enter the term {string}")
    public void enterSearchTerm(String searchWord) {

        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div[3]/div/div[2]/div/form/input")).sendKeys(searchWord);

    }

    @And("I click on search icon")
    public void clickSearchIcon() {

      driver.findElement(By.className("_2mKaC")).click();


    }

    @Then("I should see products related to {string} in search results")
    public void verifyAllSearchResults(String searchWord) {
        List<WebElement> links = driver.findElements(By.xpath("/html/body/main/div/div[3]/div[6]/div/div[5]/div[4]/div[*]/div/div/div[1]/div[2]/a"));
        List<String> linkTextList = new ArrayList<>();
        for(WebElement e: links){
           // e.findElement(e.get);
           // System.out.println(e.getText());
            linkTextList.add(e.getText().toLowerCase());
        }
        //List<String> resultTextList =  links.stream().map(webelement->webelement.getText().toLowerCase()).collect(Collectors.toList());
        assertThat(linkTextList, everyItem(containsString(searchWord.toLowerCase())));

        /*for(WebElement e: links){
            if(!e.getText().isBlank()&&!e.getText().contains("Choose options")) {
                System.out.println(e.getText());
            }
        }*/
    }



}
