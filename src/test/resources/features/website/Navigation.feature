Feature: Navigate the website
  As a user
  I want to navigate the website
  So that I can do what I need

  Background:
    Given I am on the Valtech home page

  Scenario: Homepage displays latest news
    Then the LATEST NEWS section is displayed

  @WIP
  Scenario Outline: Pages display correct headers
    When I navigate to the <pageName> page
    Then the <pageName> header is displayed

    Examples:
      | pageName |
      | ABOUT    |
      | SERVICES |
      | WORK     |