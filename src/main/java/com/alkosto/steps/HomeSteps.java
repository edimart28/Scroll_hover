package com.alkosto.steps;

import com.alkosto.pageObject.HomePageObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.JavascriptExecutor;

import static net.serenitybdd.core.Serenity.getDriver;



public class HomeSteps {
    @Page
    private HomePageObject homePageObject;

    @Step("User Open Browser")
    public void openUrl() {
        homePageObject.openUrl("https://www.alkosto.com/");
    }
    @Step("the user scrolls")
    public void scroll(int a) throws InterruptedException {
        Thread.sleep(1000);
        ((JavascriptExecutor) getDriver()).executeScript("window.scrollBy(0," + a + ")");


    }

    @Step
    public void hover() {
        homePageObject.validationHover();
    }

}



