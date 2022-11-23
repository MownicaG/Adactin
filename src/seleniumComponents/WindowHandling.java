package seleniumComponents;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandling {
		public static void main(String[] args) throws AWTException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriverNew.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window();
			driver.get("https://www.amazon.in/");
			Actions as = new Actions(driver);
			Robot rt = new Robot();
			WebElement electronics =  driver.findElement(By.linkText("Electronics"));
			as.contextClick(electronics).perform();	
			rt.keyPress(KeyEvent.VK_DOWN);
			rt.keyRelease(KeyEvent.VK_DOWN);
			rt.keyPress(KeyEvent.VK_ENTER);
			rt.keyRelease(KeyEvent.VK_ENTER);
			WebElement customer =  driver.findElement(By.linkText("Customer Service"));
			as.contextClick(customer).perform();	
			rt.keyPress(KeyEvent.VK_DOWN);
			rt.keyRelease(KeyEvent.VK_DOWN);
			rt.keyPress(KeyEvent.VK_ENTER);
			rt.keyRelease(KeyEvent.VK_ENTER);
			WebElement mobiles =  driver.findElement(By.linkText("Mobiles"));
			as.contextClick(mobiles).perform();	
			rt.keyPress(KeyEvent.VK_DOWN);
			rt.keyRelease(KeyEvent.VK_DOWN);
			rt.keyPress(KeyEvent.VK_ENTER);
			rt.keyRelease(KeyEvent.VK_ENTER);
			Set<String> Allid = driver.getWindowHandles();
			System.out.println(Allid); 
				for(String id : Allid ) {
				String title = driver.switchTo().window(id).getTitle();
				System.out.println(title);
				
			}
				String myString = "Help - Amazon Customer Service";
				for(String id : Allid ) {
					String title = driver.switchTo().window(id).getTitle();
					System.out.println(title);
					
				}
				
			
			

	}

}
