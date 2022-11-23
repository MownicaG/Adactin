package seleniumComponents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.ui.Select;

public class Myntra {

	public void totalNosofPrices() {
		WebDriver m = new ChromeDriver();
		m.manage().window().maximize();
		m.get("https://www.myntra.com/kids?f=Age%3A0M-3M%2C12M-18M%2C18M-24M%2C3M-6M%2C6M-9M%2C9M-12M%2CNewborn%3A%3ACategories%3ATops%2CTshirts&plaEnabled=false");
		List<WebElement> multiple = m.findElements(By.xpath("//li[@class='product-base']//a/div[2]/div/span"));
		System.out.println("*****All Prices*****");
		for (WebElement all : multiple) {
			System.out.println(all.getText());
		}
	}

//	public static void nosOfElements() {
//		WebDriver m = new ChromeDriver();
//		m.get("https://www.myntra.com/kids?f=Age%3A0M-3M%2C12M-18M%2C18M-24M%2C3M-6M%2C6M-9M%2C9M-12M%2CNewborn%3A%3ACategories%3ATops%2CTshirts&plaEnabled=false");
//		List<WebElement> s = m.findElements(By.xpath("//li[@class='product-base']//a/div[2]/div/span"));
//		System.out.println("*****Size*****");
//		System.out.println(s.size());
//	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriverNew.exe");
		Myntra f = new Myntra();
		f.totalNosofPrices();
//		Myntra.nosOfElements();

	}
}
