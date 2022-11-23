package seleniumComponents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriverNew.exe");
		WebDriver m = new ChromeDriver();
		m.manage().window().maximize();
		m.get("https://letcode.in/table");
		System.out.println("Single Data");
		WebElement singledata = m.findElement(By.xpath("//*[@id=\"shopping\"]/tbody/tr[2]/td[1] "));
		System.out.println(singledata.getText());

		System.out.println();
		System.out.println("All Data");
		List<WebElement> allData = m.findElements(By.xpath("((//table)[2]/tbody/tr/td)"));
		for (WebElement all : allData) {
			System.out.println(all.getText());
		}
		System.out.println();
		System.out.println("Column Data");
		List<WebElement> columnData = m.findElements(By.xpath("(//table)[1]/tbody/tr/td[1]"));
		for (WebElement column : columnData) {
			System.out.println(column.getText());
		}
		System.out.println();
		System.out.println("Row Data");
		List<WebElement> rowData = m.findElements(By.xpath("(//table)[2]/tbody/tr[1]/td"));
		for (WebElement row : rowData) {
			System.out.println(row.getText());
		}
		System.out.println("Header");
		List<WebElement> header = m.findElements(By.xpath("(//table)[3]/thead"));
		for (WebElement head : header) {
			System.out.println(head.getText());
		}


	}

}
