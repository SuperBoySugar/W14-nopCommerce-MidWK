package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[text()='Log in']")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Register']")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computerTab;

    public void clickOnLoginLink() {
        Reporter.log("Click On LoginLink: " + loginLink.toString() + "<br>");
        clickOnElement(loginLink);
        CustomListeners.test.log(Status.PASS, "Click On LoginLink ");
    }

    public void clickOnRegisterLink() {
        Reporter.log("Click On RegisterLink " + registerLink.toString() + "<br>");
        clickOnElement(registerLink);
        CustomListeners.test.log(Status.PASS, "Click On Register Link ");

    }

    public void clickOnComputerTab() {
        Reporter.log("Click On Computer Tab " + computerTab.toString() + "<br>");
        clickOnElement(computerTab);
        CustomListeners.test.log(Status.PASS, "Click On computer Tab ");
    }

}
