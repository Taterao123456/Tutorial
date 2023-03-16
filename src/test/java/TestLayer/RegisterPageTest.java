package TestLayer;

import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;

public class RegisterPageTest extends BaseClass {
	
	@Test(priority = 1)
	public static void openABrowser()
	{
		BaseClass.initiation();
	}
	
	@Test(priority = 2)
	public static void validateContactInformation()
	{
		RegisterPage obj =new RegisterPage();
		obj.contactInformation("Anjali", "Patil", "9090900", "Anjali@gmail.com");
		
	}

}
