package steps;

import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.InsurantData;
import pageObjects.PriceOption;
import pageObjects.ProductData;
import pageObjects.SendQuote;
import pageObjects.VehicleData;

public class MotorcycleInsurance {

	private static WebDriver driver = null;

	VehicleData vehicleDataPage;
	InsurantData insurantDataPage;
	ProductData productDataPage;
	PriceOption priceOptionPage;
	SendQuote sendQuotePage;

	@Before
	public void setupClass() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		vehicleDataPage = new VehicleData(driver);
		insurantDataPage = new InsurantData(driver);
		productDataPage = new ProductData(driver);
		priceOptionPage = new PriceOption(driver);
		sendQuotePage = new SendQuote(driver);
	}

	@After
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}
	}

	@Dado("que estou no site {string}")
	public void que_estou_no_site(String site) throws Throwable {
		driver.get(site);
		driver.manage().window().maximize();
	}

	@Dado("que preenchi os campos Make, Engine Performance, Data Of manufacture, Number of Seats, Fuel Type, List Price e Annual Mileage da aba Enter Vehicle Data com seus respectivos valores {string}, {string}, {string}, {string}, {string}, {string} e {string}")
	public void que_preenchi_os_campos_make_engine_performance_data_of_manufacture_number_of_seats_fuel_type_list_price_e_annual_mileage_da_aba_enter_vehicle_data_com_seus_respectivos_valores_e(
			String makeField, String enginePerformanceField, String dateManufactureField, String numberSeatsField,
			String fuelTypeField, String listPriceField, String annualMileageField) throws Throwable {

		driver.findElement(vehicleDataPage.automobileMenu).click();
		vehicleDataPage.chosenDropdownMake(makeField);
		driver.findElement(vehicleDataPage.enginePerformanceField).sendKeys(enginePerformanceField);
		driver.findElement(vehicleDataPage.dateManufactureField).sendKeys(dateManufactureField);
		vehicleDataPage.chosenDropDownNumberSeats(numberSeatsField);
		vehicleDataPage.chosenDropDownFuelType(fuelTypeField);
		driver.findElement(vehicleDataPage.listPriceField).sendKeys(listPriceField);
		driver.findElement(vehicleDataPage.annualMileageField).sendKeys(annualMileageField);
		driver.findElement(vehicleDataPage.nextButton).click();
	}

	@Dado("que preenchi os campos First Name, Last Name, Date of Birth, Country, Zip Code, Occupation e Hobbies da aba Enter Insurant Data com seus respectivos valores {string}, {string}, {string}, {string}, {string} e {string}")
	public void que_preenchi_os_campos_first_name_last_name_date_of_birth_country_zip_code_occupation_e_hobbies_da_aba_enter_insurant_data_com_seus_respectivos_valores_e(
			String FirstNameField, String lastNameField, String birthDateField, String countryField,
			String zipCodeField, String occupationField) throws Throwable {

		insurantDataPage.fillFirstName(FirstNameField);
		insurantDataPage.fillLastName(lastNameField);
		insurantDataPage.fillBirthDate(birthDateField);
		driver.findElement(insurantDataPage.countryField).sendKeys(countryField);
		driver.findElement(insurantDataPage.zipCodeField).sendKeys(zipCodeField);
		insurantDataPage.ChosenDropDownOccupation(occupationField);
		driver.findElement(insurantDataPage.speeding).click();
		driver.findElement(insurantDataPage.bungeejumping).click();
		driver.findElement(insurantDataPage.cliffdiving).click();
		driver.findElement(insurantDataPage.skydiving).click();
		driver.findElement(insurantDataPage.other).click();
		driver.findElement(insurantDataPage.nextButton).click();
	}

	@Dado("que preenchi os campos Start Date, Insurance Sum, Marit Rating, Damage Insurance, Optional Products e Courtesy Car da aba Enter Product Data com seus respectivos valores {string}, {string}, {string}, {string} e {string}")
	public void que_preenchi_os_campos_start_date_insurance_sum_marit_rating_damage_insurance_optional_products_e_courtesy_car_da_aba_enter_product_data_com_seus_respectivos_valores_e(
			String startDateField, String insuranceSumChosen, String meritratingChosen, String damageInsuranceChosen,
			String courtesyCarChosen) throws Throwable {

		driver.findElement(productDataPage.startdateField).sendKeys(startDateField);
		productDataPage.chosenDropDownInsuranceSum(insuranceSumChosen);
		productDataPage.chosenDropDownMeritrating(meritratingChosen);
		productDataPage.chosenDropDownDamageInsurance(damageInsuranceChosen);
		driver.findElement(productDataPage.euroProtectionField).click();
		driver.findElement(productDataPage.legalDefenseInsuranceField).click();
		productDataPage.chosenDropDownCourtesyCar(courtesyCarChosen);
		driver.findElement(productDataPage.nextButton).click();
	}

	@Dado("que selecionei o plano {string} na aba Select Price Option")
	public void que_selecionei_o_plano_no_aba_select_price_option(String plan) throws Throwable {

		switch (plan) {
		case "Silver": {
			driver.findElement(priceOptionPage.selectSilverOption).click();
			break;
		}
		case "Gold": {
			driver.findElement(priceOptionPage.selectGoldOption).click();
			break;
		}
		case "Platinum": {
			driver.findElement(priceOptionPage.selectPlatinumOption).click();
			break;
		}
		case "Ultimate": {
			driver.findElement(priceOptionPage.selectUltimateOption).click();
			break;
		}

		}
		priceOptionPage.clickNextButton();

	}

	@Dado("que preenchi os campos E-mail, Username, Password e Confirm Password da aba Send Quote com seus respctivos valores {string}, {string}, {string} e {string}")
	public void que_preenchi_os_campos_e_mail_username_password_e_confirm_password_da_aba_send_quote_com_seus_respctivos_valores_e(
			String email, String userName, String password, String comfirmPassword) throws Throwable {

		driver.findElement(sendQuotePage.emailField).sendKeys(email);
		driver.findElement(sendQuotePage.usernameField).sendKeys(userName);
		driver.findElement(sendQuotePage.passwordField).sendKeys(password);
		driver.findElement(sendQuotePage.confirmpasswordField).sendKeys(comfirmPassword);
	}

	@Quando("^eu clicar no botao Send")
	public void eu_clicar_no_botao_Send() throws Throwable {
		driver.findElement(sendQuotePage.sendButton).click();
	}

	@Entao("eu vejo o modal de sucesso com a menssagem {string}")
	public void eu_vejo_o_modal_de_sucesso_com_a_menssagem(String message) throws Throwable {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String msg = driver.findElement(sendQuotePage.successMessage).getText();
		if (msg.equals(message)) {
			JOptionPane.showMessageDialog(null, "Teste Finalizado com Sucesso");
		} else {
			JOptionPane.showMessageDialog(null, "Falha ao realizar cadastro");
		}
	}
}
