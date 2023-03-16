package PageLayer;

import org.openqa.selenium.By;

import BaseLayer.BaseClass;

public class RegisterPage extends BaseClass {
	
	
	public void contactInformation(String fname,String lname,String mob,String email)
	{
		driver.findElement(By.name("firstName")).sendKeys(fname);
		
		driver.findElement(By.name("lastName")).sendKeys(lname);
		
		driver.findElement(By.name("phone")).sendKeys(mob);
		
		driver.findElement(By.name("userName")).sendKeys(email);
	}

}
