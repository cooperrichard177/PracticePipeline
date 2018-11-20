Feature: I can open google
  Scenario: I can open google and search for something
    Given I am on google
    When I search for "puppies"
    Then I am shown results of "puppies"