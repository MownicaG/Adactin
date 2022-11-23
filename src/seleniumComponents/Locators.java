package seleniumComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.primevideo.com/");
		driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Feu.primevideo.com%2Fauth%2Freturn%2Fref%3Dav_auth_ap%3F_t%3Dsg3DwdpCndkAxxFhG5eBJCuXwvvA7uNUI47XWm8RJAHtTAAAAAQAAAABjLA56cmF3AAAAAPgWC9WfHH8iB-olH_E9xQ%26location%3D%2Foffers%2Fnonprimehomepage%3F_encoding%253DUTF8%2526dvah%253Dnonprimehomepage%2526ref_%253Ddv_web_force_root&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&accountStatusPolicy=P1&openid.assoc_handle=amzn_prime_video_sso_in&openid.mode=checkid_setup&siteState=259-4406880-6363354&language=en_US&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebElement mail = driver.findElement(By.id("ap_email"));
		mail.sendKeys("mownicagajendran@gmail.com");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("mowni@21");
		WebElement login = driver.findElement(By.id("signInSubmit"));
		login.click();
		
		

	}

}
