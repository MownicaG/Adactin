package seleniumComponents;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");

		WebDriver m = new ChromeDriver();
		m.manage().window().maximize();
		m.get("https://www.flipkart.com/tvs-and-appliances-new-clp-store?fm=neo%2Fmerchandising&iid=M_c40b9524-7805-40f1-b97f-766b3ee25d97_1_372UD5BXDFYS_MC.LO4IWVHA61BX&otracker=hp_rich_navigation_7_1.navigationCard.RICH_NAVIGATION_Appliances_LO4IWVHA61BX&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_7_L0_view-all&cid=LO4IWVHA61BX");
		WebElement Fb = m.findElement(By.linkText("Facebook"));	
		JavascriptExecutor js = (JavascriptExecutor) m;
		js.executeScript("arguments[0].scrollIntoView();", Fb);
		TakesScreenshot ts = (TakesScreenshot) m;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\HP\\eclipse-workspace\\Selenium_Testing\\Screenshot\\flip.png");
		FileUtils.copyFile(src, des);
		
	}

}
