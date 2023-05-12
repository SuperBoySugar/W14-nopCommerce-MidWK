package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class RegisterPageTest extends BaseTest {

    HomePage homePage;
    RegisterPage registerPage;

    @BeforeMethod (groups = {"sanity", "smoke", "regression"})
    public void inIt() {
        homePage = new HomePage();
        registerPage = new RegisterPage();
    }

    @Test  (groups = {"sanity"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        // // Click on Register Link
        homePage.clickOnRegisterLink();
        // Verify Text Register
        registerPage.verifyTextRegister("Register");
    }

    @Test (groups = {"smoke"})
    public void verifyThatFirstNameLastNameEmailOasswordAndConfirmPasswordFieldsAreMandetory() {
        // Click on Register Link
        homePage.clickOnRegisterLink();
        // Click on "REGISTER" button
        registerPage.clickOnRegisterBtn();
        //  Verify the error message "First name is required."
        registerPage.verifyErrorMessageFirst("First name is required.");
        //  Verify the error message "Last name is required."
        registerPage.verifyErrorMessageLastName("Last name is required.");
        //   Verify the error message "Email is required."
        registerPage.verifyErrorMessageEmail("Email is required.");
        //  Verify the error message "Password is required."
        registerPage.verifyErrorMessagePassword("Password is required.");
        //   Verify the error message "Password is required."
        registerPage.verifyErrorMessageConfirmPassword("Password is required.");

    }

    @Test (groups = {"smoke","regression"})
    public void VerifyThatUserShouldCreateAccountSuccessfully(){

        //Click on Register Link
        homePage.clickOnRegisterLink();
        // Select gender "Female"
        registerPage.clickOnGender("Female");
        // Enter firstname
        registerPage.inputFirstName("Henry");
        //  Enter lastname
        registerPage.inputlastName("smith");
        //  Select day
        registerPage.inputDateOfBirth("13");
        //  Select month
        registerPage.inputDateOfMonth("January");
        //  Select year
        registerPage.inputDateOfYear("2024");
        //  Enter email
        registerPage.inputEmailField("Henry@gamial.com");
        //  Enter password
        registerPage.inputPasswordField("password12");
        //  Enter Confirm Password
        registerPage.inputconfirmPasswordField("password12");
        //  Click on "REGISTER" button
        registerPage.clickOnRegisterBtn();
        // Verify Register Complete Message
        registerPage.verifyRegisterationComlete("Your registration completed");
    }
}
