package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;

public class HandlingWebElementCommands extends Base {

	public void verifyWebElementCommand() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messagebox = driver.findElement(By.id("single-input-field"));
		messagebox.sendKeys("Anjali");
		WebElement showmessagebutton = driver.findElement(By.id("button-one"));
		System.out.println(showmessagebutton.isDisplayed());
		System.out.println(showmessagebutton.isEnabled());
		showmessagebutton.click();
		
		WebElement message = driver.findElement(By.id("message-one"));
		System.out.println(message.getText());
		messagebox.clear();
		System.out.println(showmessagebutton.getCssValue("border-color"));
		System.out.println(showmessagebutton.getTagName());

	}

	public static void main(String[] args) {

		HandlingWebElementCommands webelement = new HandlingWebElementCommands();
		webelement.initializeBrowser();
		webelement.verifyWebElementCommand();

	}

}
