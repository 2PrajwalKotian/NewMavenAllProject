package finalpresentation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "C:\\Prajwal\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("http://www.vtu.ac.in/");
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.linkText("English")).click();
		Actions mouse=new Actions(driver);
     Thread.sleep(1000);
	mouse.moveToElement(driver.findElement(By.linkText("EXAMINATION"))).build().perform();
	mouse.moveToElement(driver.findElement(By.linkText("Result"))).build().perform();
		
}
}