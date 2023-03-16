package TestLayer;

import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;

public class RegisterPageTest extends BaseClass{

	@Test(priority = 1)
	public void openABrowser()
	{
		BaseClass.inilization();
	}
	
	@Test(priority = 2)
	public void verifyContactInformation()
	{
		RegisterPage RegisterPage =new RegisterPage();
		RegisterPage.contactInformation("Anjali", "Patil", "90909090", "anjali@tcs.com");
	}
	
	
}
