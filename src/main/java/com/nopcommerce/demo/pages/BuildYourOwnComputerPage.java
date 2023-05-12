package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {

    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement processor;

    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement ram;

    @CacheLookup
    @FindBy(id = "product_attribute_3_7")
    WebElement hdd;

    @CacheLookup
    @FindBy(id = "product_attribute_4_9")
    WebElement os;

    @CacheLookup
    @FindBy(id = "product_attribute_5_12")
    WebElement software;

    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//p[text()='The product has been added to your ']")
    WebElement addToCartMsg;



    // Selecting Processor
    public void selectProcessor(String processor1) {
        Reporter.log("Select processor : " + processor.toString() + "<br>");
        selectByVisibleTextFromDropDown(processor, processor1);
        CustomListeners.test.log(Status.PASS, "Select Processor: " + processor1);
    }

    // Selecting RAM
    public void selectRAM(String ram1) {
        Reporter.log("Select RAM: " + ram.toString() + "<br>");
        selectByVisibleTextFromDropDown(ram, ram1);
        CustomListeners.test.log(Status.PASS, "Select RAM: " + ram1);
    }

    // Selecting HDD
    public void selectHDD(String hdd1) {
        Reporter.log("Select HDD: " + hdd.toString() + "<br>");
        doClickOnElement(hdd, hdd1);
        CustomListeners.test.log(Status.PASS, "Select HDD: " + hdd1);
    }

    // Selecting Operating System
    public void selectOS(String os1) {
        Reporter.log("Select OS: " + os.toString() + "<br>");
        doClickOnElement(os, os1);
        CustomListeners.test.log(Status.PASS, "Select OS: " + os1);
    }

    // Selecting Software
    public void selectSoftware(String software1) {
        Reporter.log("Select Software: " + software.toString() + "<br>");
        doClickOnElement(software, software1);
        CustomListeners.test.log(Status.PASS, "Select Software: " + software1);
    }

    // Clicking on Add to Cart button
    public void clickOnAddToCart() {
        Reporter.log("Click on Add to Cart button: " + addToCart.toString() + "<br>");
        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS, "Click on Add to Cart ");
    }

    // Verifying message that product added to cart
    public void verifyAddToCartMessage(String expectedMessage) {
        Reporter.log("Verify Add to Cart message: " + addToCartMsg.toString() + "<br>");
        verifyElements(addToCartMsg, expectedMessage, "error message is not displayed");
        CustomListeners.test.log(Status.PASS, "Verify Add to Cart message: " + expectedMessage);
    }


}
