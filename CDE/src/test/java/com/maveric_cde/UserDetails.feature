Feature: Get the UserDetails

Background:

Scenario: Request the UserDetails 1

Given url 'https://reqres.in/api/users/2'
When method get
Then status 200
Then print response

Scenario: Request the UserDetails 2

Given url 'https://reqres.in/api/users/3'
When method get
Then status 200
Then print response
