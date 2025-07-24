#Scenario: Business rule through list of steps with argument
#Given:
#When:
#Then:
#And,But:
#Scenario Outline:
#Examples:
#Background:
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels): To group Scenario
#<> (placeholder)
#""
## (Comments)
#Sample Fetaure Defination Template

Feature: Login Page Feature

Background:
	Given I am the user of facebook application
	
	@TestCaseNo:1
	Scenario: Login Page Valid Scenario
	When I enter username as "abc@gmail.com"
	And I enter password as "12345"
	And I click on Login button
	Then I should be able to login successfully