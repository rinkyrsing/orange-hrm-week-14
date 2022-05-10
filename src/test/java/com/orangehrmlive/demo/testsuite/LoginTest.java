package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class LoginTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage =new HomePage();
        loginPage =new LoginPage();
    }
    @Test(dataProvider = "validCredentials",dataProviderClass = TestData.class,groups = {"sanity","regression"})
    public void verifyUserShouldLoginSuccessFully(String userName,String password){
        loginPage.setUserName(userName);
        loginPage.setPassword(password);
        loginPage.clickOnLoginButton();
        String actualText=homePage.getWelcomeText();
        String expectedText ="Welcome";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test(dataProvider = "validCredentials",dataProviderClass = TestData.class,groups = {"regression","smoke"})
    public void verifyThatTheLogoDisplayOnHomePage(String userName,String password){
        loginPage.setUserName(userName);
        loginPage.setPassword(password);
        loginPage.clickOnLoginButton();
        boolean logo = homePage.logoIsDisplayed();
        Assert.assertEquals(logo,true);
    }
    @Test(dataProvider = "validCredentials",dataProviderClass = TestData.class,groups = {"regression","smoke"})
    public void verifyUserShouldLogOutSuccessFully(String userName,String password){
        loginPage.setUserName(userName);
        loginPage.setPassword(password);
        loginPage.clickOnLoginButton();
        homePage.clickOnLogoutButton();
        String actualText =loginPage.getLoginPanelText();
        String expectedText = "LOGIN Panel";
        Assert.assertEquals(actualText,expectedText);
    }

}
