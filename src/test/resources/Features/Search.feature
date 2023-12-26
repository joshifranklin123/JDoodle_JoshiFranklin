@search
Feature: To validate JDoodle application

  Scenario Outline: Validate the search option in JDoodle application
    Given The application URL is launched
    When The user clicks on the search box
    And The user enter the "<text>" in text box
    And The user click on the python option
    Then The user validates the appearance of the Python 2 IDE
    When The user click on the execute button
    Then Verify the validated python output is correct not not

    Examples: 
      | text   |
      | python |
