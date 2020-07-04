Feature: To test features of OpenJS Org

  @readprop
  Scenario: To read properties
    Given I read property loginURL
    And I read property loginEmail
    And I read property loginPwd

  @setlogin
  Scenario: set login details
    Given I set email to "loginEmail"
    Then I set password to "loginPwd"

  @setloginOutline
  Scenario Outline: set login details
    Given I set email to "<email>"
    Then I set password to "<password>"
    Examples:
      | email         | password  |
      | email.log.com | password1 |
      | mail1@abc.com | password2 |

  @setloginExcel
  Scenario: set login with excel file
    Given I login with excel file