package Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class BasicDay3 {
	@BeforeClass
	public void BforeClass() {
		System.out.println("I am the one before the class");
	}
	@org.testng.annotations.Parameters({"URL"})
	@Test
	public void WebloginCarloan(String URLName)
	{
		//write here selenium code for web URL//
		System.out.println("WebloginCar");
		System.out.println(URLName);
	}
	
    @Test(enabled = false)
    public void MobileloginCarloan()
    {
    	//Appium
    	System.out.println("MobileloginCar");
    
    }
    @BeforeMethod
    public void BeforeSuite() {
    	System.out.println("I am no one");
    }
    @org.testng.annotations.AfterClass
	public void AfterClass(){
		System.out.println("I am the last after the class");
    }
    @Test(groups= {"Smoke"})
    public void LoginAPIcarloan()
    {
    	//Rest API Automation//
    	System.out.println("APIloginCar");
    }
    	
    
}
