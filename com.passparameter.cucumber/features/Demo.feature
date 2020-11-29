Feature: Test Logic Invoice Scenario

  Scenario Outline: Test login with valid credential
    Given Open chrome browser and start application
    When I enter the valid "<username>" and valid "<password>"
    Then User should be login successfully
    And check title
    Then Closed Browser

 

    Examples: 
      | username    | password    | 
      | vrushali    | vrushali123 |
      | vrush       | vrush123    |
      | vrushali122 | vrushali    |