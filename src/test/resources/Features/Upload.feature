@upload
Feature: To validate JDoodle application

  Scenario: To validate the upload option in JDoodle application
    Given The application URL is launched
    When The user clicks on the upload option
    Then The upload option should be visible
    When The user provides the file path
    Then The system should verify whether the file is successfully uploaded
