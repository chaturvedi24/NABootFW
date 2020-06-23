@dates
Feature: Date picker tests

  @dateselection @regression @jquery @smoke
  Scenario: Date picker selection test
    Given I am on the jquery homepage
    Then I click on datepicker
    Then I switch to demo-frame
    Then I validate date selection

