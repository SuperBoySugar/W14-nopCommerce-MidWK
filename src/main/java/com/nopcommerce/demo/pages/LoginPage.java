package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(id = "Email")
    WebElement email;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement password;

    @CacheLookup
    @FindBy (xpath = "//button[text()='Log in']")
    WebElement loginBtn;

    @CacheLookup
    @FindBy(xpath = ("//div[@class='page-title']//h1"))
    WebElement welcomeText;

    @CacheLookup
    @FindBy (xpath = "//div[text()='Login was unsuccessful. Please correct the errors and try again.']")
    WebElement errorMessage;

    public void inputEmailField(String email1){

        sendTextToElement(email, email1 );
        CustomListeners.test.log(Status.PASS, "Input EmailField: " + email1);
    }

    public void inputPasswordField(String password1){
        Reporter.log("Input Password: " + password.toString() + "<br>");
        sendTextToElement(password, password1);
        CustomListeners.test.log(Status.PASS, "Input passwordField: " + password1);
    }

    public void clickOnLoginBtn(){
        Reporter.log("Click On LoginBtn: " + loginBtn.toString() + "<br>");
        clickOnElement(loginBtn);
        CustomListeners.test.log(Status.PASS, "Click On LoginBtn: " );
    }

    public void verifyWelcomeText(String expectedText){
        Reporter.log("Verify Welcome Text: " + welcomeText.toString() + "<br>");
        verifyElements(welcomeText,expectedText,"Error");
        CustomListeners.test.log(Status.PASS, "Verify Welcome Text: " + expectedText);
    }

    public void verifyErrorMessage(String expectedMessage){
        Reporter.log("Verify Error Message: " + errorMessage.toString() + "<br>");
        verifyElements(errorMessage,expectedMessage,"Error");
        CustomListeners.test.log(Status.PASS, "Verify Error Message: " + expectedMessage);
    }

}
