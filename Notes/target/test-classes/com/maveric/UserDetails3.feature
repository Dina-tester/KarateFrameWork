Feature: User Details 3

Background: 
	* def expectedOutput = read('result.json')
	* def result = call read('UserDetails2.feature')
	

Scenario: request user 3 details
Given url 'https://reqres.in/api/users/3'
When method GET
Then status 200
Then print response
And match response == expectedOutput[1]
* print 'Output of UserDetails2', result
* print 'UserDetails2_first_name', result.response.data.first_name