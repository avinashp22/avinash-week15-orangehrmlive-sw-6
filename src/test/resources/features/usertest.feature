Feature: Users

  Scenario: adminShouldAddUserSuccessFully()
    Given I am on homepage
Login to Application
click On "Admin" Tab
Verify "System Users" Text
click On "Add" button
Verify "Add User" Text
Select User Role "Admin"
enter Employee Name "Ananya Dash"
enter Username
Select status "Disable"
enter psaaword
enter Confirm Password
click On "Save" Button
verify message "Successfully Saved"

  Scenario: searchTheUserCreatedAndVerifyIt()
    Given I am on homepage
Login to Application
click On "Admin" Tab
Verify "System Users" Text
Enter Username
Select User Role
Select Satatus
Click on "Search" Button
Verify the User should be in Result list.

  Scenario: verifyThatAdminShouldDeleteTheUserSuccessFully()
    Given I am on homepage
Login to Application
click On "Admin" Tab
Verify "System Users" Text
Enter Username
Select User Role
Select Satatus
Click on "Search" Button
Verify the User should be in Result list.
Click on Check box
Click on Delete Button
Popup will display
Click on Ok Button on Popup
verify message "Successfully Deleted"

  Scenario: searchTheUserAndVerifyTheMessageRecordFound()
    Given I am on homepage
Login to Application
click On "Admin" Tab
Verify "System Users" Text
Enter Username <username>
Select User Role <userRole>
Enter EmployeeName <employeeName>
Select Satatus <status>
Click on "Search" Button
verify message "(1) Record Found"
Verify username <username>
Click on Reset Tab
Data Set
username userrole employeeName Status
Admin Admin Paul Collings Enable
Cassidy.Hope ESS Cassidy Hope Enable
Nina.Patel ESS Nina Patel Enable
Odis.Adalwin Admin Odis Adalwin Enable
