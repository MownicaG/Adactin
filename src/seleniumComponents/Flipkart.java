package seleniumComponents;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");

		WebDriver fk = new ChromeDriver();

		fk.manage().window().maximize();

		fk.get("https://www.flipkart.com/lifestyle-big-billion-days-store?fm=neo%2Fmerchandising&iid=M_516aff0c-4a75-48f0-bc2c-ae30d72bafa1_1_LFZDN752UAJV_MC.MAGMJ6L3VQ88&otracker=hp_rich_navigation_3_1.navigationCard.RICH_NAVIGATION_Fashion_MAGMJ6L3VQ88&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_3_L0_view-all&cid=MAGMJ6L3VQ88");

		Thread.sleep(1000);
		WebElement women = fk.findElement(By.xpath("(//span[@class='_2I9KP_'])[4]"));
		women.click();
		Thread.sleep(2000);
		WebElement sarees = fk.findElement(By.xpath("(//a[@class='_3QN6WI'])[14]"));
		sarees.click();
		
		
		/*
		 * WebElement Ethinic = fk.findElement(By.linkText("Flights")); Ethinic.click();
		 */
		
	}

}
