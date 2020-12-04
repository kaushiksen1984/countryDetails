Feature: Test CountryDetailsController for different flows

Background:
	* url baseURL
	* header Content-Type = 'application/json'


Scenario: To add Country Zimbabwe

	Given path '/addCountryDetail'
	And request { countryName: 'Zimbabwe', "countryCapital": 'Harare', "continent": 'Africa' }
	When method post
	Then status 201
 	And match response == "Country Detail Added"
 	
Scenario: To add Country Zimbabwe

	Given path '/addCountryDetail'
	And request { countryName: 'Nepal', "countryCapital": 'Kathmandu', "continent": 'Asia' }
	When method post
	Then status 201
 	And match response == "Country Detail Added"
 	
Scenario: To add Country Zimbabwe

	Given path '/addCountryDetail'
	And request { countryName: 'Australia', "countryCapital": 'Canberra', "continent": 'Australia' }
	When method post
	Then status 201
 	And match response == "Country Detail Added"
 	
Scenario: To test for the retrieval for all Countries

	Given path '/countryDetails'
	When method get
	Then status 200
 	