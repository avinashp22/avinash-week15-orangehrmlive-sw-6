Feature: Login

  Scenario: verifyUserShouldLoginSuccessFully()
    Given I am on homepage
    When Enter username
And Enter password
And Click on Login Button
Then Verify "WelCome" Message

  Scenario: verifyThatTheLogoDisplayOnHomePage()
    Given I am on homepage
    When Login To The application
    Then Verify Logo is Displayed

  Scenario: verifyUserShouldLogOutSuccessFully()
    Given I am on homepage
    When Login To The application
And Click on User Profile logo
    And Mouse hover on "Logout" and click
    Then Verify the text "Login Panel" is displayed

  Scenario Outline: verifyErrorMessageWithInvalidCredentials()
    Given I am on homepage
When Enter username <username>
    And Enter password <password>
    And Click on Login Button
    Then Verify Error message <errorMessage>

    Examples:
username password errorMessage
Required
test123@gmail.com Required
test123 Required
test123@gmail.com test123 Invalid credentials

      | email              | password | errorMessage                                                                                |
      | abcd123@gmail.com  | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | xyz123@gmail.com   | abc123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | adfafasd@gmail.com | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |