package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SendQuote {
	
	public WebDriver driver = null;
	
	public By emailField = By.id("email");
	public By usernameField = By.id("username");
	public By passwordField = By.id("password");
	public By confirmpasswordField = By.id("confirmpassword");
	public By sendButton = By.id("sendemail");
	public By successMessage = By.xpath("/html/body/div[4]/h2\r\n");
	
	public SendQuote(WebDriver driver) {
		this.driver = driver;
	}

}