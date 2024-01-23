package TestSuites;

import Helper.Config;
import Pages.LoginPage;
import io.cucumber.java.en.Given;

public class CommunStepDef {
	@Given("Utilisateur est connecte avec le bon userName {string} et le bon password {string}")
	public void utilisateur_est_connecte_avec_le_bon_user_name_et_le_bon_password(String name, String pwd) {
	   Config.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   LoginPage page = new LoginPage(Config.driver);
	   page.connect(name, pwd);
	   
	}

}
