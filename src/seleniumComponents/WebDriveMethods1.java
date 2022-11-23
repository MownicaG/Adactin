package seleniumComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriveMethods1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();	
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		
	  WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	 email.sendKeys("mownicagajendran@gmail.com");
	 System.out.println(email.isDisplayed());
	 System.out.println(email.isEnabled());
	 
	 
	 WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
	 submit.click();
	 
	 WebElement fpass = driver.findElement(By.linkText("Forgot Password"));
	fpass.click();
	
	WebElement submit1 = driver.findElement(By.xpath("//input[@type='submit']"));
	submit1.click();
	WebElement help = driver.findElement(By.xpath("//span[@class='a-size-base']"));
	help.click();
	WebElement otp = driver.findElement(By.xpath("//input[contains(@type,max=\"6\"]"));
	otp.click();
	
	}


	}


