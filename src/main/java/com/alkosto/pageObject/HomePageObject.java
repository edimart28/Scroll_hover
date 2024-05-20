package com.alkosto.pageObject;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class HomePageObject extends PageObject {

    WebDriver driver;

    //@Step("hover")
    //public void validationHover() {
    //WebElement ele = driver.findElement(By.xpath("//*[@class='js-sf-myaccount-btn']"));
    //WebElement ele = driver.findElement(By.xpath("//li/a/span[@class='icon alk-icon-user'][1]"));
    //WebElement ele = driver.findElement(By.xpath("//li/a[@href='/my-account'][1]"));
    //WebElement ele = driver.findElement(By.xpath("//li/a[@href='/videojuegos/c/BI_VIJU_ALKOS']"));


        /*Creating object of an Actions class
        Actions action = new Actions(driver);


        Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();

    }*/

    @Step("hover")
    public void validationHover() {
        // Locating the Main Menu (Parent element)
        WebElement mainMenu = driver.findElement(By.xpath("(//*[@class='js-sf-myaccount-btn']"));

        //Instantiating Actions class
        Actions actions = new Actions(driver);

        //Hovering on main menu
        actions.moveToElement(mainMenu);

        // Locating the element from Sub Menu
        WebElement subMenu = driver.findElement(By.xpath("//li/a[@href='/my-account/orders'][1]"));

        //To mouseover on sub menu
        actions.moveToElement(subMenu);

        //build()- used to compile all the actions into a single step
        actions.click().build().perform();


    }

}

