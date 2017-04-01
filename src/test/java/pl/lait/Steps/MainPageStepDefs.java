package pl.lait.Steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.*;
import cucumber.api.java.en.*;
import junit.framework.Assert;
import pl.lait.PageObjects.MainPage;
import pl.lait.PageObjects.Reservation2Page;
import pl.lait.PageObjects.ReservationPage;
import pl.lait.PageObjects.SignOnPage;
import pl.lait.Setup.Init;

public class MainPageStepDefs extends Init {
	protected WebDriver driver;

	@Before
	public void init() {
		driver = getDtiver();
	}

	@Given("^I open main page$")
	public void i_open_main_page() {
		System.out.println("krok pierwszy w naszym teście");
		
	}

	@When("^I click link \"([^\"]*)\"$")
	public void i_click_link(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		MainPage main = new MainPage();
		main.link_click(driver, arg1).click();
		
	}

	@When("^I click login button$")
	public void i_click_login_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
	}

	@Then("^I should see contact page$")
	public void i_should_see_contact_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.getTitle();
		System.out.println("Page title: " + driver.getTitle());
		Assert.assertEquals("Wrong page title", "Under Construction: Mercury Tours", driver.getTitle());
	}
	
	// - logowanie

	@When("^I fill in login fields with \"([^\"]*)\" \"([^\"]*)\"$")
	public void i_fill_in_login_fields_with(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   SignOnPage login = new SignOnPage();
	   login.loginAs(arg1, arg2, driver);
	}

	@Then("^I should see flights reservation page$")
	public void i_should_see_flights_reservation_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals("Wrong page title", "Find a Flight: Mercury Tours:", driver.getTitle()); 
	}
	
	@Then("^I should see flights confirmation page$")
	public void i_should_see_flights_confirmation_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals("Wrong page title", "Find Confirmation: Mercury Tours", driver.getTitle()); 
	}
	
	@When("^I fill reservation first page$")
	public void i_fill_reservation_first_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		MainPage mainPage = new MainPage();
		SignOnPage signOnPage = new SignOnPage();
		ReservationPage reservPage = new ReservationPage();
		
		
		reservPage.radio_oneWay(driver);
		reservPage.selectpassengersCount(driver, "1");
		reservPage.selectDepartingFrom(driver, "New York");
		reservPage.selectOn(driver, "March");
		reservPage.selectOn2(driver, "19");
		reservPage.selectarrivingIn(driver, "San Francisco");
		reservPage.selectReturning1(driver, "April");
		reservPage.selectReturning2(driver, "1");
		reservPage.radio_servClass(driver);
		reservPage.selectairLine(driver, "Blue Skies Airlines");
		
		printScr("reservation");
		
		reservPage.buttonFindFlights(driver).click();
	}
	
	@When("^I fill reservation second page$")
	public void i_fill_reservation_second_page() throws Throwable {
		Reservation2Page reserv2page = new Reservation2Page();
		
		reserv2page.radio_depart2(driver).click();
		reserv2page.radio_return2(driver).click();
		reserv2page.button_continue(driver).click();
	}
	
	@When("^I fill reservation third page$")
	public void i_fill_reservation_third_page() throws Throwable {	
		Reservation2Page reserv2page = new Reservation2Page();
		
		reserv2page.fillPassNames("andrzej", "qwe123", driver);
		reserv2page.selectPassMeal(driver).selectByVisibleText("Hindu");
		reserv2page.selectcreditCard(driver).selectByVisibleText("MasterCard");
		reserv2page.input_creditnumber(driver).sendKeys("0123456789121314");
		reserv2page.selectExpirationMonth(driver).selectByVisibleText("01");
		reserv2page.selectExpirationYear(driver).selectByVisibleText("2000");
		reserv2page.fillCardName("andrzej", "blank", "qwe123", driver);
		reserv2page.checboxTicketLessTravel(driver).click();
		reserv2page.inputBillAddress(driver).clear();
		reserv2page.inputBillAddress(driver).sendKeys("9303 Lyon Drive");
		reserv2page.inputBillCity(driver).clear();
		reserv2page.inputBillCity(driver).sendKeys("Hill Valley");
		reserv2page.inputBillState(driver).clear();
		reserv2page.inputBillState(driver).sendKeys("CA");
		reserv2page.inputBillZip(driver).clear();
		reserv2page.inputBillZip(driver).sendKeys("95420");
		reserv2page.selectbillCountry(driver).selectByVisibleText("UNITED STATES");
		reserv2page.checboxbillingAddress(driver).click();
		reserv2page.inputdelAddress(driver).clear();
		reserv2page.inputdelAddress(driver).sendKeys("9303 Lyon Drive");
		reserv2page.inputdelCity(driver).clear();
		reserv2page.inputdelCity(driver).sendKeys("Hill Valley");
		reserv2page.inputdelZip(driver).clear();
		reserv2page.inputdelZip(driver).sendKeys("95420");
		reserv2page.buttonBuyFlights(driver).click();
		
	}
	
	@After
	public void end() {
		cleanUp();
	}

}
