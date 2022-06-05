package com.argos.commonLibraries;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class CommonFunctions {

public static WebDriver driver;
    public void openBrowser(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    public void takeScreenshots() throws IOException {

        TakesScreenshot takesScreenshot = ((TakesScreenshot) driver);
        File virtualFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("");
        FileUtils.copyFile(virtualFile,destinationFile);

    }



    public void closeBrowser(){

     //driver.close();

    }




}
