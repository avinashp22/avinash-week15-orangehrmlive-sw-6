package com.orangehrmlive.demo.pages;


import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AddUserPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddUserPage.class.getName());

    public AddUserPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h6[normalize-space()='Add User']")
    WebElement addUserText;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeeName;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Lisa')]")
    List<WebElement> lisa;
    @CacheLookup
    @FindBy(css = "div[class='oxd-form-row'] div[class='oxd-grid-2 orangehrm-full-width-grid'] div[class='oxd-grid-item oxd-grid-item--gutters'] div[class='oxd-input-group oxd-input-field-bottom-space'] div input[class='oxd-input oxd-input--active']")
    WebElement username;
    @CacheLookup
    @FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
    WebElement searchText;
    @CacheLookup
    @FindBy(xpath = "(//span[normalize-space()='Disabled'])[1]")
    WebElement disable;
    @CacheLookup
    @FindBy(xpath = "(//input[@type='password'])[1]")
    WebElement password;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[2]")
    WebElement saveButton;
    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
    WebElement successfullySaved;

    public String verifyAddUserText() {
        log.info("Verify add user text");
        return getTextFromElement(addUserText);
    }
    public void enterEmployeeName(String name) {
        log.info("Enter employee name ");
        sendTextToElement(employeeName, name);
        List<WebElement> suggList = lisa;
        for (WebElement element : suggList) {
            System.out.println(element.getText());
        }
        mouseHoverToElementAndClick(By.xpath("//span[contains(text(),'Lisa')]"));
    }
    public void enterUsername() {
        log.info("Enter username  "  + " to username  field " + username.toString());
        sendTextToElement(username, getRandomString(10));
    }

    public void clickOnStatusSelect() {
        log.info("Click on status select");
        clickOnElement(searchText);
    }

    public void clickOnDisable() {
        log.info("Click on status select");
        clickOnElement(disable);
    }

    public void enterPassword(String passWord) {
        log.info("Enter Password  " + passWord + " to Password  field " + password.toString());
        sendTextToElement(password, passWord);
    }

    public void enterConfirmPassword(String conPassword) {
        log.info("Enter Password  " + conPassword + " to Password  field " + confirmPassword.toString());
        sendTextToElement(confirmPassword, conPassword);
    }

    public void clickOnSave() {
        log.info("Click on save button");
        clickOnElement(saveButton);
    }
    public String getSuccessfullySavedText() {
        log.info("Get successfully saved text");
        return getTextFromElement(successfullySaved);
    }

}
