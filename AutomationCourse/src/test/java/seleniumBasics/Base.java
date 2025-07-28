package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public WebDriver driver;
	
	public void initializeBrowser()
	{
		driver= new ChromeDriver();  //specifying the browser.
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize(); //maximize the window.
	}
	
	public void browserClose()
	{
		//driver.close();  for closing a single page.
		//driver.quit();   for closing all pages.
	}
	public static void main(String[] args) 
	
	{
       Base base= new Base();
       base.initializeBrowser();
       base.browserClose();
		
	}

}
