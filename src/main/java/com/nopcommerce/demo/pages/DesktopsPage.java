package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class DesktopsPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Desktops']")
    WebElement desktopsText;

    @CacheLookup
    @FindBy (xpath = "//h2[@class='product-title']//a[text()='Build your own computer']")
    WebElement buildYourOwnComputer;

    public void verifyTextDesktops(String expectedText){
        Reporter.log("Verify Text Desktops : " + desktopsText.toString() + "<br>");
        verifyElements(desktopsText, expectedText, "Error");
        CustomListeners.test.log(Status.PASS, "Verify Text Desktops " + expectedText);
    }

    public void clickOnBuildYourOwnComputer(){
        Reporter.log("Click On Build Your Own Computer : " + buildYourOwnComputer.toString() + "<br>");
        clickOnElement(buildYourOwnComputer);
        CustomListeners.test.log(Status.PASS, "Click on Build your Own Computer " );
    }
}
