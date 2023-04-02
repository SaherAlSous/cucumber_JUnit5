Feature: refactoring scenarios

#  Scenario: Create and invoice
#    Given I am a signed-in user with role: admin
#    And a client "Test Client" exists with name: "Test Client"
#    And a project "Test Project" exists with
#      |  name         |  "Test Project"              |
#      |  client       |  client "Test Client"        |
#    And an issue "Test issue" exists with:
#      |  project      |  project "Test Project"      |
#      |  name         |  "Test Issue"                |
#    And a work_unit "Test Work Unit" exists with:
#      |  issue        |  issue "Test Issue"          |
#      |  completed_on |  "2011-08-04"                |
#    And I am on admin invoices page
#    Then I should see "Test Client"
#    And I follow "Test Client"
#    And I fill in "invoice_id" with "abc"
#    And I press "Submit"
#    Then I am on admin invoices page
#    And I should not see "Test Client"

#    Background: Context
#      Given I am a signed-in user with admin role
#
#    Scenario: Logging as admin into invoice page
#      When I go to admin invoice page
#      Then I should see "Test Client"
#
#    Scenario: creating an invoice
#      When I fill I create an invoice for pending clients
#      Then Pending clients should disappear from invoices page