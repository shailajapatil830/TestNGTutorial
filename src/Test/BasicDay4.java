package Test;

import org.testng.annotations.Test;

public class BasicDay4 {
	@Test
	public void WebloginHomeloan()
	
	
	{
		//write here selenium code for web URL//
		System.out.println("WebloginHome");
	}
	
    @Test(groups= {"Smoke"})
    public void MobileloginHomeloan()
    {
    	//Appium
    	System.out.println("MobileloginHome");
    
    }
    @Test 
    public void LoginAPIHomeloan()
    {
    	//Rest API Automation//
    	System.out.println("APIloginHome");
    }
    	
    
}


