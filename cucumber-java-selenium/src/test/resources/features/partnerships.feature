Feature: Access Lehman College website for Partnerships

  Scenario: Print page title and url for for the partnerships page
    When I navigate to lehman college website
    And I navigate to partnerships page
    Then I validate page title "Community Engagement - Lehman College" and URL "http://www.lehman.edu/student-affairs/community-engagement/"