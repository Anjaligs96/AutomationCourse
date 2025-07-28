package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base{
	
	public void verifyRightclick()
	{
		WebElement home= driver.findElement(By.xpath("//a[text()='Home']"));
		Actions a= new Actions(driver);
		a.contextClick(home).build().perform();
	}
	public void VerifyMouseOver()
	{
		WebElement home= driver.findElement(By.xpath("//a[text()='Home']"));
		Actions a= new Actions(driver);
		a.moveToElement(home).build().perform();
	}
	
	public void verifyDragandDrop()
	{
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement dragme=driver.findElement(By.id("draggable"));
		WebElement drophere= driver.findElement(By.id("droppable"));
		Actions a= new Actions(driver);
		a.dragAndDrop(dragme, drophere).build().perform();
		
	}
	public void verifyKeyboardActions() throws AWTException
	{
		Robot robot= new Robot();
		 //Cntrl+T for new tab
		
		robot.keyPress(KeyEvent.VK_CONTROL);   //to press cntrl .
		robot.keyPress(KeyEvent.VK_T);        // to press T.
        robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HandlingActions actions= new HandlingActions();
		actions.initializeBrowser();
		//actions.verifyRightclick();
		//actions.VerifyMouseOver();
		//actions.verifyDragandDrop();
		try {
			actions.verifyKeyboardActions();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
