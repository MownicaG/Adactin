package seleniumComponents;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotActionsMethod {

	public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window();
	driver.get("https://testautomationpractice.blogspot.com/");
	Actions as = new Actions(driver);
	Robot rt = new Robot();
	WebElement src = driver.findElement(By.id("draggable"));
	WebElement tgt = driver.findElement(By.id("droppable"));
	as.dragAndDrop(src, tgt).build().perform();
	driver.navigate().to("https://www.amazon.in/");
	WebElement Mobile = driver.findElement(By.linkText("Today's Deals"));
	as.moveToElement(Mobile).perform();
	WebElement mobiles =  driver.findElement(By.linkText("Mobiles"));
	as.contextClick(mobiles).perform();	
	rt.keyPress(KeyEvent.VK_DOWN);
	rt.keyRelease(KeyEvent.VK_DOWN);
	rt.keyPress(KeyEvent.VK_ENTER);
	rt.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	}

}
