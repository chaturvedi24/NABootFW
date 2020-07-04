Feature: pass data from one step to another

  @radiosselectionpico
  Scenario: perform radio button selection
    Given I am on the jquery homepage
    When I click on checkboxradio
    Then I switch to demo-frame
    Then I land on the checkboxradio page
    When I only select "New York" radio button
    Then I validate radiocheckbox selection
    When I only select "Paris" radio button
    Then I validate radiocheckbox selection
    When I only select "London" radio button
    Then I validate radiocheckbox selection