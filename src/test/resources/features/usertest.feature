Feature: Users Test
# Ananya Dash - does not work

  Background:
    Given I am on homepage
    When  I enter username "Admin"
    And   I enter password "admin123"
    Then  I click on login button
    When  I click on admin tab
    And   I should be able to verify "System Users" text


  Scenario: Admin should add user successfully
    When  I click on add button
    And   I can verify "Add User" text
    And   I select user role "Admin"
    And   I enter employee name "Orange  Test"
    When  I enter username "Orange.Test" into username field
    And   I select status "Disable"
    And   I enter password "Orange123456!"into password field
    And   I enter confirm password "Orange123456!"
    And   I click on save button
    Then  I am able to verify message "Successfully saved"

  Scenario: Admin search the user created and verify user
    When  I enter username "Orange.Test" into username field
    And   I select user role "Admin"
    And   I click on search button
    Then  I should be able to verify the user should be in result list

  Scenario: Verify admin should delete the user successfully
    When  I enter username "Orange.Test" into username field
    And   I select user role "Admin"
    And   I click on search button
    Then  I should be able to verify the user should be in result list
    When  I click on check box
    And   I click on delete button
    And   Popup will display
    Then  Click on ok button on popup
    And   I am able to verify text "Successfully Deleted"

  Scenario Outline: Search The User And Verify The Message Record Found
    When  I enter username <username> into username field
    And   I select user role <userrole>
    And   I click on search button
    Then  I should be able to verify the user should be in result list


    Examples:
      | username     | userrole |
      | Admin        | Admin    |
      | Cassidy.Hope | ESS      |
      | Nina.Patel   | ESS      |
      | Odis.Adalwin | Admin    |