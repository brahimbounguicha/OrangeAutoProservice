package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class LoginPage {
	@FindBy(xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	WebElement userName;
	
	@FindBy(xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	WebElement password;
	
	
	@FindBy(xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	WebElement submit;
	
	@FindBy(xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
	WebElement verifWrongCredatianls;
public LoginPage(WebDriver driver) {
	PageFactory.initElements(Config.driver, this);
}


public void connect(String a,String b) {
	Config.attente(10);
	userName.sendKeys(a);
	password.sendKeys(b);
	submit.click();
}

public String verifMessage() {
	String actualMessage = verifWrongCredatianls.getText();
	return actualMessage;
	
}

}
