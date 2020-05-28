package com.covid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
public class Main {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    
    Map<String,Severity>  dataMap= new HashMap<String, Severity>();
    
    
    
    
     Severity severity1=new   Severity("IOException",100,"High");
    dataMap.put("IOException",severity1);
     Severity severity2=new Severity("MemoryException",110,"High"); 
    dataMap.put("MemoryException",severity2);
    Severity severity3=new Severity("ThreadAbortException",200,"Medium");
        
     dataMap.put("ThreadAbortException",severity3);

     Severity severity4=new Severity("ResponseTimeoutException",300,"Low");
     dataMap.put("ThreadAbortException",severity4);
     Severity severity5=new Severity("ParameterException",301,"Low");
     dataMap.put("ParameterException",severity5);
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    while ((line = in.readLine()) != null) {
      
   // Severity str=  severity.get(line.substring(0,line.indexOf("|")));
   //    System.out.println(line.substring(severity.get(line.substring(0,line.indexOf("|"));
    }
  }
  
  

  
}


class Data{
	
	String Name;
	String value;
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Data other = (Data) obj;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
 
}

