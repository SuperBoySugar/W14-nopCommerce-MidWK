package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {

    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod
    public void inIt(){
        homePage = new HomePage();
        loginPage = new LoginPage();
    }


    @Test (groups = {"sanity"})
    public void userShouldNavigateToLoginPageSuccessFully(){

        //Click on login link
        homePage.clickOnLoginLink();
        // verify that "Welcome, Please Sign In!" message display
        loginPage.verifyWelcomeText("Welcome, Please Sign In!");

    }
    @Test
    public void verifyTheErrorMessageWithInValidCredentials(){

        // Click on login link
        homePage.clickOnLoginLink();
        //  Enter EmailId
        loginPage.inputEmailField("Henry@gmail.com");
        //  Enter Password
        loginPage.inputPasswordField("abcde34");
        //  Click on Login Button
        loginPage.clickOnLoginBtn();
        // Verify that the Error message
        loginPage.verifyErrorMessage("Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found");
    }
    @Test
    public void  verifyThatUserShouldLogInSuccessFullyWithValidCredentials(){
        //  Click on login link
        homePage.clickOnLoginLink();
        //	 Enter EmailId
        loginPage.inputEmailField("Henry@gmail.com");
        //  Enter Password
        loginPage.inputPasswordField("abcde34");
        //  Click on Login Button
        loginPage.clickOnLoginBtn();
        //  Verify that LogOut link is display

    }

    @Test
    public void VerifyThatUserShouldLogOutSuccessFully(){

        //  Click on login link
        homePage.clickOnLoginLink();
        //	 Enter EmailId
        loginPage.inputEmailField("Henry@gmail.com");
        //  Enter Password
        loginPage.inputPasswordField("abcde34");
        //  Click on Login Button
        loginPage.clickOnLoginBtn();
        //  Click on LogOut Link

        //  Verify that LogIn Link Display
    }
}
