@iib
Feature: User Details

Scenario: Get call test

Given url 'https://reqres.in/api/users/2'
When method Get
Then status 200
And print response
And def expectedResult = read('flygbra.json')
And match response == expectedResult
* match response.data.id == 2
* match response.data.last_name != null
* match response.data.first_name != null
