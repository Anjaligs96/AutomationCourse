package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import seleniumBasics.TestNGBase;

public class LoginTest  extends TestNGBase{
	
	@Test
	public void verifyUserLoginWithValidCredentials()
	{
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		WebElement loginbutton= driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbutton.click();
	}
	
   @Test
	public void verifyUserLoginWithValidUsernameAndInvalidPassword()
	{
	   
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("password");
		WebElement loginbutton= driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbutton.click();
	}
   
   @Test
	public void verifyUserLoginWithInvalidUsernameAndValidPassword()
	{
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("user");
		WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		WebElement loginbutton= driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbutton.click();
	}
   
   @Test
	public void verifyUserLoginWithInValidCredentials()
	{
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("user");
		WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("password");
		WebElement loginbutton= driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbutton.click();
	}
}
