package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;

@Listeners(CustomListeners.class)
public class ComputerTest extends BaseTest {

    HomePage homePage;
    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();


    }


    @Test (groups = {"sanity", "smoke", "regression"})
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {

        //Click on Computer tab
        homePage.clickOnComputerTab();
        //  Verify "Computer" text
        computerPage.verifyComputerText("Computers");

    }

    @Test (groups = {"sanity"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {

        //Click on Computer tab
        homePage.clickOnComputerTab();
        // Click on Desktops link
        computerPage.clickOnDeskTopLink();
        // Verify Text Desktops
        desktopsPage.verifyTextDesktops("Desktops");
    }

    @Test (dataProvider = "Build Your Own computer",dataProviderClass = TestData.class)
    public void VerifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram,
                                                                                    String hdd, String os, String software) {
        // Click on Computer tab
        homePage.clickOnComputerTab();
        //  Click on Desktops link
        computerPage.clickOnDeskTopLink();
        // Click on Build your own Computer
        desktopsPage.clickOnBuildYourOwnComputer();
        // Select processor "processor"
        buildYourOwnComputerPage.selectProcessor(processor);
        //  Select RAM "ram"
        buildYourOwnComputerPage.selectRAM(ram);
        //  Select HDD "hdd"
        buildYourOwnComputerPage.selectHDD(hdd);
        // Select OS "os"
        buildYourOwnComputerPage.selectOS(os);
        //  Select Software "software"
        buildYourOwnComputerPage.selectSoftware(software);
        // Click on "ADD TO CART" Button
        buildYourOwnComputerPage.clickOnAddToCart();
        //  Verify message "The product has been added to your shopping cart"
        buildYourOwnComputerPage.verifyAddToCartMessage("The product has been added to your shopping cart");
    }
}
