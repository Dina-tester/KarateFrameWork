
Feature: User Details 2

Background: 
	* def expectedOutput = read('result.json')
	
Scenario: request user 2 details
Given url 'https://reqres.in/api/users/2'
When method GET
Then status 200
Then print response
And match response == expectedOutput[0]


