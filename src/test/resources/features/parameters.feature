@practice
Feature: Practice for parameterization

  @doublequoteparams
  Scenario: string parameter with double quotes
    When I read parameter "value1"
    Then I read parameter "value2"
    And I read parameter "value3"
    But I read parameter "value 4 abc 123"

  @outlineexample
  Scenario Outline: scenario outline example
    When I read parameter "<values>"
    Given I login with "<usernm>" id and "<password>" password
    Given I login with <usernm> id and <password> password
    When I pass integer <numeric>
    Examples:
      | values          | usernm   | password  | numeric |
      | value1          | user1    | password1 | 1       |
      | value2          | user2    | password2 | 2       |
      | value3          | user3    | password3 | 3       |
      | value 4 abc 123 | user4    | password4 | 4       |
      | asdfasfd        | asdfasdf | afsdasfd  | w1231   |

  @multiparams
  Scenario: multiple string params
    Given I login with "user1" id and "password1" password
    Given I login with "user2" id and "password3" password

  @doublequoteparam1
  Scenario: string parameter with double quotes2
    Given I signup with user name "test user 1" and email "some@1.com"

  @wordparam
  Scenario: string word parameter with continuous words and no spaces and double quotes
    Given I login with user1 id and password1 password
    Given I login with user2 id and password2 password

  @intparam
  Scenario: Int parameter sample
    When I pass integer 5678989

  @doubleparam
  Scenario: double parameter sample
    Then I pass double value 1124.63212

  @limitedparams
  Scenario: limiting parameter values
    Then I select Faster from the speed drop down