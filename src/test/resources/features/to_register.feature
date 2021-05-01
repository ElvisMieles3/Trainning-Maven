@Register
Feature: Register user

  As QA Automation of mi store
  I Want to Register User
  to check availability

  Background:
    Given Elvis open the web

  @RegisterCorrect
  Scenario: Register correct usuario
    When the Elvis record the data
      | email               | firstName | lastName | password | dateMonth | dateDay | dateYear | addressName | addressLastName | addressCompany | addressCity | state   | postalCode | country       | mobilePhone | addressReference |
      | elvis+m99@gmail.com | elvis     | mieles   | 12345    | March     | 4       | 1995     | Calazans    | calle           | SAS            | Medellin    | Arizona | 76565      | united States | 3045419895  | Edificio ver     |
    Then he sees the menssage "MY ACCOUNT"
    And he sees the user name "elvis mieles"
