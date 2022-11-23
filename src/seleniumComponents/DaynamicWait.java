package seleniumComponents;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DaynamicWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriverNew.exe");
		WebDriver m = new ChromeDriver();
		m.manage().window().maximize();
		m.get("https://www.google.com/");
		m.findElement(By.name("q")).sendKeys("penne oru murai nee sirithal");
		//implicit
		m.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//dynamic
		m.findElement(By.xpath("//input[@class='gLFyf gsfi']//following::input[@class='gNO89b'][1]")).click();
		//explicit
		//WebDriverWait m = new WebDriverWait(m, 30);
		//wait.until(ExceptionConditions.visiblityof(element));
		WebElement ep = m.findElement(By.xpath("//input[@class='gLFyf gsfi']//following::h3[@class ='LC20lb MBeuO MMgsKf']"));
		
		WebDriverWait w = new WebDriverWait(m, 30);
		w.until(ExpectedConditions.visibilityOf(ep));
		ep.click();
		
		m.findElement(By.xpath("//button[@class ='ytp-play-button ytp-button']")).click();
		
		
	}
}
