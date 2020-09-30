@Smoke
Feature: Get the UserDetails

Background:
Given url 'https://reqres.in/api/users/2'


     
Scenario: Request the UserDetails 2

When method get
Then status 200
#Then print response   //This # is used to skip the particular line of the feature file

Scenario: Request the UserDetails 3


When method get
Then status 200
Then print response    //This used to print the response
