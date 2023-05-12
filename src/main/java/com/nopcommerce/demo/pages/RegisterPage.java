package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Register']")
    WebElement registerText;

    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerBtn;

    @CacheLookup
    @FindBy(xpath = "//span[text()='First name is required.']")
    WebElement errorMessageFirst;

    @CacheLookup
    @FindBy(xpath = "//span[text()='Last name is required.']")
    WebElement errorMessageLastName;

    @CacheLookup
    @FindBy(xpath = "//span[text()='Email is required.']")
    WebElement errorMessageEmail;

    @CacheLookup
    @FindBy(id = "Password-error")
    WebElement errorMessagePassword;

    @CacheLookup
    @FindBy(id = "ConfirmPassword-error")
    WebElement errorMessageConfirmPassword;

    @CacheLookup
    @FindBy (id = "FirstName")
    WebElement firstName;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastName;

    @CacheLookup
    @FindBy(id = "gender")
    WebElement gender;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dateOfBirth;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement dateOfMonth;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement dateOfYear;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(xpath = "//span[text()='Your registration completed']")
    WebElement registerationComplete;






    public void verifyTextRegister(String expectedText) {
        Reporter.log("Verify Register text " + registerText.toString() + "<br>");
        verifyElements(registerText, expectedText, "Error");
        CustomListeners.test.log(Status.PASS, "Verify Register Text: " + expectedText);
    }

      public void verifyErrorMessageFirst(String expectedMessage) {
          Reporter.log("Verify Error Message First: " + errorMessageFirst.toString() + "<br>");
        verifyElements(errorMessageFirst, expectedMessage, "Error");
          CustomListeners.test.log(Status.PASS, "Verify Error Message: " + expectedMessage);
    }

    public void verifyErrorMessageLastName(String expectedMessage) {
        Reporter.log("Verify Error Message Last: " + errorMessageLastName.toString() + "<br>");
        verifyElements(errorMessageLastName,expectedMessage,"Error");
        CustomListeners.test.log(Status.PASS, "Verify Error Message: " + expectedMessage);
    }
    public void verifyErrorMessageEmail(String expectedMessage) {
        Reporter.log("Verify Error Message Email: " + errorMessageEmail.toString() + "<br>");
        verifyElements(errorMessageEmail, expectedMessage, "Error");
        CustomListeners.test.log(Status.PASS, "Verify Error Message: " + expectedMessage);
    }
    public void verifyErrorMessagePassword(String expectedMessage) {
        Reporter.log("Verify Error Message password: " + errorMessagePassword.toString() + "<br>");
        verifyElements(errorMessagePassword, expectedMessage, "Error");
        CustomListeners.test.log(Status.PASS, "Verify Error Message Password: " + expectedMessage);
    }
    public void verifyErrorMessageConfirmPassword(String expectedMessage) {
        Reporter.log("Verify Error Message Confirm Password: " +errorMessageConfirmPassword.toString() + "<br>");
        verifyElements(errorMessageConfirmPassword, expectedMessage, "Error");
        CustomListeners.test.log(Status.PASS, "Verify Error Message Confirm Password: " + expectedMessage);
    }

    public void inputFirstName(String firstName1){
        Reporter.log("Input First Name: " + firstName.toString() + "<br>");
        sendTextToElement(firstName,firstName1);
        CustomListeners.test.log(Status.PASS, "Input First Name: " + firstName1);
    }

    public void inputlastName(String lastName1){
        Reporter.log("Input Last Name: " +lastName.toString() + "<br>");
        sendTextToElement(lastName,lastName1);
        CustomListeners.test.log(Status.PASS, "Input Last Name: " + lastName1);
    }
    public void clickOnGender(String gender1){
        Reporter.log("Click On Gender: " +gender.toString() + "<br>");
        clickOnElement(gender);
        CustomListeners.test.log(Status.PASS, "Verify Error Message: " + gender1);
    }


    public void inputEmailField(String email1){
        Reporter.log("Input Email Field: " + emailField.toString() + "<br>");
        sendTextToElement(emailField,email1);
        CustomListeners.test.log(Status.PASS, "Input Email Field: " +email1);
    }
    public void inputDateOfBirth(String dateOfBirth1){
        Reporter.log("Input Date Of Birth: " + dateOfBirth.toString() + "<br>");
        sendTextToElement(dateOfBirth,dateOfBirth1);
        CustomListeners.test.log(Status.PASS, "Input Date Of Birth: " + dateOfBirth1);
    }

    public void inputDateOfMonth(String dateOfMonth1){
        Reporter.log("Input Date Of month: " + dateOfMonth.toString() + "<br>");
        sendTextToElement(dateOfMonth,dateOfMonth1);
        CustomListeners.test.log(Status.PASS, "Input Email: " + dateOfMonth1);
    }
    public void inputDateOfYear(String dateOfYear1){
        Reporter.log("Input Date Of Year: " + dateOfYear.toString() + "<br>");
        sendTextToElement(dateOfYear,dateOfYear1);
        CustomListeners.test.log(Status.PASS, "Input Date Of Year: " + dateOfYear1);
    }
    public void inputPasswordField(String password1){
        Reporter.log("Input Password: " + passwordField.toString() + "<br>");
        sendTextToElement(passwordField,password1);
        CustomListeners.test.log(Status.PASS, "Input Password: " + password1);
    }

    public void inputconfirmPasswordField(String confirmPassword1){
        Reporter.log("Input Confirm Password: " + confirmPasswordField.toString() + "<br>");
        sendTextToElement(confirmPasswordField, confirmPassword1);
        CustomListeners.test.log(Status.PASS, "Input Confirm Password: " + confirmPassword1);
    }
    public void clickOnRegisterBtn() {
        Reporter.log("Click On Register: " + registerBtn.toString() + "<br>");
        clickOnElement(registerBtn);
        CustomListeners.test.log(Status.PASS, "Click On Register: " );
    }

    public void verifyRegisterationComlete(String expectedMessage){
        Reporter.log("Verify RegistrationComplete: " + registerationComplete.toString() + "<br>");
        verifyElements(registerationComplete,expectedMessage,"Error");
        CustomListeners.test.log(Status.PASS, "Verify RegistrationComplete: " + expectedMessage);
    }
}