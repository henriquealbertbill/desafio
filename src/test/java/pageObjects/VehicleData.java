package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class VehicleData {

	public WebDriver driver = null;

	public By automobileMenu = By.id("nav_automobile");
	public By makeDropDown = By.id("make");
	public By enginePerformanceField = By.id("engineperformance");
	public By dateManufactureField = By.id("dateofmanufacture");
	public By numberSeatsDropDown = By.id("numberofseats");
	public By fuelTypeDropDown = By.id("fuel");
	public By listPriceField = By.id("listprice");
	public By annualMileageField = By.id("annualmileage");
	public By nextButton = By.id("nextenterinsurantdata");

	public VehicleData(WebDriver driver) {
		this.driver = driver;
	}

	public void chosenDropdownMake(String text) {
		driver.findElement(makeDropDown).click();
		Select dropdown = new Select(driver.findElement(makeDropDown));
		dropdown.selectByVisibleText(text);
	}

	public void chosenDropDownNumberSeats(String text) {
		driver.findElement(numberSeatsDropDown).click();
		Select dropdown = new Select(driver.findElement(numberSeatsDropDown));
		dropdown.selectByVisibleText(text);
	}

	public void chosenDropDownFuelType(String text) {
		driver.findElement(fuelTypeDropDown).click();
		Select dropdown = new Select(driver.findElement(fuelTypeDropDown));
		dropdown.selectByVisibleText(text);
	}
}
