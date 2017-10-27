Feature: Organizations feature
  User should have ability to operate with organizations

  Scenario: User should have ability create new organization

    Given I have opened EDS

    When  I enter credential
      | login         | password |
      | user@user.com | password |

    When I have choose Private area

    When I have choose Organization Tub

    When I have choose Certificate


    Then I successfully reach it