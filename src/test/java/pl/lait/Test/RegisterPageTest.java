package pl.lait.Test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pl.lait.PageObjects.MainPage;
import pl.lait.PageObjects.RegisterPage;
import pl.lait.Setup.Init;

public class RegisterPageTest extends Init {
	
	protected static WebDriver driver;
	
	//@Before
	public void run(){
		driver = getDtiver();
	}

	//@Test
	public void register(){
		MainPage mainPage = new MainPage();
		RegisterPage regisPage = new RegisterPage();
		
		mainPage.link_register(driver).click();
		regisPage.input_firstName(driver).sendKeys("andrzej");
		regisPage.input_lastName(driver).sendKeys("qwe123");
		regisPage.input_phone(driver).sendKeys("012345678");
		regisPage.input_userName(driver).sendKeys("abc@com");
		regisPage.input_city(driver).sendKeys("Hill Valley");
		regisPage.input_address1(driver).sendKeys("9303 Lyon Drive");
		regisPage.input_state(driver).sendKeys("CA");
		regisPage.input_postalCode(driver).sendKeys("95420");
		regisPage.selectCountry(driver).selectByVisibleText("UNITED STATES");
		regisPage.input_email(driver).sendKeys("andrzej_qwe123");
		regisPage.input_password(driver).sendKeys("qwe123");
		regisPage.input_confirmPassword(driver).sendKeys("qwe123");
		printScr("register");
		regisPage.buttonregister(driver).click();
		printScr("register2");
	}
}