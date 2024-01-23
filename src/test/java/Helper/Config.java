package Helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class Config {
	
	public static WebDriver driver ;
	
	public static WebDriver driver2 ;
	
	public static void confchrome() {
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
	}
	public static void maximaseWindow() {
		driver.manage().window().maximize();
		
	}
	
	public static void attente(long s) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));
	}

}
