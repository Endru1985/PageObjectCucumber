package pl.lait.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ReservationPage {

	static String roundTrip_xpath = "/html/body/div/table/tbody/tr/td[2]/"
			+ "table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/"
			+ "td[2]/b/font/input[1]";

	static String oneWay_xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/"
			+ "table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]";

	static String passCount_name = "passCount";
	static String depFrom_name = "fromPort";
	static String fromMonth_name = "fromMonth";
	static String fromDay_name = "fromDay";
	static String toPort_name = "toPort";
	static String toMonth_name = "toMonth";
	static String toDay_name = "toDay";
	static String airLine_name = "airline";
	
	static String servClass_xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]"
			+ "/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]";
	
	static String findFlights_name = "findFlights";

	public WebElement radio_roundTrip(WebDriver driver) {
		return driver.findElement(By.xpath(roundTrip_xpath));
	}

	public WebElement radio_oneWay(WebDriver driver) {
		return driver.findElement(By.xpath(oneWay_xpath));
	}
	
	public void selectpassengersCount(WebDriver driver, String visibletext_passCount) {
		Select passengers = new Select(driver.findElement(By.name(passCount_name)));
		passengers.selectByVisibleText(visibletext_passCount);
	}

	public void selectDepartingFrom(WebDriver driver, String visibleText_depFrom) {
		Select departingfrom = new Select(driver.findElement(By.name(depFrom_name)));
		departingfrom.selectByVisibleText(visibleText_depFrom);
	}

	public void selectOn(WebDriver driver, String visibleText_fromMonth) {
		Select on = new Select(driver.findElement(By.name(fromMonth_name)));
		on.selectByVisibleText(visibleText_fromMonth);
	}

	public void selectOn2(WebDriver driver, String visibleText_fromDay) {
		Select on2 = new Select(driver.findElement(By.name(fromDay_name)));
		on2.selectByVisibleText(visibleText_fromDay);
	}

	public void selectarrivingIn(WebDriver driver, String visibleText_toPort) {
		Select arrivingIn = new Select(driver.findElement(By.name(toPort_name)));
		arrivingIn.selectByVisibleText(visibleText_toPort);
	}

	public void selectReturning1(WebDriver driver, String visibleText_toMont) {
		Select returning = new Select(driver.findElement(By.name(toMonth_name)));
		returning.selectByVisibleText(visibleText_toMont);
	}

	public void selectReturning2(WebDriver driver, String visibleText_toDay) {
		Select returning2 = new Select(driver.findElement(By.name(toDay_name)));
		returning2.selectByVisibleText(visibleText_toDay);
	}
	
	public WebElement radio_servClass(WebDriver driver) {
		return driver.findElement(By.xpath(servClass_xpath));
	}

	public void selectairLine(WebDriver driver, String visibleText_airLine) {
		Select airLine = new Select(driver.findElement(By.name(airLine_name)));
		airLine.selectByVisibleText(visibleText_airLine);
	}
	
	public WebElement buttonFindFlights(WebDriver driver){
	return driver.findElement(By.name(findFlights_name));
}
}