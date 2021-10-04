package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class InsurantData {

	public WebDriver driver = null;

	public By firstNameField 		= By.id("firstname");
	public By lastNameField 		= By.id("lastname");
	public By birthDateField 		= By.id("birthdate");
	public By countryField 			= By.id("country");
	public By zipCodeField 			= By.id("zipcode");
	public By occupatioDropDown 		= By.id("occupation");
	public By speeding 		= By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[1]\r\n");
	public By bungeejumping 	= By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[2]\r\n");
	public By cliffdiving 		= By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[3]\r\n");
	public By skydiving 		= By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[4]\r\n");
	public By other 			= By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[5]\r\n");
	public By nextButton = By.id("nextenterproductdata");	


	public InsurantData (WebDriver driver) {
		this.driver = driver;
	}

	public void fillFirstName(String text) {
		try{
			WebElement a = driver.findElement(firstNameField);
			Assert.assertEquals(true, a.isDisplayed());
			driver.findElement(firstNameField).sendKeys(text);		
			}
		catch(NoSuchElementException e){
			
		}	
	}

	public void fillLastName(String text) {
		try{
			WebElement a = driver.findElement(lastNameField);
			Assert.assertEquals(true, a.isDisplayed());
			driver.findElement(lastNameField).sendKeys(text);		
			}
		catch(NoSuchElementException e){
			
		}
	}

	public void fillBirthDate(String text) throws InterruptedException {
		try{
			WebElement a = driver.findElement(birthDateField);
			Assert.assertEquals(true, a.isDisplayed());
			driver.findElement(birthDateField).sendKeys(text);		
			}
		catch(NoSuchElementException e){
			
		}	
	}

	public void ChosenDropDownOccupation(String text) {
		driver.findElement(occupatioDropDown).click();
		Select dropdown = new Select (driver.findElement(occupatioDropDown));
		dropdown.selectByVisibleText(text);		 
	}
}
