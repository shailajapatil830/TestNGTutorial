package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicDay2 {
	
	@Test(groups= {"Smoke"})
	public void PersonalLoan() {
		System.out.println("20000");
	}
	@BeforeTest
	public void prerequiste()
	{
		System.out.println("I will execute first");
	}

}
