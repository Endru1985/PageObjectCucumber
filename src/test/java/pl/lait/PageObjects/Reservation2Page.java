package pl.lait.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Reservation2Page {
	
	static String radioDepart_xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[5]/td[1]/input";
	static String radioReturn_xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[9]/td[1]/input";
	static String inputReserve_name = "reserveFlights";
	//page3 elements
	static String input_passFirst0_name = "passFirst0";
	static String input_passLast0_name = "passLast0";
	static String select_passMeal_name = "pass.0.meal";
	static String select_creditCard_name = "creditCard";
	static String input_creditNumber_name = "creditnumber";
	static String select_ExpirationMonth_name = "cc_exp_dt_mn";
	static String select_ExpirationYear_name = "cc_exp_dt_yr";
	static String input_cc_frst_name = "cc_frst_name";
	static String input_cc_mid_name = "cc_mid_name";
	static String input_cc_last_name = "cc_last_name";
	static String checbox_ticketLess = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[8]/td[2]/input";
	static String input_billAddress1_name = "billAddress1";
	static String input_billCity_name = "billCity";
	static String input_billState_name = "billState";
	static String input_billZip_name = "billZip";
	static String select_billCountry_name = "billCountry";
	static String checbox_billingAddress = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input";
	static String input_delAddress1_name = "delAddress1";
	static String input_delCity_name = "delCity";
	static String input_delZip_name = "delZip";
	static String button_buyFlights = "buyFlights";
	
	public WebElement radio_depart2(WebDriver driver){
	return driver.findElement(By.xpath(radioDepart_xpath));
	}
	
	public WebElement radio_return2(WebDriver driver){
	return driver.findElement(By.xpath(radioReturn_xpath));
	}
	
	public WebElement button_continue(WebDriver driver){
		return driver.findElement(By.name(inputReserve_name));
	}
	//page3
	public WebElement input_passFirst(WebDriver driver){
		return driver.findElement(By.name(input_passFirst0_name));
	}
	public WebElement input_passLast(WebDriver driver){
		return driver.findElement(By.name(input_passLast0_name));
	}
	//alt dla obu powyżej!!!
	public void fillPassNames(String first, String last, WebDriver driver){
		driver.findElement(By.name(input_passFirst0_name)).sendKeys(first);
		driver.findElement(By.name(input_passLast0_name)).sendKeys(last);		
	}
	
	public Select selectPassMeal(WebDriver driver){
		return new Select(driver.findElement(By.name(select_passMeal_name)));
	}

	public Select selectcreditCard(WebDriver driver){
		return new Select(driver.findElement(By.name(select_creditCard_name)));
	}
	
	public WebElement input_creditnumber(WebDriver driver){
		return driver.findElement(By.name(input_creditNumber_name));		
	}

	public Select selectExpirationMonth(WebDriver driver){
		return new Select(driver.findElement(By.name(select_ExpirationMonth_name)));
	}
	
	public Select selectExpirationYear(WebDriver driver){
		return new Select(driver.findElement(By.name(select_ExpirationYear_name)));
	}
	
	public void fillCardName(String first, String middle, String last, WebDriver driver){
		driver.findElement(By.name(input_cc_frst_name)).sendKeys(first);
		driver.findElement(By.name(input_cc_mid_name)).sendKeys(middle);
		driver.findElement(By.name(input_cc_last_name)).sendKeys(last);
	}
	
	public WebElement checboxTicketLessTravel(WebDriver driver){
		return driver.findElement(By.xpath(checbox_ticketLess));
	}

	public WebElement inputBillAddress(WebDriver driver){
		return driver.findElement(By.name(input_billAddress1_name));
	}

	public WebElement inputBillCity(WebDriver driver){
		return driver.findElement(By.name(input_billCity_name));
	}
	
	public WebElement inputBillState(WebDriver driver){
		return driver.findElement(By.name(input_billState_name));
	}
	
	public WebElement inputBillZip(WebDriver driver){
		return driver.findElement(By.name(input_billZip_name));
	}
	
	public Select selectbillCountry(WebDriver driver){
		return new Select(driver.findElement(By.name(select_billCountry_name)));
	}
	
	public WebElement checboxbillingAddress(WebDriver driver){
		return driver.findElement(By.xpath(checbox_billingAddress));
	}
	
	public WebElement inputdelAddress(WebDriver driver){
		return driver.findElement(By.name(input_delAddress1_name));
	}
	
	public WebElement inputdelCity(WebDriver driver){
		return driver.findElement(By.name(input_delCity_name));
	}
	
	public WebElement inputdelZip(WebDriver driver){
		return driver.findElement(By.name(input_delZip_name));
	}

	public WebElement buttonBuyFlights(WebDriver driver){
		return driver.findElement(By.name(button_buyFlights));
	}
	
}


