package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "user-name")
	private WebElement username;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(id = "login-button")
	private WebElement loginbutton;

	public void enterUserNameOnUserNameField(String username1) {
		username.sendKeys(username1);

	}

	public void enterPasswordOnPasswordField(String password1) {
		password.sendKeys(password1);
	}

	public void clickOnSignInButton() {
		loginbutton.click();
	}

}
