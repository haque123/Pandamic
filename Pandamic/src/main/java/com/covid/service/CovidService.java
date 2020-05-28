package com.covid.service;

 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.model.CDCRestService;
import com.covid.model.Covid;
  

@Service
public class CovidService {
 
	 @Autowired
	 CDCRestService cdcRestService;
	 
	 public List<Covid> getCasesForCountry(String country)  throws CovidExeption {
	   String uri = "https://covidtracking.com/api/v1/"+country+"/current.json";

	 
	   
	   List<Covid>  rs= cdcRestService.getrestTemplate(uri);
	  
	   
        return rs;//new Covid(500000.0,56885.0,3883.0,73.0);
    }

   

    // Find
    public 	List<Covid> getCasesForState(String stCode)  throws CovidExeption{
    	// CDCRestService.countryCase();
    	  String uri = "https://covidtracking.com/api/v1/states/"+stCode+"/current.json";
   	  System.out.println("uri "+uri);
   	   List<Covid>  rs= cdcRestService.getrestTemplateState(uri);
       	
   	   
		 
   	  
    	 return rs;//new Covid(10000.0,565.0,383.0,73.0);
    }

  


}
