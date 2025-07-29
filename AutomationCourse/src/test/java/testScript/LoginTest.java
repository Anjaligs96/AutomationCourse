package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumBasics.TestNGBase;

public class LoginTest extends TestNGBase {

	@Test
	public void verifyUserLoginWithValidCredentials() {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField();
		loginpage.enterPasswordOnPasswordField();
		loginpage.clickOnSignInButton();

	}

	@Test
	public void verifyUserLoginWithValidUsernameAndInvalidPassword() {

		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("password");
		WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbutton.click();
	}

	@Test
	public void verifyUserLoginWithInvalidUsernameAndValidPassword() {
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("user");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbutton.click();
	}

	@Test
	public void verifyUserLoginWithInValidCredentials() {
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("user");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("password");
		WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbutton.click();
	}
}
