package com.orangehrmlive.demo.pages;


import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends Utility {
    private static final Logger log = LogManager.getLogger(DashboardPage.class.getName());

    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h6[normalize-space()='Dashboard']")
    WebElement dashboardText;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Admin']")
    WebElement adminTab;

    public String getDashboardText() {
        log.info("get actual title text of register page");
        return getTextFromElement(dashboardText);
    }
    public void clickOnAdminTab() {
        log.info("Click on admin tab");
        clickOnElement(adminTab);
    }
}
