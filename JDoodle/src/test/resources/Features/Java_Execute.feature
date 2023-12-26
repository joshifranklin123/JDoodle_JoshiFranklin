@java
Feature: To validate JDoodle application

  Scenario: Validate Online Java Compiler IDE in JDoodle application
    Given The application URL is launched
    When The text box is clicked
    And The existing code in the text box is cleared
    And The Java multiplication method code is entered
    And The execute button is clicked
    Then Verify the validated output is correct not not
