package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AddUserPage extends Utility {

    public AddUserPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[@id='UserHeading']")
    WebElement addUserText;

    @FindBy(xpath = "//select[@id='systemUser_userType']")
    WebElement userRoleDropDown;

    @FindBy(xpath = "//input[@id='systemUser_employeeName_empName']")
    WebElement employeeName;

    @FindBy(xpath = "//input[@id='systemUser_userName']")
    WebElement userName;

    @FindBy(xpath = "//select[@id='systemUser_status']")
    WebElement statusDropDown;

    @FindBy(xpath = "//input[@id='systemUser_password']")
    WebElement password;

    @FindBy(xpath = "//input[@id='systemUser_confirmPassword']")
    WebElement confirmPassword;

    @FindBy(xpath = "//input[@id='btnSave']")
    WebElement saveButton;

    @FindBy(xpath = "//input[@id='btnCancel']")
    WebElement cancelButton;


    public void selectUserRole(String role)
    {
        Reporter.log("Select User role"  + userRoleDropDown.toString()+"<br>");
        selectByVisibleTextFromDropDown(userRoleDropDown,role);
    }

    public void enterEmployeeName(String eName)
    {
        Reporter.log("set emp name"  + eName+"to emp filed"+employeeName.toString()+"<br>");
        sendTextToElement(employeeName,eName);
    }

    public void enterUserName(String uName)
    {
        Reporter.log("set user name"  + uName+"to user filed"+userName.toString()+"<br>");
        sendTextToElement(userName,uName);
    }

    public void selectStatusFromDropDown(String status)
    {
        Reporter.log("Select status"  + statusDropDown.toString()+"<br>");
        selectByVisibleTextFromDropDown(statusDropDown,status);
    }

    public void enterPassword(String pwd)
    {
        Reporter.log("set password"  + pwd+"to password filed"+password.toString()+"<br>");
        sendTextToElement(password,pwd);
    }

    public void enterConfirmPassword(String cPwd)
    {
        Reporter.log("set confirm password"  + cPwd+"to  confirm password filed"+confirmPassword.toString()+"<br>");
        sendTextToElement(confirmPassword,cPwd);
    }
    public void clickOnSaveButton()
    {
        Reporter.log("click on save button" +saveButton.toString()+"<br>");
        clickOnElement(saveButton);
    }

    public void clickOnCancelButton()
    {
        Reporter.log("click on cancel button" +cancelButton.toString()+"<br>");
        clickOnElement(cancelButton);
    }

    public String getaddUserText()
    {
        Reporter.log("get user text"+addUserText.toString()+"<br>");
        return getTextFromElement(addUserText);
    }


}
