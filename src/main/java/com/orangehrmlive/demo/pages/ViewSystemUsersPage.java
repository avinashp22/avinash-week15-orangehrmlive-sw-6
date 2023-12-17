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

public class ViewSystemUsersPage extends Utility {

    private static final Logger log = LogManager.getLogger(ViewSystemUsersPage.class.getName());

    public ViewSystemUsersPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h5[normalize-space()='System Users']")
    WebElement systemUsersText;
    @CacheLookup
    @FindBy(xpath = "//i[@class='oxd-icon bi-plus oxd-button-icon']")
    WebElement addButtonOnSystemUserPage;
    @CacheLookup
    @FindBy(xpath = "(//div[contains(text(),'-- Select --')])[1]")
    WebElement searchText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
    WebElement username;

    @CacheLookup
    @FindBy(xpath = "(//span[contains(text(),'Admin')])[1]")
    WebElement admin;
    @CacheLookup
    @FindBy(xpath = "(//button[normalize-space()='Search'])[1]")
    WebElement searchButton;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Lavanya')]")
    WebElement lauris;
    @CacheLookup
    @FindBy(xpath = "(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[2]")
    WebElement checkBox;
    @CacheLookup
    @FindBy(xpath = "(//button[normalize-space()='Delete Selected'])[1]")
    WebElement deleteButton;
    @CacheLookup
    @FindBy(xpath = "(//button[normalize-space()='Yes, Delete'])[1]")
    WebElement yesDelete;
    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
    WebElement deleted;
    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
    WebElement noRecordFound;

    public String verifySystemUsersText() {
        log.info("Verify system users text");
        return getTextFromElement(systemUsersText);
    }
    public void enterUsername(String usernameField) {
        log.info("Enter username  "  + " to username  field " + username.toString());
        sendTextToElement(username,usernameField);
    }

    public void clickOnAddButton() {
        log.info("Click on admin tab");
        clickOnElement(addButtonOnSystemUserPage);
    }

    public void selectUserRoleFromDropDown() {
        log.info("Select user role from dropdown");
        sendTextToElement(searchText, "Admin");

        List<WebElement> suggList = driver.findElements(By.xpath("(//span[contains(text(),'Admin')])[1]"));
        for (WebElement element : suggList) {
            System.out.println(element.getText());
        }
        mouseHoverToElementAndClick(admin);
    }
    public void clickOnSearchButton() {
        log.info("Click on search button");
        clickOnElement(searchButton);
    }
    public String getUserShouldBeInListText() {
        log.info("get user should be in list text");
        return getTextFromElement(lauris);
    }
    public void clickOnCheckBox() {
        log.info("Click on check box");
        clickOnElement(checkBox);
    }

    public void clickOnDeleteButton() {
        log.info("Click on delete button");
        clickOnElement(deleteButton);
    }
    public void clickOnYesDeleteButton() {
        log.info("Click on yes delete button");
        clickOnElement(yesDelete);
    }
    public String getSuccessfullyDeletedText() {
        log.info("get successfully deleted text");
        return getTextFromElement(deleted);
    }
    public String getNoRecordFoundText() {
        return getTextFromElement(noRecordFound);
    }

}
