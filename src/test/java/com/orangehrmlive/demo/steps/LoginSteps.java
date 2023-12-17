package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I enter username {string}")
    public void iEnterUsername(String username) {
        new LoginPage().enterUserName(username);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should be able to verify message {string}")
    public void iShouldBeAbleToVerifyMessage(String arg0) {
        Assert.assertEquals(new DashboardPage().getDashboardText(),"Dashboard", "Error message");
    }

    @And("I should login successfully")
    public void iShouldLoginSuccessfully() {
    }

    @Then("I should be able to verify the  logo is displayed")
    public void iShouldBeAbleToVerifyTheLogoIsDisplayed() {
        new HomePage().verifyLogoIsDisplayed();
    }

    @Then("I click on user profile logo")
    public void iClickOnUserProfileLogo() {
        new HomePage().clickOnUserProfileLogo();
    }

    @And("I mouse hover on logout and click")
    public void iMouseHoverOnLogoutAndClick() {
        new LoginPage().mouseHoverAndClickOnLogout();
    }

    @Then("I can verify the text {string} is displayed")
    public void iCanVerifyTheTextIsDisplayed(String arg0) {
        new LoginPage().getLoginText();
    }

    @When("I enter username <username>")
    public void iEnterUsernameUsername(String username) {
        new LoginPage().enterUserName(username);
    }

    @And("I enter password <password>")
    public void iEnterPasswordPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @Then("I can verify the text <errorMessage>")
    public void iCanVerifyTheTextErrorMessage() {
    }
}
