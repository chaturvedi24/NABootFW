Feature: Checkboxradio page tests

  @checksradioscount
  Scenario: validate number of checkboxes and radios
    Given I am on the jquery homepage
    When I click on checkboxradio
    Then I switch to demo-frame
    Then I land on the checkboxradio page
    Then I validate number of radios is 3
    Then I validate number of ratings is 4
    Then I validate number of bedTypes is 4

  @radiosselection
  Scenario: perform radio button selection
    Given I am on the jquery homepage
    When I click on checkboxradio
    Then I switch to demo-frame
    Then I land on the checkboxradio page
    Then I select "New York" radio button
    Then I select "Paris" radio button
    Then I select "London" radio button

# Write scenario for selecting hotel stars
# Write scenario for selecting Bed Types
