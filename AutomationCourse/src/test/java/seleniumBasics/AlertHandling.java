package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base{
	
	public void verifySimpleAlert()
	
	{
		driver.navigate().to("https://demoqa.com/alerts");
		
		WebElement button= driver.findElement(By.id("alertButton"));
		button.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
	
	public void confirmAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement button= driver.findElement(By.id("confirmButton"));
		button.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		//alert.dismiss();
	}

	public void verifypromptAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement button= driver.findElement(By.id("promtButton"));
		button.click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Anjali");
		alert.accept();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AlertHandling alert= new AlertHandling();
		alert.initializeBrowser();
		//alert.verifySimpleAlert();
		//alert.confirmAlert();
		alert.verifypromptAlert();
		

	}

}
