package com.country.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.country.model.CountryDetail;

@RestController
@RequestMapping("/country")
public class CountryDetailsController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CountryDetailsController.class);
	
	List<CountryDetail> countryDetails = new ArrayList<CountryDetail>();
	
	@GetMapping(value = "/countryDetails")
	public ResponseEntity<List<CountryDetail>> getAllCountryDetails() {
		return ResponseEntity.status(HttpStatus.OK).body(countryDetails);
	}
	
	
	@GetMapping(value = "/countryByName")
	public ResponseEntity<CountryDetail> getCountryByCountryName(@RequestParam String countryName) {
		for(CountryDetail countryDetail:countryDetails) {
			if(countryDetail.getCountryName().equals(countryName)) {
				return ResponseEntity.status(HttpStatus.OK).body(countryDetail);
			}
		}
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
	}
	
	@PutMapping(value = "/updateCountryDetail")
	public ResponseEntity<String> updateCountryDetail(@RequestBody CountryDetail countryDtl) {
		String message = "Country Detail Updated";
		for(CountryDetail countryDetail:countryDetails) {
			if(countryDetail.getCountryName().equals(countryDtl.getCountryName())) {
				countryDetail.setCountryCapital(countryDtl.getCountryCapital());
				return ResponseEntity.status(HttpStatus.CREATED).body(message);
			}
		}
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
	}
	
	@PostMapping(value = "/addCountryDetail")
	public ResponseEntity<String> addCountryDetail(@RequestBody CountryDetail countryDetail) {
		countryDetails.add(countryDetail);
		String message = "Country Detail Added";
		return ResponseEntity.status(HttpStatus.CREATED).body(message);
	}
	
	@DeleteMapping(value = "/deleteCountryDetail")
	public ResponseEntity<String> deleteCountryByCountryName(@RequestParam String countryName) {
		String message = "Country Detail Deleted";
		for(CountryDetail countryDetail:countryDetails) {
			if(countryDetail.getCountryName().equals(countryName)) {
				countryDetails.remove(countryDetail);
				return ResponseEntity.status(HttpStatus.OK).body(message);
			}
		}
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
	}

}
