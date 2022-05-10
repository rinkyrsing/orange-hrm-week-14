package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//body/div[@id='wrapper']/div[@id='branding']/a[1]/img[1]")
    WebElement OrangeHRMLogo;

    @FindBy(xpath = "//a[@id='welcome']")
    WebElement welcomeText;

    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    WebElement logoutButton;

    @FindBy(xpath = "//b[contains(text(),'Admin')]")
    WebElement adminText;

    @FindBy(xpath = "//b[contains(text(),'PIM')]")
    WebElement pimText;

    @FindBy(xpath = "//b[contains(text(),'Leave')]")
    WebElement leaveText;

    @FindBy(xpath = "//h1[contains(text(),'Dashboard')]")
    WebElement dashBoardText;

    @FindBy(xpath = "//b[contains(text(),'Admin')]")
    WebElement adminTab;

    public String getWelcomeText() {
        Reporter.log("Get welcome text " + welcomeText + " from welcome message " + welcomeText.toString() + "<br>");
        return getTextFromElement(welcomeText).substring(0, 7);
    }

    public boolean logoIsDisplayed() {
        Reporter.log("Check logo is displayed " + welcomeText.toString() + "<br>");
        return OrangeHRMLogo.isDisplayed();
    }

    public void clickOnLogoutButton() {
        Reporter.log("Click on logout " + logoutButton.toString() + "<br>");
        mouseHoverToElementAndClick(welcomeText);
        clickOnElement(logoutButton);
    }
    public void clickOnAdminTab() {
        Reporter.log("click on admin tab" + adminTab.toString() + "<br>");

        clickOnElement(adminTab);
    }
    public String getAdminText() {

        return getTextFromElement(adminText);
    }

    public String getPimText() {

        return getTextFromElement(pimText);
    }

    public String getLeaveText() {

        return getTextFromElement(leaveText);
    }

    public String dashBoardText() {

        return getTextFromElement(dashBoardText);
    }
}
