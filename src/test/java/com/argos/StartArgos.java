package com.argos;

import com.argos.commonLibraries.CommonFunctions;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class StartArgos {

    CommonFunctions commonFunctions = new CommonFunctions();


    @Before
    public void beforeTest(){

        commonFunctions.openBrowser();

    }

    @After
    public void afterTest(){

    commonFunctions.closeBrowser();

    }



}
