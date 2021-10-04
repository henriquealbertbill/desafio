package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PriceOption {
	
	public WebDriver driver = null;

	public By selectSilverOption   = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[1]/span\r\n");
	public By selectGoldOption     = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[2]/span\r\n");
	public By selectPlatinumOption = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[3]/span\r\n");
	public By selectUltimateOption = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[4]/span\r\n");
	public By nextButton  = By.id("nextsendquote");

	public PriceOption(WebDriver driver) {
		this.driver = driver;
	}

	public void clickNextButton() {
		WebDriverWait wait = new WebDriverWait (driver, 10); 
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(nextButton)));
		element.click();
	}
}
