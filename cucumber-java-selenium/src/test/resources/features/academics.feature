Feature: Access Lehman College website for Academics

  Scenario: Print page title and url for for the academics page
    When I navigate to lehman college website
    And I navigate to academics page
    Then I validate page title "Llehman College Academics - Lehman College" and URL "http://www.lehman.edu/academics/"