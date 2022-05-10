package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ViewSystemUsersPage extends Utility {

    public ViewSystemUsersPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h1[contains(text(),'System Users')]")
    WebElement systemUserText;

    @FindBy(id = "searchSystemUser_userName")
    WebElement userName;

    @FindBy(id = "searchSystemUser_userType")
    WebElement userRoleDropDown;

    @FindBy(xpath = "//input[@id='searchSystemUser_employeeName_empName']")
    WebElement employeeName;
    @FindBy (xpath = "//a[contains(text(),'Anu129')]")
    WebElement getUserName;

    @FindBy(xpath = "//select[@id='searchSystemUser_status']")
    WebElement statusDropDown;

    @FindBy(id = "searchBtn")
    WebElement searchButton;

    @FindBy(id = "resetBtn")
    WebElement resetButton;

    @FindBy(id = "btnAdd")
    WebElement addButton;

    @FindBy(id = "btnDelete")
    WebElement deleteButton;

    @FindBy(name = "chkSelectRow[]")
    WebElement clickOnCheckBox;

    public String findUserName(){
        Reporter.log("Get user name " + getUserName.toString() + "<br>");
        if (getUserName.isDisplayed()){
            return   getTextFromElement(getUserName);

        }else {
            clickOnElement(By.xpath("//body/div[@id='wrapper']/div[@id='content']/div[@id='customerList']/div[@id='search-results']/div[1]/form[1]/div[1]/ul[1]/li[6]/a[1]"));
            return   getTextFromElement(getUserName);
        }

    }
    public String getSystemUserText()
    {
        Reporter.log("Get system user text "+ systemUserText.toString() + "<br>");
        return getTextFromElement(systemUserText);
    }

    public void enterUserName(String uname)
    {
        Reporter.log("set user name " + uname + " to username field " + userName.toString() + "<br>");
        sendTextToElement(userName,uname);
    }

    public void selectUserRole(String role){
        Reporter.log("Select user role" + userRoleDropDown.toString() + "<br>");
        selectByVisibleTextFromDropDown(userRoleDropDown,role);
    }

    public void enterEmployeeName(String ename)
    {
        Reporter.log("set emp name " + ename+ " to ep name field " + employeeName.toString() + "<br>");
        sendTextToElement(employeeName,ename);
    }

    public void selectStatus(String status)
    {
        Reporter.log("select status "+ statusDropDown.toString() + "<br>");
        selectByVisibleTextFromDropDown(statusDropDown,status);
    }

    public void clickOnSearchButton()
    {
        Reporter.log("click on search button" + searchButton.toString() + "<br>");
        clickOnElement(searchButton);
    }

    public void clickOnResetButton()
    {
        Reporter.log("click on reset button" + resetButton.toString() + "<br>");
        clickOnElement(resetButton);
    }

    public void clickOnAddButton()
    {
        Reporter.log("click on add button" + addButton.toString() + "<br>");
        clickOnElement(addButton);
    }

    public void clickOnDeleteButton()
    {
        Reporter.log("click on delete" + deleteButton.toString() + "<br>");
        clickOnElement(deleteButton);
    }

    public void clickOnUserCheckBox()
    {
        Reporter.log("click on checkbox tab" + clickOnCheckBox.toString() + "<br>");
        clickOnElement(clickOnCheckBox);
    }

    @FindBy(xpath = "//input[@id='dialogDeleteBtn']")
    WebElement okButtonOnDelete;

    public void clickONOnButtonOnPopUp()
    {
        Reporter.log("click on ok button " + okButtonOnDelete.toString() + "<br>");
        clickOnElement(okButtonOnDelete);
    }


    @FindBy(xpath = "//td[contains(text(),'No Records Found')]")
    WebElement noRecordFoundText;

    public String getNoRecordFoundText()
    {
        return getTextFromElement(noRecordFoundText);
    }





}
