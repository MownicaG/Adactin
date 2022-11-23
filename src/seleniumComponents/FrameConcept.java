package seleniumComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		driver.switchTo().frame(1);
		driver.findElement(By.name("fname")).sendKeys("Mownica");
		driver.findElement(By.name("lname")).sendKeys("Gajendran");
		WebElement a = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		
		
		driver.findElement(By.name("email")).sendKeys("mowni@gmail.com");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Watch tutorial")).click();
	}

}
