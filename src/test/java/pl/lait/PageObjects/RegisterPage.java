package pl.lait.PageObjects;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

	public String input_firstName = "firstName";
	public String input_lastName = "lastName";
	public String input_phone = "phone";
	public String input_userName = "userName";
	public String input_address1 = "address1";
	public String input_city = "city";
	public String input_state = "state";
	public String input_postalCode = "postalCode";
	static String select_country = "country";
	static String input_email = "email";
	static String input_password = "password";
	static String input_confirmPassword = "confirmPassword";
	static String button_register = "register";
	
	public WebElement input_firstName(WebDriver driver){
		return driver.findElement(By.name(input_firstName));
	}
	
	public WebElement input_lastName(WebDriver driver){
		return driver.findElement(By.name(input_lastName));
	}
	
	public WebElement input_phone(WebDriver driver){
		return driver.findElement(By.name(input_phone));
	}
	
	public WebElement input_userName(WebDriver driver){
		return driver.findElement(By.name(input_userName));
	}
	
	public WebElement input_address1(WebDriver driver){
		return driver.findElement(By.name(input_address1));
	}
	
	public WebElement input_city(WebDriver driver){
		return driver.findElement(By.name(input_city));
	}
	
	public WebElement input_state(WebDriver driver){
		return driver.findElement(By.name(input_state));
	}
	
	public WebElement input_postalCode(WebDriver driver){
		return driver.findElement(By.name(input_postalCode));
	}
	
	public Select selectCountry(WebDriver driver){
		return new Select(driver.findElement(By.name(select_country)));
	}
	
	public WebElement input_email(WebDriver driver){
		return driver.findElement(By.name(input_email));
	}
	
	public WebElement input_password(WebDriver driver){
		return driver.findElement(By.name(input_password));
	}
	
	public WebElement input_confirmPassword(WebDriver driver){
		return driver.findElement(By.name(input_confirmPassword));
	}
	
	public WebElement buttonregister(WebDriver driver){
		return driver.findElement(By.name(button_register));
	}
}

