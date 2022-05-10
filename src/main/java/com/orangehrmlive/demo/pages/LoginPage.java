package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage extends Utility {

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='txtUsername']")
    WebElement userNameField;
    @FindBy(xpath = "//input[@id='txtPassword']")
    WebElement passwordField;
    @FindBy(xpath = "//input[@id='btnLogin']")
    WebElement loginButton;
    @FindBy(xpath = "//div[@id='logInPanelHeading']")
    WebElement loginPanelText;



    public void setUserName(String userName){
        Reporter.log("Enter username " + userName + " to userName field " +  userNameField.toString()+"<br>");
        sendTextToElement(userNameField,userName);
    }
    public void setPassword(String password){
        Reporter.log("Enter password " + password + " to password field " + passwordField.toString()+"<br>");
        sendTextToElement(passwordField,password);
    }
    public void clickOnLoginButton(){
        Reporter.log("Clicking on Login Button " + loginButton.toString()+"<br>");
        clickOnElement(loginButton);
    }
    public String getLoginPanelText(){
        Reporter.log("Get login panel text " + loginPanelText.toString()+"<br>");
        return getTextFromElement(loginPanelText);
    }


}
