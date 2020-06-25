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

  @mapparams
  Scenario: multi params
   # Given I enter first name "some fn" and last name "some last" and address line 1 "abc street building 1"
    Given I fill signup form
      | first name    | some fn         |
      | last name     | some ln         |
      | address line1 | 200 some street |
      | address line2 | Suite A4        |
      | zip code      | 10001           |
      | City          | Ney York        |
      | State         | NY              |
    Then I fill bankapplication form
      | first name    | some fn         |
      | last name     | some ln         |
      | address line1 | 200 some street |
      | address line2 | Suite A4        |
      | zip code      | 10001           |
      | City          | Ney York        |
      | State         | NY              |
    And I fill registration form
      | first name    | some fn         |
      | last name     | some ln         |
      | address line1 | 200 some street |
      | address line2 | Suite A4        |
      | zip code      | 10001           |
      | City          | Ney York        |
      | State         | NY              |

  @datatable
  Scenario: DataTable example
    Given I fill all forms
      | first name | last name | address line1   | address line2 | zip code | City       | State | Email          |
      | some fn1   | some ln1  | 200 some street | Apt A         | 10001    | New York   | NY    | somemail@1.com |
      | some fn2   | some ln2  | 201 some street | Apt B         | 00120    | Wilmington | NC    |                |
      | some fn3   | some ln3  | 202 some street | Apt C         | 96251    | Denver     | CO    | somemail@3.com |
      | some fn4   | some ln4  | 203 some street | Apt D         | 52689    | NAshville  | TN    | somemail@4.com |

  @datatable2
  Scenario Outline: DataTable example
    Given I fill all forms on <Browser>
      | first name | last name | address line1   | address line2 | zip code | City       | State | Email          |
      | some fn1   | some ln1  | 200 some street | Apt A         | 10001    | New York   | NY    | somemail@1.com |
      | some fn2   | some ln2  | 201 some street | Apt B         | 00120    | Wilmington | NC    |                |
      | some fn3   | some ln3  | 202 some street | Apt C         | 96251    | Denver     | CO    | somemail@3.com |
      | some fn4   | some ln4  | 203 some street | Apt D         | 52689    | NAshville  | TN    | somemail@4.com |
    Examples:
    |Browser|
    |chrome |
    |firefox|
    |edge   |
