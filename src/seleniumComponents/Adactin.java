package seleniumComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {
	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver m = new ChromeDriver();
		m.manage().window().maximize();;
		m.get("http://adactinhotelapp.com/SearchHotel.php");
		WebElement user = m.findElement(By.id("username"));
		user.sendKeys("GMownica");
		WebElement password = m.findElement(By.id("password"));
		password.sendKeys("Mowni@21");
		WebElement login = m.findElement(By.id("login"));
		login.click();
		WebElement location = m.findElement(By.id("location"));
		location.click();
        Select s = new Select(location);
		s.selectByVisibleText("Melbourne");
		WebElement hotels = m.findElement(By.id("hotels"));
		hotels.click();
		Select s1 = new Select(hotels);
		s1.selectByVisibleText("Hotel Creek");
		WebElement room = m.findElement(By.id("room_type"));
		room.click();
		Select s2 = new Select(room);
		s2.selectByVisibleText("Deluxe");
		WebElement roomno = m.findElement(By.id("room_nos"));
		roomno.click();
		Select s3 = new Select(roomno);
		s3.selectByVisibleText("2 - Two");
		m.findElement(By.id("datepick_in")).clear();
		m.findElement(By.id("datepick_in")).sendKeys("21/10/2022");
		m.findElement(By.id("datepick_out")).clear();
		m.findElement(By.id("datepick_out")).sendKeys("25/10/2022");
		
		WebElement ad = m.findElement(By.id("adult_room"));
        Select s4 = new Select(ad);
		s4.selectByVisibleText("2 - Two");
		
		WebElement cd = m.findElement(By.id("child_room"));
        Select s5 = new Select(cd);
		s5.selectByVisibleText("2 - Two");

		m.findElement(By.id("Submit")).click();
		
		m.findElement(By.id("radiobutton_0")).click();
		
		m.findElement(By.id("continue")).click();
		
		m.findElement(By.id("first_name")).sendKeys("Mownica");
		
		m.findElement(By.id("last_name")).sendKeys("Gajendran");
		
		m.findElement(By.id("address")).sendKeys("2/788,M.M nagar, 5th cross");
		m.findElement(By.id("cc_num")).sendKeys("1234567890123456");
		m.findElement(By.id("cc_type")).sendKeys("Others");
		WebElement em = m.findElement(By.id("cc_exp_month"));
		Select s6 = new Select(em);
		s6.selectByVisibleText("March");
		WebElement exm = m.findElement(By.id("cc_exp_year"));
		Select s7 = new Select(exm);
		s7.selectByVisibleText("2022");
		m.findElement(By.id("cc_cvv")).sendKeys("1528");
		m.findElement(By.id("book_now")).click();
		
		
		
		
		
		
		
		
	}

}
