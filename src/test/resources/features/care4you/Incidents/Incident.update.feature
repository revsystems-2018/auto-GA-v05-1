
Feature: Incident

  Background: Incidents form is displayed
    Given 'Care4You' page is loaded
    And click 'Incidents' tab in 'Header menu'
    And click 'Incidents' menu item in 'Incidents menu'
    And click 'Edit an incident' button in first element of 'Incidents list'

  Scenario Outline: : Incidents form is filled
    Given Enter 'Create an incident' form information
      | name    | description    | date    | type    | severity    | employeeId    |
      | <sname> | <sdescription> | <sdate> | <stype> | <sseverity> | <semployeeId> |

    Examples:
      | sname              | sdescription          | sdate                  | stype    | sseverity | semployeeId |
      | My incident EDITED | My description EDITED | Friday, March 22, 2019 | FRACTURE | HIGH      | Juan Pinto  |


  Scenario Outline: : Incidents form is submitted
    Given Enter 'Create an incident' form information
      | name    | description    | date    | type    | severity    | employeeId    |
      | <sname> | <sdescription> | <sdate> | <stype> | <sseverity> | <semployeeId> |
    And click 'submit' button in 'Incidents menu'

    Examples:
      | sname              | sdescription          | sdate                  | stype    | sseverity | semployeeId |
      | My incident EDITED | My description EDITED | Friday, March 22, 2019 | FRACTURE | HIGH      | Juan Pinto  |


  Scenario Outline: : Verify edition of incident
    Given Enter 'Create an incident' form information
      | name    | description    | date    | type    | severity    | employeeId    |
      | <sname> | <sdescription> | <sdate> | <stype> | <sseverity> | <semployeeId> |
    And click 'submit' button in 'Incidents menu'
    And verify incident item has been edited in 'Incidents list'
      | name    | description    | date    | type    | severity    | employeeId    |
      | <sname> | <sdescription> | <sdate> | <stype> | <sseverity> | <semployeeId> |

    Examples:
      | sname              | sdescription          | sdate                  | stype    | sseverity | semployeeId |
      | My incident EDITED | My description EDITED | Friday, March 22, 2019 | FRACTURE | HIGH      | Juan Pinto  |