package seleniumComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropDown {

	public static void main(String[] args) throws InterruptedException    {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();
		
		Thread.sleep(2000);
		
		WebElement name = driver.findElement(By.name("firstname"));
		name.sendKeys("Mownica");
		
		WebElement name1 = driver.findElement(By.name("lastname"));
		name1.sendKeys("Gajendran");
		
		
		WebElement name2 = driver.findElement(By.name("reg_email__"));
		name2.sendKeys("mownicagajendran@gamil.com");
		
		WebElement name3 = driver.findElement(By.name("reg_email_confirmation__"));
		System.out.println(name3.isDisplayed());
		System.out.println(name3.isEnabled());
		name3.sendKeys("mownicagajendran@gamil.com");
		
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByValue("3");
		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		s1.selectByIndex(2);
		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("1997");
		
		WebElement Gender = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		Gender.click();
		WebElement submit = driver.findElement(By.name("websubmit"));
		submit.click();
		
	}

}
