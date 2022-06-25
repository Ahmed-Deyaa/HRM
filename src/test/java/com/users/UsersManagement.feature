Feature: Users Management
  In order to give access to users
  As a system admin
  I want to load users page successfully

  @smokeTest @regression
  Scenario Outline: open users page successfully

    Given user navigates to orange website
    When  user enters valid username "<username>" and password "<password>"
    And   user clicks on login button
    Then  user navigates to home page successfully
    When  user hover over admin Tab
    And   user hover over userManagement Tab
    And   user click on users tab
    Then  user navigates to users page successfully

    Examples:
    |username|password|
    |Admin|admin123|

    Scenario Outline: valid login
      Given user navigates to orange website
      When  user enters valid username "<username>" and password "<password>"
      And   user clicks on login button
      Then  user navigates to home page successfully
      Examples:
        |username|password|
        |Admin|admin123|



