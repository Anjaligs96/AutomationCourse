package seleniumBasics;

import org.openqa.selenium.By;

public class HandlingLocators extends Base{

	 public void verifyLocators()
	 {
		 driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		 driver.findElement(By.id("button-one"));
		 driver.findElement(By.className("btn btn-primary"));
		 driver.findElement(By.tagName("button"));
		 driver.findElement(By.name("description"));//meta name.
		 driver.findElement(By.linkText("Simple Form Demo"));
		 driver.findElement(By.partialLinkText("Simple"));
		 driver.findElement(By.cssSelector("button[id='button-one']"));
		 
		//Absolute xpath- /html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input
		 
		 driver.findElement(By.xpath("//button[@id='button-one']"));
		 driver.findElement(By.xpath("//button[text()='Show Message']"));
		 driver.findElement(By.xpath("//button[starts-with(text(),'Show ')]"));
		 driver.findElement(By.xpath("//button[@id='button-one' and @type='button']"));
		 driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics']"));
		 driver.findElement(By.xpath("//div[contains (text(), 'Single Input Field')]//parent::div[@class='card']"));
		 driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));
		 driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
		 driver.findElement(By.xpath("//button[@id='button-one']//preceding:: div[@class='card']"));
		 driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));	
		 driver.findElement(By.xpath("//div[@class='card']//descendant::div"));
		 
		 
	 }
	public static void main(String[] args) 
	{
		
		HandlingLocators locator= new HandlingLocators();
		locator.initializeBrowser();
		locator.verifyLocators();
		

	}

}
