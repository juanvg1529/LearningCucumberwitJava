Feature: Login functionality feature
  In order to do internal banking
  as a valid bank custumer
  I want to login succesfully

  Scenario: Login_Succesfull
    Given The user logs at the page of ParaBank Application
    When the user enter valid credential
    Then The user can be taken tod the Overview page