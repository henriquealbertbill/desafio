package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ProductData {

	public WebDriver driver = null;

	public By startdateField = By.id("startdate");
	public By insuranceSumDropDown = By.id("insurancesum");
	public By meritratingDropDown = By.id("meritrating");
	public By damageInsuranceDropDown = By.id("damageinsurance");
	public By euroProtectionField = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[5]/p/label[1]/span\r\n");
	public By legalDefenseInsuranceField = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[5]/p/label[2]/span\r\n");
	public By courtesyCarDropDown = By.id("courtesycar");
	public By nextButton = By.id("nextselectpriceoption");

	public ProductData(WebDriver driver) {
		this.driver = driver;
	}

	public void chosenDropDownInsuranceSum(String text) {
		driver.findElement(insuranceSumDropDown).click();
		Select dropdown = new Select(driver.findElement(insuranceSumDropDown));
		dropdown.selectByVisibleText(text);
	}

	public void chosenDropDownMeritrating(String text) {
		driver.findElement(meritratingDropDown).click();
		Select dropdown = new Select(driver.findElement(meritratingDropDown));
		dropdown.selectByVisibleText(text);
	}

	public void chosenDropDownDamageInsurance(String text) {
		driver.findElement(damageInsuranceDropDown).click();
		Select dropdown = new Select(driver.findElement(damageInsuranceDropDown));
		dropdown.selectByVisibleText(text);
	}

	public void chosenDropDownCourtesyCar(String text) {
		driver.findElement(courtesyCarDropDown).click();
		Select dropdown = new Select(driver.findElement(courtesyCarDropDown));
		dropdown.selectByVisibleText(text);
	}
}
