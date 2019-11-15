package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BasicDay1 {
	@AfterTest()
	public void lastexecution() {
		System.out.println("I will execute last");
	}
	@Parameters({"URL", "APIKey/username"})
	@Test
	public void demo(String URLname, String key) {
		
		System.out.println("Hello");
		System.out.println(URLname);
		System.out.println(key);
	
	}
	@AfterSuite
	public void Aftersuite() {
		System.out.println("I am the no one from the last");
	}
	@Test
	public void SecondTest()
	{
		System.out.println("Bye Have a nice day");
	}
	

}
