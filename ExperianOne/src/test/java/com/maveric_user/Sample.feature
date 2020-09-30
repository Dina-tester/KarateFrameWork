Feature: Just Practising


Scenario: Practising 1

Given def myJson = {foo: 'bar'}
And print myJson 
When set myJson.foo = 'world'
And print myJson
Then match myJson == {foo: 'world'}
* set myJson.cat={name:'Billie'}
* match myJson == {foo:'world',zee:[5]}


@SBL
Scenario: Practising 2

Given def myJson = 'Sridharan'
And print myJson 
When set myXml[0] = 'Tester'
And print myXml[0]
Then match myJson == myXml[0]
