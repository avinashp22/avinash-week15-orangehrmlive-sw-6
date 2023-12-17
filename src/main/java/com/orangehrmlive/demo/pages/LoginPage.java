package com.orangehrmlive.demo.pages;


import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(name = "username")
    WebElement userNameField;

    @CacheLookup
    @FindBy(name = "password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(id = "logInPanelHeading")
    WebElement loginPanelText;
    @CacheLookup
    @FindBy(linkText = "Logout")
    WebElement logoutTab;
    @CacheLookup
    @FindBy(xpath = "//h5[normalize-space()='Login']")
    WebElement loginPanel;

    public void enterUserName(String username){
        log.info("Enter username  " + username + " to username  field " + userNameField.toString());
        sendTextToElement(userNameField,username);
    }

    public void enterPassword(String password){
        log.info("Enter Password  " + password + " to Password  field " + passwordField.toString());
        sendTextToElement(passwordField,password);
    }

    public void clickOnLoginButton(){
        log.info("Click On Login Button");
        clickOnElement(loginButton);
    }

    public void loginToApplication() {

    }

    public String getLoginPanelText() {
        log.info("Get login panel text");
        return getTextFromElement(loginPanelText);
    }

    public void mouseHoverAndClickOnLogout() {
        log.info("Mouse hover and click on logout tab");
        mouseHoverToElementAndClick(logoutTab);
    }

    public String getLoginText() {
        return getTextFromElement(loginPanel);
    }
}