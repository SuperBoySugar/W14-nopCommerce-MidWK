package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains (text(), 'Computers')]")
    WebElement computerText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='block block-category-navigation']/descendant::a[2]")
    WebElement desktops;

    public void verifyComputerText(String expectedText){
        verifyElements(computerText,expectedText,"Error");
    }
    public void clickOnDeskTopLink(){
        Reporter.log("Click On Desktop: " + desktops.toString() + "<br>");
        clickOnElement(desktops);
        CustomListeners.test.log(Status.PASS, "Click on Desktop ");
    }
}
