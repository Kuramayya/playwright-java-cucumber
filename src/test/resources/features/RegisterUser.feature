Feature: Login Page feature
    
  @register @smoke
  Scenario: Verify User is able to register to Book Store application
    Given user navigates to "url"
    When user clicks on "Book Store Application" icon in main page
    And user clicks Login button
    And user clicks NewUser button
    And user enters "firstName" firstname
    And user enters "lastName" lastname
    And user enters "userName" userName
    And user enters "password" passWord
    #Then user clicks on checkbox
    And user clicks on register button
    Then verify error message 