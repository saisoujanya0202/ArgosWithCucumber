package com.argos;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features"
        //,tags="@loginValid"
        ,glue = "com.argos")

public class RunCucumberTest {


}
