@product
Feature: To validate JDoodle application

  Scenario: To validate products option in JDoodle application
    Given The application URL is launched
    When The user click on the product option
    And The user click on the tech and assess platfrom
    Then The user validate the tech page
    When The user clicks on the Create an Assignment button
    Then The user validates the sign in page
    When The user clicks the Cancel button
    And The user scrolls down the documentation to explore a topic
    And The user clicks on the find out button
    Then The user validates the Tech and Assess page

    
    
    