package com.orangehrmlive.demo.pages;


import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//img[@alt='client brand banner']")
    WebElement orangeHrmLogo;

    @CacheLookup
    @FindBy(xpath = "//header/div[1]/div[2]/ul[1]/li[1]/span[1]/img[1]")
    WebElement userProfileLogo;

    @CacheLookup
    @FindBy(xpath = "//b[contains(text(),'PIM')]")
    WebElement pimText;

    @CacheLookup
    @FindBy(xpath = "//b[contains(text(),'Leave')]")
    WebElement leaveText;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Dashboard')]")
    WebElement dashBoardText;

    @CacheLookup
    @FindBy(xpath = "//a[@id='welcome']")
    WebElement welcomeText;

    public void verifyLogoIsDisplayed() {
        log.info("Verify logo is displayed");
        WebElement logo = driver.findElement(By.xpath("//img[@alt='client brand banner']"));
        if (logo.isDisplayed()) {
            System.out.println("Logo is displayed on the login page");
        } else {
            System.out.println("Logo is not displayed on the login page");
        }
    }

    public void clickOnUserProfileLogo() {
        log.info("Click on user profile logo");
        clickOnElement(userProfileLogo);
    }
}
