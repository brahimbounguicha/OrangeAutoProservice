package TestSuites;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginPageStepDef {
	
	@Before
	public void init() {
		Config.confchrome();
		Config.driver= new ChromeDriver();
		Config.maximaseWindow();
	}
	
	
	@Given("admin is on login page")
	public void admin_is_on_login_page() {
		Config.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
		
	}

	

@When("admin enter correct username {string} and correct password {string}")
public void admin_enter_correct_username_and_correct_password(String x, String y) {
	  LoginPage page = new LoginPage(Config.driver);
      page.connect(x, y); 
}


	
	
	@Then("admin is directed to the homePage that contains {string}")
	public void admin_is_directed_to_the_home_page_that_contains(String msg) {
		HomePage home = new HomePage(Config.driver);
		 String actualMessage = home.verifMessage();
	       
	       Assert.assertEquals(msg, actualMessage);
	    
	}
	

	@When("admin enter correct username {string} and wrong password {string}")
	public void admin_enter_correct_username_and_wrong_password(String name, String password) {
		  LoginPage page = new LoginPage(Config.driver);
	      page.connect(name, password);
	}


	
	@Then("admin is still on login page that contains message {string}")
	public void admin_is_still_on_login_page_that_contains_message(String expectedMessage) {
		 LoginPage page = new LoginPage(Config.driver);
		 String actualMessage = page.verifMessage();
		 Assert.assertEquals(expectedMessage, actualMessage);
	}


}
