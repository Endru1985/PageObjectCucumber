package pl.lait.Test;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pl.lait.PageObjects.MainPage;
import pl.lait.PageObjects.Reservation2Page;
import pl.lait.PageObjects.ReservationPage;
import pl.lait.PageObjects.SignOnPage;
import pl.lait.Setup.Init;

public class ReservationTest extends Init{

	protected static WebDriver driver;
	
	
	//@Before
	public void run(){
		driver = getDtiver();
	}
	
	//@Test
	public void reservation(){
		MainPage mainPage = new MainPage();
		SignOnPage signOnPage = new SignOnPage();
		ReservationPage reservPage = new ReservationPage();
		Reservation2Page reserv2page = new Reservation2Page();
		
		mainPage.link_signOn(driver).click();
		signOnPage.loginAs("andrzej_qwe123", "qwe123", driver);
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
		
		//2 strona rezerwacji
		reserv2page.radio_depart2(driver).click();
		reserv2page.radio_return2(driver).click();
		
		printScr("reservation2");
		
		reserv2page.button_continue(driver).click();
		
		//3 strona rezerwacji
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
		printScr("reservation3");	
		reserv2page.buttonBuyFlights(driver).click();
		printScr("reservation4");	
	}
}
