Feature: Log in feature
  User should have ability to log in/out system

  Scenario: Successful log in system

    Given I have opened EDS application log in page

    When  I enter credentials
      | login         | password |
      | user@user.com | password |

    Then I successfully log in