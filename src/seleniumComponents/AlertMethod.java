package seleniumComponents;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMethod {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://letcode.in/alert");
	WebElement simple = driver.findElement(By.id("accept"));
	simple.click();
	Alert a = driver.switchTo().alert();
	System.out.println(a.getText());
	a.accept();
	
	WebElement confirm = driver.findElement(By.id("confirm"));
	confirm.click();
	Alert b = driver.switchTo().alert();
	System.out.println(b.getText());
	b.dismiss();
	
	WebElement prompt = driver.findElement(By.id("prompt"));
	prompt.click();
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.sendKeys("Mownica");
	alert.accept();
	

	}

}
