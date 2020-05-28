package com.covid;


public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s1 = new String("HELLO"); 
		 String s3 = "HELLO"; 
		 String s4 = "HELLO"; 
	        String s2 = new String("HELLO"); 
	  
	        
	        System.out.println(s1 == s3); 
	  	  
	        System.out.println(s1.equals(s3)); 
	        
	        System.out.println(s3 == s4); 
		  	  
	        System.out.println(s3.equals(s4)); 
	        
	        System.out.println(s1 == s4); 
		  	  
	        System.out.println(s1.equals(s4)); 
	        
	        

	        System.out.println(s1 == s2); 
	  
	        System.out.println(s1.equals(s2)); 
	        
	        System.out.println(s1+" == "+s2+" "+s1 == s2); 
	        System.out.println(s1+".equals("+s2+")  is "+s1 == s2); 
	  
	        
	        System.out.println(s1+" == "+s3+" "+s1 == s3); 
	        System.out.println(s1+".equals("+s3+")  is "+s1 == s3); 
	  
	        
	        System.out.println(s3 == s4); 
		  	  
	        System.out.println(s3.equals(s4)); 
	        
	        System.out.println(s3+" == "+s4+" "+s3 == s4); 
	        System.out.println(s3+".equals("+s4+")  is "+s3 == s4); 
	  
	        
	        System.out.println(s1+" == "+s4+" "+s1 == s4); 
	        System.out.println(s1+".equals("+s4+")  is "+s1 == s4); 
	  

	        
	        
	        
	        
	}

}
