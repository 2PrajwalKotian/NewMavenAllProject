package seliniumexample;
//import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpathApp {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Prajwal\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.xpath("//div/input[@name='firstname']")).sendKeys("Prajwal");
		driver.findElement(By.xpath("//div/input[@name='lastname']")).sendKeys("Kotian");
		driver.findElement(By.xpath("//div/input[@name='reg_email__']")).sendKeys("abc123@gmail.com");
		driver.findElement(By.xpath("//div/input[@name='reg_email_confirmation__']")).sendKeys("abc123@gmail.com");
		driver.findElement(By.xpath("//div/input[@name='reg_passwd__']")).sendKeys("@12abcd");
		//driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.name("birthday_day")).sendKeys("10");
		driver.findElement(By.name("birthday_month")).sendKeys("Feb");
		driver.findElement(By.name("birthday_year")).sendKeys("2001");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.xpath("//div/button[@name='websubmit']")).click();
	}

}

