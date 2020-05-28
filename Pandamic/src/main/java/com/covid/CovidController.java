package com.covid;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.covid.model.Covid;
import com.covid.service.CovidExeption;
import com.covid.service.CovidService;
import com.javainuse.exceptionhandling.ResourceNotFoundException;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
 
 
 
@RestController
@RequestMapping("/api")
@Api(value = "Covid Tracking System", description = "Operations pertaining to covid in Covid Tracking system")

public class CovidController {
	Logger logger =LoggerFactory.getLogger(CovidController.class);

	
 
	
	
	  @Autowired CovidService covidService;
	 
	  @ApiOperation(value = "View a list of available employees", response = List.class)
	    @ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Successfully retrieved list"),
	        @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
	        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
	        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	    })
	@RequestMapping(value = "/{country}", method = RequestMethod.GET)
	public List<Covid>  getCasesForCountry( @ApiParam(value = "Country Code for which Covid Track will retrieved", required = true) @PathVariable String country) throws ResourceNotFoundException, CovidExeption {
		
		   
		  List<Covid> covid1=null;
		
		try {
			 covid1=covidService.getCasesForCountry(country);
			
			  //Covid covid =new Covid(500000L,56885L,3883L,73L);
			 if (covid1 == null  || covid1.size()==0 ) {
					throw new ResourceNotFoundException("Covid Record not found for "+country);
				}
				 
				return covid1;
		} catch (CovidExeption e) {
			// TODO Auto-generated catch block
			throw new CovidExeption("Internal Server Exception while getting exception");
		}
	
	}
	  
	  
	  //Happy path, an Covid is returned as response
		@RequestMapping(value = "/{country}/{stateCode}", method = RequestMethod.GET)
		public List<Covid> getCasesForState(@PathVariable String country, @PathVariable String stateCode) throws ResourceNotFoundException, CovidExeption {
						
			List<Covid> covid2=covidService.getCasesForState(stateCode);
			 if (covid2 == null || covid2.size()==0 ) {
					throw new ResourceNotFoundException("Covid Record not found for "+stateCode+","+country);
				}
				 

				 return covid2;
		}
	
}