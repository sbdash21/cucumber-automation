Feature: Validate the Auto-Update feature

#  Scenario: validate the Auto-Update feature
#    Given User is in the login screen
#    When User enter "username" and "password"
#    Then Validate that user is in "home" screen
#    When user select "TASK MANAGEMENT"
#    Then Validate that user is in "TASK MANAGEMENT" screen
#    When User clicks on "descending big icon"
#    And User clicks on "MEDIUM PRIORITY TASKS"
#    Then Validate that "Plan of Selected Items"
#    When User clicks on down arrow badge
#    And User clicks on the progress icon
#    And User select "Completed"
#    Then User validate completed message as "Sys. Sugg: 0d"
#    And validate the mssage "d Remaining"

  @regression
  Scenario Outline: validate the error message shown to the user when he/she tries to
  set the Status of a Task to IP
    Given User is in the login screen
    When User enter "Interview" and "satyabrata"
    Then Verify user is in "Concerto-SL" Screen
    When User select "TASK MANAGEMENT"
#    Then Validate that user is in "TASK MANAGEMENT" screen
#    When User clicks on "descending big icon"
#    And User clicks on "MEDIUM PRIORITY TASKS"
#    Then Validate that "Plan of Selected Items"
#    When User clicks on the progress icon of "Architect Finalization"
#    And User select "In Progress"
#    Then User validate error message as "<message>"

    Examples:
      | message                                                        |
      | ERROR!\nTask: Architect Finalization is already in Status: IP. |