package com.covid;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;

import org.springframework.http.MediaType;

import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;


import org.springframework.web.client.RestTemplate;



@SpringBootTest
public class CDCRestServiceTest {	 
	
	 ///   https://covidtracking.com/api/v1/us/current.json
	 
	@Test
	public void testGetRestTemplate( ) throws URISyntaxException 
	{
		 HttpHeaders headers = new HttpHeaders();
		 
	        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

	      //  RestTemplate restTemplate = 
	        RestTemplate restTemplate = getRestTemplate();
	      
	        String uri = "https://covidtracking.com/api/v1/states/OH/current.json";
	 	   
	        String  result   = restTemplate.getForObject(uri, String.class);

	        
	         
					 
  	
  	System.out.println(" COVID detail"+result.toString());
	    //Verify request succeed
	  //  Assert.assertEquals(200, result.getEngative());
	   // Assert.assertEquals(true, result.getBody().contains("employeeList"));
	}
	 

    @Autowired
    private RestTemplate restTemplate;

    private static final String COUNTRY_URL  = "https://covidtracking.com/api/v1/us/current.json";
    private static final String STATE_URL = "https://covidtracking.com/api/v1/states/";

    private RestTemplate getRestTemplate(){
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
        messageConverters.add(converter);
        restTemplate.setMessageConverters(messageConverters);
        return restTemplate;
    }
   

	 
}
