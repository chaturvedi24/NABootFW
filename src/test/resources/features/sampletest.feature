# Recognized step keywords: Given, When, Then, And, But, *
Feature: JQuery homepage
  Test the homepage of http://jqueryui.com/ website

  Background:
    Given I am on the jquery homepage

  @controlgroup @regression
  Scenario: controlgroup button test
    This scenario is to test control group button
    When I click on controlgroup
    Then I land on the controlgroup page

  @datepicker @smoke
  Scenario: datepicker button test
  This scenario is to test date picker button
    When I click on datepicker
    Then I land on the datepicker page

  @checkboxradio @jquery
  Scenario: checkboxradio button test
  This scenario is to test checkbox radio button
    When I click on checkboxradio
    Then I land on the checkboxradio page