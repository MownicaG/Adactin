package seleniumComponents;

import org.apache.commons.io.input.WindowsLineEndingInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriverNew.exe");
		WebDriver m = new ChromeDriver();
		m.get("https://www.youtube.com/");
		m.manage().window().maximize();
		m.findElement(By.cssSelector("input[autocapitalize='none']")).sendKeys("Kaatre En vasal song mp3");
		Thread.sleep(2000);
		m.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/button"))
				.click();
		Thread.sleep(2000);
		m.findElement(By.cssSelector("a[aria-label^='Rhythm   Katrae En Vasal |']")).click();
		Thread.sleep(600000);
		Actions a = new Actions(m);
		WebElement src = m.findElement(By.xpath("//*[@id=\"movie_player\"]/div[29]/div[1]/div[2]/div[6]/div"));
		WebElement timeline = m.findElement(By.cssSelector("div[class=ytp-timed-markers-container]"));
		a.dragAndDropBy(src, +30, 0).perform();

//	    m.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/form/div[1]/div[1]/input")).sendKeys("<yt-formatted-string class=\"style-scope ytd-video-renderer\" aria-label=\"MUNBE VAA | BASS BOOSTED | SILLINU ORU KADHAL by MT BASS 2 years ago 6 minutes, 12 seconds 356,263 views\">MUNBE VAA | BASS BOOSTED | SILLINU ORU KADHAL</yt-formatted-string>");
//	    m.findElement(By.id("search-icon-legacy")).click();

	}

}
