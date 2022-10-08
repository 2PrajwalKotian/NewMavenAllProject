package finalpresentation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromtAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Prajwal\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Alerts.html ");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert promptalert = driver.switchTo().alert();
		System.out.println(promptalert.getText());
		Thread.sleep(1000);
		promptalert.sendKeys("prajwal");
		Thread.sleep(1000);
		promptalert.accept();
		
		
	}

}