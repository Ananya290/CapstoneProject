package com.SeleniumCucumber.RestAssureScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupCheck {
	
	
public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); // open the browser
		
		
		   
	     driver.get("https://www.google.com/");
	     
	      //driver.getTitle();
		     System.out.println(driver.getTitle());	     

	     
	     System.out.println("run succesffully");	     
	     
	    
	     
	   
	     
	     

	}


}
