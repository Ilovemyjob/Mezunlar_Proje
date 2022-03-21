@2
Feature: Us_2
  Background: Sign in
    When User go to Amazon site
    And user hover over Sign in
    And clickt Sign In

  Scenario:tc2 User should reach to the Amazon web site
    And write valid e mail
    And write valid Password
    And User should see home

  Scenario:tc3 user should not sigh in with invalid email
    And write valid e mail
    And write invalid Password
    And see Error Message

    #log ayarlandi
  Scenario:tc4 user should not sigh in with invalid email
    And write invalid e mail
    And clickt Continue
    And see Error Message