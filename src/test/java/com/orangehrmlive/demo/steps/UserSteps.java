package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class UserSteps {
    @When("I click on admin tab")
    public void iClickOnAdminTab() {
        new DashboardPage().clickOnAdminTab();
    }

    @And("I should be able to verify {string} text")
    public void iShouldBeAbleToVerifyText(String arg0) {
        Assert.assertEquals(new ViewSystemUsersPage().verifySystemUsersText(), "System Users", "Error message found");
    }

    @When("I click on add button")
    public void iClickOnAddButton() {
        new ViewSystemUsersPage().clickOnAddButton();
    }

    @And("I can verify {string} text")
    public void iCanVerifyText(String arg0) {
        Assert.assertEquals(new AddUserPage().verifyAddUserText(), "Add User", "Error message found");
    }

    @And("I select user role {string}")
    public void iSelectUserRole(String arg0) {
        new ViewSystemUsersPage().selectUserRoleFromDropDown();

    }

    @And("I enter employee name {string}")
    public void iEnterEmployeeName(String name) {
        new AddUserPage().enterEmployeeName(name);
    }

    @When("I enter username {string} into username field")
    public void iEnterUsernameIntoUsernameField(String arg0) {
        new AddUserPage().enterUsername();
    }

    @And("I select status {string}")
    public void iSelectStatus(String arg0) {
        new AddUserPage().clickOnStatusSelect();
        new AddUserPage().clickOnDisable();
    }

    @And("I enter password {string}into password field")
    public void iEnterPasswordIntoPasswordField(String password) {
        new AddUserPage().enterPassword(password);
    }

    @And("I enter confirm password {string}")
    public void iEnterConfirmPassword(String conPassword) {
        new AddUserPage().enterConfirmPassword(conPassword);
    }

    @And("I click on save button")
    public void iClickOnSaveButton() {
        new AddUserPage().clickOnSave();
    }

    @Then("I am able to verify message {string}")
    public void iAmAbleToVerifyMessage(String arg0) {
        Assert.assertEquals(new AddUserPage().getSuccessfullySavedText(), "Successfully Saved", "Error message found");
    }

    @And("I click on search button")
    public void iClickOnSearchButton() {
        new ViewSystemUsersPage().clickOnSearchButton();
    }

    @Then("I should be able to verify the user should be in result list")
    public void iShouldBeAbleToVerifyTheUserShouldBeInResultList() {
        Assert.assertEquals(new ViewSystemUsersPage().getUserShouldBeInListText(), "Orange.Test", "Error message displayed");
    }

    @When("I click on check box")
    public void iClickOnCheckBox() {
        new ViewSystemUsersPage().clickOnCheckBox();
    }

    @And("I click on delete button")
    public void iClickOnDeleteButton() {
        new ViewSystemUsersPage().clickOnDeleteButton();
    }

    @And("Popup will display")
    public void popupWillDisplay() {
    }

    @Then("Click on ok button on popup")
    public void clickOnOkButtonOnPopup() {
        new ViewSystemUsersPage().clickOnYesDeleteButton();
    }

    @And("I am able to verify text {string}")
    public void iAmAbleToVerifyText(String arg0) {
        Assert.assertEquals(new ViewSystemUsersPage().getSuccessfullyDeletedText(), "Successfully Deleted", "Error message displayed");
    }

    @When("I enter username <username> into username field")
    public void iEnterUsernameUsernameIntoUsernameField() {
        new AddUserPage().enterUsername();
    }

    @And("I select user role <userrole>")
    public void iSelectUserRoleUserrole() {
        new ViewSystemUsersPage().selectUserRoleFromDropDown();
    }
}
