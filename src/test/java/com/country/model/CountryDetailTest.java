package com.country.model;

import org.junit.Test;

import pl.pojo.tester.api.assertion.Assertions;
import pl.pojo.tester.api.assertion.Method;

public class CountryDetailTest {
	
	@Test
    public void should_Pass_All_Pojo_Tests_CountryDetailTest(){
        final Class<CountryDetail> classUnderTest = CountryDetail.class;
        Assertions.assertPojoMethodsFor(classUnderTest).testing(Method.GETTER, Method.SETTER,
        		Method.TO_STRING, Method.EQUALS, Method.HASH_CODE).areWellImplemented();
    }

}
