package com.covid.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.covid.model.Covid;
import com.covid.service.CovidExeption;


@Service
public class CDCRestService {
	
	@Autowired RestTemplate restTemplate;
	
	public  List<Covid> getrestTemplate(String uri) throws CovidExeption {

	       
		//get All rated movie  IDs
        Covid[] covid= restTemplate.getForObject(uri, Covid[].class);
 
       List<Covid>  ls=new ArrayList<Covid>();
       ls.add(covid[0]);
       
return  ls;
       

    }
	
	public  List<Covid> getrestTemplateState(String uri) throws CovidExeption{

	       
		//get All rated movie  IDs
        Covid covid= restTemplate.getForObject(uri, Covid.class);
 
       List<Covid>  ls=new ArrayList<Covid>();
       ls.add(covid);;
       
return  ls;
       

    }
 

}
