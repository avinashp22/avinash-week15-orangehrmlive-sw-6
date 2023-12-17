Feature: Login Test

  Scenario: Verify user should login successfully
    Given I am on homepage
    When  I enter username "Admin"
    And   I enter password "admin123"
    And   I click on login button
    Then  I should be able to verify message "Dashboard"
    And   I should login successfully

  Scenario:  Verify the logo display on home page
    Given I am on homepage
    When  I enter username "Admin"
    And   I enter password "admin123"
    And   I click on login button
    Then  I should be able to verify the  logo is displayed

  Scenario: Verify user should logout successfully
    Given I am on homepage
    When  I enter username "Admin"
    And   I enter password "admin123"
    And   I click on login button
    Then  I click on user profile logo
    And   I mouse hover on logout and click
    Then  I can verify the text "Login Panel" is displayed

  Scenario Outline: User should not login successfully
    Given I am on homepage
    When I enter username <username>
    And I enter password <password>
    And I click on login button
    Then I can verify the text <errorMessage>

    Examples:
      | username          | password | errorMessage        |
      |                   |          | Required            |
      | test123@gmail.com |          | Required            |
      |                   | test123  | Required            |
      | test123@gmail.com | test123  | Invalid Credentials |