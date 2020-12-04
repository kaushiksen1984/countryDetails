package com.country.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.country.model.CountryDetail;

@RunWith(MockitoJUnitRunner.class)
public class CountryDetailsControllerTest {
	
	@InjectMocks
	private CountryDetailsController countryDetailsController;
	
	private List<CountryDetail> expectedCountryDetails;
	private CountryDetail countryDetail;
	
	@Before
	public void setUp() {
		expectedCountryDetails = new ArrayList<CountryDetail>();
		countryDetail = new CountryDetail();
		countryDetail.setCountryName("Country");
		countryDetail.setCountryCapital("Capital");
		countryDetail.setContinent("Continent");
	}
	
	@Test
	public void testGetAllCountryDetails() {
		ResponseEntity<List<CountryDetail>> actual = countryDetailsController.getAllCountryDetails();
		Assert.assertEquals(expectedCountryDetails, actual.getBody());
		Assert.assertEquals(HttpStatus.OK, actual.getStatusCode());
	}

}

