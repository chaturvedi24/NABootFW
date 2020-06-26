@controlgroup
Feature: Control Group tests

  @controlgroupheader @regression @jquery @smoke
  Scenario: ControlGroup Header test
    Given I am on the jquery homepage
    Then I click on controlgroup
    When I land on the controlgroup page
    Then I switch to demo-frame
    Then I validate header

  @controlgroupcars @regression @jquery @smoke
  Scenario: ControlGroup number of cars test
    Given I am on the jquery homepage
    Then I click on controlgroup
    When I land on the controlgroup page
    Then I switch to demo-frame
    When I click up arrow 5 times
    Then I validate that number of cars is 5
    When I click down arrow 2 times
    Then I validate that number of cars is 3

