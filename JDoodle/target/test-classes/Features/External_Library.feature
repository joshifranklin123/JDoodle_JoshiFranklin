@lib
Feature: To validate JDoodle application

  Scenario: The user validates the external library option for adding a library function
    Given The application URL is launched
    When The user clicks on the external library option
    Then The user validates the add library option is displayed
    When The user adds the Maven dependency in the add library text box
    And The user clicks the add library button
    Then The user verifies that the dependency is added
    
