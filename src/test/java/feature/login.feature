#Author: suryamitracse@gmail.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Homepage_Login
  I want to validate all possible login scenarios : Valid/Invalid
  Background: User is on Login Page
  
  Scenario: Valid Login
    
    When User enters username and password
    When Click on Login
    Then Homepage should open
    Then User should see Dashboard text

	 @Tag1
	 Scenario: Forgot Password
	 
    When Click on Forgot Password button
    Then User should see Forgot password page