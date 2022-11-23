package seleniumComponents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://letcode.in/dropdowns");
		WebElement fruit = driver.findElement(By.id("fruits"));
		fruit.click();
		Select s = new Select(fruit);
		
		s.selectByValue("3");
		
		WebElement multiple = driver.findElement(By.id("superheros"));
		System.out.println(s.isMultiple());
		Select s1 = new Select(multiple);
		System.out.println(s1.isMultiple());
		s1.selectByValue("am");
		s1.selectByVisibleText("Wonder Woman");
		s1.selectByValue("th");
		s1.selectByValue("ww");
		s1.deselectByValue("am");
		List<WebElement>options = s1.getOptions();
		for (WebElement all : options) {
			System.out.println(all.getText());
			
			
		}
		System.out.println("ALL SELECTED OPTIONS");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement selected : allSelectedOptions) {
			System.out.println(selected.getText());
			
		}
		System.out.println("First Selected Options");
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		s1.deselectAll();
		

	}

}
