@Test2
Feature: Testar response 401

  Scenario: Fazer GET num endpoint errado
    Given  Que eu faça um GET errado
    Then Status code será 401